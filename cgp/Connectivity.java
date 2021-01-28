/*    */ package cgp;
/*    */ 
/*    */ import java.sql.Connection;
/*    */ import java.sql.DriverManager;
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.Statement;
/*    */ import javax.swing.JComboBox;
/*    */ import javax.swing.JOptionPane;
/*    */ import javax.swing.JTextField;
/*    */ 
/*    */ 
/*    */ public class Connectivity
/*    */ {
/*    */   public static Connection connect;
/*    */   
/*    */   public Connectivity() {
/*    */     try {
/* 18 */       Class.forName("com.mysql.jdbc.Driver").newInstance();
/* 19 */     } catch (Exception e) {
/* 20 */       JOptionPane.showMessageDialog(null, "Unable to find driver", "warning", -1);
/*    */     } 
/*    */   }
/*    */   public void connectToDatabase() {
/*    */     try {
/* 25 */       connect = DriverManager.getConnection("jdbc:mysql://localhost/gpcal", "root", "");
/* 26 */     } catch (Exception e) {
/* 27 */       JOptionPane.showMessageDialog(null, e, "warning", -1);
/*    */     } 
/*    */   }
/*    */   public void setTheTextFields(JTextField fields, JComboBox boxes, JTextField otherFields) {
/* 31 */     Connectivity con = new Connectivity();
/* 32 */     con.connectToDatabase();
/*    */     try {
/* 34 */       Statement statement = connect.createStatement();
/* 35 */       ResultSet rs = statement.executeQuery("select courseCredit, courseCode from courses where courseName= '" + boxes.getSelectedItem() + "';");
/*    */       
/* 37 */       if (rs.next()) {
/* 38 */         fields.setText(rs.getInt("courseCredit") + "");
/* 39 */         otherFields.setText(rs.getString("courseCode"));
/*    */       } 
/* 41 */       rs.close();
/* 42 */       statement.close();
/*    */     }
/* 44 */     catch (Exception e) {
/* 45 */       JOptionPane.showMessageDialog(null, e, "warning", 2);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void assignUnit(JComboBox boxs, JTextField f) {
/* 52 */     Connectivity con = new Connectivity();
/* 53 */     con.connectToDatabase();
/*    */     try {
/* 55 */       Statement statement = connect.createStatement();
/* 56 */       ResultSet rs = statement.executeQuery("select value from grades where grading= '" + boxs.getSelectedItem() + "' ;");
/* 57 */       if (rs.next()) {
/* 58 */         f.setText(rs.getInt("value") + "");
/*    */       }
/* 60 */       rs.close();
/* 61 */       statement.close();
/*    */     }
/* 63 */     catch (Exception e) {
/* 64 */       JOptionPane.showMessageDialog(null, e, "warning", 2);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\ABAS\Documents\old\documents\Documents\GPCAL.jar!\cgp\Connectivity.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */