package Start;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;

import java.io.IOException;

public class Homepagecontroller {

    @FXML
    private MenuButton activity;

    @FXML
    private MenuButton evalution;

    @FXML
    private Button logout;

    @FXML
    private MenuButton management;

    @FXML
    private MenuButton payment;

    @FXML
    void activitybutton(ActionEvent event) {

    }

    @FXML
    void evalutionbutton(ActionEvent event) {

    }

    @FXML
    void logoutbutton(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();

        FXMLScence fxmlScence =FXMLScence.load("login.fxml");

        loginController loginController = (Start.loginController) fxmlScence.controller;
        Parent root = fxmlScence.root;

        stage.setScene(new Scene(root, 356, 476));
    }

    @FXML
    void managebutton(ActionEvent event) {

    }

    @FXML
    void paymentbutton(ActionEvent event) {

    }

}
