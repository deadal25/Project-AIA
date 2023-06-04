package centralLibrary.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import centralLibrary.models.BorrowingMember;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DatabaseConfig {
    private static Connection connect;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    private static final String DB_URL = "jdbc:sqlite:database/db_central_library.db";

    public static void connection() {
        try {
            connect = DriverManager.getConnection(DB_URL);
            System.out.println("Connection: Success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 

    public static boolean validateMember(String namaLengkap, String kodeAkses) {
        connection();
        try {
            String validasi = "SELECT * FROM anggota WHERE nama_lengkap = ? AND kode_akses = ?";
            preparedStatement = connect.prepareStatement(validasi);
            preparedStatement.setString(1, namaLengkap);
            preparedStatement.setString(2, kodeAkses);

            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                } if (preparedStatement != null) {
                    preparedStatement.close();
                } if (connect != null) {
                    connect.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();               
            }
        }
    }

    public static void insertData(String nama, String tanggalLahir, String alamat, String telepon, String gender, String kodeAkses) {
        connection();
        try {
            String tambah = "INSERT INTO anggota (nama_lengkap, tanggal_lahir, alamat, telepon, gender, kode_akses) VALUES (?, ?, ?, ?, ?, ?)";
            preparedStatement = connect.prepareStatement(tambah);
            preparedStatement.setString(1, nama);
            preparedStatement.setString(2, tanggalLahir);
            preparedStatement.setString(3, alamat);
            preparedStatement.setString(4, telepon);
            preparedStatement.setString(5, gender);
            preparedStatement.setString(6, kodeAkses);

            preparedStatement.executeUpdate();

            preparedStatement.close();
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertDataPeminjam(String nama, String kodeAkses, int id) {
        connection();
        try {
            String cariDataAnggota = "SELECT * FROM anggota WHERE nama_lengkap = ? AND kode_akses = ?";
            String cariDataBuku = "SELECT * FROM book WHERE id = ?";
            preparedStatement = connect.prepareStatement(cariDataAnggota);
            preparedStatement.setString(1, nama);
            preparedStatement.setString(2, kodeAkses);
            resultSet = preparedStatement.executeQuery();
    
            if (resultSet.next()) {
                String namaLengkap = resultSet.getString("nama_lengkap");
                String tanggalLahir = resultSet.getString("tanggal_lahir");
                String alamat = resultSet.getString("alamat");
                String telepon = resultSet.getString("telepon");
                String gender = resultSet.getString("gender");
    
                preparedStatement = connect.prepareStatement(cariDataBuku);
                preparedStatement.setInt(1, id);
                resultSet = preparedStatement.executeQuery();
    
                if (resultSet.next()) {
                    String judulBuku = resultSet.getString("title");
                    String jenisBuku = resultSet.getString("type");
    
                    String tambah = "INSERT INTO anggota_peminjam (nama_lengkap, tanggal_lahir, alamat, telepon, gender, judul_buku, jenis_buku) VALUES (?, ?, ?, ?, ?, ?, ?)";
                    preparedStatement = connect.prepareStatement(tambah);
                    preparedStatement.setString(1, namaLengkap);
                    preparedStatement.setString(2, tanggalLahir);
                    preparedStatement.setString(3, alamat);
                    preparedStatement.setString(4, telepon);
                    preparedStatement.setString(5, gender);
                    preparedStatement.setString(6, judulBuku);
                    preparedStatement.setString(7, jenisBuku);
    
                    preparedStatement.executeUpdate();
                }
            }
    
            resultSet.close();
            preparedStatement.close();
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static ObservableList<BorrowingMember> getDataPeminjam() {
        ObservableList<BorrowingMember> borrowingMembers = FXCollections.observableArrayList();
        try {
            connection();
            String getData = "SELECT * FROM anggota_peminjam";
            preparedStatement = connect.prepareStatement(getData);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String namaLengkap = resultSet.getString("nama_lengkap");
                String tanggalLahir = resultSet.getString("tanggal_lahir");
                String alamat = resultSet.getString("alamat");
                String telepon = resultSet.getString("telepon");
                String gender = resultSet.getString("gender");
                String judulBuku = resultSet.getString("judul_buku");
                String jenisBuku = resultSet.getString("jenis_buku");
                
                BorrowingMember borrowingMember = new BorrowingMember(id, namaLengkap, tanggalLahir, alamat, telepon, gender, judulBuku, jenisBuku);
                borrowingMembers.add(borrowingMember);
            }
            resultSet.close();
            preparedStatement.close();
            connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return borrowingMembers;
    }

    public static void deletePeminjam(int id) {
        connection();
        try {
            String deleteData = "DELETE FROM anggota_peminjam WHERE id = ?";
            preparedStatement = connect.prepareStatement(deleteData);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
