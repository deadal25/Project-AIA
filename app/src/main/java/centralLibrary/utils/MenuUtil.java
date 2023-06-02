package centralLibrary.utils;

import centralLibrary.scenes.BerandaScene;
import centralLibrary.scenes.KatalogScene;
import centralLibrary.scenes.ListPeminjam;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuUtil{

    public static MenuBar menu() {
        MenuBar menuBar = new MenuBar();
        menuBar.setId("menu-bar");

        Menu menu = new Menu("Menu");

        MenuItem beranda = new MenuItem("Beranda");
        MenuItem katalog = new MenuItem("Katalog");
        MenuItem listPinjam = new MenuItem("List Peminjam");

        menu.getItems().addAll(beranda, katalog, listPinjam);

        beranda.setOnAction(action -> {
            Stage stage = (Stage) menuBar.getScene().getWindow();
            BerandaScene berandaScene = new BerandaScene(stage);
            berandaScene.berandaScene();
        });

        katalog.setOnAction(action -> {
            Stage stage = (Stage) menuBar.getScene().getWindow();
            KatalogScene katalogScene = new KatalogScene(stage);
            katalogScene.katalogScene();

        });

        listPinjam.setOnAction(action -> {
            Stage stage = (Stage) menuBar.getScene().getWindow();
            ListPeminjam listPeminjam = new ListPeminjam(stage);
            listPeminjam.listPeminjamScene();
        });
        
        menuBar.getMenus().addAll(menu);
        return menuBar;
    }

    public static VBox vBoxMenu() {
        Label labelName = new Label("CENTRAL LIBRARY");
        labelName.setId("central-library");
        VBox vboxMenu = new VBox(8, labelName, menu());
        vboxMenu.setAlignment(Pos.CENTER);
        return vboxMenu;
    }
}