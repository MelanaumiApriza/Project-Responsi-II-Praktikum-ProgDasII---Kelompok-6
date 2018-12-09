package Program;

import java.sql.*;
import javax.swing.*;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pn_Background = new javax.swing.JPanel();
        Lb_SignUp = new javax.swing.JLabel();
        Lb_IDPeg = new javax.swing.JLabel();
        Lb_NamaPeg = new javax.swing.JLabel();
        Lb_AlamatPeg = new javax.swing.JLabel();
        Lb_UserName = new javax.swing.JLabel();
        Lb_Password = new javax.swing.JLabel();
        Txt_IDPeg = new javax.swing.JTextField();
        Txt_NamaPeg = new javax.swing.JTextField();
        Txt_AlamatPeg = new javax.swing.JTextField();
        Txt_username = new javax.swing.JTextField();
        Txt_password = new javax.swing.JTextField();
        Btn_SignUp = new javax.swing.JButton();
        Btn_SignUp1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pn_Background.setBackground(new java.awt.Color(204, 204, 255));

        Lb_SignUp.setFont(new java.awt.Font("Bite _ Bullet", 1, 36)); // NOI18N
        Lb_SignUp.setForeground(new java.awt.Color(255, 153, 153));
        Lb_SignUp.setText("SIGN UP FOR CONTINUE YOUR WORKS");

        Lb_IDPeg.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Lb_IDPeg.setForeground(new java.awt.Color(255, 153, 153));
        Lb_IDPeg.setText("ID Pegawai               :");

        Lb_NamaPeg.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Lb_NamaPeg.setForeground(new java.awt.Color(255, 153, 153));
        Lb_NamaPeg.setText("Nama Pegawai      : ");

        Lb_AlamatPeg.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Lb_AlamatPeg.setForeground(new java.awt.Color(255, 153, 153));
        Lb_AlamatPeg.setText("Alamat Pegawai   :");

        Lb_UserName.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Lb_UserName.setForeground(new java.awt.Color(255, 153, 153));
        Lb_UserName.setText("Username                : ");

        Lb_Password.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Lb_Password.setForeground(new java.awt.Color(255, 153, 153));
        Lb_Password.setText("Password                 :");

        Btn_SignUp.setBackground(new java.awt.Color(255, 153, 153));
        Btn_SignUp.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Btn_SignUp.setForeground(new java.awt.Color(204, 204, 255));
        Btn_SignUp.setText("TRY AGAIN");
        Btn_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SignUpActionPerformed(evt);
            }
        });

        Btn_SignUp1.setBackground(new java.awt.Color(255, 153, 153));
        Btn_SignUp1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Btn_SignUp1.setForeground(new java.awt.Color(204, 204, 255));
        Btn_SignUp1.setText("SIGN UP");
        Btn_SignUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SignUp1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pn_BackgroundLayout = new javax.swing.GroupLayout(Pn_Background);
        Pn_Background.setLayout(Pn_BackgroundLayout);
        Pn_BackgroundLayout.setHorizontalGroup(
            Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addComponent(Lb_IDPeg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_IDPeg))
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addComponent(Lb_NamaPeg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_NamaPeg))
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addComponent(Lb_AlamatPeg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_AlamatPeg))
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addComponent(Lb_UserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_username))
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addComponent(Lb_SignUp)
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addComponent(Lb_Password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                .addComponent(Btn_SignUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_SignUp))
                            .addComponent(Txt_password))))
                .addContainerGap())
        );
        Pn_BackgroundLayout.setVerticalGroup(
            Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addComponent(Lb_SignUp)
                        .addGap(41, 41, 41)
                        .addComponent(Lb_IDPeg))
                    .addComponent(Txt_IDPeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_NamaPeg)
                    .addComponent(Txt_NamaPeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_AlamatPeg)
                    .addComponent(Txt_AlamatPeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_UserName)
                    .addComponent(Txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Password)
                    .addComponent(Txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_SignUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pn_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pn_Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SignUpActionPerformed
        int yakin = JOptionPane.showConfirmDialog(null, "Are You Sure To Try Again?","Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(yakin == JOptionPane.YES_OPTION) {
                Txt_IDPeg.setText("");
                Txt_NamaPeg.setText("");
                Txt_AlamatPeg.setText("");
                Txt_username.setText("");
                Txt_password.setText("");
                Txt_IDPeg.requestFocus();
            }
    }//GEN-LAST:event_Btn_SignUpActionPerformed

    private void Btn_SignUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SignUp1ActionPerformed
        JOptionPane.showMessageDialog(null, "Success To Sign Up","Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Btn_SignUp1ActionPerformed
   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_SignUp;
    private javax.swing.JButton Btn_SignUp1;
    private javax.swing.JLabel Lb_AlamatPeg;
    private javax.swing.JLabel Lb_IDPeg;
    private javax.swing.JLabel Lb_NamaPeg;
    private javax.swing.JLabel Lb_Password;
    private javax.swing.JLabel Lb_SignUp;
    private javax.swing.JLabel Lb_UserName;
    private javax.swing.JPanel Pn_Background;
    private javax.swing.JTextField Txt_AlamatPeg;
    private javax.swing.JTextField Txt_IDPeg;
    private javax.swing.JTextField Txt_NamaPeg;
    private javax.swing.JTextField Txt_password;
    private javax.swing.JTextField Txt_username;
    // End of variables declaration//GEN-END:variables
}
