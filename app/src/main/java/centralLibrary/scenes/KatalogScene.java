package centralLibrary.scenes;

import javax.swing.Action;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class KatalogScene {
    private Stage stage;

    public KatalogScene(Stage stage) {
        this.stage = stage;
        // new BorderPane();
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
            
            Button button1 = new Button("PINJAM");
            button1.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");
            
            VBox vbox1 = new VBox(5,label1,novel1ImageView,label11,button1);
            vbox1.setAlignment(Pos.CENTER);
            vbox1.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");


            // Novel Midnight Library
            Label label2 = new Label("The Midnight Library");
            
            ImageView novel2ImageView = new ImageView(new Image("/images/midnight.jpg")); 
            
            novel2ImageView.setFitHeight(150);
            novel2ImageView.setPreserveRatio(true);   
            
            Label label10 = new Label("");
            label10.setStyle("-fx-font-size: 10px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");
            
            Button button2 = new Button("PINJAM");
            button2.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");
            
            VBox vbox2 = new VBox(5,label2,novel2ImageView,label10,button2);
            vbox2.setAlignment(Pos.CENTER);
            vbox2.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");


            // Novel Melangkah
            Label label5 = new Label("Melangkah");
            ImageView novel5ImageView = new ImageView(new Image("/images/melangkah.jpg")); 
            novel5ImageView.setFitHeight(150);
            novel5ImageView.setPreserveRatio(true);
            Button button6 = new Button("PINJAM");
            button6.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");

            VBox vbox6 = new VBox(5,label5,novel5ImageView,button6);
            vbox6.setAlignment(Pos.CENTER);
            vbox6.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

    Label novel = new Label("EDUKASI BOOKS");
    novel.setStyle("-fx-background-color:GRAY;-fx-font-size: 15px; -fx-font-family: 'CAMBRIA'; -fx-text-fill: BLACK");
    VBox vboxnovel = new VBox(0, novel);
    vboxnovel.setStyle("-fx-background-color:GRAY;");
    vboxnovel.setAlignment(Pos.CENTER);

            // Buku Filosofi Teras
            Label label3 = new Label("Filosofi Teras");
            ImageView book3ImageView = new ImageView(new Image("/images/stoik.JPG")); 
            book3ImageView.setFitHeight(150);
            book3ImageView.setPreserveRatio(true);
            Button button3 = new Button("PINJAM");
            button3.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 2;");
            
            VBox vbox3 = new VBox(5,label3,book3ImageView,button3);
            vbox3.setAlignment(Pos.CENTER);
            vbox3.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");
            
            // Buku Atomic Habits
            Label label4 = new Label("Attomic Habits");
            ImageView bukuImageView = new ImageView(new Image("/images/habits.jpg")); 
            bukuImageView.setFitHeight(150);
            bukuImageView.setPreserveRatio(true);
            Button button4 = new Button("PINJAM");
            button4.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 2;");
    
            VBox vbox4 = new VBox(5,label4,bukuImageView,button4);
            vbox4.setAlignment(Pos.CENTER);
            vbox4.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");
    
        
            VBox vbox5 = new VBox();
            vbox5.setAlignment(Pos.CENTER);
    
            Button exitButton = new Button("EXIT");
            exitButton.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:RED;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 2;");
            vbox5.getChildren().add(exitButton);
            VBox.setMargin(exitButton, new Insets(0, 10, 0, 0));
            exitButton.setOnAction(Action ->{
                BerandaScene berandaScene = new BerandaScene(stage);
                berandaScene.berandaScene();
            });
            
            HBox hbox1 = new HBox(15, vbox1,vbox2,vbox6);
            hbox1.setAlignment(Pos.CENTER);
            
            HBox hbox2 = new HBox(15, vbox3,vbox4);
            hbox2.setAlignment(Pos.CENTER);
            
            VBox utama = new VBox(10, vboxjudul,hbox1,vboxnovel,hbox2,vbox5);
            // utama.setStyle("-fx-background-color:#DCDCDC;");

            StackPane pane = new StackPane();
            pane.getChildren().addAll(background, utama);
            Scene perpusScene = new Scene(pane, 900, 700);

            perpusScene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
            stage.setScene(perpusScene);
            stage.show();
        }
    }


