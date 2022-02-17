package gui.controllers;

import bll.InfoGetter;
import dal.BE.Lesson;
import gui.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class TeacherController {

    public ComboBox comboBox;
    private InfoGetter infoGetter;
    public VBox vBox;
    public Label lblDate;
    public Label lblCourse;
    public Button btnLogout;
    public VBox lessonsVbox;

    public TeacherController () {
        infoGetter = new InfoGetter();
    }

    public void logout(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) btnLogout.getScene().getWindow();
        primaryStage.setScene(new Scene(FXMLLoader.load(MainApp.class.getResource("views/LoginView.fxml"))));
        primaryStage.centerOnScreen();
    }

    public void fillLessons() {
        lessonsVbox.getChildren().clear();
        ArrayList<Lesson> lessons = infoGetter.courseLessons((String) comboBox.getValue());
        for (Lesson l : lessons) {
            HBox hBox = new HBox();
            Label date = new Label(l.date);
            date.setMinWidth(150);
            Label time = new Label(l.time);
            time.setMinWidth(150);
            Label attendance = new Label(l.presenceOverview);
            attendance.setMinWidth(30);
            hBox.getChildren().addAll(date, time, attendance);
            lessonsVbox.getChildren().add(hBox);

        }

    }
}
