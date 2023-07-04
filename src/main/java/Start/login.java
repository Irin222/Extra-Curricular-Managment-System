package Start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class login extends Application {
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent rootLayout = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
        Scene scene = new Scene(rootLayout, 356, 476);
        stage.setTitle("Extra-Curricular");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
