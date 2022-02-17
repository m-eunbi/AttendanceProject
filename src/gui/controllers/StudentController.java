package gui.controllers;

import bll.InfoGetter;
import dal.BE.Lesson;
import dal.BE.Student;
import gui.MainApp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class StudentController implements Initializable {
    public PieChart pieChart;
    public VBox lessonVBox;
    public VBox infoVBox;

    private InfoGetter infoGetter;

    private ArrayList<Lesson> lessons;

    public StudentController(){
        infoGetter = new InfoGetter();
        lessons = infoGetter.studentLessons();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        drawPieChart();
        fillLessons();
        setStudentInfo();
    }

    public void logout(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) pieChart.getScene().getWindow();
        primaryStage.setScene(new Scene(FXMLLoader.load(MainApp.class.getResource("views/LoginView.fxml"))));
        primaryStage.centerOnScreen();
    }

    private void setStudentInfo(){
        Student student = infoGetter.studentViewInfo();
        ImageView image = new ImageView(student.imagePath);
        image.setFitHeight(50);
        image.setFitWidth(50);
        Label name = new Label(student.name);
        Label iD = new Label("ID: " + student.iD);
        infoVBox.getChildren().addAll(image, name, iD);
    }

    private void drawPieChart(){
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Absent", 3),
                new PieChart.Data("Present", 47));
        pieChart.setData(pieChartData);
        pieChart.setLabelsVisible(false);
        pieChart.setStartAngle(90);
    }

    private void fillLessons(){
        for (Lesson l : lessons) {
            String present = "";
            if (l.present)
                present = "✅";
            else
                present = "❌";
            HBox innerHBox = new HBox();
            innerHBox.setStyle("-fx-border-color: black; -fx-alignment: CENTER; -fx-background-color: white");
            innerHBox.setPadding(new Insets(0, 10, 0,10));
            HBox outerHBox = new HBox();
            Label date = new Label(l.date);
            date.setMinWidth(150);
            Label lesson = new Label(l.course);
            lesson.setMinWidth(100);
            Label presence = new Label(present);
            presence.setMinWidth(10);
            Button btn = new Button("Edit");
            btn.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    if(l.present){
                        presence.setText("❌");
                        l.present = false;
                    }
                    else{
                        presence.setText("✅");
                        l.present = true;
                    }
                }
            });
            innerHBox.getChildren().addAll(date, lesson, presence);
            outerHBox.getChildren().addAll(innerHBox, btn);
            lessonVBox.getChildren().add(outerHBox);
        }
    }


}
