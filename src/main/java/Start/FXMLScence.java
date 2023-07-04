package Start;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public class FXMLScence {
    Parent root = null;
    Object controller = null;

    public static FXMLScence load(String fxmlpath) throws IOException {

        FXMLScence fxmlScence = new FXMLScence();

        FXMLLoader fxmlLoader = new FXMLLoader(); // creates a basic fxml object here
        fxmlLoader.setLocation(fxmlScence.getClass().getResource(fxmlpath)); // sets the fxml loader to new class

        fxmlScence.root =  fxmlLoader.load();
        fxmlScence.controller = fxmlLoader.getController(); // gets the controller class of new fxml scene

        return fxmlScence;

    }
}
