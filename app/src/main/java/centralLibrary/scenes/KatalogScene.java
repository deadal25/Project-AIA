package centralLibrary.scenes;

import centralLibrary.utils.MenuUtil;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
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
        vboxjudul.setStyle("-fx-background-color:SILVER;");
        vboxjudul.setAlignment(Pos.CENTER);
    
        // Novel Hujan
        Label label1 = new Label("Hujan");
        label1.setId("label-satu");
        ImageView novel1ImageView = new ImageView(new Image("/images/hujan.jpg")); 
        novel1ImageView.setFitHeight(150);
        novel1ImageView.setPreserveRatio(true);
        Label nomorHujan = new Label("1");
        nomorHujan.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        

        VBox vbox1 = new VBox(5,label1,novel1ImageView,nomorHujan);
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");

        // Novel Midnight Library
        Label label2 = new Label("The Midnight Library");
        ImageView novel2ImageView = new ImageView(new Image("/images/midnight.jpg")); 
        novel2ImageView.setFitHeight(150);
        novel2ImageView.setPreserveRatio(true);   
        Label nomorMidnight = new Label("2");
        nomorMidnight.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        VBox vbox2 = new VBox(5,label2,novel2ImageView,nomorMidnight);

        vbox2.setAlignment(Pos.CENTER);
        vbox2.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");

        // Novel Melangkah
        Label label5 = new Label("Melangkah");
        ImageView novel5ImageView = new ImageView(new Image("/images/melangkah.jpg")); 
        novel5ImageView.setFitHeight(150);
        novel5ImageView.setPreserveRatio(true);
        Label nomorMelangkah = new Label("3");
        nomorMelangkah.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");


        // Novel Black Showman
        Label novel9 = new Label("Black Showman");
        ImageView novel8ImageView = new ImageView(new Image("/images/Showman.jpg")); 
        novel8ImageView.setFitHeight(150);
        novel8ImageView.setPreserveRatio(true);   
        
        Label nomorShowman = new Label("4");
        nomorShowman.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        VBox vbox23 = new VBox(5,novel9,novel8ImageView,nomorShowman);
        vbox23.setAlignment(Pos.CENTER);
        vbox23.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");


        // Novel Bumi
        Label novel5 = new Label("Bumi");
        ImageView novel6ImageView = new ImageView(new Image("/images/bumi.jpg")); 
        novel6ImageView.setFitHeight(150);
        novel6ImageView.setPreserveRatio(true);   
        
        Label nomorBumi = new Label("5");
        nomorBumi.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        VBox vbox28 = new VBox(5,novel5,novel6ImageView,nomorBumi);
        vbox28.setAlignment(Pos.CENTER);
        vbox28.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");

        VBox vbox6 = new VBox(5,label5,novel5ImageView,nomorMelangkah);
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
        Label nomorFilosofi = new Label("6");
        nomorFilosofi.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");

        // Novel You do you
        Label buku5 = new Label("You do you");
        ImageView buku6ImageView = new ImageView(new Image("/images/youdo.jpg")); 
        buku6ImageView.setFitHeight(150);
        buku6ImageView.setPreserveRatio(true);   
        
        Label nomorYoudo = new Label("8");
        nomorYoudo.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        VBox vbox18 = new VBox(5,buku5,buku6ImageView,nomorYoudo);
        vbox18.setAlignment(Pos.CENTER);
        vbox18.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");

        // Novel Self Healing
        Label buku6 = new Label("Self Healing");
        ImageView buku9ImageView = new ImageView(new Image("/images/Healing.jpg")); 
        buku9ImageView.setFitHeight(150);
        buku9ImageView.setPreserveRatio(true);   

        Label nomorHealing = new Label("9");
        nomorHealing.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        VBox vbox16 = new VBox(5,buku6,buku9ImageView,nomorHealing);
        vbox16.setAlignment(Pos.CENTER);
        vbox16.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");

        // Buku Insecurity
        Label buku3 = new Label("Insecurity");
        ImageView buku7ImageView = new ImageView(new Image("/images/insecurity.jpg")); 
        buku7ImageView.setFitHeight(150);
        buku7ImageView.setPreserveRatio(true);   
        Label nomorInsec = new Label("10");
        nomorInsec.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        VBox vbox17 = new VBox(5,buku3,buku7ImageView,nomorInsec);
        vbox17.setAlignment(Pos.CENTER);
        vbox17.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");

        VBox vbox3 = new VBox(5,label3,book3ImageView,nomorFilosofi);
        vbox3.setAlignment(Pos.CENTER);
        vbox3.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");

        // Buku Atomic Habits
        Label label4 = new Label("Atomic Habits");
        ImageView sepatu4ImageView = new ImageView(new Image("/images/habits.jpg")); 
        sepatu4ImageView.setFitHeight(150);
        sepatu4ImageView.setPreserveRatio(true);
        Label nomorAtomic = new Label("7");
        nomorAtomic.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");

        VBox vbox4 = new VBox(5,label4,sepatu4ImageView,nomorAtomic);
        vbox4.setAlignment(Pos.CENTER);
        vbox4.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 15px 15px;");
    
        VBox vbox5 = new VBox();
        vbox5.setAlignment(Pos.CENTER);

        Button pinjamButton = new Button("PINJAM");
        pinjamButton.setOnMouseEntered(action -> pinjamButton.setCursor(Cursor.HAND));
        pinjamButton.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        pinjamButton.setOnAction(action -> {
            NotifikasiScene notofikasiPinjam = new NotifikasiScene(new Stage());
            notofikasiPinjam.berhasilPinjam();
        });

        Button exitButton = new Button("EXIT");
        exitButton.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        exitButton.setOnMouseEntered(action -> exitButton.setCursor(Cursor.HAND));
        exitButton.setOnAction(action -> {
            BerandaScene pindahBerandaScene = new BerandaScene(stage);
            pindahBerandaScene.berandaScene();
        });

        HBox hBoxButton = new HBox(30, exitButton, pinjamButton);
        hBoxButton.setAlignment(Pos.BOTTOM_CENTER);
        VBox.setMargin(exitButton, new Insets(0, 10, 0, 0));
        
        
        HBox hbox1 = new HBox(15, vbox1,vbox2,vbox6,vbox23,vbox28);
        hbox1.setAlignment(Pos.CENTER);
        
        HBox hbox2 = new HBox(15, vbox3,vbox4,vbox18,vbox16,vbox17);
        hbox2.setAlignment(Pos.CENTER);
        
        VBox utama = new VBox(10, vboxjudul,hbox1,vboxnovel,hbox2,hBoxButton);
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(MenuUtil.vBoxMenu());
        borderPane.setBottom(utama);
        borderPane.setPadding(new Insets(0, 0, 30, 0));

        StackPane pane = new StackPane();
        pane.getChildren().addAll(background, borderPane);
        Scene perpustakaan = new Scene(pane, 900, 700);

        perpustakaan.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(perpustakaan);
        stage.show();
    }
}
