package centralLibrary.utils;

import centralLibrary.scenes.BerandaScene;
import centralLibrary.scenes.DaftarScene;
import centralLibrary.scenes.KatalogScene;
import centralLibrary.scenes.ListPeminjam;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuUtil {

    public static VBox vBoxMenu() {
        Button berandaButton = new Button("Beranda");
        berandaButton.setStyle("-fx-background-color: #241b24; -fx-padding:10px;-fx-border-width: 6px; -fx-background-radius:10px;" +
        "-fx-font-weight: bold; -fx-text-fill: white;-fx-font-family: Times New Roman; -fx-font-size: 14px; -fx-opacity: 0.6;");
        berandaButton.setOnMouseEntered(action -> berandaButton.setCursor(Cursor.HAND));
        
        Button koleksiButton = new Button("Koleksi");
        koleksiButton.setStyle("-fx-background-color: #241b24; -fx-padding:10px; -fx-border-width: 6px; -fx-background-radius:10px;" +
        "-fx-font-weight: bold; -fx-text-fill: white;-fx-font-family: Times New Roman; -fx-font-size: 14px; -fx-opacity: 0.6;");
        koleksiButton.setOnMouseEntered(action -> koleksiButton.setCursor(Cursor.HAND));
        
        Button listPeminjamButton = new Button("List Peminjam");
        listPeminjamButton.setStyle("-fx-background-color: #241b24; -fx-padding:10px; -fx-border-width: 6px; -fx-background-radius:10px;" +
        "-fx-font-weight: bold; -fx-text-fill: white; -fx-font-family: Times New Roman; -fx-font-size: 14px; -fx-opacity: 0.6;");
        listPeminjamButton.setOnMouseEntered(action -> listPeminjamButton.setCursor(Cursor.HAND));
        
        Button daftarAnggotaButton = new Button("Daftar Anggota");
        daftarAnggotaButton.setStyle("-fx-background-color: #241b24; -fx-padding:10px; -fx-border-width: 6px; -fx-background-radius:10px;" +
        "-fx-font-weight: bold; -fx-text-fill: white; -fx-font-family: Times New Roman; -fx-font-size: 14px; -fx-opacity: 0.6;");
        daftarAnggotaButton.setOnMouseEntered(action -> daftarAnggotaButton.setCursor(Cursor.HAND));
        
        HBox hBox = new HBox(0, berandaButton, koleksiButton, daftarAnggotaButton, listPeminjamButton);
        hBox.setStyle("-fx-background-color: #37100c;");

        berandaButton.setOnAction(action -> {
            Stage stage = (Stage) hBox.getScene().getWindow();
            BerandaScene berandaScene = new BerandaScene(stage);
            berandaScene.berandaScene();
        });
        koleksiButton.setOnAction(action -> {
            Stage stage = (Stage) hBox.getScene().getWindow();
            KatalogScene katalogScene = new KatalogScene(stage);
            katalogScene.katalogScene();
        });
        daftarAnggotaButton.setOnAction(action -> {
            Stage stage = (Stage) hBox.getScene().getWindow();
            DaftarScene daftarScene = new DaftarScene(stage);
            daftarScene.daftarScene();
        });
        listPeminjamButton.setOnAction(action -> {
            Stage stage = (Stage) hBox.getScene().getWindow();
            ListPeminjam listPeminjam = new ListPeminjam(stage);
            listPeminjam.listPeminjamScene();
        });

        Label labelName = new Label("CENTRAL LIBRARY");
        labelName.setId("central-library");
        labelName.setStyle("-fx-font-family: Times New Roman; -fx-text-fill: white; -fx-font-size:17px; -fx-font-weight: bold;");

        VBox vBoxLabelName = new VBox(labelName);
        vBoxLabelName.setAlignment(Pos.BASELINE_CENTER);
        VBox vBoxMenu = new VBox(hBox, vBoxLabelName);
        return vBoxMenu;
    }
}