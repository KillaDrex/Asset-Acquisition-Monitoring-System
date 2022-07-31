/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyApp;

import MyLibs.Employee;
import MyLibs.Manager;
import MyLibs.User;

/**
 *
 * @author killa
 */
public class LoginPage extends javax.swing.JPanel {
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
     
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField3;
    
    private javax.swing.JButton jButton2;
    
    private javax.swing.JPanel jPanel1;
    
    public LoginPage(java.awt.Container parentContentPane) {
        initComponents(parentContentPane);
    }
    
    private void initComponents(java.awt.Container parentContentPane) {
        jLabel1 =  new javax.swing.JLabel();
        jLabel2 =  new javax.swing.JLabel();
        jLabel3 =  new javax.swing.JLabel();
        jLabel4 =  new javax.swing.JLabel();
        jLabel5 =  new javax.swing.JLabel();
        
        jPasswordField = new javax.swing.JPasswordField();
        jTextField3 = new javax.swing.JTextField();
        
        jButton2 = new javax.swing.JButton();
        
        jPanel1 = new javax.swing.JPanel();
        
        setBackground(new java.awt.Color(68, 78, 93));
        
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon-3.png")));
        
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Asset Acquisition &");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Monitoring System");

        jPanel1.setBackground(new java.awt.Color(78, 87, 101));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));

        jPasswordField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jPasswordField.setPreferredSize(new java.awt.Dimension(21, 20));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username:");

        jTextField3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField3.setPreferredSize(new java.awt.Dimension(21, 20));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password:");      
        
        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Log In");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );        
        
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );   
        
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
        setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2))
                        .addGap(48, 48, 48)))
                .addContainerGap(121, Short.MAX_VALUE))
        );  
        
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(parentContentPane);
        parentContentPane.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(this, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(this, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        AppForm parent = (AppForm)(getParent().getParent().getParent().getParent());
        
        // create user object based on log-in details
        User user = new User(jTextField3.getText(), jPasswordField.getText() );

        // log-in
        if (user.login(parent.getUserInfoList() ) ) {
            // iterate over user info list to determine employee position
            for (Object[] o : parent.getUserInfoList() ) {
                int objRequest = (Integer)o[2];
                
                if (objRequest == 0) {
                    user = new Employee(jTextField3.getText().substring(0, 1).toUpperCase() +
                                            jTextField3.getText().substring(1).toLowerCase(), jPasswordField.getText());
                } else {
                    user = new Manager(jTextField3.getText().substring(0, 1).toUpperCase() +
                                            jTextField3.getText().substring(1).toLowerCase(), jPasswordField.getText());
                }
            }
            
            // set main program's user
            parent.setUser(user);
            
            // clear login-error message
             parent.getLoginErrorMessageLabel().setForeground(new java.awt.Color(54, 50, 78));
            
            // move to user page
            parent.remove(this);
            parent.useJPanel(new ExtendedUserPage() );   
        } else {
            // log-in failed: show error message
            parent.getLoginErrorMessageLabel().setForeground(new java.awt.Color(255, 23, 73));
        }
    }
}
