package gui.controllers;

import gui.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField txtID;
    @FXML
    private  PasswordField txtPassword;

    private static final String TEACHER_ID = "Teacher";
    private static final String TEACHER_PASS = "TeacherPassword";
    private static final String STUDENT_ID = "Student";
    private static final String STUDENT_PASS = "StudentPassword";

    public void handleLogin(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) txtID.getScene().getWindow();

        // TODO: when done - change logins
        if (txtID.getText().equals(TEACHER_ID) && txtPassword.getText().equals(TEACHER_PASS)){
            primaryStage.setScene(new Scene(FXMLLoader.load(MainApp.class.getResource("views/TeacherStartView.fxml"))));
        }
        else if (txtID.getText().equals(STUDENT_ID) && txtPassword.getText().equals(STUDENT_PASS)){
            primaryStage.setScene(new Scene(FXMLLoader.load(MainApp.class.getResource("views/RegistrationView.fxml"))));
        }
        primaryStage.centerOnScreen();
    }

}
