package centralLibrary.utils;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

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
}
