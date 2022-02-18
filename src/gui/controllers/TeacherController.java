package gui.controllers;

import bll.InfoGetter;
import dal.BE.Lesson;
import dal.BE.Student;
import gui.MainApp;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TeacherController {
    public ComboBox comboBox;
    public Label lblDate;
    public Label lblCourse;
    public Button btnLogout;
    public VBox lessonsVbox;

    private InfoGetter infoGetter;

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
        lessonsVbox.setStyle("-fx-border-color: transparent");
        ArrayList<Lesson> lessons = infoGetter.courseLessons((String) comboBox.getValue());
        for (Lesson l : lessons) {
            HBox hBox = new HBox();
            hBox.setMinHeight(30);
            hBox.setPadding(new Insets(0, 10, 0,10));
            hBox.setStyle("-fx-border-color: black; -fx-background-color: white; -fx-alignment: CENTER;");
            hBox.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    Stage primaryStage = (Stage) btnLogout.getScene().getWindow();
                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader();
                        fxmlLoader.setLocation(MainApp.class.getResource("views/LessonView.fxml"));
                        Scene scene = new Scene(fxmlLoader.load());
                        LessonViewController lvController = fxmlLoader.getController();
                        lvController.setLessonInfo(l);
                        primaryStage.setScene(scene);
                        primaryStage.centerOnScreen();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
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
