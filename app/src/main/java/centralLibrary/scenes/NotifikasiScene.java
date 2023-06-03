package centralLibrary.scenes;

import centralLibrary.utils.DatabaseConfig;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NotifikasiScene {
    private Stage stage;

    public NotifikasiScene(Stage stage) {
        this.stage = stage;
    }

    public void berhasilDaftar() {
        Label label1 = new Label("Anda Telah Terdaftar");
        Label label2 = new Label("Selamat Telah Menjadi Anggota Central Library");

        Button closeButton = new Button("OKE");
        closeButton.setOnAction(action -> {
            stage.close();
        });

        VBox vBox = new VBox(10, label1, label2, closeButton);
        Scene scene = new Scene(vBox, 300, 200);
        stage.setScene(scene);
        stage.setResizable(true);
        stage.show();
    }

    public void berhasilPinjam() {
        Label labelNama = new Label("Nama Lengkap: ");
        TextField fieldNama = new TextField();

        Label labelKodeAkses = new Label("Kode Akses: ");
        TextField fieldKodeAkses = new TextField();

        Button buttonVerifikasi = new Button("Verifikasi");
        buttonVerifikasi.setOnAction(action -> {
            String nama = fieldNama.getText();
            String kodeAkses = fieldKodeAkses.getText();
            DatabaseConfig.insertDataPeminjam(nama, kodeAkses);
            if (DatabaseConfig.validateMember(nama, kodeAkses)) {
                Label labelBerhasil = new Label("Anda Berhasil Meminjam Buku");
                Button okButton = new Button("OKE");
                okButton.setOnAction(action1 -> {
                    stage.close();
                });
                BorderPane borderPane = new BorderPane();
                borderPane.setTop(labelBerhasil);
                borderPane.setCenter(okButton);
                Scene scene = new Scene(borderPane, 400, 400);
                stage.setScene(scene);
                stage.show();
            } else {
                Text textGagal = new Text();
                textGagal.setText("Anda Belum Terdaftar Sebagai Anggota.\n" +
                            "Untuk Melanjutkan, Silahkan Mendaftarkan Diri Anda");
                Button okButton = new Button("SIIP");
                okButton.setOnAction(action1 -> {
                    stage.close();
                });
                BorderPane borderPane = new BorderPane();
                borderPane.setTop(textGagal);
                borderPane.setCenter(okButton);
                Scene scene = new Scene(borderPane, 400, 400);
                stage.setScene(scene);
                stage.show();
            }
        });

        HBox hBoxNama = new HBox(15, labelNama, fieldNama);
        HBox hBoxKodeAkses = new HBox(15, labelKodeAkses, fieldKodeAkses);
        VBox vBox = new VBox(15, hBoxNama, hBoxKodeAkses, buttonVerifikasi);
        vBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
