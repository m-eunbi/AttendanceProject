package gui.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField txtID;
    @FXML
    private  PasswordField txtPassword;

    private static final String TEACHER_ID = "Teacher";
    private static final String TEACHER_PASS = "TeacherPassword";
    private static final String STUDENT_ID = "Student";
    private static final String STUDENT_PASS = "StudentPassword";

    public void handleLogin(ActionEvent actionEvent) {
        if (txtID.getText().equals(TEACHER_ID) && txtPassword.getText().equals(TEACHER_PASS)){
            System.out.println("Teacher login");
        }
        else if (txtID.getText().equals(STUDENT_ID) && txtPassword.getText().equals(STUDENT_PASS)){
            System.out.println("Student login");
        }
    }
}
