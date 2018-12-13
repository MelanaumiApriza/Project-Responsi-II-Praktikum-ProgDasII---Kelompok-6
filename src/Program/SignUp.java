package Program;

import java.sql.*;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

    private Connection conn = new Koneksi().connect();

    public SignUp() {
        initComponents();
        Txt_IDPeg.setEnabled(true);
        Txt_NamaPeg.setEnabled(true);
        Txt_AlamatPeg.setEnabled(true);
        Txt_username.setEnabled(true);
        Txt_password.setEnabled(true);
        Btn_SignIn.setEnabled(true);
        Btn_SignUp.setEnabled(true);
        Btn_TryAgain.setEnabled(true);
        Btn_Close.setEnabled(true);
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
        Btn_TryAgain = new javax.swing.JButton();
        Btn_SignUp = new javax.swing.JButton();
        Btn_SignIn = new javax.swing.JButton();
        Btn_Close = new javax.swing.JButton();

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

        Btn_TryAgain.setBackground(new java.awt.Color(255, 153, 153));
        Btn_TryAgain.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Btn_TryAgain.setForeground(new java.awt.Color(204, 204, 255));
        Btn_TryAgain.setText("TRY AGAIN");
        Btn_TryAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TryAgainActionPerformed(evt);
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

        Btn_SignIn.setBackground(new java.awt.Color(255, 153, 153));
        Btn_SignIn.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Btn_SignIn.setForeground(new java.awt.Color(204, 204, 255));
        Btn_SignIn.setText("SIGN IN");
        Btn_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SignInActionPerformed(evt);
            }
        });

        Btn_Close.setBackground(new java.awt.Color(255, 153, 153));
        Btn_Close.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Btn_Close.setForeground(new java.awt.Color(204, 204, 255));
        Btn_Close.setText("EXIT");
        Btn_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CloseActionPerformed(evt);
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
                        .addComponent(Lb_Password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                .addComponent(Btn_SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_TryAgain))
                            .addComponent(Txt_password)
                            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                .addComponent(Btn_SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(Btn_Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addComponent(Lb_UserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_username))
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                .addComponent(Lb_AlamatPeg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_AlamatPeg))
                            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                .addComponent(Lb_NamaPeg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_NamaPeg))
                            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                .addComponent(Lb_IDPeg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_IDPeg, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(Lb_SignUp)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        Pn_BackgroundLayout.setVerticalGroup(
            Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_SignUp)
                .addGap(38, 38, 38)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lb_IDPeg)
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
                    .addComponent(Btn_SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_TryAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pn_Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pn_Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_TryAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TryAgainActionPerformed
        int yakin = JOptionPane.showConfirmDialog(null, "Are You Sure To Try Again?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (yakin == JOptionPane.YES_OPTION) {
            Txt_IDPeg.setText("");
            Txt_NamaPeg.setText("");
            Txt_AlamatPeg.setText("");
            Txt_username.setText("");
            Txt_password.setText("");
            Txt_IDPeg.requestFocus();
        }
    }//GEN-LAST:event_Btn_TryAgainActionPerformed

    private void Btn_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SignUpActionPerformed
        String sql = "INSERT INTO Pegawai VALUES (?,?,?,?,?)";
        try {
            if (Txt_password.getText().isEmpty() || Txt_IDPeg.getText().isEmpty() || Txt_NamaPeg.getText().isEmpty() || Txt_AlamatPeg.getText().isEmpty() || Txt_username.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "SIGN UP FAILED! ANY DATA YOU MUST ENTER AGAIN!");
            } else {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.setString(1, Txt_IDPeg.getText());
                stat.setString(2, Txt_NamaPeg.getText());
                stat.setString(3, Txt_AlamatPeg.getText());
                stat.setString(4, Txt_username.getText());
                stat.setString(5, Txt_password.getText());

                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "SUCCESS TO SIGN UP");
                this.dispose();
                SignIn obj = new SignIn();
                obj.setVisible(true);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR TO SIGN UP" + e);
        }
    }//GEN-LAST:event_Btn_SignUpActionPerformed

    private void Btn_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SignInActionPerformed
        this.dispose();
        SignIn reg = new SignIn();
        reg.setVisible(true);
    }//GEN-LAST:event_Btn_SignInActionPerformed

    private void Btn_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CloseActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(null, "Apakah Anda Akan Keluar Dari Aplikasi ?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_Btn_CloseActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Close;
    private javax.swing.JButton Btn_SignIn;
    private javax.swing.JButton Btn_SignUp;
    private javax.swing.JButton Btn_TryAgain;
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
