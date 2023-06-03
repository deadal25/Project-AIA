package centralLibrary.scenes;

import centralLibrary.utils.DatabaseConfig;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
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
        label1.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 30px; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        Label label2 = new Label("Selamat Telah Menjadi Anggota Central Library");
        label2.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 30px; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");

        Button closeButton = new Button("OKE");
        closeButton.setAlignment(Pos.TOP_CENTER);
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

        ImageView background = new ImageView("/images/books.jpg");
        background.setPreserveRatio(true);
        background.setFitHeight(400);
        
        Label teks = new Label("Memimjam Buku");
        teks.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 30px; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");

        Label labelNama = new Label("Nama Lengkap : ");
        labelNama.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 16px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        TextField fieldNama = new TextField();

        Label labelKodeAkses = new Label("Kode Akses : ");
        labelKodeAkses.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 16px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        TextField fieldKodeAkses = new TextField();

        Label labelNomorBuku = new Label("Nomor Buku : ");
        labelNomorBuku.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 16px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        TextField fieldNomorBuku= new TextField();

        Button buttonVerifikasi = new Button("Verifikasi");
        buttonVerifikasi.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        buttonVerifikasi.setOnAction(action -> {
            String nama = fieldNama.getText();
            String kodeAkses = fieldKodeAkses.getText();
            int nomorBuku = Integer.parseInt(fieldNomorBuku.getText());
            DatabaseConfig.insertDataPeminjam(nama, kodeAkses, nomorBuku);
            if (DatabaseConfig.validateMember(nama, kodeAkses)) {
                Label labelBerhasil = new Label("Anda Berhasil Meminjam Buku");
                labelBerhasil.setStyle("-fx-font-family: 'Times New Roman';-fx-text-fill:BLACK;-fx-font-size: 20px;");
                Button okButton = new Button("OKE");
                okButton.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
                okButton.setOnAction(action1 -> {
                    stage.close();
                });
                BorderPane borderPane = new BorderPane();
                borderPane.setTop(labelBerhasil);
                borderPane.setCenter(okButton);
                Scene scene = new Scene(borderPane, 260, 70);
                stage.setScene(scene);
                stage.show();
            } else {
                Text textGagal = new Text();
                textGagal.setText("Anda Belum Terdaftar Sebagai Anggota!");
                textGagal.setStyle("-fx-font-family: 'Times New Roman';-fx-text-fill:BLACK;-fx-font-size: 20px;");
                Button okButton = new Button("OKE");
                okButton.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
                okButton.setOnAction(action1 -> {
                    stage.close();
                });
                BorderPane borderPane = new BorderPane();
                borderPane.setTop(textGagal);
                borderPane.setCenter(okButton);
                Scene scene = new Scene(borderPane, 330, 70);
                stage.setScene(scene);
                stage.show();
            }
        });

        HBox hBoxNama = new HBox(15, labelNama, fieldNama);
        HBox hBoxKodeAkses = new HBox(15, labelKodeAkses, fieldKodeAkses);
        HBox hBoxNomorBuku = new HBox(15, labelNomorBuku, fieldNomorBuku);
        VBox vBox = new VBox(15, teks, hBoxNama, hBoxKodeAkses,hBoxNomorBuku, buttonVerifikasi);
        vBox.setAlignment(Pos.CENTER);

        StackPane pane = new StackPane(background, vBox);

        Scene scene = new Scene(new VBox(pane), 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
