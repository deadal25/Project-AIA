package centralLibrary.scenes;

import centralLibrary.models.BorrowingMember;
import centralLibrary.utils.DatabaseConfig;
import centralLibrary.utils.MenuUtil;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListPeminjam {
    private Stage stage;

    public ListPeminjam(Stage stage) {
        this.stage = stage;
    }

    public void listPeminjamScene() {
        ImageView background = new ImageView("/images/bownCloud.jpg");
        background.setPreserveRatio(true);
        background.setFitHeight(1080);
        Label labelScene = new Label("List Peminjam Buku");
        labelScene.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 18px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");


        ObservableList<BorrowingMember> borrowingMembers = DatabaseConfig.getDataPeminjam();

        TableColumn<BorrowingMember, Integer> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<BorrowingMember, String> namaColumn = new TableColumn<>("NAMA");
        namaColumn.setCellValueFactory(new PropertyValueFactory<>("nama"));

        TableColumn<BorrowingMember, String> tanggalLahirColumn = new TableColumn<>("TANGGAL LAHIR");
        tanggalLahirColumn.setCellValueFactory(new PropertyValueFactory<>("tanggalLahir"));

        TableColumn<BorrowingMember, String> alamatColumn = new TableColumn<>("ALAMAT");
        alamatColumn.setCellValueFactory(new PropertyValueFactory<>("alamat"));

        TableColumn<BorrowingMember, String> teleponColumn = new TableColumn<>("TELEPON");
        teleponColumn.setCellValueFactory(new PropertyValueFactory<>("telepon"));

        TableColumn<BorrowingMember, String> genderColumn = new TableColumn<>("JENIS KELAMIN");
        genderColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));

        TableColumn<BorrowingMember, String> bukuDipinjamColumn = new TableColumn<>("BUKU DIPINJAM");
        bukuDipinjamColumn.setCellValueFactory(new PropertyValueFactory<>("judulBuku"));

        TableColumn<BorrowingMember, String> jenisBukuColumn = new TableColumn<>("JENIS BUKU");
        jenisBukuColumn.setCellValueFactory(new PropertyValueFactory<>("jenisBuku"));

        TableView<BorrowingMember> table = new TableView<>();
        table.setStyle("-fx-opacity: 0.7;");
        table.setItems(borrowingMembers);
        table.getColumns().add(idColumn);
        table.getColumns().add(namaColumn);
        table.getColumns().add(tanggalLahirColumn);
        table.getColumns().add(alamatColumn);
        table.getColumns().add(teleponColumn);
        table.getColumns().add(genderColumn);
        table.getColumns().add(bukuDipinjamColumn);
        table.getColumns().add(jenisBukuColumn);

        Button kembaliButton = new Button("Kembalikan");
        kembaliButton.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Times New Roman';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #241b24; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 3;");
        kembaliButton.setOnMouseEntered(action -> kembaliButton.setCursor(Cursor.HAND));

        kembaliButton.setOnAction(action -> {
            BorrowingMember selectedData = table.getSelectionModel().getSelectedItem();
            if (selectedData != null) {
                int selectedId = selectedData.getId();
                DatabaseConfig.deletePeminjam(selectedId);
                borrowingMembers.remove(selectedData);
                table.refresh();
            }
        });


        VBox vBox = new VBox(15, labelScene, table, kembaliButton);
        vBox.setPadding(new Insets(0, 0, 50, 0));
        vBox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(MenuUtil.vBoxMenu());
        borderPane.setCenter(vBox);

        StackPane stackPane = new StackPane(background, borderPane);

        Scene scene = new Scene(stackPane, 900, 700);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
