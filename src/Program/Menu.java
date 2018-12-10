package Program;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    private Connection conn = new Koneksi().connect();
    private DefaultTableModel tabmode;

    protected void aktif() {
        Txt_NoPesanan.setEnabled(true);
        Txt_IDMenu.setEnabled(true);
        Txt_Harga.setEnabled(true);
        Txt_Jumlah.setEnabled(true);
        Txt_TotalPembayaran.setEnabled(true);
        Txt_IDMenu.requestFocus();
    }

    protected void kosong() {
        Txt_NoPesanan.setText("");
        Txt_IDMenu.setText("");
        Txt_Harga.setText("");
        Txt_Jumlah.setText("");
        Txt_TotalPembayaran.setText("");
    }

    protected void datatable() {
        Object[] Baris = {"ID Menu", "Menu Pilihan", "Harga Satuan"};
        tabmode = new DefaultTableModel(null, Baris);
        Tbl_Pesanan.setModel(tabmode);
        String sql = "SELECT * FROM menu";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String IDMenu = hasil.getString("KD_Menu");
                String Menu = hasil.getString("Menu");
                String Harga = hasil.getString("Harga");

                String[] data = {IDMenu, Menu, Harga};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
    }

    public Menu() {
        initComponents();
        datatable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pn_Background = new javax.swing.JPanel();
        Lb_Judul = new javax.swing.JLabel();
        Lb_Harga = new javax.swing.JLabel();
        Lb_Jumlah = new javax.swing.JLabel();
        Lb_NoPesanan = new javax.swing.JLabel();
        Txt_NoPesanan = new javax.swing.JTextField();
        Txt_Harga = new javax.swing.JTextField();
        Txt_Jumlah = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Pesanan = new javax.swing.JTable();
        Lb_Jumlah1 = new javax.swing.JLabel();
        Txt_TotalPembayaran = new javax.swing.JTextField();
        Btn_Pesan = new javax.swing.JButton();
        Btn_Hapus = new javax.swing.JButton();
        Btn_Simpan = new javax.swing.JButton();
        Btn_Tutup = new javax.swing.JButton();
        Lb_Judul1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Lb_Jumlah2 = new javax.swing.JLabel();
        Txt_IDMenu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pn_Background.setBackground(new java.awt.Color(204, 204, 255));

        Lb_Judul.setFont(new java.awt.Font("Bite _ Bullet", 1, 36)); // NOI18N
        Lb_Judul.setForeground(new java.awt.Color(255, 153, 153));
        Lb_Judul.setText("CHOOSE YOUR MENU!!! ENJOY!!!");

        Lb_Harga.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Lb_Harga.setForeground(new java.awt.Color(255, 153, 153));
        Lb_Harga.setText("Harga Satuan                                      :");

        Lb_Jumlah.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Lb_Jumlah.setForeground(new java.awt.Color(255, 153, 153));
        Lb_Jumlah.setText("Jumlah                                                     :");

        Lb_NoPesanan.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Lb_NoPesanan.setForeground(new java.awt.Color(255, 153, 153));
        Lb_NoPesanan.setText("Nomor Pesanan                                 :");

        Tbl_Pesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Menu", "Menu Pilihan", "Harga Satuan"
            }
        ));
        jScrollPane1.setViewportView(Tbl_Pesanan);

        Lb_Jumlah1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Lb_Jumlah1.setForeground(new java.awt.Color(255, 153, 153));
        Lb_Jumlah1.setText("Total Pembayaran                           :");

        Btn_Pesan.setBackground(new java.awt.Color(255, 153, 153));
        Btn_Pesan.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Btn_Pesan.setForeground(new java.awt.Color(204, 204, 255));
        Btn_Pesan.setText("PESAN");

        Btn_Hapus.setBackground(new java.awt.Color(255, 153, 153));
        Btn_Hapus.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Btn_Hapus.setForeground(new java.awt.Color(204, 204, 255));
        Btn_Hapus.setText("HAPUS");

        Btn_Simpan.setBackground(new java.awt.Color(255, 153, 153));
        Btn_Simpan.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Btn_Simpan.setForeground(new java.awt.Color(204, 204, 255));
        Btn_Simpan.setText("SIMPAN");

        Btn_Tutup.setBackground(new java.awt.Color(255, 153, 153));
        Btn_Tutup.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Btn_Tutup.setForeground(new java.awt.Color(204, 204, 255));
        Btn_Tutup.setText("TUTUP");

        Lb_Judul1.setFont(new java.awt.Font("Bite _ Bullet", 1, 36)); // NOI18N
        Lb_Judul1.setForeground(new java.awt.Color(255, 153, 153));
        Lb_Judul1.setText("WELCOME TO NANDOo'S STREET FOOD");

        Lb_Jumlah2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Lb_Jumlah2.setForeground(new java.awt.Color(255, 153, 153));
        Lb_Jumlah2.setText("Kode Menu                                            :");

        javax.swing.GroupLayout Pn_BackgroundLayout = new javax.swing.GroupLayout(Pn_Background);
        Pn_Background.setLayout(Pn_BackgroundLayout);
        Pn_BackgroundLayout.setHorizontalGroup(
            Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                .addComponent(Lb_NoPesanan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Txt_NoPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE))
                            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(Btn_Pesan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(Btn_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(Btn_Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                .addComponent(Lb_Jumlah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Txt_Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                .addComponent(Lb_Jumlah2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Txt_IDMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pn_BackgroundLayout.createSequentialGroup()
                                    .addComponent(Lb_Jumlah1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Txt_TotalPembayaran))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pn_BackgroundLayout.createSequentialGroup()
                                    .addComponent(Lb_Harga)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Txt_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(Lb_Judul1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(Lb_Judul, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn_BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Btn_Tutup, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        Pn_BackgroundLayout.setVerticalGroup(
            Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                .addComponent(Lb_Judul1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lb_Judul, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_NoPesanan)
                    .addComponent(Txt_NoPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_IDMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Jumlah2))
                .addGap(18, 18, 18)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Jumlah)
                    .addComponent(Txt_Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Harga)
                    .addComponent(Txt_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Jumlah1)
                    .addComponent(Txt_TotalPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Pesan)
                    .addComponent(Btn_Hapus)
                    .addComponent(Btn_Simpan)
                    .addComponent(Btn_Tutup))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pn_Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pn_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Pesan;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JButton Btn_Tutup;
    private javax.swing.JLabel Lb_Harga;
    private javax.swing.JLabel Lb_Judul;
    private javax.swing.JLabel Lb_Judul1;
    private javax.swing.JLabel Lb_Jumlah;
    private javax.swing.JLabel Lb_Jumlah1;
    private javax.swing.JLabel Lb_Jumlah2;
    private javax.swing.JLabel Lb_NoPesanan;
    private javax.swing.JPanel Pn_Background;
    private javax.swing.JTable Tbl_Pesanan;
    private javax.swing.JTextField Txt_Harga;
    private javax.swing.JTextField Txt_IDMenu;
    private javax.swing.JTextField Txt_Jumlah;
    private javax.swing.JTextField Txt_NoPesanan;
    private javax.swing.JTextField Txt_TotalPembayaran;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
