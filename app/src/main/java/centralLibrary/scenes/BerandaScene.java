package centralLibrary.scenes;

import centralLibrary.utils.MenuUtil;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BerandaScene {
    private Stage stage;

    public BerandaScene(Stage stage) {
        this.stage = stage;
    }

    public void berandaScene() {

        ImageView background = new ImageView("/images/bownCloud.jpg");
        background.setPreserveRatio(true);
        background.setFitHeight(1080);

        ImageView imageView = new ImageView("/images/LogoCentral.png");
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(160);

        Label text1 = new Label();
        text1.setText ("Central  Library  adalah tempat  yang  nyaman untuk  mengeksplorasi dunia  literasi.\n" + 
                        "Kami menjadi  rumah bagi  para pecinta buku dan penggemar literasi. Di Central\n" + 
                        "Library, kami berkomitmen untuk menciptakan  lingkungan yang ramah  dan inspiratif\n" + 
                        "bagi semua orang yang ingin menjelajahi dunia pengetahuan melalui bahan bacaan yang\n" + 
                        "berkualitas.");
        text1.getStyleClass().add("text");

        Label text2 = new Label("Lokasi: Jl. Imajinasi No.01, Kota Bayangan, Negara Cahaya.");
        text2.getStyleClass().add("text");

        Label text3 = new Label();
        text3.getStyleClass().add("text");
        text3.setText  ("Jam Operasional:\n" +
                        "   Senin - Jumat: 08:00 - 20:00\n" +
                        "   Sabtu - Minggu: 10:00 - 18:00");

        Label text4 = new Label();
        text4.setText  ("Layanan yang Ditawarkan:\n" +
                        "   - Peminjaman Buku: Anggota dapat meminjam buku dengan mendaftarkan diri sebagai anggota perpustakaan.\n" +
                        "   - Ruang Baca: Kami menyediakan area nyaman untuk membaca di tempat dengan berbagai fasilitas lengkap.\n" +
                        "   - Perpustakaan Digital: Anggota perpustakaan dapat mengakses koleksi e-book melalui platform perpustakaan digital kami.");
        text4.getStyleClass().add("text");

        Label label1 = new Label("Bergabung bersama kami");
        label1.getStyleClass().add("label-one");
        Button daftar = new Button("Daftar Anggota");
        Label label2 = new Label("Lihat koleksi kami");
        label2.getStyleClass().add("label-two");
        Button kunjungKatalog = new Button("Kunjungi Koleksi");

        daftar.setOnAction(action -> {
            DaftarScene pindahDaftarScene = new DaftarScene(stage);
            pindahDaftarScene.daftarScene();
        });

        kunjungKatalog.setOnAction(action -> {
            KatalogScene pindahKatalogScene = new KatalogScene(stage);
            pindahKatalogScene.katalogScene();
        });

        VBox vBoxAnggota = new VBox(label1,daftar);
        vBoxAnggota.setAlignment(Pos.CENTER);
        VBox vBoxKatalog = new VBox(label2,kunjungKatalog);
        vBoxKatalog.setAlignment(Pos.CENTER);
        HBox hbox = new HBox(vBoxAnggota,vBoxKatalog);
        hbox.setSpacing(140);
        hbox.setAlignment(Pos.CENTER);

        VBox vboxProfil = new VBox(15, imageView, text2, text3, text4, hbox);
        vboxProfil.setAlignment(Pos.TOP_CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(MenuUtil.vBoxMenu());
        borderPane.setCenter(vboxProfil);

        StackPane pane = new StackPane(background,borderPane);
        
        Scene scene = new Scene(pane, 900, 700);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
