package Program;

import java.sql.*;
import javax.swing.*;

public class SignIn extends javax.swing.JFrame {

    private Connection conn = new Koneksi().connect();

    public SignIn() {
        initComponents();
        Txt_Username.setEnabled(true);
        Txt_Password.setEnabled(true);
        Btn_SignIn.setEnabled(true);
        Btn_SignUp.setEnabled(true);
        Btn_Exit.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pn_Background = new javax.swing.JPanel();
        Lb_Title = new javax.swing.JLabel();
        Lb_Username = new javax.swing.JLabel();
        Lb_Password = new javax.swing.JLabel();
        Txt_Username = new javax.swing.JTextField();
        Txt_Password = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Btn_SignIn = new javax.swing.JButton();
        Btn_SignUp = new javax.swing.JButton();
        Btn_Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        Pn_Background.setBackground(new java.awt.Color(204, 204, 255));

        Lb_Title.setFont(new java.awt.Font("Bite _ Bullet", 1, 36)); // NOI18N
        Lb_Title.setForeground(new java.awt.Color(255, 153, 153));
        Lb_Title.setText("SIGN IN TO YOU, ENJOY YOUR WORKS.");

        Lb_Username.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Lb_Username.setForeground(new java.awt.Color(255, 153, 153));
        Lb_Username.setText("Username           :");

        Lb_Password.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Lb_Password.setForeground(new java.awt.Color(255, 153, 153));
        Lb_Password.setText("Password            :");

        Btn_SignIn.setBackground(new java.awt.Color(255, 153, 153));
        Btn_SignIn.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Btn_SignIn.setForeground(new java.awt.Color(204, 204, 255));
        Btn_SignIn.setText("SIGN IN");
        Btn_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SignInActionPerformed(evt);
            }
        });

        Btn_SignUp.setBackground(new java.awt.Color(255, 153, 153));
        Btn_SignUp.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Btn_SignUp.setForeground(new java.awt.Color(204, 204, 255));
        Btn_SignUp.setText("SIGN UP");
        Btn_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SignUpActionPerformed(evt);
            }
        });

        Btn_Exit.setBackground(new java.awt.Color(255, 153, 153));
        Btn_Exit.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Btn_Exit.setForeground(new java.awt.Color(204, 204, 255));
        Btn_Exit.setText("EXIT");
        Btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pn_BackgroundLayout = new javax.swing.GroupLayout(Pn_Background);
        Pn_Background.setLayout(Pn_BackgroundLayout);
        Pn_BackgroundLayout.setHorizontalGroup(
            Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn_BackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                .addComponent(Lb_Username)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Lb_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn_BackgroundLayout.createSequentialGroup()
                        .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                .addComponent(Lb_Password)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Txt_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Btn_SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn_SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14)))
                .addContainerGap())
        );
        Pn_BackgroundLayout.setVerticalGroup(
            Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_Username)
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Txt_Username, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_Password)
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Txt_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_SignIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_SignUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Exit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pn_Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pn_Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SignInActionPerformed
        try {
            String sql = "SELECT * FROM Pegawai WHERE Username = '" + Txt_Username.getText() + "' AND Password ='" + Txt_Password.getText() + "' ";
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            if (hasil.next()) {
                if (Txt_Username.getText().equals(hasil.getString("Username")) && Txt_Password.getText().equals(hasil.getString("Password"))) {
                    JOptionPane.showMessageDialog(null, "Sign In Success");
                    this.dispose();
                    Menu obj = new Menu();
                    obj.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username Or Password");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_Btn_SignInActionPerformed

    private void Btn_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SignUpActionPerformed
        this.dispose();
        SignUp reg = new SignUp();
        reg.setVisible(true);
    }//GEN-LAST:event_Btn_SignUpActionPerformed

    private void Btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ExitActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(null, "Apakah Anda Akan Keluar Dari Aplikasi ?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_Btn_ExitActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Exit;
    private javax.swing.JButton Btn_SignIn;
    private javax.swing.JButton Btn_SignUp;
    private javax.swing.JLabel Lb_Password;
    private javax.swing.JLabel Lb_Title;
    private javax.swing.JLabel Lb_Username;
    private javax.swing.JPanel Pn_Background;
    private javax.swing.JTextField Txt_Password;
    private javax.swing.JTextField Txt_Username;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
