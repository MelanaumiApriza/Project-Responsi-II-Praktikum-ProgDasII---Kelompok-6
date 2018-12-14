package Program;

import java.sql.*;
import javax.swing.*;

public class Antrian extends javax.swing.JFrame {

    public String Antri;
    static String no_antri;
    
    public String getAntri() {
        return Antri;
    }

    private Connection conn = new Koneksi().connect();

    public Antrian() {
        initComponents();
        Btn_Next.setEnabled(true);
        Btn_Cancel.setEnabled(true);
        AutoNomor();
    }

    public void AutoNomor() {
        try {
            Connection conn = new Koneksi().connect();

            Statement st = conn.createStatement();
            String sql = "SELECT MAX(NomorPesan) FROM pesan";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                int a = rs.getInt(1);
                no_antri = Integer.toString(a + 1);
                Txt_NoPesan.setText("" + no_antri);
            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pn_Background = new javax.swing.JPanel();
        Lb_Judul = new javax.swing.JLabel();
        Lb_Judul1 = new javax.swing.JLabel();
        Lb_NomorPesanan = new javax.swing.JLabel();
        Txt_NoPesan = new javax.swing.JTextField();
        Btn_Next = new javax.swing.JButton();
        Btn_Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pn_Background.setBackground(new java.awt.Color(204, 204, 255));

        Lb_Judul.setFont(new java.awt.Font("Bite _ Bullet", 1, 36)); // NOI18N
        Lb_Judul.setForeground(new java.awt.Color(255, 153, 153));
        Lb_Judul.setText("WELCOME TO NANDOO'S STREET FOOD");

        Lb_Judul1.setFont(new java.awt.Font("Bite _ Bullet", 1, 36)); // NOI18N
        Lb_Judul1.setForeground(new java.awt.Color(255, 153, 153));
        Lb_Judul1.setText("TAKE YOUR ORDER NUmBER");

        Lb_NomorPesanan.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Lb_NomorPesanan.setForeground(new java.awt.Color(255, 153, 153));
        Lb_NomorPesanan.setText("Nomor Pesanan                        :");

        Btn_Next.setBackground(new java.awt.Color(255, 153, 153));
        Btn_Next.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Btn_Next.setForeground(new java.awt.Color(204, 204, 255));
        Btn_Next.setText("Next");
        Btn_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NextActionPerformed(evt);
            }
        });

        Btn_Cancel.setBackground(new java.awt.Color(255, 153, 153));
        Btn_Cancel.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Btn_Cancel.setForeground(new java.awt.Color(204, 204, 255));
        Btn_Cancel.setText("Cancel");
        Btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pn_BackgroundLayout = new javax.swing.GroupLayout(Pn_Background);
        Pn_Background.setLayout(Pn_BackgroundLayout);
        Pn_BackgroundLayout.setHorizontalGroup(
            Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(Lb_Judul))
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(Lb_Judul1))
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Lb_NomorPesanan)
                        .addGap(30, 30, 30)
                        .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                .addComponent(Btn_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_Cancel))
                            .addComponent(Txt_NoPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        Pn_BackgroundLayout.setVerticalGroup(
            Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Judul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lb_Judul1)
                .addGap(43, 43, 43)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_NomorPesanan)
                    .addComponent(Txt_NoPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Cancel)
                    .addComponent(Btn_Next))
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

    private void Btn_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NextActionPerformed
        this.dispose();
        Menu reg = new Menu();
        reg.setVisible(true);
    }//GEN-LAST:event_Btn_NextActionPerformed

    private void Btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelActionPerformed
        int yakin = JOptionPane.showConfirmDialog(null, "Are You Sure To Cancel?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (yakin == JOptionPane.YES_OPTION) {
            Txt_NoPesan.setText("");
            Txt_NoPesan.requestFocus();
        }
    }//GEN-LAST:event_Btn_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(Antrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Antrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Antrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Antrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Antrian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cancel;
    private javax.swing.JButton Btn_Next;
    private javax.swing.JLabel Lb_Judul;
    private javax.swing.JLabel Lb_Judul1;
    private javax.swing.JLabel Lb_NomorPesanan;
    private javax.swing.JPanel Pn_Background;
    private javax.swing.JTextField Txt_NoPesan;
    // End of variables declaration//GEN-END:variables
}
