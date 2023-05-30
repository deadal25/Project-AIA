package centralLibrary.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseAnggota implements AutoCloseable{
    private static Connection connection;
    private static final String CREATE_TABLE = "CREATE TABLE anggota ("
                                            + "nama TEXT NOT NULL,"
                                            + "tanggal_lahir TEXT NOT NULL,"
                                            + "alamat TEXT NOT NULL,"
                                            + "telepon TEXT NOT NULL,"
                                            + "gender TEXT NOT NULL,"
                                            + "kode_akses TEXT NOT NULL"
                                            + ")";
    private static final String CREATE_INDEX = "CREATE INDEX idx_anggota_nama ON anggota(nama)";

    
    public DatabaseAnggota(String path) {
        try {
            // Buat koneksi database.
            connection = DriverManager.getConnection("jdbc:sqlite:" + path);

            // Bangun database jika belum ada.
            build();
        } catch (SQLException e) {
            // Oh no
            e.printStackTrace();
        }
    }

    public void build() throws SQLException {
        try (Statement stmt = connection.createStatement()) {
            // Eksekusi kueri untuk menge-cek apakah tabel "absen" sudah tersedia.
            // Tabel "sqlite_master" adalah tabel khusus pada SQLite3 yang berisi
            // semua tabel dan hal-hal lain yang ada pada sebuah berkas database.
            ResultSet result = stmt
                    .executeQuery("SELECT * FROM `sqlite_master` WHERE `type` = 'table' AND `name` = 'db_anggota';");
            if (result.next()) {
                // Tabel sudah ada.
                result.close();
            } else {
                // Matikan autocommit untuk area kode ini.
                try (NoAutoCommit nac = new NoAutoCommit(connection)) {
                    // Jalankan kueri untuk membuat tabel.
                    stmt.execute(CREATE_TABLE);
                    stmt.execute(CREATE_INDEX);

                    connection.commit();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void tambahAnggota(String nama, String tanggalLahir, String alamat, String telepon, String gender, String kodeAkses) {
        try {
            String tambah = "INSERT INTO anggota (nama, tanggal_lahir, alamat, telepon, gender, kode_akses) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(tambah);
            statement.setString(1, nama);
            statement.setString(2, tanggalLahir);
            statement.setString(3, alamat);
            statement.setString(4, telepon);
            statement.setString(5, gender);
            statement.setString(6, kodeAkses);

            statement.executeUpdate();

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
                
    }

    @Override
    public void close() throws Exception {
        try {
            if (!connection.getAutoCommit()) {
                connection.rollback();
            }
        } catch (SQLException e) {
            // Oh no
            e.printStackTrace();
        }

        try {
            connection.close();
        } catch (SQLException e) {
            // Oh no
            e.printStackTrace();
        }
    }
}
