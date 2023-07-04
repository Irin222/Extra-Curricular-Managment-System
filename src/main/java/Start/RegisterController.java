package Start;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterController {

    @FXML
    private Button complete;

    @FXML
    private PasswordField confpassword;

    @FXML
    private TextField email;

    @FXML
    private TextField firstname;

    @FXML
    private TextField lastname;

    @FXML
    private PasswordField password;

    @FXML
    void Completebutton(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();

        FXMLScence fxmlScence =FXMLScence.load("Homepage.fxml");

        Homepagecontroller homepagecontroller = (Start.Homepagecontroller) fxmlScence.controller;
        Parent root = fxmlScence.root;

        stage.setScene(new Scene(root, 356, 476));
    }

}
