/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ipl_project;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class PCap_A extends javax.swing.JFrame {

    /**
     * Creates new form PCap_A
     */
    public PCap_A() {
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
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton2.setText("SEASON 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(300, 190, 120, 60);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton1.setText("SEASON 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(140, 190, 120, 60);

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton4.setText("SEASON 4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(300, 280, 120, 60);

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton3.setText("SEASON 3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(460, 190, 120, 60);

        jButton9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton9.setText("GO BACK <<");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(230, 530, 107, 29);

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton6.setText("SEASON 6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(460, 280, 120, 60);

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton5.setText("SEASON 5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(140, 280, 120, 60);

        jTable1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "WICKETS", "MATCHES", "TEAM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(255, 0, 255));
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 370, 600, 110);

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton15.setText("X");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(700, 10, 43, 29);

        jButton7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton7.setText("CLEAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(380, 530, 75, 29);

        jLabel2.setBackground(new java.awt.Color(255, 200, 0));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipl_project/ipl-purple-cap.jpg"))); // NOI18N
        jLabel2.setText("   PURPLE CAP");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 10, 438, 160);

        jButton10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton10.setText("NEXT(ORANGE CAP)");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(500, 530, 169, 29);

        jButton8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton8.setText("MAIN MENU");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(70, 530, 119, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipl_project/light-pink-background.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton7.doClick();
        DefaultTableModel
        Model = (DefaultTableModel)jTable1.getModel();

        try
        {
            Class.forName("java.sql.Driver");
            Connection Con= DriverManager.getConnection("jdbc:mysql://localhost/ipl","root","mohalo");
            Statement Stmt=Con.createStatement();
            String sql="Select * from P_Cap2;";
            ResultSet rs= Stmt.executeQuery(sql);
            while(rs.next())
            {
                Object Name=rs.getObject("Name");
                Object Wickets=rs.getObject("Wickets");
                Object Matches=rs.getObject("Matches");
                Object Team=rs.getObject("Team");

                Model.addRow(new Object[]{Name,Wickets,Matches,Team});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton7.doClick();
        DefaultTableModel
        Model = (DefaultTableModel)jTable1.getModel();

        try
        {
            Class.forName("java.sql.Driver");
            Connection Con= DriverManager.getConnection("jdbc:mysql://localhost/ipl","root","mohalo");
            Statement Stmt=Con.createStatement();
            String sql="Select * from P_Cap1;";
            ResultSet rs= Stmt.executeQuery(sql);
            while(rs.next())
            {
                Object Name=rs.getObject("Name");
                Object Wickets=rs.getObject("Wickets");
                Object Matches=rs.getObject("Matches");
                Object Team=rs.getObject("Team");

                Model.addRow(new Object[]{Name,Wickets,Matches,Team});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton7.doClick();
        DefaultTableModel
        Model = (DefaultTableModel)jTable1.getModel();

        try
        {
            Class.forName("java.sql.Driver");
            Connection Con= DriverManager.getConnection("jdbc:mysql://localhost/ipl","root","mohalo");
            Statement Stmt=Con.createStatement();
            String sql="Select * from P_Cap4;";
            ResultSet rs= Stmt.executeQuery(sql);
            while(rs.next())
            {
                Object Name=rs.getObject("Name");
                Object Wickets=rs.getObject("Wickets");
                Object Matches=rs.getObject("Matches");
                Object Team=rs.getObject("Team");

                Model.addRow(new Object[]{Name,Wickets,Matches,Team});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton7.doClick();
        DefaultTableModel
        Model = (DefaultTableModel)jTable1.getModel();

        try
        {
            Class.forName("java.sql.Driver");
            Connection Con= DriverManager.getConnection("jdbc:mysql://localhost/ipl","root","mohalo");
            Statement Stmt=Con.createStatement();
            String sql="Select * from P_Cap3;";
            ResultSet rs= Stmt.executeQuery(sql);
            while(rs.next())
            {
                Object Name=rs.getObject("Name");
                Object Wickets=rs.getObject("Wickets");
                Object Matches=rs.getObject("Matches");
                Object Team=rs.getObject("Team");

                Model.addRow(new Object[]{Name,Wickets,Matches,Team});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        dispose();
        new OCap_A();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton7.doClick();
        DefaultTableModel
        Model = (DefaultTableModel)jTable1.getModel();

        try
        {
            Class.forName("java.sql.Driver");
            Connection Con= DriverManager.getConnection("jdbc:mysql://localhost/ipl","root","mohalo");
            Statement Stmt=Con.createStatement();
            String sql="Select * from P_Cap6;";
            ResultSet rs= Stmt.executeQuery(sql);
            while(rs.next())
            {
                Object Name=rs.getObject("Name");
                Object Wickets=rs.getObject("Wickets");
                Object Matches=rs.getObject("Matches");
                Object Team=rs.getObject("Team");

                Model.addRow(new Object[]{Name,Wickets,Matches,Team});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton7.doClick();
        DefaultTableModel
        Model = (DefaultTableModel)jTable1.getModel();

        try
        {
            Class.forName("java.sql.Driver");
            Connection Con= DriverManager.getConnection("jdbc:mysql://localhost/ipl","root","mohalo");
            Statement Stmt=Con.createStatement();
            String sql="Select * from P_Cap5;";
            ResultSet rs= Stmt.executeQuery(sql);
            while(rs.next())
            {
                Object Name=rs.getObject("Name");
                Object Wickets=rs.getObject("Wickets");
                Object Matches=rs.getObject("Matches");
                Object Team=rs.getObject("Team");

                Model.addRow(new Object[]{Name,Wickets,Matches,Team});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        int l;
        l=JOptionPane.showConfirmDialog(this,"ARE YOU SURE YOU WANT TO QUIT", "IPL", JOptionPane.YES_NO_OPTION);
        if(l==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int rows;
        rows=jTable1.getRowCount();
        DefaultTableModel
        Model=(DefaultTableModel)jTable1.getModel();
        for(int i=0;i<rows;i++)
        {
            Model.removeRow(0);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        dispose();
        new OCap_A();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dispose();
        new Main_PageA();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(PCap_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PCap_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PCap_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PCap_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PCap_A().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
