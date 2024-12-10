
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Memuat file FXML untuk mendefinisikan tampilan aplikasi
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainApp.fxml"));
        BorderPane root = loader.load();

        // Membuat scene (tampilan utama) dan mengatur layout root ke dalamnya
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Task Manager");
        primaryStage.show();
    }

    public void changeScene(String fxml, Stage primaryStage) throws Exception {
        // Memuat file FXML baru
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
        BorderPane root = loader.load();

        // Membuat scene baru
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        // Mengatur judul jendela aplikasi
        primaryStage.setTitle("Task Manager");
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Meluncurkan aplikasi JavaFX
        launch(args);
    }
}
