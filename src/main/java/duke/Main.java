package duke;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * A GUI for Duke using FXML.
 */
public class Main extends Application {

    private Duke duke = new Duke();
    private Image iconImage = new Image(this.getClass().getResourceAsStream("/images/butlerPooh.png"));

    public Main() {
    }

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setScene(scene);
            initialiseTitleBar(stage);
            fxmlLoader.<MainWindow>getController().setDuke(duke);
            sendWelcomeMessage(fxmlLoader);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initialiseTitleBar(Stage stage) {
        stage.getIcons().add(iconImage);
        stage.setTitle("Butler Pooh");
    }

    private void sendWelcomeMessage(FXMLLoader fxmlLoader) {
        fxmlLoader.<MainWindow>getController().sendFromDuke(duke.getWelcomeMessage());
        fxmlLoader.<MainWindow>getController().sendFromDuke(Response.inputRequestMessage());
    }

}