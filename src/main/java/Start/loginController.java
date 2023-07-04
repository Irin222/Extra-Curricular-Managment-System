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

public class loginController {

    @FXML
    private PasswordField Password;

    @FXML
    private TextField Username;

    @FXML
    private Button forgetpass;

    @FXML
    private Button login;

    @FXML
    private Button register;

    @FXML
    void forgetbutton(ActionEvent event)
    {

    }

    @FXML
    void loginbutton(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();

        FXMLScence fxmlScence =FXMLScence.load("Homepage.fxml");

        Homepagecontroller homepagecontroller = (Start.Homepagecontroller) fxmlScence.controller;
        Parent root = fxmlScence.root;

        stage.setScene(new Scene(root, 776, 676));
    }

    @FXML
    void registerbutton(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();

        FXMLScence fxmlScence =FXMLScence.load("Register.fxml");

        RegisterController registerController = (Start.RegisterController) fxmlScence.controller;
        Parent root = fxmlScence.root;

        stage.setScene(new Scene(root, 356, 476));
    }

}
