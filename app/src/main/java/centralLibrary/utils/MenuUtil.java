package centralLibrary.utils;

import centralLibrary.scenes.BerandaScene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuUtil{

    public static MenuBar menu() {
        MenuBar menuBar = new MenuBar();

        Menu menu = new Menu("Menu");

        MenuItem beranda = new MenuItem("Beranda");
        MenuItem katalog = new MenuItem("Katalog");
        MenuItem bukuDipinjam = new MenuItem("Buku Dipinjam");
        MenuItem listAnggota = new MenuItem("List Anggota");

        menu.getItems().addAll(beranda, katalog, bukuDipinjam, listAnggota);

        beranda.setOnAction(action -> {
            Stage stage = (Stage) menuBar.getScene().getWindow();
            BerandaScene berandaScene = new BerandaScene(stage);
            berandaScene.berandaScene();
        });
        
        menuBar.getMenus().addAll(menu);
        return menuBar;
    }

    public static VBox vBoxMenu() {
        Label labelName = new Label("CENTRAL LIBRARY");
        VBox vboxMenu = new VBox(10, labelName, menu());
        return vboxMenu;
    }
}