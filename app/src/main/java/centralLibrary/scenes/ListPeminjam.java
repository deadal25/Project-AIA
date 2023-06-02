package centralLibrary.scenes;

import centralLibrary.models.BorrowingMember;
import centralLibrary.utils.DatabaseConfig;
import centralLibrary.utils.MenuUtil;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListPeminjam {
    private Stage stage;

    public ListPeminjam(Stage stage) {
        this.stage = stage;
    }

    public void listPeminjamScene() {
        Label label = new Label("List Peminjam Buku");

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

        TableView<BorrowingMember> table = new TableView<>();
        table.setItems(borrowingMembers);
        table.getColumns().add(idColumn);
        table.getColumns().add(namaColumn);
        table.getColumns().add(tanggalLahirColumn);
        table.getColumns().add(alamatColumn);
        table.getColumns().add(teleponColumn);
        table.getColumns().add(genderColumn);


        VBox vBox = new VBox(15, label, table);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(MenuUtil.vBoxMenu());
        borderPane.setCenter(vBox);

        Scene scene = new Scene(borderPane, 900, 700);
        stage.setScene(scene);
        stage.show();
    }
}
