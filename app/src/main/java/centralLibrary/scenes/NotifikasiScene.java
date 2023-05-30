package centralLibrary.scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifikasiScene {
    private Stage stage;

    public NotifikasiScene(Stage stage) {
        this.stage = stage;
    }

    public void berhasilDaftar() {
        Label label1 = new Label("Anda Telah Terdaftar");
        Label label2 = new Label("Selamat Telah Menjadi Anggota Central Library");

        Button closeButton = new Button("SIIIP");
        closeButton.setOnAction(action -> {
            stage.close();
        });

        VBox vBox = new VBox(10, label1, label2, closeButton);
        Scene scene = new Scene(vBox, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
}
