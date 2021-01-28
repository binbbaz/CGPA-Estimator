/*     */ package cgp;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.HierarchyBoundsListener;
/*     */ import java.awt.event.HierarchyEvent;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.LayoutStyle;
/*     */ import javax.swing.UIManager;
/*     */ 
/*     */ public class Login extends JFrame {
/*     */   public Login() {
/*  18 */     initComponents();
/*     */   }
/*     */   
/*     */   private JButton jButton1;
/*     */   private JPopupMenu jPopupMenu1;
/*     */   private JLabel loginLabel;
/*     */   private JLabel passwordLabel;
/*     */   private JPasswordField passwordTextField;
/*     */   private JLabel regLabel;
/*     */   private JTextField regNumTextField;
/*     */   
/*     */   private void initComponents() {
/*  30 */     this.jPopupMenu1 = new JPopupMenu();
/*  31 */     this.regNumTextField = new JTextField();
/*  32 */     this.passwordTextField = new JPasswordField();
/*  33 */     this.loginLabel = new JLabel();
/*  34 */     this.regLabel = new JLabel();
/*  35 */     this.passwordLabel = new JLabel();
/*  36 */     this.jButton1 = new JButton();
/*     */     
/*  38 */     setDefaultCloseOperation(3);
/*  39 */     setTitle("login");
/*  40 */     setBackground(new Color(0, 0, 255));
/*  41 */     setCursor(new Cursor(0));
/*  42 */     setExtendedState(3);
/*  43 */     setFont(new Font("Futura Md BT", 0, 18));
/*  44 */     setForeground(Color.green);
/*  45 */     setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
/*  46 */     setType(Window.Type.UTILITY);
/*  47 */     addWindowFocusListener(new WindowFocusListener() {
/*     */           public void windowGainedFocus(WindowEvent evt) {
/*  49 */             Login.this.formWindowGainedFocus(evt);
/*     */           }
/*     */           
/*     */           public void windowLostFocus(WindowEvent evt) {}
/*     */         });
/*  54 */     addHierarchyBoundsListener(new HierarchyBoundsListener() {
/*     */           public void ancestorMoved(HierarchyEvent evt) {}
/*     */           
/*     */           public void ancestorResized(HierarchyEvent evt) {
/*  58 */             Login.this.formAncestorResized(evt);
/*     */           }
/*     */         });
/*     */     
/*  62 */     this.loginLabel.setText("LOGIN FORM");
/*     */     
/*  64 */     this.regLabel.setText("REG NUMBER");
/*     */     
/*  66 */     this.passwordLabel.setText("PASSWORD");
/*     */     
/*  68 */     this.jButton1.setText("login");
/*  69 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  71 */             Login.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  75 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  76 */     getContentPane().setLayout(layout);
/*  77 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(242, 242, 242).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addComponent(this.passwordLabel).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.passwordTextField, -2, 143, -2)).addGroup(layout.createSequentialGroup().addGap(122, 122, 122).addComponent(this.loginLabel)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(1, 1, 1).addComponent(this.regLabel).addGap(18, 18, 18).addComponent(this.regNumTextField, -2, 143, -2))).addComponent(this.jButton1, -2, 60, -2)).addContainerGap(248, 32767)));
/*     */ 
/*     */ 

/*     */     
/*  99 */     layout.linkSize(0, new Component[] { this.passwordTextField, this.regNumTextField });
/*     */     
/* 101 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(64, 64, 64).addComponent(this.loginLabel).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.regNumTextField, -2, -1, -2).addComponent(this.regLabel)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.passwordTextField, -2, 20, -2).addComponent(this.passwordLabel)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1).addContainerGap(63, 32767)));
/*     */ 

/* 119 */     layout.linkSize(1, new Component[] { this.passwordTextField, this.regNumTextField });
/*     */     
/* 121 */     getAccessibleContext().setAccessibleParent(this.jPopupMenu1);
/*     */     
/* 123 */     pack();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void formAncestorResized(HierarchyEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void formWindowGainedFocus(WindowEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 137 */     Connectivity con = new Connectivity();
/* 138 */     con.connectToDatabase();
/*     */     try {
/* 140 */       Statement statement = Connectivity.connect.createStatement();
/* 141 */       ResultSet result = statement.executeQuery("select * from login left join students on login.regNo = students.regNo where  login.regNo = '" + this.regNumTextField.getText() + "' and login.password = '" + this.passwordTextField.getText() + "'");
/*     */ 
/*     */ 
/*     */       
/* 145 */       if (!result.next()) {
/* 146 */         JOptionPane.showMessageDialog(this, "incorrect password or regNo", "warning", -1);
/* 147 */         this.passwordTextField.setText("");
/*     */       } else {
/* 149 */         (new UserPanel()).setVisible(true);
/*     */       }
/*     */     
/* 152 */     } catch (Exception e) {
/* 153 */       JOptionPane.showMessageDialog(this, e, "warning", 2);
/*     */     } 
/*     */   }

/*     */   
/*     */   public static void main(String[] args) {
/*     */     try {
/* 172 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 173 */         if ("Nimbus".equals(info.getName())) {
/* 174 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 178 */     } catch (ClassNotFoundException ex) {
/* 179 */       Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 180 */     } catch (InstantiationException ex) {
/* 181 */       Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 182 */     } catch (IllegalAccessException ex) {
/* 183 */       Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 184 */     } catch (UnsupportedLookAndFeelException ex) {
/* 185 */       Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 192 */     EventQueue.invokeLater(new Runnable()
/*     */         {
/*     */           public void run() {
/* 195 */             Login log = new Login();
/* 196 */             log.setVisible(true);
/* 197 */             log.setLocationRelativeTo((Component)null);
/*     */           }
/*     */         });
/*     */   }
/*     */ 

/*     */   
/*     */   public JButton getjButton1() {
/* 216 */     return this.jButton1;
/*     */   }
/*     */ }


/* Location:              C:\Users\ABAS\Documents\old\documents\Documents\GPCAL.jar!\cgp\Login.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */