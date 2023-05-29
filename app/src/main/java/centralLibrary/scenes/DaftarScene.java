package centralLibrary.scenes;

import centralLibrary.utils.MenuUtil;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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

    public DaftarScene(Stage stage) {
        this.stage = stage;
    }

    public void daftarScene() {
        VBox vBox = MenuUtil.vBoxMenu();

        
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        
        Label labelNama = new Label("Nama Lengkap:");
        TextField fieldNama = new TextField();

        
        Label labelAlamat = new Label("Alamat:");
        TextField fieldAlamat = new TextField();
        
        Label labelUsia = new Label("Tanggal Lahir:");
        TextField fieldUsia = new TextField();

        Label labelTelepon = new Label("Telepon:");
        TextField fieldTelepon = new TextField();

        Label labelGender = new Label("Jenis Kelamin: ");
        CheckBox pria = new CheckBox("Laki-laki");
        CheckBox wanita = new CheckBox("Perempuan");
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
        
        Button buttonSimpan = new Button("Simpan");
        buttonSimpan.setOnAction(action -> {
            String nama = fieldNama.getText();
            String alamat = fieldAlamat.getText();
            String tanggalLahir = fieldUsia.getText();
            
            fieldNama.clear();
            fieldAlamat.clear();
            fieldUsia.clear();
        });
        
        gridPane.add(labelNama, 0, 0);
        gridPane.add(fieldNama, 1, 0);
        gridPane.add(labelAlamat, 0, 1);
        gridPane.add(fieldAlamat, 1, 1);
        gridPane.add(labelUsia, 0, 2);
        gridPane.add(fieldUsia, 1, 2);
        gridPane.add(labelTelepon, 0, 3);
        gridPane.add(fieldTelepon, 1, 3);
        gridPane.add(labelGender, 0, 4);
        gridPane.add(hBoxGender, 1, 4);
        gridPane.add(buttonSimpan, 1, 5);
        gridPane.setAlignment(Pos.CENTER);

        Rectangle kotak = new Rectangle(400, 300);
        kotak.setFill(Color.BLUE);

        StackPane stackpane = new StackPane();
        stackpane.getChildren().addAll(kotak, gridPane);

        BorderPane root = new BorderPane();
        root.setTop(vBox);
        root.setCenter(stackpane);
        Scene scene = new Scene(root, 800, 500);

        stage.setScene(scene);
        stage.show();
    }
}