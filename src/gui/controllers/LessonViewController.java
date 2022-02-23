package gui.controllers;

import dal.BE.Lesson;
import dal.BE.Student;
import gui.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

    @FXML
    private VBox vBox;
    @FXML
    private Label lblDate;
    @FXML
    private Label lblCourse;

    public void setLessonInfo(Lesson l){
        showAttendanceInfo(l);
        lblDate.setText(l.getDate());
        lblCourse.setText(l.getCourse());
    }
    private void showAttendanceInfo(Lesson l) {
        for (Student s : l.getAllStudents()){
            HBox hBox = new HBox();
            hBox.setPadding(new Insets(0, 10, 0, 0));
            hBox.setSpacing(10);
            hBox.setStyle("-fx-border-color: black; -fx-background-color: white; -fx-alignment: CENTER");
            ImageView pic = new ImageView(s.getImagePath());
            pic.setFitWidth(70);
            pic.setFitHeight(70);
            Label name = new Label(s.getName());
            name.setPrefWidth(500);
            CheckBox checkBox = new CheckBox();
            if (l.getPresentStudents().contains(s))
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
