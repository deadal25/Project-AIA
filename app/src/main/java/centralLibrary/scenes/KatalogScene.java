package centralLibrary.scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;  
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class KatalogScene {
    private Stage stage;


    public Stage getStage() {
        return stage;
    }
    public KatalogScene() {}
    public KatalogScene(Stage stage) {
        this.stage = stage;
    }
    public void katalogScene(){
        ImageView background = new ImageView("/images/bownCloud.jpg");
        background.setPreserveRatio(true);
        background.setFitHeight(1080);

        Label judul = new Label("NOVELS");
        judul.setId("judul-katalog");
        VBox vboxjudul = new VBox(0, judul);
        // vboxjudul.setId("vbox-judul");
        vboxjudul.setStyle("-fx-background-color:SILVER;");
        vboxjudul.setAlignment(Pos.CENTER);
    
        // Novel Hujan
        Label label1 = new Label("Hujan");
        label1.setId("label-satu");
        ImageView novel1ImageView = new ImageView(new Image("/images/hujan.jpg")); 
        novel1ImageView.setFitHeight(150);
        novel1ImageView.setPreserveRatio(true);
        Label label11 = new Label("");
        label11.setStyle("-fx-font-size: 10px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");
        Button PinjamHujan = new Button("PINJAM");
        PinjamHujan.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");
        
        PinjamHujan.setOnAction(action -> {
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });
        VBox vbox1 = new VBox(5,label1,novel1ImageView,label11,PinjamHujan);
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

        // Novel Midnight Library
        Label label2 = new Label("The Midnight Library");
        ImageView novel2ImageView = new ImageView(new Image("/images/midnight.jpg")); 
        novel2ImageView.setFitHeight(150);
        novel2ImageView.setPreserveRatio(true);   
        Label label10 = new Label("");
        label10.setStyle("-fx-font-size: 10px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");
        Button PinjamMidnight = new Button("PINJAM");
        PinjamMidnight.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");
        VBox vbox2 = new VBox(5,label2,novel2ImageView,label10,PinjamMidnight);
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

        PinjamMidnight.setOnAction(action ->{
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });

        // Novel Melangkah
        Label label5 = new Label("Melangkah");
        ImageView novel5ImageView = new ImageView(new Image("/images/melangkah.jpg")); 
        novel5ImageView.setFitHeight(150);
        novel5ImageView.setPreserveRatio(true);
        Button PinjamMelangkah = new Button("PINJAM");
        PinjamMelangkah.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");

        PinjamMelangkah.setOnAction(action -> {
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });

        // Novel Black Showman
        Label novel9 = new Label("Black Showman");
        ImageView novel8ImageView = new ImageView(new Image("/images/Showman.jpg")); 
        novel8ImageView.setFitHeight(150);
        novel8ImageView.setPreserveRatio(true);   
        Label label87 = new Label("");
        label87.setStyle("-fx-font-size: 10px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");
        
        Button Pinjamshowman = new Button("PINJAM");
        Pinjamshowman.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");
        VBox vbox23 = new VBox(5,novel9,novel8ImageView,label87,Pinjamshowman);
        vbox23.setAlignment(Pos.CENTER);
        vbox23.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

        Pinjamshowman.setOnAction(action ->{
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });

        // Novel Bumi
        Label novel5 = new Label("Bumi");
        ImageView novel6ImageView = new ImageView(new Image("/images/bumi.jpg")); 
        novel6ImageView.setFitHeight(150);
        novel6ImageView.setPreserveRatio(true);   
        Label label69 = new Label("");
        label69.setStyle("-fx-font-size: 10px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");
        
        Button Pinjamsbumi = new Button("PINJAM");
        Pinjamsbumi.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");
        VBox vbox28 = new VBox(5,novel5,novel6ImageView,label69,Pinjamsbumi);
        vbox28.setAlignment(Pos.CENTER);
        vbox28.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

        Pinjamsbumi.setOnAction(action ->{
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });

        VBox vbox6 = new VBox(5,label5,novel5ImageView,PinjamMelangkah);
        vbox6.setAlignment(Pos.CENTER);
        vbox6.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

        Label novel = new Label("EDUKASI BOOK");
        novel.setStyle("-fx-background-color:GRAY;-fx-font-size: 15px; -fx-font-family: 'CAMBRIA'; -fx-text-fill: BLACK");
        VBox vboxnovel = new VBox(0, novel);
        vboxnovel.setStyle("-fx-background-color:GRAY;");
        vboxnovel.setAlignment(Pos.CENTER);

        // Buku Filosofi Teras
        Label label3 = new Label("Filosofi Teras");
        ImageView book3ImageView = new ImageView(new Image("/images/stoik.JPG")); 
        book3ImageView.setFitHeight(150);
        book3ImageView.setPreserveRatio(true);
        Button PinjamFilosofi = new Button("PINJAM");
        PinjamFilosofi.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 2;");
        
        PinjamFilosofi.setOnAction(action -> {
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });

        // Novel You do you
        Label buku5 = new Label("You do you");
        ImageView buku6ImageView = new ImageView(new Image("/images/youdo.jpg")); 
        buku6ImageView.setFitHeight(150);
        buku6ImageView.setPreserveRatio(true);   
        Label label09 = new Label("");
        label09.setStyle("-fx-font-size: 10px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");
        
        Button PinjamYoudo = new Button("PINJAM");
        PinjamYoudo.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");
        VBox vbox18 = new VBox(5,buku5,buku6ImageView,label09,PinjamYoudo);
        vbox18.setAlignment(Pos.CENTER);
        vbox18.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

        PinjamYoudo.setOnAction(action ->{
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });

        // Novel Self Healing
        Label buku6 = new Label("Self Healing");
        ImageView buku9ImageView = new ImageView(new Image("/images/Healing.jpg")); 
        buku9ImageView.setFitHeight(150);
        buku9ImageView.setPreserveRatio(true);   
        Label label03 = new Label("");
        label03.setStyle("-fx-font-size: 10px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");
        
        Button Pinjamhealing = new Button("PINJAM");
        Pinjamhealing.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");
        VBox vbox16 = new VBox(5,buku6,buku9ImageView,label03,Pinjamhealing);
        vbox16.setAlignment(Pos.CENTER);
        vbox16.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

        Pinjamhealing.setOnAction(action ->{
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });

        // Buku Insecurity
        Label buku3 = new Label("Insecurity");
        ImageView buku7ImageView = new ImageView(new Image("/images/insecurity.jpg")); 
        buku7ImageView.setFitHeight(150);
        buku7ImageView.setPreserveRatio(true);   
        Label label07 = new Label("");
        label07.setStyle("-fx-font-size: 10px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");
        
        Button PinjamInsec = new Button("PINJAM");
        PinjamInsec.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");
        VBox vbox17 = new VBox(5,buku3,buku7ImageView,label07,PinjamInsec);
        vbox17.setAlignment(Pos.CENTER);
        vbox17.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

        PinjamInsec.setOnAction(action ->{
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });


        VBox vbox3 = new VBox(5,label3,book3ImageView,PinjamFilosofi);
        vbox3.setAlignment(Pos.CENTER);
        vbox3.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");
        Label label4 = new Label("Attomic Habits");
        ImageView sepatu4ImageView = new ImageView(new Image("/images/habits.jpg")); 
        sepatu4ImageView.setFitHeight(150);
        sepatu4ImageView.setPreserveRatio(true);
        Button PinjamAttomicHabits = new Button("PINJAM");
        PinjamAttomicHabits.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 2;");

        PinjamAttomicHabits.setOnAction(action -> {
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();

        });

        VBox vbox4 = new VBox(5,label4,sepatu4ImageView,PinjamAttomicHabits);
        vbox4.setAlignment(Pos.CENTER);
        vbox4.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");
    
        VBox vbox5 = new VBox();
        vbox5.setAlignment(Pos.CENTER);

        Button exitButton = new Button("EXIT");
        exitButton.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:RED;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 2;");
        vbox5.getChildren().add(exitButton);
        VBox.setMargin(exitButton, new Insets(0, 10, 0, 0));
        
        exitButton.setOnAction(action -> {
            BerandaScene pindahBerandaScene = new BerandaScene(stage);
            pindahBerandaScene.berandaScene();
        });
        
        HBox hbox1 = new HBox(15, vbox1,vbox2,vbox6,vbox23,vbox28);
        hbox1.setAlignment(Pos.CENTER);
        
        HBox hbox2 = new HBox(15, vbox3,vbox4,vbox18,vbox16,vbox17);
        hbox2.setAlignment(Pos.CENTER);
        
        VBox utama = new VBox(10, vboxjudul,hbox1,vboxnovel,hbox2,vbox5);
        // utama.setStyle("-fx-background-color:#DCDCDC;");

        StackPane pane = new StackPane();
        pane.getChildren().addAll(background, utama);
        Scene perpustakaan = new Scene(pane, 900, 700);

        perpustakaan.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(perpustakaan);
        stage.show();
    }
}
