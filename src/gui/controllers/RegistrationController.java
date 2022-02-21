package gui.controllers;

import gui.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationController {
    public BorderPane borderPane;

    public void nextScreen(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) borderPane.getScene().getWindow();
        primaryStage.setScene(new Scene(FXMLLoader.load(MainApp.class.getResource("views/StudentView.fxml"))));
        primaryStage.centerOnScreen();
    }
}
