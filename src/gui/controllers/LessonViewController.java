package gui.controllers;

import dal.BE.Lesson;
import dal.BE.Student;
import gui.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class LessonViewController {

    public VBox vBox;
    public Label lblDate;
    public Label lblCourse;

    public void setLessonInfo(Lesson l){
        showAttendanceInfo(l);
        lblDate.setText(l.date);
        lblCourse.setText(l.course);
    }
    private void showAttendanceInfo(Lesson l) {
        for (Student s : l.allStudents){
            HBox hBox = new HBox();
            hBox.setPadding(new Insets(0, 10, 0, 0));
            hBox.setSpacing(10);
            hBox.setStyle("-fx-border-color: black; -fx-background-color: white; -fx-alignment: CENTER");
            ImageView pic = new ImageView(s.imagePath);
            pic.setFitWidth(70);
            pic.setFitHeight(70);
            Label name = new Label(s.name);
            name.setPrefWidth(500);
            CheckBox checkBox = new CheckBox();
            if (l.presentStudents.contains(s))
                checkBox.setSelected(true);
            hBox.getChildren().addAll(pic, name, checkBox);
            vBox.getChildren().add(hBox);
        }
    }

    public void showCourses(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) vBox.getScene().getWindow();
        primaryStage.setScene(new Scene(FXMLLoader.load(MainApp.class.getResource("views/TeacherStartView.fxml"))));
        primaryStage.centerOnScreen();
    }

    public void logout(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) vBox.getScene().getWindow();
        primaryStage.setScene(new Scene(FXMLLoader.load(MainApp.class.getResource("views/LoginView.fxml"))));
        primaryStage.centerOnScreen();
    }
}
