import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

public class TournamentWithGUI extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GUI.fxml"));
        Parent root = loader.load();
        stage.setTitle("Can You Help a Guy?");
        stage.setScene(new Scene(root));
        stage.show();

        stage.setOnCloseRequest(event -> {
            System.out.println("Window is closing");
        });
    }
}