package gui.controllers;

import gui.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class TeacherController {

    public VBox vBox;
    public Label lblDate;
    public Label lblCourse;
    public Button btnLogout;

    public void logout(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) btnLogout.getScene().getWindow();
        primaryStage.setScene(new Scene(FXMLLoader.load(MainApp.class.getResource("views/LoginView.fxml"))));
        primaryStage.centerOnScreen();
    }
}
