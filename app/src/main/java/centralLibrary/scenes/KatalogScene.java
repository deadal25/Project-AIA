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
        vboxjudul.setStyle("-fx-background-color:Brown;");
        vboxjudul.setAlignment(Pos.CENTER);
    
            // Novel Hujan
            Label label1 = new Label("Hujan");
            label1.setId("label-satu");
            ImageView novel1ImageView = new ImageView(new Image("/images/hujan.jpg")); 
            novel1ImageView.setFitHeight(150);
            novel1ImageView.setPreserveRatio(true);
            Label label11 = new Label("");
            label11.setStyle("-fx-font-size: 10px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");
            Button button1 = new Button("Borrow");
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
            Button button2 = new Button("Borrow");
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
            Button button3 = new Button("Borrow");
            button3.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 2;");
            VBox vbox3 = new VBox(5,label3,book3ImageView,button3);
            vbox3.setAlignment(Pos.CENTER);
            vbox3.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");
            Label label4 = new Label("Attomic Habits");
            ImageView sepatu4ImageView = new ImageView(new Image("/images/habits.jpg")); 
            sepatu4ImageView.setFitHeight(150);
            sepatu4ImageView.setPreserveRatio(true);
            Button button4 = new Button("Borrow");
            button4.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 2;");
    
            VBox vbox4 = new VBox(5,label4,sepatu4ImageView,button4);
            vbox4.setAlignment(Pos.CENTER);
            vbox4.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");
    
        
            VBox vbox5 = new VBox();
            vbox5.setAlignment(Pos.CENTER);
    
            Button button5 = new Button("EXIT");
            button5.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:RED;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 2;");
            vbox5.getChildren().add(button5);
            VBox.setMargin(button5, new Insets(0, 10, 0, 0));
            
            HBox hbox1 = new HBox(15, vbox1,vbox2,vbox6);
            hbox1.setAlignment(Pos.CENTER);
            
            HBox hbox2 = new HBox(15, vbox3,vbox4);
            hbox2.setAlignment(Pos.CENTER);
            
            VBox utama = new VBox(10, vboxjudul,hbox1,vboxnovel,hbox2,vbox5);
            // utama.setStyle("-fx-background-color:#DCDCDC;");

            StackPane pane = new StackPane();
            pane.getChildren().addAll(background, utama);
            Scene tokoScene = new Scene(pane, 900, 700);

            tokoScene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
            stage.setScene(tokoScene);
            stage.show();
        }
    }



// package centralLibrary.Scenes;



// import javafx.geometry.Insets;
// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.image.Image;
// import javafx.scene.image.ImageView;
// import javafx.scene.layout.HBox;
// import javafx.scene.layout.VBox;
// import javafx.stage.Stage;

// public class KatalogScene {
//     private Stage stage;

//     public KatalogScene(Stage stage) {
//         this.stage = stage;
//     }

//     public void katalogScene() {

//         Label judul = new Label("Library");
//         judul.setStyle(
//                 "-fx-background-color:GRAY;-fx-font-size: 15px; -fx-font-family: 'CAMBRIA'; -fx-text-fill: BLACK");
//         VBox vboxjudul = new VBox(0, judul);
//         vboxjudul.setStyle("-fx-background-color:GRAY;");
//         vboxjudul.setAlignment(Pos.CENTER);

//         Label label1 = new Label("NOVEL SENKU");
//         label1.setStyle(
//                 "-fx-padding: 5px 25px;-fx-font-size: 15px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;-fx-background-color: #23c7f0; -fx-border-color: WHITE; -fx-border-width: 1px; -fx-border-radius: 5;");

//         ImageView novel1ImageView = new ImageView(new Image("/images/senku.jpg"));
//         novel1ImageView.setFitHeight(140);
//         novel1ImageView.setFitWidth(175);

//         Label label11 = new Label("NOVEL SENKU MENCERITAKAN TENTANG DUNIA BATU");
//         label11.setStyle("-fx-font-size: 10px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");

//         Button button1 = new Button("PIN");
//         button1.setStyle(
//                 "-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");

//         VBox vbox1 = new VBox(5, label1, novel1ImageView, label11, button1);
//         vbox1.setAlignment(Pos.CENTER);
//         vbox1.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

    
//         Label label2 = new Label(" NOVEL CLASSROOM ");
//         label2.setStyle(
//                 "-fx-padding: 5px 15px;-fx-font-size: 15px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;-fx-background-color: #23c7f0; -fx-border-color: WHITE; -fx-border-width: 2px; -fx-border-radius: 5;");

//         ImageView novel2ImageView = new ImageView(new Image("/images/ayano.jpg"));
//         novel2ImageView.setFitHeight(140);
//         novel2ImageView.setFitWidth(175);
//         Label label10 = new Label(
//                 "NOVEL AYANO");
//         label10.setStyle("-fx-font-size: 10px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");

//         Button button2 = new Button("PIN");
//         button2.setStyle(
//                 "-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");

//         VBox vbox2 = new VBox(5, label2, novel2ImageView, label10, button2);
//         vbox2.setAlignment(Pos.CENTER);
//         vbox2.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

//         Label label5 = new Label("NOVEL RIMURU");
//         label5.setStyle(
//                 "-fx-padding: 5px 25px;-fx-font-size: 15px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;-fx-background-color: #23c7f0; -fx-border-color: WHITE; -fx-border-width: 1px; -fx-border-radius: 5;");

//         ImageView novel3ImageView = new ImageView(new Image("/images/rimuru.jpg"));
//         novel3ImageView.setFitHeight(140);
//         novel3ImageView.setFitWidth(175);

//         Label label16 = new Label("NOVEL RIMURU");
//         label16.setStyle("-fx-font-size: 10px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");

//         Button button6 = new Button("PIN");
//         button6.setStyle(
//                 "-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");

//         VBox vbox6 = new VBox(5, label5, novel3ImageView, label16, button6);
//         vbox6.setAlignment(Pos.CENTER);
//         vbox6.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

//         Label novel = new Label("EDUKASI");
//         novel.setStyle(
//                 "-fx-background-color:GRAY;-fx-font-size: 15px; -fx-font-family: 'CAMBRIA'; -fx-text-fill: BLACK");
//         VBox vboxnovel = new VBox(0, novel);
//         vboxnovel.setStyle("-fx-background-color:GRAY;");
//         vboxnovel.setAlignment(Pos.CENTER);

//         Label label3 = new Label(" BUKU EDUKASI AGAMA ");
//         label3.setStyle(
//                 "-fx-padding: 5px 25px;-fx-font-size: 15px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;-fx-background-color: #23c7f0; -fx-border-color: WHITE; -fx-border-width: 2px; -fx-border-radius: 5;");

//         ImageView novel4ImageView = new ImageView(new Image("/images/agama.JPG"));
//         novel4ImageView.setFitHeight(140);
//         novel4ImageView.setFitWidth(175);

//         Label label13 = new Label("NOVEL RIMURU");
//         label13.setStyle("-fx-font-size: 10px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");

//         Button button3 = new Button("PIN");
//         button3.setStyle(
//                 "-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 2;");

//         VBox vbox3 = new VBox(5, label3, novel4ImageView, label13, button3);
//         vbox3.setAlignment(Pos.CENTER);
//         vbox3.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

//         Label label4 = new Label(" BUKU EDUKASI POLITIK ");
//         label4.setStyle(
//                 "-fx-padding: 5px 25px;-fx-font-size: 15px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;-fx-background-color: #23c7f0; -fx-border-color: WHITE; -fx-border-width: 2px; -fx-border-radius: 5;");

//         ImageView novel5ImageView = new ImageView(new Image("/images/politik.jpg"));
//         novel5ImageView.setFitHeight(140);
//         novel5ImageView.setFitWidth(175);

//         Label label14 = new Label("BUKU AGAMA");
//         label14.setStyle("-fx-font-size: 10px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");

//         Button button4 = new Button("PIN");
//         button4.setStyle(
//                 "-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 2;");

//         VBox vbox4 = new VBox(5, label4, novel5ImageView, label14, button4);
//         vbox4.setAlignment(Pos.CENTER);
//         vbox4.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

//         VBox vbox5 = new VBox();
//         vbox5.setAlignment(Pos.CENTER);

//         Button button5 = new Button("EXIT");
//         button5.setStyle(
//                 "-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:RED;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 2;");
//         vbox5.getChildren().add(button5);
//         VBox.setMargin(button5, new Insets(0, 10, 0, 0));

//         HBox hbox1 = new HBox(15, vbox1, vbox2, vbox6);
//         hbox1.setAlignment(Pos.CENTER);

//         HBox hbox2 = new HBox(15, vbox3, vbox4);
//         hbox2.setAlignment(Pos.CENTER);

//         VBox utama = new VBox(10, vboxjudul, hbox1, vboxnovel, hbox2, vbox5);

//         Scene tokoScene = new Scene(utama, 615, 615);
//         stage.setScene(tokoScene);
//         stage.show();
//     }

//     public void show() {
//     }
// }

