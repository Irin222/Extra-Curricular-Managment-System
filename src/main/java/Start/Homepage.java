package Start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Homepage extends Application {
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent rootLayout = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Homepage.fxml")));
        Scene scene = new Scene(rootLayout, 776, 676);
        stage.setTitle("Homepage");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(true);

    }

    public static void main(String[] args) {
        launch(args);
    }
    // testing
}
