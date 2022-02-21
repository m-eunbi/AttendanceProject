package gui.controllers;

import dal.BE.Course;
import dal.BE.Student;
import gui.MainApp;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.*;
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
    public VBox infoVBox;

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
            vBox.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    infoVBox.getChildren().clear();
                    Label infoName = new Label(s.name);
                    Label id = new Label(s.iD);
                    Label email = new Label(s.email);
                    Label absence = new Label("Total absence: " + s.absencePercent + "%");
                    BarChart<String, Number> chart = drawChart(s.absencePerDay);
                    infoVBox.getChildren().addAll(infoName, id, email, absence, chart);
                    infoVBox.setStyle("-fx-background-color: white; -fx-border-color: black");
                }
            });
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

    public BarChart<String, Number> drawChart(int[] info){
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart<String, Number> chart = new BarChart<>(xAxis, yAxis);
        yAxis.setLabel("Absence %");
        XYChart.Series<String, Number> series = new XYChart.Series();
        series.getData().add(new XYChart.Data<>("Monday", info[0]));
        series.getData().add(new XYChart.Data<>("Tuesday", info[1]));
        series.getData().add(new XYChart.Data<>("Wednesday", info[2]));
        series.getData().add(new XYChart.Data<>("Thursday", info[3]));
        series.getData().add(new XYChart.Data<>("Friday", info[4]));
        chart.getData().add(series);
        chart.setLegendVisible(false);
        return chart;
    }
}
