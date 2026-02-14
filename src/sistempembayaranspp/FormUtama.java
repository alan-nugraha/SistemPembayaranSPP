package sistempembayaranspp;

import java.sql.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

public class FormUtama extends javax.swing.JFrame {

    private String selectedIdBayar = "";

    public FormUtama() {
        initComponents();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jPanelForm = new javax.swing.JPanel();
        jLabelIdSiswa = new javax.swing.JLabel();
        jLabelNamaSiswa = new javax.swing.JLabel();
        jLabelKelas = new javax.swing.JLabel();
        jLabelJurusan = new javax.swing.JLabel();
        jLabelPembayaran = new javax.swing.JLabel();
        jLabelJumlah = new javax.swing.JLabel();
        txtIdSiswa = new javax.swing.JTextField();
        txtNamaSiswa = new javax.swing.JTextField();
        txtKelas = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        cmbJurusan = new javax.swing.JComboBox();
        cmbPembayaran = new javax.swing.JComboBox();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID Bayar", "ID Siswa", "Nama Siswa", "Kelas", "Jurusan", "Jenis Pembayaran", "Jumlah"
            }
        ) {
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Pembayaran SPP SMP Jakenan");

        jLabelTitle.setBackground(java.awt.Color.white);
        jLabelTitle.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(30, 30, 120));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("SISTEM PEMBAYARAN SPP SMP JAKENAN");

        jPanelForm.setBackground(java.awt.Color.white);
        jPanelForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelIdSiswa.setText("ID Siswa :");

        jLabelNamaSiswa.setText("Nama Siswa :");

        jLabelKelas.setText("Kelas :");

        jLabelJurusan.setText("Jurusan :");

        jLabelPembayaran.setText("Pembayaran :");

        jLabelJumlah.setText("Jumlah :");

        cmbJurusan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "IPA", "IPS", "Bahasa", "Teknik Komputer", "Multimedia" }));

        cmbPembayaran.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "SPP Bulanan", "Uang Gedung", "Seragam", "Buku", "Kegiatan Sekolah" }));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormLayout = new javax.swing.GroupLayout(jPanelForm);
        jPanelForm.setLayout(jPanelFormLayout);
        jPanelFormLayout.setHorizontalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPembayaran)
                    .addComponent(jLabelIdSiswa)
                    .addComponent(jLabelKelas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNamaSiswa)
                    .addComponent(jLabelJurusan)
                    .addComponent(jLabelJumlah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNamaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(cmbJurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 280, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnSimpan)
                .addGap(10, 10, 10)
                .addComponent(btnHapus)
                .addGap(10, 10, 10)
                .addComponent(btnUbah)
                .addGap(10, 10, 10)
                .addComponent(btnCetak)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFormLayout.setVerticalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdSiswa)
                    .addComponent(txtIdSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNamaSiswa)
                    .addComponent(txtNamaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKelas)
                    .addComponent(txtKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelJurusan)
                    .addComponent(cmbJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPembayaran)
                    .addComponent(cmbPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelJumlah)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btnUbah)
                    .addComponent(btnCetak))
                .addContainerGap())
        );

        tblData.setRowHeight(22);
        tblData.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        simpanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hapusData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        ubahData();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        cetakData();
    }//GEN-LAST:event_btnCetakActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        isiFormDariTabel();
    }//GEN-LAST:event_tblDataMouseClicked

    // ================================================================
    //  Load data dari database ke tabel
    // ================================================================
    private void loadData() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);

        String sql =
            "SELECT p.id_bayar, p.id_siswa, s.nama_siswa, s.kelas, s.jurusan, "
            + "p.jenis_pembayaran, p.jumlah "
            + "FROM tbl_pembayaran p "
            + "JOIN tbl_siswa s ON p.id_siswa = s.id_siswa "
            + "ORDER BY p.id_bayar";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            NumberFormat nf = NumberFormat.getNumberInstance(new Locale("id", "ID"));
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id_bayar"),
                    rs.getString("id_siswa"),
                    rs.getString("nama_siswa"),
                    rs.getString("kelas"),
                    rs.getString("jurusan"),
                    rs.getString("jenis_pembayaran"),
                    nf.format(rs.getDouble("jumlah"))
                });
            }

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Gagal memuat data:\n" + ex.getMessage(),
                    "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    // ================================================================
    //  Isi form dari baris tabel yang diklik
    // ================================================================
    private void isiFormDariTabel() {
        int row = tblData.getSelectedRow();
        if (row < 0) return;

        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        selectedIdBayar = model.getValueAt(row, 0).toString();
        txtIdSiswa.setText(model.getValueAt(row, 1).toString());
        txtNamaSiswa.setText(model.getValueAt(row, 2).toString());
        txtKelas.setText(model.getValueAt(row, 3).toString());
        cmbJurusan.setSelectedItem(model.getValueAt(row, 4).toString());
        cmbPembayaran.setSelectedItem(model.getValueAt(row, 5).toString());
        String raw = model.getValueAt(row, 6).toString()
                         .replaceAll("[^0-9,.]", "").replace(".", "").replace(",", ".");
        txtJumlah.setText(raw.isEmpty() ? model.getValueAt(row, 6).toString() : raw);
    }

    // ================================================================
    //  Validasi input
    // ================================================================
    private boolean validasiInput() {
        if (txtIdSiswa.getText().trim().isEmpty()) {
            warn("ID Siswa tidak boleh kosong!", txtIdSiswa); return false;
        }
        if (txtNamaSiswa.getText().trim().isEmpty()) {
            warn("Nama Siswa tidak boleh kosong!", txtNamaSiswa); return false;
        }
        if (txtKelas.getText().trim().isEmpty()) {
            warn("Kelas tidak boleh kosong!", txtKelas); return false;
        }
        if (cmbJurusan.getSelectedIndex() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Pilih Jurusan terlebih dahulu!", "Peringatan",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (cmbPembayaran.getSelectedIndex() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Pilih Jenis Pembayaran terlebih dahulu!", "Peringatan",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (txtJumlah.getText().trim().isEmpty()) {
            warn("Jumlah tidak boleh kosong!", txtJumlah); return false;
        }
        try {
            Double.parseDouble(txtJumlah.getText().trim().replace(",", "."));
        } catch (NumberFormatException e) {
            warn("Jumlah harus berupa angka (contoh: 150000)!", txtJumlah);
            return false;
        }
        return true;
    }

    private void warn(String msg, java.awt.Component focus) {
        javax.swing.JOptionPane.showMessageDialog(this, msg, "Peringatan",
                javax.swing.JOptionPane.WARNING_MESSAGE);
        focus.requestFocus();
    }

    // ================================================================
    //  SIMPAN (INSERT)
    // ================================================================
    private void simpanData() {
        if (!validasiInput()) return;

        String idSiswa   = txtIdSiswa.getText().trim();
        String namaSiswa = txtNamaSiswa.getText().trim();
        String kelas     = txtKelas.getText().trim();
        String jurusan   = cmbJurusan.getSelectedItem().toString();
        String bayar     = cmbPembayaran.getSelectedItem().toString();
        double jumlah    = Double.parseDouble(txtJumlah.getText().trim().replace(",", "."));

        try (Connection conn = Koneksi.getConnection()) {
            conn.setAutoCommit(false);
            try {
                PreparedStatement psSiswa = conn.prepareStatement(
                    "INSERT INTO tbl_siswa (id_siswa, nama_siswa, kelas, jurusan) "
                    + "VALUES (?,?,?,?) ON DUPLICATE KEY UPDATE nama_siswa=?, kelas=?, jurusan=?");
                psSiswa.setString(1, idSiswa);
                psSiswa.setString(2, namaSiswa);
                psSiswa.setString(3, kelas);
                psSiswa.setString(4, jurusan);
                psSiswa.setString(5, namaSiswa);
                psSiswa.setString(6, kelas);
                psSiswa.setString(7, jurusan);
                psSiswa.executeUpdate();

                PreparedStatement psBayar = conn.prepareStatement(
                    "INSERT INTO tbl_pembayaran (id_siswa, jenis_pembayaran, jumlah, tanggal) "
                    + "VALUES (?,?,?,CURDATE())");
                psBayar.setString(1, idSiswa);
                psBayar.setString(2, bayar);
                psBayar.setDouble(3, jumlah);
                psBayar.executeUpdate();

                conn.commit();
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Data berhasil disimpan!", "Info",
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);
                bersihkanForm();
                loadData();

            } catch (SQLException ex) {
                conn.rollback();
                throw ex;
            }
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Gagal menyimpan:\n" + ex.getMessage(), "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    // ================================================================
    //  HAPUS (DELETE)
    // ================================================================
    private void hapusData() {
        if (selectedIdBayar.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Pilih baris data yang ingin dihapus!", "Peringatan",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        int ok = javax.swing.JOptionPane.showConfirmDialog(this,
                "Yakin ingin menghapus data ini?", "Konfirmasi",
                javax.swing.JOptionPane.YES_NO_OPTION);
        if (ok != javax.swing.JOptionPane.YES_OPTION) return;

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                     "DELETE FROM tbl_pembayaran WHERE id_bayar = ?")) {
            ps.setInt(1, Integer.parseInt(selectedIdBayar));
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Data berhasil dihapus!", "Info",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            bersihkanForm();
            loadData();
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Gagal menghapus:\n" + ex.getMessage(), "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    // ================================================================
    //  UBAH (UPDATE)
    // ================================================================
    private void ubahData() {
        if (selectedIdBayar.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Pilih baris data yang ingin diubah!", "Peringatan",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!validasiInput()) return;

        String idSiswa   = txtIdSiswa.getText().trim();
        String namaSiswa = txtNamaSiswa.getText().trim();
        String kelas     = txtKelas.getText().trim();
        String jurusan   = cmbJurusan.getSelectedItem().toString();
        String bayar     = cmbPembayaran.getSelectedItem().toString();
        double jumlah    = Double.parseDouble(txtJumlah.getText().trim().replace(",", "."));

        try (Connection conn = Koneksi.getConnection()) {
            conn.setAutoCommit(false);
            try {
                PreparedStatement psSiswa = conn.prepareStatement(
                    "UPDATE tbl_siswa SET nama_siswa=?, kelas=?, jurusan=? WHERE id_siswa=?");
                psSiswa.setString(1, namaSiswa);
                psSiswa.setString(2, kelas);
                psSiswa.setString(3, jurusan);
                psSiswa.setString(4, idSiswa);
                psSiswa.executeUpdate();

                PreparedStatement psBayar = conn.prepareStatement(
                    "UPDATE tbl_pembayaran SET jenis_pembayaran=?, jumlah=? WHERE id_bayar=?");
                psBayar.setString(1, bayar);
                psBayar.setDouble(2, jumlah);
                psBayar.setInt(3, Integer.parseInt(selectedIdBayar));
                psBayar.executeUpdate();

                conn.commit();
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Data berhasil diubah!", "Info",
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);
                bersihkanForm();
                loadData();

            } catch (SQLException ex) {
                conn.rollback();
                throw ex;
            }
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Gagal mengubah:\n" + ex.getMessage(), "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    // ================================================================
    //  CETAK (JasperReports)
    // ================================================================
    private void cetakData() {
        try {
            java.io.InputStream reportStream =
                getClass().getResourceAsStream("/reports/LaporanPembayaran.jrxml");
            if (reportStream == null) {
                throw new Exception("File laporan tidak ditemukan: /reports/LaporanPembayaran.jrxml");
            }

            net.sf.jasperreports.engine.JasperReport jasperReport =
                net.sf.jasperreports.engine.JasperCompileManager.compileReport(reportStream);

            net.sf.jasperreports.engine.data.JRTableModelDataSource dataSource =
                new net.sf.jasperreports.engine.data.JRTableModelDataSource(tblData.getModel());

            java.util.Map<String, Object> params = new java.util.HashMap<>();

            net.sf.jasperreports.engine.JasperPrint jasperPrint =
                net.sf.jasperreports.engine.JasperFillManager.fillReport(jasperReport, params, dataSource);

            net.sf.jasperreports.view.JasperViewer.viewReport(jasperPrint, false);

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Gagal mencetak:\n" + ex.getMessage(), "Error Cetak",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    // ================================================================
    //  Bersihkan form
    // ================================================================
    private void bersihkanForm() {
        txtIdSiswa.setText("");
        txtNamaSiswa.setText("");
        txtKelas.setText("");
        txtJumlah.setText("");
        cmbJurusan.setSelectedIndex(0);
        cmbPembayaran.setSelectedIndex(0);
        selectedIdBayar = "";
        tblData.clearSelection();
    }

    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {}
        javax.swing.SwingUtilities.invokeLater(() -> new FormUtama().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox cmbJurusan;
    private javax.swing.JComboBox cmbPembayaran;
    private javax.swing.JLabel jLabelIdSiswa;
    private javax.swing.JLabel jLabelJumlah;
    private javax.swing.JLabel jLabelJurusan;
    private javax.swing.JLabel jLabelKelas;
    private javax.swing.JLabel jLabelNamaSiswa;
    private javax.swing.JLabel jLabelPembayaran;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelForm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtIdSiswa;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNamaSiswa;
    // End of variables declaration//GEN-END:variables
}
