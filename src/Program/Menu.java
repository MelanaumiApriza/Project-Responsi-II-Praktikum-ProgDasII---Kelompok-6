package Program;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Menu extends javax.swing.JFrame {

    private Connection conn = new Koneksi().connect();
    private DefaultTableModel tabmode;
    static String dataPassing;

    protected void aktif() {
        Txt_NoPesan.setEnabled(true);
        Txt_Menu.setEnabled(true);
        Txt_HargaSatuan.setEnabled(true);
        Txt_JmlPesan.setEnabled(true);
        Txt_TotalBayar.setEnabled(true);
        Txt_NoPesan.requestFocus();
        Txt_Menu.requestFocus();
    }

    protected void kosong() {
        Txt_NoPesan.setText("");
        Txt_Menu.setText("");
        Txt_HargaSatuan.setText("");
        Txt_JmlPesan.setText("");
        Txt_TotalBayar.setText("");
    }

    protected void datatable() {
        Object[] Baris = {"Menu", "Harga Satuan"};
        tabmode = new DefaultTableModel(null, Baris);
        Tbl_Menu.setModel(tabmode);
        String sql = "SELECT * FROM pilihanmenu";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String PILMEN = hasil.getString("menu");
                String HARSAT = hasil.getString("hargasatuan");

                String[] data = {PILMEN, HARSAT};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
    }

    protected void datatable1() {
        Object[] Baris = {"Menu", "Harga Satuan", "jumlah", "Harga Total"};
        tabmode = new DefaultTableModel(null, Baris);
        Tbl_Pesan.setModel(tabmode);
        String sql = "SELECT menu, hargasatuan, jumlah, hargatotal FROM detailpesan WHERE NomorPesan = " + dataPassing + ";";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String PILMEN = hasil.getString("menu");
                String HARSAT = hasil.getString("hargasatuan");
                String JML = hasil.getString("jumlah");
                String HARTOT = hasil.getString("hargatotal");

                String[] data = {PILMEN, HARSAT, JML, HARTOT};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
    }

    public void Total() {
        try {
            Connection conn = new Koneksi().connect();

            Statement st = conn.createStatement();
            String sql = "SELECT SUM(hargatotal) FROM detailpesan WHERE NomorPesan = " + dataPassing + ";";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                int a = rs.getInt(1);
                Txt_TotalBayar.setText("" + Integer.toString(a));
            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
    }
    //int JumlahBaris = Tbl_Pesan.getRowCount();
    //int TotalBiaya = 0;
    //int jumlah, harga;
    //TableModel tableModel;
    //tableModel = Tbl_Pesan.getModel();
    //for (int i = 0; i < JumlahBaris; i++) {
    //  jumlah = Integer.parseInt(tableModel.getValueAt(i, 0).toString());
    //harga = Integer.parseInt(tableModel.getValueAt(i, 1).toString());
    // TotalBiaya = (TotalBiaya + (jumlah*harga));
    //Txt_TotalBayar.setText(String.valueOf(TotalBiaya));
    //  }
    //}

    public void AutoNomor() {
        Txt_NoPesan.setText(dataPassing);
    }

    public Menu() {
        initComponents();
        dataPassing = Antrian.no_antri;
        datatable();
        AutoNomor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Pn_Background = new javax.swing.JPanel();
        Lb_TotalBayar = new javax.swing.JLabel();
        Lb_JumlahPesan = new javax.swing.JLabel();
        Lb_NomorPesanan = new javax.swing.JLabel();
        Txt_JmlPesan = new javax.swing.JTextField();
        Txt_Menu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Menu = new javax.swing.JTable();
        Btn_Order = new javax.swing.JButton();
        Btn_Cancel = new javax.swing.JButton();
        Lb_Judul2 = new javax.swing.JLabel();
        Lb_Judul1 = new javax.swing.JLabel();
        Txt_TotalBayar = new javax.swing.JTextField();
        Btn_Close = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tbl_Pesan = new javax.swing.JTable();
        Btn_Pilih = new javax.swing.JButton();
        Btn_Hapus = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        Txt_NoPesan = new javax.swing.JTextField();
        Lb_Menu = new javax.swing.JLabel();
        Lb_HrgSat = new javax.swing.JLabel();
        Txt_HargaSatuan = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pn_Background.setBackground(new java.awt.Color(204, 204, 255));

        Lb_TotalBayar.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Lb_TotalBayar.setForeground(new java.awt.Color(255, 153, 153));
        Lb_TotalBayar.setText("Total Bayar                                           :");

        Lb_JumlahPesan.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Lb_JumlahPesan.setForeground(new java.awt.Color(255, 153, 153));
        Lb_JumlahPesan.setText("Jumlah                                                     :");

        Lb_NomorPesanan.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Lb_NomorPesanan.setForeground(new java.awt.Color(255, 153, 153));
        Lb_NomorPesanan.setText("Nomor Pesanan                                 :");

        Tbl_Menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Menu", "Harga Satuan"
            }
        ));
        Tbl_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_MenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_Menu);

        Btn_Order.setBackground(new java.awt.Color(255, 153, 153));
        Btn_Order.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Btn_Order.setForeground(new java.awt.Color(204, 204, 255));
        Btn_Order.setText("ORDER");
        Btn_Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_OrderActionPerformed(evt);
            }
        });

        Btn_Cancel.setBackground(new java.awt.Color(255, 153, 153));
        Btn_Cancel.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Btn_Cancel.setForeground(new java.awt.Color(204, 204, 255));
        Btn_Cancel.setText("CANCEL");
        Btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelActionPerformed(evt);
            }
        });

        Lb_Judul2.setFont(new java.awt.Font("Bite _ Bullet", 1, 36)); // NOI18N
        Lb_Judul2.setForeground(new java.awt.Color(255, 153, 153));
        Lb_Judul2.setText("WELCOME TO NANDOo'S STREET FOOD");

        Lb_Judul1.setFont(new java.awt.Font("Bite _ Bullet", 1, 36)); // NOI18N
        Lb_Judul1.setForeground(new java.awt.Color(255, 153, 153));
        Lb_Judul1.setText("CHOOSE YOUR MENU!!! ENJOY!!!");

        Btn_Close.setBackground(new java.awt.Color(255, 153, 153));
        Btn_Close.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Btn_Close.setForeground(new java.awt.Color(204, 204, 255));
        Btn_Close.setText("CLOSE");
        Btn_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CloseActionPerformed(evt);
            }
        });

        Tbl_Pesan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Menu", "Jumlah", "Harga Satuan", "Harga Total"
            }
        ));
        jScrollPane3.setViewportView(Tbl_Pesan);

        Btn_Pilih.setBackground(new java.awt.Color(255, 153, 153));
        Btn_Pilih.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Btn_Pilih.setForeground(new java.awt.Color(204, 204, 255));
        Btn_Pilih.setText("CHOOSE");
        Btn_Pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PilihActionPerformed(evt);
            }
        });

        Btn_Hapus.setBackground(new java.awt.Color(255, 153, 153));
        Btn_Hapus.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Btn_Hapus.setForeground(new java.awt.Color(204, 204, 255));
        Btn_Hapus.setText("DELETE");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });

        Txt_NoPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NoPesanActionPerformed(evt);
            }
        });

        Lb_Menu.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Lb_Menu.setForeground(new java.awt.Color(255, 153, 153));
        Lb_Menu.setText("Menu                                                         :");

        Lb_HrgSat.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Lb_HrgSat.setForeground(new java.awt.Color(255, 153, 153));
        Lb_HrgSat.setText("Harga Satuan                                      :");

        javax.swing.GroupLayout Pn_BackgroundLayout = new javax.swing.GroupLayout(Pn_Background);
        Pn_Background.setLayout(Pn_BackgroundLayout);
        Pn_BackgroundLayout.setHorizontalGroup(
            Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn_BackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Lb_Judul1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(Lb_Judul2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pn_BackgroundLayout.createSequentialGroup()
                                    .addComponent(Lb_NomorPesanan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Txt_NoPesan))
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pn_BackgroundLayout.createSequentialGroup()
                                    .addComponent(Lb_Menu)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Txt_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pn_BackgroundLayout.createSequentialGroup()
                                    .addComponent(Lb_HrgSat)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Txt_HargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pn_BackgroundLayout.createSequentialGroup()
                                    .addComponent(Lb_JumlahPesan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                            .addComponent(Btn_Pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Btn_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Txt_JmlPesan))))
                            .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                    .addComponent(Lb_TotalBayar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                                            .addComponent(Btn_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(49, 49, 49)
                                            .addComponent(Btn_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Txt_TotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        Pn_BackgroundLayout.setVerticalGroup(
            Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Judul2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lb_Judul1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_NomorPesanan)
                    .addComponent(Txt_NoPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Menu)
                    .addComponent(Txt_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_HrgSat)
                    .addComponent(Txt_HargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_JumlahPesan)
                    .addComponent(Txt_JmlPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Pilih)
                    .addComponent(Btn_Hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lb_TotalBayar)
                    .addComponent(Txt_TotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(Pn_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Order)
                    .addComponent(Btn_Cancel)
                    .addComponent(Btn_Close))
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
            .addComponent(Pn_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CloseActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(null, "Apakah Anda Akan Keluar Dari Aplikasi ?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_Btn_CloseActionPerformed

    private void Btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelActionPerformed
        int yakin = JOptionPane.showConfirmDialog(null, "Are You Sure To Cancel?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (yakin == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM pesan WHERE NomorPesan = " + dataPassing + ";";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                sql = "DELETE FROM detailpesan WHERE NomorPesan = " + dataPassing + ";";
                stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "PESANAN BERHASIL DI TUNDA");
                Txt_NoPesan.requestFocus();
                kosong();
                datatable1();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "PESANAN GAGAL DI TUNDA" + e);
            }
        }

    }//GEN-LAST:event_Btn_CancelActionPerformed

    private void Btn_OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_OrderActionPerformed
        Total();

        String sql = "INSERT INTO pesan VALUES (?,?)";
        int nopes = Integer.parseInt(Txt_NoPesan.getText());
        int tobar = Integer.parseInt(Txt_TotalBayar.getText());
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, Integer.toString(nopes));
            stat.setString(2, Integer.toString(tobar));
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "MENU DIMASUKKAN DALAM LIST ORDER");
            Txt_NoPesan.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "MENU GAGAL DIMASUKKAN DALAM LIST ORDER" + e);
        }
    }//GEN-LAST:event_Btn_OrderActionPerformed

    private void Tbl_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_MenuMouseClicked
        int bar = Tbl_Menu.getSelectedRow();

        String PILMEN = tabmode.getValueAt(bar, 0).toString();
        String HARSAT = tabmode.getValueAt(bar, 1).toString();

        Txt_Menu.setText(PILMEN);
        Txt_HargaSatuan.setText(HARSAT);
    }//GEN-LAST:event_Tbl_MenuMouseClicked

    private void Btn_PilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PilihActionPerformed
        String sql = "INSERT INTO detailpesan VALUES (?,?,?,?,?)";
        int total = Integer.parseInt(Txt_HargaSatuan.getText()) * Integer.parseInt(Txt_JmlPesan.getText());
        int nopes = Integer.parseInt(Txt_NoPesan.getText());
        int jumlah = Integer.parseInt(Txt_JmlPesan.getText());
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, Integer.toString(nopes));
            stat.setString(2, Txt_Menu.getText());
            stat.setString(3, Txt_HargaSatuan.getText());
            stat.setString(4, Integer.toString(jumlah));
            stat.setString(5, Integer.toString(total));
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "MENU DIMASUKKAN DALAM LIST ORDER");
            datatable1();
            Txt_NoPesan.requestFocus();
            Txt_Menu.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "MENU GAGAL DIMASUKKAN DALAM LIST ORDER" + e);
        }
    }//GEN-LAST:event_Btn_PilihActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda Akan Menghapus Data ?", "PESAN KONFIRMASI", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "DELETE FROM pilihanmenu WHERE menu = '" + Txt_Menu.getText() + "" + Txt_HargaSatuan.getText() + "'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "DATA BERHASIL DIHAPUS");
                kosong();
                Txt_Menu.requestFocus();
                datatable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "DATA TIDAK BERHASIL DIHAPUS" + e);
            }
        }
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void Txt_NoPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NoPesanActionPerformed

    }//GEN-LAST:event_Txt_NoPesanActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cancel;
    private javax.swing.JButton Btn_Close;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Order;
    private javax.swing.JButton Btn_Pilih;
    private javax.swing.JLabel Lb_HrgSat;
    private javax.swing.JLabel Lb_Judul1;
    private javax.swing.JLabel Lb_Judul2;
    private javax.swing.JLabel Lb_JumlahPesan;
    private javax.swing.JLabel Lb_Menu;
    private javax.swing.JLabel Lb_NomorPesanan;
    private javax.swing.JLabel Lb_TotalBayar;
    private javax.swing.JPanel Pn_Background;
    private javax.swing.JTable Tbl_Menu;
    private javax.swing.JTable Tbl_Pesan;
    private javax.swing.JTextField Txt_HargaSatuan;
    private javax.swing.JTextField Txt_JmlPesan;
    private javax.swing.JTextField Txt_Menu;
    private javax.swing.JTextField Txt_NoPesan;
    private javax.swing.JTextField Txt_TotalBayar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
