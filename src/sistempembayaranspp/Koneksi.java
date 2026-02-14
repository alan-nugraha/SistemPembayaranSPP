package sistempembayaranspp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Kelas utilitas untuk membuka koneksi ke database MySQL.
 * Pastikan XAMPP sudah berjalan sebelum menjalankan program.
 */
public class Koneksi {

    private static final String HOST     = "localhost";
    private static final String PORT     = "3306";
    private static final String DATABASE = "dbProjectSiswa";
    private static final String USER     = "root";
    private static final String PASSWORD = "";   // Sesuaikan jika ada password MySQL

    private static final String URL =
            "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE
            + "?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";

    /**
     * Membuka dan mengembalikan objek Connection ke database.
     *
     * @return Connection yang aktif
     * @throws SQLException jika driver tidak ditemukan atau koneksi gagal
     */
    public static Connection getConnection() throws SQLException {
        try {
            // Driver MySQL Connector/J 8.x
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            try {
                // Fallback ke driver lama 5.x
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                throw new SQLException(
                    "MySQL JDBC Driver tidak ditemukan!\n"
                    + "Tambahkan library mysql-connector-java ke project NetBeans\n"
                    + "(klik kanan project > Properties > Libraries > Add JAR/Folder).",
                    ex);
            }
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
