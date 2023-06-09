package centralLibrary.scenes;

import centralLibrary.utils.DatabaseConfig;
import centralLibrary.utils.MenuUtil;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DaftarScene {
    private Stage stage;

    public Stage getStage() {
        return stage;
    }

    public DaftarScene(Stage stage) {
        this.stage = stage;
    }

    public void daftarScene() {

        ImageView background = new ImageView("/images/bownCloud.jpg");
        background.setPreserveRatio(true);
        background.setFitHeight(1080);

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        Label labelScene = new Label("DAFTAR ANGGOTA BARU : ");
        labelScene.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 18px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");

        Label labelNama = new Label("Nama Lengkap: ");
        labelNama.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 16px;");
        TextField fieldNama = new TextField();
        
        Label labelAlamat = new Label("Alamat : ");
        labelAlamat.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 16px;");
        TextField fieldAlamat = new TextField();
        
        Label labelTanggalLahir = new Label("Tanggal Lahir : ");
        labelTanggalLahir.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 16px;");
        TextField fieldTanggalLahir = new TextField();

        Label labelTelepon = new Label("Telepon : ");
        labelTelepon.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 16px;");
        TextField fieldTelepon = new TextField();

        Label labelGender = new Label("Jenis Kelamin : ");
        labelGender.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 16px;");
        CheckBox pria = new CheckBox("Laki-laki");
        pria.setStyle("-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-text-fill:WHITE;-fx-font-size: 14px");
        CheckBox wanita = new CheckBox("Perempuan");
        wanita.setStyle("-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-text-fill:WHITE;-fx-font-size: 14px");
        pria.setOnAction(action -> {
            if (pria.isSelected()) {
                wanita.setSelected(false);
            }
        });
        wanita.setOnAction(action -> {
            if (wanita.isSelected()) {
                pria.setSelected(false);
            }
        });
        HBox hBoxGender = new HBox(10, pria, wanita);

        Label labelKodeAkses = new Label("Kode Akses : ");
        labelKodeAkses.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 16px; ");
        PasswordField fieldKodeAkses = new PasswordField();
        
        Button buttonSimpan = new Button("Simpan");
        buttonSimpan.setStyle("-fx-font-family: 'Times New Roman';-fx-text-fill:black;-fx-font-size: 16px;");
        buttonSimpan.setOnMouseEntered(action -> buttonSimpan.setCursor(Cursor.HAND));

        buttonSimpan.disableProperty().bind(
                Bindings.isEmpty(fieldNama.textProperty())
                        .or(Bindings.isEmpty(fieldAlamat.textProperty()))
                        .or(Bindings.isEmpty(fieldTanggalLahir.textProperty()))
                        .or(Bindings.isEmpty(fieldTelepon.textProperty()))
                        .or(Bindings.isEmpty(fieldKodeAkses.textProperty()))
                        .or(pria.selectedProperty().not().and(wanita.selectedProperty().not()))
        );
        buttonSimpan.setOnAction(action -> {
            String nama = fieldNama.getText();
            String tanggalLahir = fieldTanggalLahir.getText();
            String alamat = fieldAlamat.getText();
            String telepon = fieldTelepon.getText();
            String gender = (pria.isSelected() ? "Pria" : "Wanita");
            String kodeAkses = fieldKodeAkses.getText();

            DatabaseConfig.insertData(nama, tanggalLahir, alamat, telepon, gender, kodeAkses);

            NotifikasiScene berhasilNotif = new NotifikasiScene(new Stage());
            berhasilNotif.berhasilDaftar();
            fieldNama.clear();
            fieldTanggalLahir.clear();
            fieldAlamat.clear();
            fieldTelepon.clear();
            pria.setSelected(false);
            wanita.setSelected(false);
            fieldKodeAkses.clear();
        });
        
        gridPane.add(labelNama, 0, 0);
        gridPane.add(fieldNama, 1, 0);
        gridPane.add(labelTanggalLahir, 0, 1);
        gridPane.add(fieldTanggalLahir, 1, 1);
        gridPane.add(labelAlamat, 0, 2);
        gridPane.add(fieldAlamat, 1, 2);
        gridPane.add(labelTelepon, 0, 3);
        gridPane.add(fieldTelepon, 1, 3);
        gridPane.add(labelGender, 0, 4);
        gridPane.add(hBoxGender, 1, 4);
        gridPane.add(labelKodeAkses, 0, 5);
        gridPane.add(fieldKodeAkses, 1, 5);
        gridPane.add(buttonSimpan, 1, 6);
        gridPane.setAlignment(Pos.CENTER);

        Rectangle kotak = new Rectangle(400, 300);
        kotak.setArcWidth(50);
        kotak.setArcHeight(40);
        kotak.setFill(Color.valueOf("#241b24"));

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(kotak, gridPane);
        VBox vBox2 = new VBox(15, labelScene, stackPane);
        vBox2.setAlignment(Pos.BASELINE_CENTER);
        vBox2.setPadding(new Insets(40, 0, 0, 0));
        BorderPane root = new BorderPane();
        root.setTop(MenuUtil.vBoxMenu());
        root.setCenter(vBox2);

        StackPane pane = new StackPane();
        pane.getChildren().addAll(background, root);
        Scene scene = new Scene(pane, 900, 700);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
