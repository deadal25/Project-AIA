package centralLibrary.utils;

import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;

public class MenuUtil{
    public static MenuBar menu() {
        MenuBar menuBar = new MenuBar();

        Menu beranda = new Menu("Beranda");
        Menu katalog = new Menu("Katalog");
        Menu pinjam = new Menu("Buku Dipinjam");
        Menu bantuan = new Menu("Bantuan");

        MenuItem novel = new MenuItem("Novel");
        MenuItem edukasi = new MenuItem("Edukasi");

        katalog.getItems().addAll(novel, edukasi);


        menuBar.getMenus().addAll(beranda, katalog, pinjam, bantuan);
        return menuBar;
    }

    public static VBox vBoxMenu() {
        Label labelName = new Label("CENTRAL LIBRARY");
        VBox vboxMenu = new VBox(10, labelName, menu());
        return vboxMenu;
    }
}
