package ipl_project;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class N_ACCOUNT extends javax.swing.JFrame {

    /**
     * Creates new form N_ACCOUNT
     */
    public N_ACCOUNT() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jRadioButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 17)); // NOI18N
        jRadioButton3.setText("OTHER");
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(490, 290, 87, 33);

        jRadioButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 17)); // NOI18N
        jRadioButton2.setText("FEMALE ");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(310, 290, 99, 33);

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(450, 70, 180, 40);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel2.setText("NEW ACCOUNT");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 10, 183, 34);

        jTextField4.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jPanel1.add(jTextField4);
        jTextField4.setBounds(450, 400, 180, 34);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel6.setText("EMAIL ADDRESS*");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 400, 177, 28);

        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(450, 330, 180, 34);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel5.setText("PHONE NO*");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 340, 117, 28);

        jButton8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton8.setText("LOGIN PAGE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(120, 530, 119, 29);

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton12.setText("X");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(680, 20, 43, 29);

        jRadioButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 17)); // NOI18N
        jRadioButton1.setText("MALE");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(130, 290, 73, 33);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(350, 530, 79, 31);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(540, 530, 93, 31);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel3.setText("FIRST NAME*");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 80, 140, 28);

        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(450, 130, 180, 40);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 22)); // NOI18N
        jLabel4.setText("SELECT GENDER*");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 240, 192, 32);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel7.setText("LAST NAME");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(120, 140, 119, 28);

        jPasswordField1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(450, 470, 180, 30);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel9.setText("SET PASSWORD*");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 460, 160, 40);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel8.setText("ACCESS NO*");
        jLabel8.setToolTipText("The Access Number can be \nA01,A02,A03,A04, a01,a02,a03,a04\n according to Mysql\n Foreign Key implementation");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(120, 200, 126, 28);

        jTextField6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTextField6.setToolTipText("The Access no can be \nA01,A02,A03,A04, a01,a02,a03,a04\naccording to Mysql \nForeign Key implementation");
        jTextField6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField6CaretUpdate(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(450, 190, 180, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipl_project/light-pink-background.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 740, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate

    }//GEN-LAST:event_jTextField1CaretUpdate

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int l;
        l=JOptionPane.showConfirmDialog(this,"ARE YOU SURE YOU WANT TO QUIT", "IPL", JOptionPane.YES_NO_OPTION);
        if(l==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField6.setText(null);
        jPasswordField1.setText(null); 
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if((jTextField1.getText().isEmpty())||(jTextField3.getText().isEmpty())||(jTextField4.getText().isEmpty())
                ||(jPasswordField1.getText().isEmpty()))
                      {
           JOptionPane.showMessageDialog(this,"FIELDS WITH * ARE MANDATORY TO FILL !!!");
       }
        else
        {
           int l;
           l=JOptionPane.showConfirmDialog(this,"ARE YOU SURE YOU WANT TO PROCEED","IPL",JOptionPane.YES_NO_OPTION);
       if (l==0)
       {
           try
        {
           Class.forName("java.sql.Driver");
           Connection Con= DriverManager.getConnection("jdbc:mysql://localhost/ipl","root","mohalo");
           Statement Stmt=Con.createStatement();
           
           Object access_no,name,gender,phone_no,email,password;
           access_no=jTextField6.getText();
           name=jTextField1.getText().concat(" ").concat(jTextField2.getText());
           if(jRadioButton1.isSelected())
           {gender="Male";}
           else if(jRadioButton2.isSelected())
           {gender="Female";}
           else
           {gender="Other";}
           phone_no=jTextField3.getText();
           email=jTextField4.getText();
           password=String.copyValueOf(jPasswordField1.getPassword());
           
           String sql="Insert into b_account values('"+access_no+"','"+name+"','"+gender+"',"+phone_no+",'"+email+"','"+password+"');";
           Stmt.executeUpdate(sql);
       }
        catch(Exception k)
        {
            JOptionPane.showMessageDialog(this,k.getMessage());
        }
          
           {
               try
               {
                   Class.forName("java.sql.Driver");
                   Connection
                   con=DriverManager.getConnection("jdbc:mysql://localhost/ipl","root","mohalo");
                   Statement stmt=con.createStatement();
                   String Name=jTextField1.getText().concat(" ").concat(jTextField2.getText());
                   String sql="Select name from b_account where name='"+Name+"';";
                   ResultSet rs=stmt.executeQuery(sql);
                   while(rs.next())
                   {
                       Object name=rs.getObject("name");
                       if(name.equals(Name))
                       {
                           JOptionPane.showMessageDialog(this,"Account created successfully !!!");
                           dispose();
                           new Main_PageB();
                           Main_PageB.jMenuItem3.setText("LOGGED IN AS "+String.valueOf(name).toUpperCase());
                       }
                       else
                       {
                           JOptionPane.showMessageDialog(this,"Account not created");
                       }
                   }
                   
               }
               catch(Exception k)
               {
                   JOptionPane.showMessageDialog(this,k.getMessage());
               }
           }
       }
       else if(l==1)
       {
       }
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dispose();
        new Login_page();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField6CaretUpdate
      String A_no=jTextField6.getText();
        if(("A01".equals(A_no))||("A02".equals(A_no))||("A03".equals(A_no))||("A04".equals(A_no))
                ||("a01".equals(A_no))||("a02".equals(A_no))||("a03".equals(A_no))
                ||("a04".equals(A_no)))
        {
            jButton1.setEnabled(true);
        }
        else
        {
            jButton1.setEnabled(false);
        }
        
    }//GEN-LAST:event_jTextField6CaretUpdate

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(N_ACCOUNT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(N_ACCOUNT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(N_ACCOUNT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(N_ACCOUNT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new N_ACCOUNT().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
