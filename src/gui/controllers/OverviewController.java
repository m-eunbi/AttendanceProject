package gui.controllers;

import bll.InfoGetter;
import dal.BE.Course;
import dal.BE.Student;
import gui.MainApp;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class OverviewController {
    public TilePane tilePane;
    public ComboBox comboBox;
    public BorderPane borderPane;

    private Course course;

    public void setCourseInfo(Course course){
        this.course = course;
        setStudents(course.studentsAlphabetical);
    }

    public void selectOrder(ActionEvent actionEvent) {
        if (comboBox.getValue().toString().equals("Alphabetical"))
            setStudents(course.studentsAlphabetical);
        else if (comboBox.getValue().toString().equals("Most absence"))
            setStudents(course.studentsAbsence);
    }

    public void setStudents(ArrayList<Student> students){
        tilePane.getChildren().clear();
        for (Student s : students){
            VBox vBox = new VBox();
            vBox.setSpacing(10);
            vBox.setStyle("-fx-background-color: white; -fx-border-color: black");
            ImageView pic = new ImageView(s.imagePath);
            pic.setFitHeight(150);
            pic.setFitWidth(150);
            Label name = new Label(s.name);
            name.setPadding(new Insets(0, 0, 5, 5));
            vBox.getChildren().addAll(pic, name);
            tilePane.getChildren().add(vBox);
        }
    }

    public void showCourses(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) tilePane.getScene().getWindow();
        primaryStage.setScene(new Scene(FXMLLoader.load(MainApp.class.getResource("views/TeacherStartView.fxml"))));
        primaryStage.centerOnScreen();
    }

    public void logout(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) tilePane.getScene().getWindow();
        primaryStage.setScene(new Scene(FXMLLoader.load(MainApp.class.getResource("views/LoginView.fxml"))));
        primaryStage.centerOnScreen();
    }
}
