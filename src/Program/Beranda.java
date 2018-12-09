package Program;

import java.sql.*;
import javax.swing.*;

public class Beranda extends javax.swing.JFrame {

    private Connection conn = new Koneksi().connect();
    
    public Beranda() {
        initComponents();
        Btn_Pegawai.setEnabled(true);
        Btn_Pesan.setEnabled(true);
        Btn_Keluar.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Lb_Judul = new javax.swing.JLabel();
        Btn_Pegawai = new javax.swing.JButton();
        Btn_Pesan = new javax.swing.JButton();
        Btn_Keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        Lb_Judul.setFont(new java.awt.Font("Bite _ Bullet", 1, 48)); // NOI18N
        Lb_Judul.setForeground(new java.awt.Color(255, 153, 153));
        Lb_Judul.setText("NANDOO'S STREET FOOD");

        Btn_Pegawai.setBackground(new java.awt.Color(255, 153, 153));
        Btn_Pegawai.setFont(new java.awt.Font("Bite _ Bullet", 1, 36)); // NOI18N
        Btn_Pegawai.setForeground(new java.awt.Color(204, 204, 255));
        Btn_Pegawai.setText("PEGAWAI");
        Btn_Pegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PegawaiActionPerformed(evt);
            }
        });

        Btn_Pesan.setBackground(new java.awt.Color(255, 153, 153));
        Btn_Pesan.setFont(new java.awt.Font("Bite _ Bullet", 1, 36)); // NOI18N
        Btn_Pesan.setForeground(new java.awt.Color(204, 204, 255));
        Btn_Pesan.setText("PESAN");
        Btn_Pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PesanActionPerformed(evt);
            }
        });

        Btn_Keluar.setBackground(new java.awt.Color(255, 153, 153));
        Btn_Keluar.setFont(new java.awt.Font("Bite _ Bullet", 1, 36)); // NOI18N
        Btn_Keluar.setForeground(new java.awt.Color(204, 204, 255));
        Btn_Keluar.setText("KELUAR");
        Btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Lb_Judul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Pesan, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Pegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Judul)
                .addGap(18, 18, 18)
                .addComponent(Btn_Pegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Btn_Pesan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Btn_Keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KeluarActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(null, "Apakah Anda Akan Keluar Dari Aplikasi ?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_Btn_KeluarActionPerformed

    private void Btn_PegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PegawaiActionPerformed
        this.dispose();
        SignIn reg = new SignIn();
        reg.setVisible(true);
    }//GEN-LAST:event_Btn_PegawaiActionPerformed

    private void Btn_PesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PesanActionPerformed
        this.dispose();
        Menu reg = new Menu();
        reg.setVisible(true);
    }//GEN-LAST:event_Btn_PesanActionPerformed

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
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beranda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Keluar;
    private javax.swing.JButton Btn_Pegawai;
    private javax.swing.JButton Btn_Pesan;
    private javax.swing.JLabel Lb_Judul;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
