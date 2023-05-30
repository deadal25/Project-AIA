package centralLibrary.scenes;

import centralLibrary.utils.MenuUtil;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BerandaScene {
    private Stage stage;

    public BerandaScene(Stage stage) {
        this.stage = stage;
    }

    public void berandaScene() {
        Label profil = new Label("PROFIL");
        profil.getStyleClass().add("label-name");
        Text text1 = new Text();
        text1.setText ("Central  Library  adalah tempat  yang  nyaman untuk  mengeksplorasi dunia  literasi.\n" + 
                        "Kami menjadi  rumah bagi  para pecinta buku dan penggemar literasi. Di Central\n" + 
                        "Library, kami berkomitmen untuk menciptakan  lingkungan yang ramah  dan inspiratif\n" + 
                        "bagi semua orang yang ingin menjelajahi dunia pengetahuan melalui bahan bacaan yang\n" + 
                        "berkualitas.");
        Text text2 = new Text("Lokasi: Jl. Imajinasi No.01, Kota Bayangan, Negara Cahaya.");
        Text text3 = new Text();
        text3.setText  ("Jam Operasional:\n" +
                        "   - Senin-Jumat: 08:00 - 20:00\n" +
                        "   - Sabtu-Minggu: 10:00 - 18:00");
        Text text4 = new Text();
        text4.setText  ("Layanan yang Ditawarkan:\n" +
                        "   - Peminjaman Buku: Anggota dapat meminjam buku dengan mendaftarkan diri sebagai anggota perpustakaan. Batas peminjaman adalah 3 buku selama 2 minggu.\n" +
                        "   - Ruang Baca: Kami menyediakan area nyaman untuk membaca di tempat dengan berbagai fasilitas seperti kursi ergonomis, meja, dan akses Wi-Fi gratis.\n" +
                        "   - Perpustakaan Digital: Anggota perpustakaan dapat mengakses koleksi e-book, audiobook, dan sumber belajar online melalui platform perpustakaan digital kami.");
        Label label1 = new Label("Bergabung bersama kami di ");
        Button daftar = new Button("Daftar Anggota");
        Label label2 = new Label(",   Atau lihat koleksi kami di ");
        Button kunjungKatalog = new Button("Kunjungi Katalog");

        daftar.setOnAction(action -> {
            DaftarScene pindahDaftarScene = new DaftarScene(stage);
            pindahDaftarScene.daftarScene();
        });

        HBox hbox = new HBox(label1, daftar, label2, kunjungKatalog);

        VBox vboxProfil = new VBox(15, profil, text1, text2, text3, text4, hbox);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(MenuUtil.vBoxMenu());
        borderPane.setCenter(vboxProfil);
        
        Scene scene = new Scene(borderPane, 800, 500);
        scene.getStylesheets().add("styles.css");
        stage.setScene(scene);
        stage.show();
    }
}
