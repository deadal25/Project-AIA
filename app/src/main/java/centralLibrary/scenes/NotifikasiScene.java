package centralLibrary.scenes;

import centralLibrary.utils.DatabaseConfig;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class NotifikasiScene {
    private Stage stage;

    public NotifikasiScene(Stage stage) {
        this.stage = stage;
    }

    public void berhasilDaftar() {
        ImageView background = new ImageView("/images/books.jpg");
        background.setPreserveRatio(true);
        
        Rectangle rectangle = new Rectangle(430, 300);
        rectangle.setArcWidth(50);
        rectangle.setArcHeight(40);
        rectangle.setFill(Color.valueOf("#241b24"));

        Label label1 = new Label("Anda Telah Terdaftar");
        label1.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 20px;");
        Label label2 = new Label("Selamat Telah Menjadi Anggota Central Library");
        label2.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 20px;");

        Button closeButton = new Button("OKE");
        closeButton.setOnMouseEntered(action -> closeButton.setCursor(Cursor.HAND));
        closeButton.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        closeButton.setOnAction(action -> {
            stage.close();
        });

        VBox vBox = new VBox(10, label1, label2, closeButton);
        vBox.setAlignment(Pos.CENTER);
        StackPane stackPane = new StackPane(background, rectangle, vBox);

        Scene scene = new Scene(stackPane, 445, 400);
        stage.setScene(scene);
        stage.getIcons().add(new Image("images/logoPerpus.png"));
        stage.setTitle("Central Library");
        stage.setResizable(false);
        stage.show();
    }

    public void berhasilPinjam() {
        ImageView background = new ImageView("/images/books.jpg");
        background.setPreserveRatio(true);
        background.setFitHeight(400);

        Rectangle rectangle = new Rectangle(300, 300);
        rectangle.setArcWidth(50);
        rectangle.setArcHeight(40);
        rectangle.setFill(Color.valueOf("#241b24"));

        Label teks = new Label("Memimjam Buku");
        teks.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 30px; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");

        Label labelNama = new Label("Nama Lengkap : ");
        labelNama.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 16px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        TextField fieldNama = new TextField();

        Label labelKodeAkses = new Label("Kode Akses : ");
        labelKodeAkses.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 16px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        PasswordField fieldKodeAkses = new PasswordField();

        Label labelNomorBuku = new Label("Nomor Buku : ");
        labelNomorBuku.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 16px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        TextField fieldNomorBuku= new TextField();

        Button okButton = new Button("OKE");
        okButton.setOnMouseEntered(action1 -> okButton.setCursor(Cursor.HAND));
        okButton.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        
        Button verifikasiButton = new Button("Verifikasi");
        verifikasiButton.setOnMouseEntered(action -> verifikasiButton.setCursor(Cursor.HAND));
        verifikasiButton.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        
        verifikasiButton.setOnAction(action -> {
            String nama = fieldNama.getText();
            String kodeAkses = fieldKodeAkses.getText();
            int nomorBuku = Integer.parseInt(fieldNomorBuku.getText());
            DatabaseConfig.insertDataPeminjam(nama, kodeAkses, nomorBuku);
            if (DatabaseConfig.validateMember(nama, kodeAkses)) {
                Label labelBerhasil = new Label("Anda Berhasil Meminjam Buku");
                labelBerhasil.setStyle("-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 20px;");
                
                okButton.setOnAction(action1 -> {
                    stage.close();
                });

                VBox vBox = new VBox(40, labelBerhasil, okButton);
                vBox.setAlignment(Pos.CENTER);

                StackPane stackPane = new StackPane(background,rectangle, vBox);
                Scene scene = new Scene(stackPane, 400, 400);
                stage.setScene(scene);
                stage.setTitle("Central Library");
                stage.getIcons().add(new Image("images/logoPerpus.png"));
                stage.setResizable(false);
                stage.show();
            } else {
                rectangle.setWidth(350);

                Label labelGagal = new Label();
                labelGagal.setText("Anda Belum Terdaftar Sebagai Anggota!");
                labelGagal.setStyle("-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 20px;");

                
                okButton.setOnAction(action1 -> {
                    stage.close();
                });

                VBox vBox = new VBox(40, labelGagal, okButton);
                vBox.setAlignment(Pos.CENTER);

                StackPane stackPane = new StackPane(background, rectangle, vBox);
                Scene scene = new Scene(stackPane, 400, 400);
                stage.setScene(scene);
                stage.setTitle("Central Library");
                stage.getIcons().add(new Image("images/logoPerpus.png"));
                stage.setResizable(false);
                stage.show();
            }
        });

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.add(labelNama, 0, 0);
        gridPane.add(fieldNama, 1, 0);
        gridPane.add(labelNomorBuku, 0, 1);
        gridPane.add(fieldNomorBuku, 1, 1);
        gridPane.add(labelKodeAkses, 0, 2);
        gridPane.add(fieldKodeAkses, 1, 2);

        VBox vBox = new VBox(15, teks, gridPane, verifikasiButton);
        vBox.setAlignment(Pos.CENTER);

        StackPane pane = new StackPane(background, vBox);

        Scene scene = new Scene(new VBox(pane), 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
