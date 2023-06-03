package centralLibrary.scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
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
        vboxjudul.setStyle("-fx-background-color:SILVER;");
        vboxjudul.setAlignment(Pos.CENTER);
    
        // Novel Hujan
        Label label1 = new Label("Hujan");
        label1.setId("label-satu");
        ImageView novel1ImageView = new ImageView(new Image("/images/hujan.jpg")); 
        novel1ImageView.setFitHeight(150);
        novel1ImageView.setPreserveRatio(true);
        Button PinjamHujan = new Button("PINJAM");
        PinjamHujan.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        
        PinjamHujan.setOnAction(action -> {
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });
        VBox vbox1 = new VBox(5,label1,novel1ImageView,PinjamHujan);
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");

        // Novel Midnight Library
        Label label2 = new Label("The Midnight Library");
        ImageView novel2ImageView = new ImageView(new Image("/images/midnight.jpg")); 
        novel2ImageView.setFitHeight(150);
        novel2ImageView.setPreserveRatio(true);   
        Button PinjamMidnight = new Button("PINJAM");
        PinjamMidnight.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        VBox vbox2 = new VBox(5,label2,novel2ImageView,PinjamMidnight);

        vbox2.setAlignment(Pos.CENTER);
        vbox2.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");

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
        PinjamMelangkah.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");

        PinjamMelangkah.setOnAction(action -> {
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });

        // Novel Black Showman
        Label novel9 = new Label("Black Showman");
        ImageView novel8ImageView = new ImageView(new Image("/images/Showman.jpg")); 
        novel8ImageView.setFitHeight(150);
        novel8ImageView.setPreserveRatio(true);   
        
        Button Pinjamshowman = new Button("PINJAM");
        Pinjamshowman.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        VBox vbox23 = new VBox(5,novel9,novel8ImageView,Pinjamshowman);
        vbox23.setAlignment(Pos.CENTER);
        vbox23.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");

        Pinjamshowman.setOnAction(action ->{
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });

        // Novel Bumi
        Label novel5 = new Label("Bumi");
        ImageView novel6ImageView = new ImageView(new Image("/images/bumi.jpg")); 
        novel6ImageView.setFitHeight(150);
        novel6ImageView.setPreserveRatio(true);   
        
        Button Pinjambumi = new Button("PINJAM");
        Pinjambumi.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        VBox vbox28 = new VBox(5,novel5,novel6ImageView,Pinjambumi);
        vbox28.setAlignment(Pos.CENTER);
        vbox28.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");

        Pinjambumi.setOnAction(action ->{
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });

        VBox vbox6 = new VBox(5,label5,novel5ImageView,PinjamMelangkah);
        vbox6.setAlignment(Pos.CENTER);
        vbox6.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");

        Label novel = new Label("EDUKASI BOOKS");
        novel.setStyle("-fx-background-color:GRAY;-fx-font-size: 18px; -fx-font-family: 'CAMBRIA'; -fx-text-fill: BLACK");
        VBox vboxnovel = new VBox(0, novel);
        vboxnovel.setStyle("-fx-background-color:GRAY;");
        vboxnovel.setAlignment(Pos.CENTER);

        // Buku Filosofi Teras
        Label label3 = new Label("Filosofi Teras");
        ImageView book3ImageView = new ImageView(new Image("/images/stoik.JPG")); 
        book3ImageView.setFitHeight(150);
        book3ImageView.setPreserveRatio(true);
        Button PinjamFilosofi = new Button("PINJAM");
        PinjamFilosofi.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        
        PinjamFilosofi.setOnAction(action -> {
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });

        // Novel You do you
        Label buku5 = new Label("You do you");
        ImageView buku6ImageView = new ImageView(new Image("/images/youdo.jpg")); 
        buku6ImageView.setFitHeight(150);
        buku6ImageView.setPreserveRatio(true);   
        
        Button PinjamYoudo = new Button("PINJAM");
        PinjamYoudo.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        VBox vbox18 = new VBox(5,buku5,buku6ImageView,PinjamYoudo);
        vbox18.setAlignment(Pos.CENTER);
        vbox18.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");

        PinjamYoudo.setOnAction(action ->{
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });

        // Novel Self Healing
        Label buku6 = new Label("Self Healing");
        ImageView buku9ImageView = new ImageView(new Image("/images/Healing.jpg")); 
        buku9ImageView.setFitHeight(150);
        buku9ImageView.setPreserveRatio(true);   

        Button Pinjamhealing = new Button("PINJAM");
        Pinjamhealing.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        VBox vbox16 = new VBox(5,buku6,buku9ImageView,Pinjamhealing);
        vbox16.setAlignment(Pos.CENTER);
        vbox16.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");

        Pinjamhealing.setOnAction(action ->{
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });

        // Buku Insecurity
        Label buku3 = new Label("Insecurity");
        ImageView buku7ImageView = new ImageView(new Image("/images/insecurity.jpg")); 
        buku7ImageView.setFitHeight(150);
        buku7ImageView.setPreserveRatio(true);   
        Button PinjamInsec = new Button("PINJAM");
        PinjamInsec.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        VBox vbox17 = new VBox(5,buku3,buku7ImageView,PinjamInsec);
        vbox17.setAlignment(Pos.CENTER);
        vbox17.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");

        PinjamInsec.setOnAction(action ->{
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });

        VBox vbox3 = new VBox(5,label3,book3ImageView,PinjamFilosofi);
        vbox3.setAlignment(Pos.CENTER);
        vbox3.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");

        // Buku Atomic Habits
        Label label4 = new Label("Atomic Habits");
        ImageView sepatu4ImageView = new ImageView(new Image("/images/habits.jpg")); 
        sepatu4ImageView.setFitHeight(150);
        sepatu4ImageView.setPreserveRatio(true);
        Button PinjamAttomicHabits = new Button("PINJAM");
        PinjamAttomicHabits.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");

        PinjamAttomicHabits.setOnAction(action -> {
            NotifikasiScene validasiPinjaman = new NotifikasiScene(new Stage());
            validasiPinjaman.berhasilPinjam();
        });

        VBox vbox4 = new VBox(5,label4,sepatu4ImageView,PinjamAttomicHabits);
        vbox4.setAlignment(Pos.CENTER);
        vbox4.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");
    
        VBox vbox5 = new VBox();
        vbox5.setAlignment(Pos.CENTER);

        Region space = new Region();
        space.setPrefHeight(60);

        Button exitButton = new Button("EXIT");
        exitButton.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        vbox5.getChildren().addAll(space, exitButton);
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

        StackPane pane = new StackPane();
        pane.getChildren().addAll(background, utama);
        Scene perpustakaan = new Scene(pane, 900, 700);

        perpustakaan.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(perpustakaan);
        stage.show();
    }
}
