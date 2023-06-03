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

    private static final String DB_URL = "jdbc:sqlite:database/db_anggota.db";

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
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void insertDataPeminjam(String nama, String kodeAkses) {
        connection();
        try {
            String cariData = "SELECT * FROM anggota WHERE nama_lengkap = ? AND kode_akses = ?";
            preparedStatement = connect.prepareStatement(cariData);
            preparedStatement.setString(1, nama);
            preparedStatement.setString(2, kodeAkses);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String namaLengkap = resultSet.getString("nama_lengkap");
                String tanggalLahir = resultSet.getString("tanggal_lahir");
                String alamat = resultSet.getString("alamat");
                String telepon = resultSet.getString("telepon");
                String gender = resultSet.getString("gender");

                String tambah = "INSERT INTO anggota_peminjam (nama_lengkap, tanggal_lahir, alamat, telepon, gender) VALUES (?, ?, ?, ?, ?)";
                preparedStatement = connect.prepareStatement(tambah);
                preparedStatement.setString(1, namaLengkap);
                preparedStatement.setString(2, tanggalLahir);
                preparedStatement.setString(3, alamat);
                preparedStatement.setString(4, telepon);
                preparedStatement.setString(5, gender);

                preparedStatement.executeUpdate();
                resultSet.close();
                preparedStatement.close();
            }
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
                
                BorrowingMember borrowingMember = new BorrowingMember(id, namaLengkap, tanggalLahir, alamat, telepon, gender);
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
}
