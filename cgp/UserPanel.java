/*     */ package cgp;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class UserPanel extends JFrame {
/*     */   private JButton jButton1;
/*     */   private JComboBox jComboBox1;
/*     */   private JComboBox jComboBox10;
/*     */   private JComboBox jComboBox11;
/*     */   private JComboBox jComboBox12;
/*     */   private JComboBox jComboBox2;
/*     */   private JComboBox jComboBox3;
/*     */   private JComboBox jComboBox4;
/*     */   private JComboBox jComboBox5;
/*     */   private JComboBox jComboBox6;
/*     */   
/*     */   public UserPanel() {
/*  22 */     initComponents();
/*  23 */     setExtendedState(6);
/*  24 */     Connectivity con = new Connectivity();
/*  25 */     con.connectToDatabase();
/*     */     try {
/*  27 */       Statement statement = Connectivity.connect.createStatement();
/*  28 */       ResultSet rs = statement.executeQuery("select courseName from courses;");
/*  29 */       while (rs.next()) {
/*  30 */         this.jComboBox1.addItem(rs.getString("courseName"));
/*  31 */         this.jComboBox2.addItem(rs.getString("courseName"));
/*  32 */         this.jComboBox3.addItem(rs.getString("courseName"));
/*  33 */         this.jComboBox4.addItem(rs.getString("courseName"));
/*  34 */         this.jComboBox5.addItem(rs.getString("courseName"));
/*  35 */         this.jComboBox6.addItem(rs.getString("courseName"));
/*     */       }
/*     */     
/*  38 */     } catch (Exception e) {
/*  39 */       JOptionPane.showMessageDialog(this, e, "warning", 2);
/*     */     } 
/*     */     
/*     */     try {
/*  43 */       Statement statement = Connectivity.connect.createStatement();
/*  44 */       ResultSet rs = statement.executeQuery("select grading from grades;");
/*  45 */       while (rs.next()) {
/*  46 */         this.jComboBox7.addItem(rs.getString("grading"));
/*  47 */         this.jComboBox8.addItem(rs.getString("grading"));
/*  48 */         this.jComboBox9.addItem(rs.getString("grading"));
/*  49 */         this.jComboBox10.addItem(rs.getString("grading"));
/*  50 */         this.jComboBox11.addItem(rs.getString("grading"));
/*  51 */         this.jComboBox12.addItem(rs.getString("grading"));
/*     */       }
/*     */     
/*  54 */     } catch (Exception e) {
/*  55 */       JOptionPane.showMessageDialog(this, e, "warning", 2);
/*     */     } 
/*     */ 
/*     */     
/*  59 */     this.jLabel1.setVisible(false);
/*     */   }
/*     */   private JComboBox jComboBox7; private JComboBox jComboBox8; private JComboBox jComboBox9; private JLabel jLabel1; private JLabel jLabel2; private JTextField jTextField1; private JTextField jTextField10; private JTextField jTextField11; private JTextField jTextField12; private JTextField jTextField13; private JTextField jTextField14; private JTextField jTextField15; private JTextField jTextField16; private JTextField jTextField17; private JTextField jTextField18; private JTextField jTextField19; private JTextField jTextField2; private JTextField jTextField20; private JTextField jTextField21; private JTextField jTextField22; private JTextField jTextField23; private JTextField jTextField24; private JTextField jTextField25;
/*     */   private JTextField jTextField26;
/*     */   private JTextField jTextField3;
/*     */   private JTextField jTextField4;
/*     */   private JTextField jTextField5;
/*     */   private JTextField jTextField6;
/*     */   private JTextField jTextField7;
/*     */   private JTextField jTextField8;
/*     */   private JTextField jTextField9;
/*     */   
/*     */   private void initComponents() {
/*  72 */     this.jComboBox1 = new JComboBox();
/*  73 */     this.jTextField1 = new JTextField();
/*  74 */     this.jComboBox2 = new JComboBox();
/*  75 */     this.jTextField2 = new JTextField();
/*  76 */     this.jComboBox3 = new JComboBox();
/*  77 */     this.jTextField3 = new JTextField();
/*  78 */     this.jComboBox4 = new JComboBox();
/*  79 */     this.jTextField4 = new JTextField();
/*  80 */     this.jComboBox5 = new JComboBox();
/*  81 */     this.jTextField5 = new JTextField();
/*  82 */     this.jTextField6 = new JTextField();
/*  83 */     this.jComboBox6 = new JComboBox();
/*  84 */     this.jTextField7 = new JTextField();
/*  85 */     this.jTextField8 = new JTextField();
/*  86 */     this.jTextField9 = new JTextField();
/*  87 */     this.jTextField10 = new JTextField();
/*  88 */     this.jTextField11 = new JTextField();
/*  89 */     this.jTextField12 = new JTextField();
/*  90 */     this.jComboBox7 = new JComboBox();
/*  91 */     this.jComboBox8 = new JComboBox();
/*  92 */     this.jComboBox9 = new JComboBox();
/*  93 */     this.jComboBox10 = new JComboBox();
/*  94 */     this.jComboBox11 = new JComboBox();
/*  95 */     this.jComboBox12 = new JComboBox();
/*  96 */     this.jTextField13 = new JTextField();
/*  97 */     this.jTextField14 = new JTextField();
/*  98 */     this.jTextField15 = new JTextField();
/*  99 */     this.jTextField16 = new JTextField();
/* 100 */     this.jTextField17 = new JTextField();
/* 101 */     this.jTextField18 = new JTextField();
/* 102 */     this.jTextField19 = new JTextField();
/* 103 */     this.jTextField20 = new JTextField();
/* 104 */     this.jTextField21 = new JTextField();
/* 105 */     this.jTextField22 = new JTextField();
/* 106 */     this.jTextField23 = new JTextField();
/* 107 */     this.jTextField24 = new JTextField();
/* 108 */     this.jTextField25 = new JTextField();
/* 109 */     this.jTextField26 = new JTextField();
/* 110 */     this.jButton1 = new JButton();
/* 111 */     this.jLabel1 = new JLabel();
/* 112 */     this.jLabel2 = new JLabel();
/*     */     
/* 114 */     setDefaultCloseOperation(3);
/* 115 */     addInputMethodListener(new InputMethodListener() {
/*     */           public void caretPositionChanged(InputMethodEvent evt) {}
/*     */           
/*     */           public void inputMethodTextChanged(InputMethodEvent evt) {
/* 119 */             UserPanel.this.formInputMethodTextChanged(evt);
/*     */           }
/*     */         });
/* 122 */     getContentPane().setLayout(new GridBagLayout());
/*     */     
/* 124 */     this.jComboBox1.setMaximumRowCount(15);
/* 125 */     this.jComboBox1.setAutoscrolls(true);
/* 126 */     this.jComboBox1.setDebugGraphicsOptions(4);
/* 127 */     this.jComboBox1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 129 */             UserPanel.this.jComboBox1ActionPerformed(evt);
/*     */           }
/*     */         });
/* 132 */     GridBagConstraints gridBagConstraints = new GridBagConstraints();
/* 133 */     gridBagConstraints.gridx = 0;
/* 134 */     gridBagConstraints.gridy = 1;
/* 135 */     gridBagConstraints.ipadx = 340;
/* 136 */     gridBagConstraints.anchor = 18;
/* 137 */     gridBagConstraints.insets = new Insets(18, 10, 0, 0);
/* 138 */     getContentPane().add(this.jComboBox1, gridBagConstraints);
/*     */     
/* 140 */     this.jTextField1.setEditable(false);
/* 141 */     gridBagConstraints = new GridBagConstraints();
/* 142 */     gridBagConstraints.gridx = 2;
/* 143 */     gridBagConstraints.gridy = 1;
/* 144 */     gridBagConstraints.ipadx = 34;
/* 145 */     gridBagConstraints.anchor = 18;
/* 146 */     gridBagConstraints.insets = new Insets(18, 18, 0, 0);
/* 147 */     getContentPane().add(this.jTextField1, gridBagConstraints);
/*     */     
/* 149 */     this.jComboBox2.setMaximumRowCount(15);
/* 150 */     this.jComboBox2.setAutoscrolls(true);
/* 151 */     this.jComboBox2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 153 */             UserPanel.this.jComboBox2ActionPerformed(evt);
/*     */           }
/*     */         });
/* 156 */     gridBagConstraints = new GridBagConstraints();
/* 157 */     gridBagConstraints.gridx = 0;
/* 158 */     gridBagConstraints.gridy = 2;
/* 159 */     gridBagConstraints.ipadx = 340;
/* 160 */     gridBagConstraints.anchor = 18;
/* 161 */     gridBagConstraints.insets = new Insets(6, 10, 0, 0);
/* 162 */     getContentPane().add(this.jComboBox2, gridBagConstraints);
/*     */     
/* 164 */     this.jTextField2.setEditable(false);
/* 165 */     gridBagConstraints = new GridBagConstraints();
/* 166 */     gridBagConstraints.gridx = 2;
/* 167 */     gridBagConstraints.gridy = 2;
/* 168 */     gridBagConstraints.ipadx = 34;
/* 169 */     gridBagConstraints.anchor = 18;
/* 170 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 171 */     getContentPane().add(this.jTextField2, gridBagConstraints);
/*     */     
/* 173 */     this.jComboBox3.setMaximumRowCount(15);
/* 174 */     this.jComboBox3.setAutoscrolls(true);
/* 175 */     this.jComboBox3.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 177 */             UserPanel.this.jComboBox3ActionPerformed(evt);
/*     */           }
/*     */         });
/* 180 */     gridBagConstraints = new GridBagConstraints();
/* 181 */     gridBagConstraints.gridx = 0;
/* 182 */     gridBagConstraints.gridy = 3;
/* 183 */     gridBagConstraints.ipadx = 340;
/* 184 */     gridBagConstraints.anchor = 18;
/* 185 */     gridBagConstraints.insets = new Insets(6, 10, 0, 0);
/* 186 */     getContentPane().add(this.jComboBox3, gridBagConstraints);
/*     */     
/* 188 */     this.jTextField3.setEditable(false);
/* 189 */     gridBagConstraints = new GridBagConstraints();
/* 190 */     gridBagConstraints.gridx = 2;
/* 191 */     gridBagConstraints.gridy = 3;
/* 192 */     gridBagConstraints.ipadx = 34;
/* 193 */     gridBagConstraints.anchor = 18;
/* 194 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 195 */     getContentPane().add(this.jTextField3, gridBagConstraints);
/*     */     
/* 197 */     this.jComboBox4.setMaximumRowCount(15);
/* 198 */     this.jComboBox4.setAutoscrolls(true);
/* 199 */     this.jComboBox4.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 201 */             UserPanel.this.jComboBox4ActionPerformed(evt);
/*     */           }
/*     */         });
/* 204 */     gridBagConstraints = new GridBagConstraints();
/* 205 */     gridBagConstraints.gridx = 0;
/* 206 */     gridBagConstraints.gridy = 4;
/* 207 */     gridBagConstraints.ipadx = 340;
/* 208 */     gridBagConstraints.anchor = 18;
/* 209 */     gridBagConstraints.insets = new Insets(6, 10, 0, 0);
/* 210 */     getContentPane().add(this.jComboBox4, gridBagConstraints);
/*     */     
/* 212 */     this.jTextField4.setEditable(false);
/* 213 */     gridBagConstraints = new GridBagConstraints();
/* 214 */     gridBagConstraints.gridx = 2;
/* 215 */     gridBagConstraints.gridy = 5;
/* 216 */     gridBagConstraints.ipadx = 34;
/* 217 */     gridBagConstraints.anchor = 18;
/* 218 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 219 */     getContentPane().add(this.jTextField4, gridBagConstraints);
/*     */     
/* 221 */     this.jComboBox5.setMaximumRowCount(15);
/* 222 */     this.jComboBox5.setAutoscrolls(true);
/* 223 */     this.jComboBox5.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 225 */             UserPanel.this.jComboBox5ActionPerformed(evt);
/*     */           }
/*     */         });
/* 228 */     gridBagConstraints = new GridBagConstraints();
/* 229 */     gridBagConstraints.gridx = 0;
/* 230 */     gridBagConstraints.gridy = 5;
/* 231 */     gridBagConstraints.ipadx = 340;
/* 232 */     gridBagConstraints.anchor = 18;
/* 233 */     gridBagConstraints.insets = new Insets(6, 10, 0, 0);
/* 234 */     getContentPane().add(this.jComboBox5, gridBagConstraints);
/*     */     
/* 236 */     this.jTextField5.setEditable(false);
/* 237 */     gridBagConstraints = new GridBagConstraints();
/* 238 */     gridBagConstraints.gridx = 2;
/* 239 */     gridBagConstraints.gridy = 4;
/* 240 */     gridBagConstraints.ipadx = 34;
/* 241 */     gridBagConstraints.anchor = 18;
/* 242 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 243 */     getContentPane().add(this.jTextField5, gridBagConstraints);
/*     */     
/* 245 */     this.jTextField6.setEditable(false);
/* 246 */     gridBagConstraints = new GridBagConstraints();
/* 247 */     gridBagConstraints.gridx = 2;
/* 248 */     gridBagConstraints.gridy = 6;
/* 249 */     gridBagConstraints.ipadx = 34;
/* 250 */     gridBagConstraints.anchor = 18;
/* 251 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 252 */     getContentPane().add(this.jTextField6, gridBagConstraints);
/*     */     
/* 254 */     this.jComboBox6.setMaximumRowCount(15);
/* 255 */     this.jComboBox6.setAutoscrolls(true);
/* 256 */     this.jComboBox6.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 258 */             UserPanel.this.jComboBox6ActionPerformed(evt);
/*     */           }
/*     */         });
/* 261 */     gridBagConstraints = new GridBagConstraints();
/* 262 */     gridBagConstraints.gridx = 0;
/* 263 */     gridBagConstraints.gridy = 6;
/* 264 */     gridBagConstraints.ipadx = 340;
/* 265 */     gridBagConstraints.anchor = 18;
/* 266 */     gridBagConstraints.insets = new Insets(6, 10, 0, 0);
/* 267 */     getContentPane().add(this.jComboBox6, gridBagConstraints);
/*     */     
/* 269 */     this.jTextField7.setEditable(false);
/* 270 */     gridBagConstraints = new GridBagConstraints();
/* 271 */     gridBagConstraints.gridx = 1;
/* 272 */     gridBagConstraints.gridy = 1;
/* 273 */     gridBagConstraints.ipadx = 80;
/* 274 */     gridBagConstraints.anchor = 18;
/* 275 */     gridBagConstraints.insets = new Insets(18, 18, 0, 0);
/* 276 */     getContentPane().add(this.jTextField7, gridBagConstraints);
/*     */     
/* 278 */     this.jTextField8.setEditable(false);
/* 279 */     gridBagConstraints = new GridBagConstraints();
/* 280 */     gridBagConstraints.gridx = 1;
/* 281 */     gridBagConstraints.gridy = 2;
/* 282 */     gridBagConstraints.ipadx = 80;
/* 283 */     gridBagConstraints.anchor = 18;
/* 284 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 285 */     getContentPane().add(this.jTextField8, gridBagConstraints);
/*     */     
/* 287 */     this.jTextField9.setEditable(false);
/* 288 */     gridBagConstraints = new GridBagConstraints();
/* 289 */     gridBagConstraints.gridx = 1;
/* 290 */     gridBagConstraints.gridy = 3;
/* 291 */     gridBagConstraints.ipadx = 80;
/* 292 */     gridBagConstraints.anchor = 18;
/* 293 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 294 */     getContentPane().add(this.jTextField9, gridBagConstraints);
/*     */     
/* 296 */     this.jTextField10.setEditable(false);
/* 297 */     gridBagConstraints = new GridBagConstraints();
/* 298 */     gridBagConstraints.gridx = 1;
/* 299 */     gridBagConstraints.gridy = 4;
/* 300 */     gridBagConstraints.ipadx = 80;
/* 301 */     gridBagConstraints.anchor = 18;
/* 302 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 303 */     getContentPane().add(this.jTextField10, gridBagConstraints);
/*     */     
/* 305 */     this.jTextField11.setEditable(false);
/* 306 */     gridBagConstraints = new GridBagConstraints();
/* 307 */     gridBagConstraints.gridx = 1;
/* 308 */     gridBagConstraints.gridy = 5;
/* 309 */     gridBagConstraints.ipadx = 80;
/* 310 */     gridBagConstraints.anchor = 18;
/* 311 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 312 */     getContentPane().add(this.jTextField11, gridBagConstraints);
/*     */     
/* 314 */     this.jTextField12.setEditable(false);
/* 315 */     gridBagConstraints = new GridBagConstraints();
/* 316 */     gridBagConstraints.gridx = 1;
/* 317 */     gridBagConstraints.gridy = 6;
/* 318 */     gridBagConstraints.ipadx = 80;
/* 319 */     gridBagConstraints.anchor = 18;
/* 320 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 321 */     getContentPane().add(this.jTextField12, gridBagConstraints);
/*     */     
/* 323 */     this.jComboBox7.setMaximumRowCount(15);
/* 324 */     this.jComboBox7.setAutoscrolls(true);
/* 325 */     this.jComboBox7.setDebugGraphicsOptions(4);
/* 326 */     this.jComboBox7.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 328 */             UserPanel.this.jComboBox7ActionPerformed(evt);
/*     */           }
/*     */         });
/* 331 */     gridBagConstraints = new GridBagConstraints();
/* 332 */     gridBagConstraints.gridx = 3;
/* 333 */     gridBagConstraints.gridy = 1;
/* 334 */     gridBagConstraints.ipadx = 21;
/* 335 */     gridBagConstraints.anchor = 18;
/* 336 */     gridBagConstraints.insets = new Insets(18, 18, 0, 0);
/* 337 */     getContentPane().add(this.jComboBox7, gridBagConstraints);
/*     */     
/* 339 */     this.jComboBox8.setMaximumRowCount(15);
/* 340 */     this.jComboBox8.setAutoscrolls(true);
/* 341 */     this.jComboBox8.setDebugGraphicsOptions(4);
/* 342 */     this.jComboBox8.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 344 */             UserPanel.this.jComboBox8ActionPerformed(evt);
/*     */           }
/*     */         });
/* 347 */     gridBagConstraints = new GridBagConstraints();
/* 348 */     gridBagConstraints.gridx = 3;
/* 349 */     gridBagConstraints.gridy = 2;
/* 350 */     gridBagConstraints.ipadx = 21;
/* 351 */     gridBagConstraints.anchor = 18;
/* 352 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 353 */     getContentPane().add(this.jComboBox8, gridBagConstraints);
/*     */     
/* 355 */     this.jComboBox9.setMaximumRowCount(15);
/* 356 */     this.jComboBox9.setAutoscrolls(true);
/* 357 */     this.jComboBox9.setDebugGraphicsOptions(4);
/* 358 */     this.jComboBox9.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 360 */             UserPanel.this.jComboBox9ActionPerformed(evt);
/*     */           }
/*     */         });
/* 363 */     gridBagConstraints = new GridBagConstraints();
/* 364 */     gridBagConstraints.gridx = 3;
/* 365 */     gridBagConstraints.gridy = 3;
/* 366 */     gridBagConstraints.ipadx = 21;
/* 367 */     gridBagConstraints.anchor = 18;
/* 368 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 369 */     getContentPane().add(this.jComboBox9, gridBagConstraints);
/*     */     
/* 371 */     this.jComboBox10.setMaximumRowCount(15);
/* 372 */     this.jComboBox10.setAutoscrolls(true);
/* 373 */     this.jComboBox10.setDebugGraphicsOptions(4);
/* 374 */     this.jComboBox10.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 376 */             UserPanel.this.jComboBox10ActionPerformed(evt);
/*     */           }
/*     */         });
/* 379 */     gridBagConstraints = new GridBagConstraints();
/* 380 */     gridBagConstraints.gridx = 3;
/* 381 */     gridBagConstraints.gridy = 4;
/* 382 */     gridBagConstraints.ipadx = 21;
/* 383 */     gridBagConstraints.anchor = 18;
/* 384 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 385 */     getContentPane().add(this.jComboBox10, gridBagConstraints);
/*     */     
/* 387 */     this.jComboBox11.setMaximumRowCount(15);
/* 388 */     this.jComboBox11.setAutoscrolls(true);
/* 389 */     this.jComboBox11.setDebugGraphicsOptions(4);
/* 390 */     this.jComboBox11.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 392 */             UserPanel.this.jComboBox11ActionPerformed(evt);
/*     */           }
/*     */         });
/* 395 */     gridBagConstraints = new GridBagConstraints();
/* 396 */     gridBagConstraints.gridx = 3;
/* 397 */     gridBagConstraints.gridy = 5;
/* 398 */     gridBagConstraints.ipadx = 21;
/* 399 */     gridBagConstraints.anchor = 18;
/* 400 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 401 */     getContentPane().add(this.jComboBox11, gridBagConstraints);
/*     */     
/* 403 */     this.jComboBox12.setMaximumRowCount(15);
/* 404 */     this.jComboBox12.setAutoscrolls(true);
/* 405 */     this.jComboBox12.setDebugGraphicsOptions(4);
/* 406 */     this.jComboBox12.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 408 */             UserPanel.this.jComboBox12ActionPerformed(evt);
/*     */           }
/*     */         });
/* 411 */     gridBagConstraints = new GridBagConstraints();
/* 412 */     gridBagConstraints.gridx = 3;
/* 413 */     gridBagConstraints.gridy = 6;
/* 414 */     gridBagConstraints.ipadx = 21;
/* 415 */     gridBagConstraints.anchor = 18;
/* 416 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 417 */     getContentPane().add(this.jComboBox12, gridBagConstraints);
/*     */     
/* 419 */     this.jTextField13.setEditable(false);
/* 420 */     gridBagConstraints = new GridBagConstraints();
/* 421 */     gridBagConstraints.gridx = 4;
/* 422 */     gridBagConstraints.gridy = 6;
/* 423 */     gridBagConstraints.gridwidth = 3;
/* 424 */     gridBagConstraints.ipadx = 34;
/* 425 */     gridBagConstraints.anchor = 18;
/* 426 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 427 */     getContentPane().add(this.jTextField13, gridBagConstraints);
/*     */     
/* 429 */     this.jTextField14.setEditable(false);
/* 430 */     gridBagConstraints = new GridBagConstraints();
/* 431 */     gridBagConstraints.gridx = 4;
/* 432 */     gridBagConstraints.gridy = 5;
/* 433 */     gridBagConstraints.gridwidth = 3;
/* 434 */     gridBagConstraints.ipadx = 34;
/* 435 */     gridBagConstraints.anchor = 18;
/* 436 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 437 */     getContentPane().add(this.jTextField14, gridBagConstraints);
/*     */     
/* 439 */     this.jTextField15.setEditable(false);
/* 440 */     gridBagConstraints = new GridBagConstraints();
/* 441 */     gridBagConstraints.gridx = 4;
/* 442 */     gridBagConstraints.gridy = 4;
/* 443 */     gridBagConstraints.gridwidth = 3;
/* 444 */     gridBagConstraints.ipadx = 34;
/* 445 */     gridBagConstraints.anchor = 18;
/* 446 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 447 */     getContentPane().add(this.jTextField15, gridBagConstraints);
/*     */     
/* 449 */     this.jTextField16.setEditable(false);
/* 450 */     gridBagConstraints = new GridBagConstraints();
/* 451 */     gridBagConstraints.gridx = 4;
/* 452 */     gridBagConstraints.gridy = 3;
/* 453 */     gridBagConstraints.gridwidth = 3;
/* 454 */     gridBagConstraints.ipadx = 34;
/* 455 */     gridBagConstraints.anchor = 18;
/* 456 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 457 */     getContentPane().add(this.jTextField16, gridBagConstraints);
/*     */     
/* 459 */     this.jTextField17.setEditable(false);
/* 460 */     gridBagConstraints = new GridBagConstraints();
/* 461 */     gridBagConstraints.gridx = 4;
/* 462 */     gridBagConstraints.gridy = 2;
/* 463 */     gridBagConstraints.gridwidth = 3;
/* 464 */     gridBagConstraints.ipadx = 34;
/* 465 */     gridBagConstraints.anchor = 18;
/* 466 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 467 */     getContentPane().add(this.jTextField17, gridBagConstraints);
/*     */     
/* 469 */     this.jTextField18.setEditable(false);
/* 470 */     gridBagConstraints = new GridBagConstraints();
/* 471 */     gridBagConstraints.gridx = 4;
/* 472 */     gridBagConstraints.gridy = 1;
/* 473 */     gridBagConstraints.gridwidth = 3;
/* 474 */     gridBagConstraints.ipadx = 34;
/* 475 */     gridBagConstraints.anchor = 18;
/* 476 */     gridBagConstraints.insets = new Insets(18, 18, 0, 0);
/* 477 */     getContentPane().add(this.jTextField18, gridBagConstraints);
/*     */     
/* 479 */     this.jTextField19.setEditable(false);
/* 480 */     gridBagConstraints = new GridBagConstraints();
/* 481 */     gridBagConstraints.gridx = 7;
/* 482 */     gridBagConstraints.gridy = 6;
/* 483 */     gridBagConstraints.gridwidth = 9;
/* 484 */     gridBagConstraints.ipadx = 44;
/* 485 */     gridBagConstraints.anchor = 18;
/* 486 */     gridBagConstraints.insets = new Insets(6, 18, 0, 145);
/* 487 */     getContentPane().add(this.jTextField19, gridBagConstraints);
/*     */     
/* 489 */     this.jTextField20.setEditable(false);
/* 490 */     gridBagConstraints = new GridBagConstraints();
/* 491 */     gridBagConstraints.gridx = 7;
/* 492 */     gridBagConstraints.gridy = 5;
/* 493 */     gridBagConstraints.gridwidth = 9;
/* 494 */     gridBagConstraints.ipadx = 44;
/* 495 */     gridBagConstraints.anchor = 18;
/* 496 */     gridBagConstraints.insets = new Insets(6, 18, 0, 145);
/* 497 */     getContentPane().add(this.jTextField20, gridBagConstraints);
/*     */     
/* 499 */     this.jTextField21.setEditable(false);
/* 500 */     gridBagConstraints = new GridBagConstraints();
/* 501 */     gridBagConstraints.gridx = 7;
/* 502 */     gridBagConstraints.gridy = 4;
/* 503 */     gridBagConstraints.gridwidth = 9;
/* 504 */     gridBagConstraints.ipadx = 44;
/* 505 */     gridBagConstraints.anchor = 18;
/* 506 */     gridBagConstraints.insets = new Insets(6, 18, 0, 145);
/* 507 */     getContentPane().add(this.jTextField21, gridBagConstraints);
/*     */     
/* 509 */     this.jTextField22.setEditable(false);
/* 510 */     gridBagConstraints = new GridBagConstraints();
/* 511 */     gridBagConstraints.gridx = 7;
/* 512 */     gridBagConstraints.gridy = 3;
/* 513 */     gridBagConstraints.gridwidth = 9;
/* 514 */     gridBagConstraints.ipadx = 44;
/* 515 */     gridBagConstraints.anchor = 18;
/* 516 */     gridBagConstraints.insets = new Insets(6, 18, 0, 145);
/* 517 */     getContentPane().add(this.jTextField22, gridBagConstraints);
/*     */     
/* 519 */     this.jTextField23.setEditable(false);
/* 520 */     gridBagConstraints = new GridBagConstraints();
/* 521 */     gridBagConstraints.gridx = 7;
/* 522 */     gridBagConstraints.gridy = 2;
/* 523 */     gridBagConstraints.gridwidth = 9;
/* 524 */     gridBagConstraints.ipadx = 44;
/* 525 */     gridBagConstraints.anchor = 18;
/* 526 */     gridBagConstraints.insets = new Insets(6, 18, 0, 145);
/* 527 */     getContentPane().add(this.jTextField23, gridBagConstraints);
/*     */     
/* 529 */     this.jTextField24.setEditable(false);
/* 530 */     this.jTextField24.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 532 */             UserPanel.this.jTextField24ActionPerformed(evt);
/*     */           }
/*     */         });
/* 535 */     gridBagConstraints = new GridBagConstraints();
/* 536 */     gridBagConstraints.gridx = 7;
/* 537 */     gridBagConstraints.gridy = 1;
/* 538 */     gridBagConstraints.gridwidth = 9;
/* 539 */     gridBagConstraints.ipadx = 44;
/* 540 */     gridBagConstraints.anchor = 18;
/* 541 */     gridBagConstraints.insets = new Insets(18, 18, 0, 145);
/* 542 */     getContentPane().add(this.jTextField24, gridBagConstraints);
/*     */     
/* 544 */     this.jTextField25.setEditable(false);
/* 545 */     this.jTextField25.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 547 */             UserPanel.this.jTextField25ActionPerformed(evt);
/*     */           }
/*     */         });
/* 550 */     this.jTextField25.setVisible(false);
/* 551 */     gridBagConstraints = new GridBagConstraints();
/* 552 */     gridBagConstraints.gridx = 2;
/* 553 */     gridBagConstraints.gridy = 7;
/* 554 */     gridBagConstraints.gridheight = 2;
/* 555 */     gridBagConstraints.ipadx = 34;
/* 556 */     gridBagConstraints.anchor = 18;
/* 557 */     gridBagConstraints.insets = new Insets(6, 18, 0, 0);
/* 558 */     getContentPane().add(this.jTextField25, gridBagConstraints);
/*     */     
/* 560 */     this.jTextField26.setEditable(false);
/* 561 */     gridBagConstraints = new GridBagConstraints();
/* 562 */     gridBagConstraints.gridx = 7;
/* 563 */     gridBagConstraints.gridy = 7;
/* 564 */     gridBagConstraints.gridwidth = 9;
/* 565 */     gridBagConstraints.gridheight = 2;
/* 566 */     gridBagConstraints.ipadx = 44;
/* 567 */     gridBagConstraints.anchor = 18;
/* 568 */     gridBagConstraints.insets = new Insets(6, 18, 0, 145);
/* 569 */     getContentPane().add(this.jTextField26, gridBagConstraints);
/*     */     
/* 571 */     this.jButton1.setText("ok");
/* 572 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 574 */             UserPanel.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/* 577 */     this.jButton1.addKeyListener(new KeyAdapter() {
/*     */           public void keyPressed(KeyEvent evt) {
/* 579 */             UserPanel.this.jButton1KeyPressed(evt);
/*     */           }
/*     */         });
/* 582 */     gridBagConstraints = new GridBagConstraints();
/* 583 */     gridBagConstraints.gridx = 7;
/* 584 */     gridBagConstraints.gridy = 9;
/* 585 */     gridBagConstraints.gridwidth = 9;
/* 586 */     gridBagConstraints.ipadx = 10;
/* 587 */     gridBagConstraints.anchor = 18;
/* 588 */     gridBagConstraints.insets = new Insets(11, 15, 221, 145);
/* 589 */     getContentPane().add(this.jButton1, gridBagConstraints);
/*     */     
/* 591 */     this.jLabel1.setText("jLabel1");
/* 592 */     gridBagConstraints = new GridBagConstraints();
/* 593 */     gridBagConstraints.gridx = 3;
/* 594 */     gridBagConstraints.gridy = 7;
/* 595 */     gridBagConstraints.gridwidth = 2;
/* 596 */     gridBagConstraints.anchor = 18;
/* 597 */     gridBagConstraints.insets = new Insets(11, 55, 0, 0);
/* 598 */     getContentPane().add(this.jLabel1, gridBagConstraints);
/*     */     
/* 600 */     this.jLabel2.setFont(new Font("Urdu Typesetting", 1, 24));
/* 601 */     this.jLabel2.setForeground(new Color(255, 0, 0));
/* 602 */     this.jLabel2.setHorizontalAlignment(2);
/* 603 */     this.jLabel2.setText("CUMMULATIVE GRADE POINT CALCULATOR");
/* 604 */     gridBagConstraints = new GridBagConstraints();
/* 605 */     gridBagConstraints.gridx = 0;
/* 606 */     gridBagConstraints.gridy = 0;
/* 607 */     gridBagConstraints.gridwidth = 8;
/* 608 */     gridBagConstraints.ipadx = 67;
/* 609 */     gridBagConstraints.anchor = 18;
/* 610 */     gridBagConstraints.insets = new Insets(39, 123, 0, 0);
/* 611 */     getContentPane().add(this.jLabel2, gridBagConstraints);
/*     */     
/* 613 */     pack();
/*     */   }
/*     */ 
/*     */   
/*     */   private void jComboBox1ActionPerformed(ActionEvent evt) {
/* 618 */     Connectivity con = new Connectivity();
/* 619 */     con.connectToDatabase();
/* 620 */     con.setTheTextFields(this.jTextField1, this.jComboBox1, this.jTextField7);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void jComboBox2ActionPerformed(ActionEvent evt) {
/* 626 */     Connectivity con = new Connectivity();
/* 627 */     con.connectToDatabase();
/* 628 */     con.setTheTextFields(this.jTextField2, this.jComboBox2, this.jTextField8);
/*     */   }
/*     */ 
/*     */   
/*     */   private void jComboBox3ActionPerformed(ActionEvent evt) {
/* 633 */     Connectivity con = new Connectivity();
/* 634 */     con.connectToDatabase();
/* 635 */     con.setTheTextFields(this.jTextField3, this.jComboBox3, this.jTextField9);
/*     */   }
/*     */ 
/*     */   
/*     */   private void jComboBox4ActionPerformed(ActionEvent evt) {
/* 640 */     Connectivity con = new Connectivity();
/* 641 */     con.connectToDatabase();
/* 642 */     con.setTheTextFields(this.jTextField4, this.jComboBox4, this.jTextField10);
/*     */   }
/*     */ 
/*     */   
/*     */   private void jComboBox5ActionPerformed(ActionEvent evt) {
/* 647 */     Connectivity con = new Connectivity();
/* 648 */     con.connectToDatabase();
/* 649 */     con.setTheTextFields(this.jTextField5, this.jComboBox5, this.jTextField11);
/*     */   }
/*     */ 
/*     */   
/*     */   private void jComboBox6ActionPerformed(ActionEvent evt) {
/* 654 */     Connectivity con = new Connectivity();
/* 655 */     con.connectToDatabase();
/* 656 */     con.setTheTextFields(this.jTextField6, this.jComboBox6, this.jTextField12);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void jComboBox7ActionPerformed(ActionEvent evt) {
/* 662 */     Connectivity con = new Connectivity();
/* 663 */     con.connectToDatabase();
/* 664 */     con.assignUnit(this.jComboBox7, this.jTextField18);
/*     */     
/* 666 */     int first = Integer.parseInt(this.jTextField1.getText());
/* 667 */     int second = Integer.parseInt(this.jTextField18.getText());
/* 668 */     int answer = first * second;
/* 669 */     this.jTextField24.setText(answer + "");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jComboBox8ActionPerformed(ActionEvent evt) {
/* 676 */     Connectivity con = new Connectivity();
/* 677 */     con.connectToDatabase();
/* 678 */     con.assignUnit(this.jComboBox8, this.jTextField17);
/* 679 */     int first = Integer.parseInt(this.jTextField2.getText());
/* 680 */     int second = Integer.parseInt(this.jTextField17.getText());
/* 681 */     int answer = first * second;
/* 682 */     this.jTextField23.setText(answer + "");
/*     */   }
/*     */ 
/*     */   
/*     */   private void jComboBox9ActionPerformed(ActionEvent evt) {
/* 687 */     Connectivity con = new Connectivity();
/* 688 */     con.connectToDatabase();
/* 689 */     con.assignUnit(this.jComboBox9, this.jTextField16);
/* 690 */     int first = Integer.parseInt(this.jTextField3.getText());
/* 691 */     int second = Integer.parseInt(this.jTextField16.getText());
/* 692 */     int answer = first * second;
/* 693 */     this.jTextField22.setText(answer + "");
/*     */   }
/*     */ 
/*     */   
/*     */   private void jComboBox10ActionPerformed(ActionEvent evt) {
/* 698 */     Connectivity con = new Connectivity();
/* 699 */     con.connectToDatabase();
/* 700 */     con.assignUnit(this.jComboBox10, this.jTextField15);
/* 701 */     int first = Integer.parseInt(this.jTextField4.getText());
/* 702 */     int second = Integer.parseInt(this.jTextField15.getText());
/* 703 */     int answer = first * second;
/* 704 */     this.jTextField21.setText(answer + "");
/*     */   }
/*     */ 
/*     */   
/*     */   private void jComboBox11ActionPerformed(ActionEvent evt) {
/* 709 */     Connectivity con = new Connectivity();
/* 710 */     con.connectToDatabase();
/* 711 */     con.assignUnit(this.jComboBox11, this.jTextField14);
/* 712 */     int first = Integer.parseInt(this.jTextField5.getText());
/* 713 */     int second = Integer.parseInt(this.jTextField14.getText());
/* 714 */     int answer = first * second;
/* 715 */     this.jTextField20.setText(answer + "");
/*     */   }
/*     */ 
/*     */   
/*     */   private void jComboBox12ActionPerformed(ActionEvent evt) {
/* 720 */     Connectivity con = new Connectivity();
/* 721 */     con.connectToDatabase();
/* 722 */     con.assignUnit(this.jComboBox12, this.jTextField13);
/* 723 */     int first = Integer.parseInt(this.jTextField6.getText());
/* 724 */     int second = Integer.parseInt(this.jTextField13.getText());
/* 725 */     int answer = first * second;
/* 726 */     this.jTextField19.setText(answer + "");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jTextField24ActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void formInputMethodTextChanged(InputMethodEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 741 */     this.jTextField25.setVisible(true);
/* 742 */     this.jTextField26.setVisible(true);
/* 743 */     this.jLabel1.setVisible(true);
/* 744 */     int overallUnit = Integer.parseInt(this.jTextField1.getText()) + Integer.parseInt(this.jTextField2.getText()) + Integer.parseInt(this.jTextField3.getText()) + Integer.parseInt(this.jTextField4.getText()) + Integer.parseInt(this.jTextField5.getText()) + Integer.parseInt(this.jTextField6.getText());
/*     */ 
/*     */     
/* 747 */     this.jTextField25.setText(overallUnit + "");
/* 748 */     int overallMark = Integer.parseInt(this.jTextField24.getText()) + Integer.parseInt(this.jTextField23.getText()) + Integer.parseInt(this.jTextField22.getText()) + Integer.parseInt(this.jTextField21.getText()) + Integer.parseInt(this.jTextField20.getText()) + Integer.parseInt(this.jTextField19.getText());
/*     */ 
/*     */     
/* 751 */     this.jTextField26.setText(overallMark + "");
/* 752 */     double real = overallMark / overallUnit;
/* 753 */     String casted = String.format("%.2f", new Object[] { Double.valueOf(real) });
/* 754 */     this.jLabel1.setText(casted + "");
/*     */   }

/*     */   
/*     */   private void jTextField25ActionPerformed(ActionEvent evt) {}
/*     */ 

/*     */   
/*     */   private void jButton1KeyPressed(KeyEvent evt) {}

/*     */   public static void main(String[] args) {
/*     */     try {
/* 784 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 785 */         if ("Nimbus".equals(info.getName())) {
/* 786 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 790 */     } catch (ClassNotFoundException ex) {
/* 791 */       Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 792 */     } catch (InstantiationException ex) {
/* 793 */       Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 794 */     } catch (IllegalAccessException ex) {
/* 795 */       Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 796 */     } catch (UnsupportedLookAndFeelException ex) {
/* 797 */       Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 

/* 804 */     EventQueue.invokeLater(new Runnable()
/*     */         {
/*     */           public void run() {
/* 807 */             (new UserPanel()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\ABAS\Documents\old\documents\Documents\GPCAL.jar!\cgp\UserPanel.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */