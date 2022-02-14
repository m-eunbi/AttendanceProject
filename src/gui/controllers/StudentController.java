package gui.controllers;

import gui.MainApp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentController implements Initializable {
    public PieChart pieChart;

    public StudentController(){

    }

    public void drawPieChart(){
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Absent", 3),
                new PieChart.Data("Present", 47));
        pieChart.setData(pieChartData);
        pieChart.setLabelsVisible(false);
        pieChart.setStartAngle(90);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        drawPieChart();
    }

    public void logout(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) pieChart.getScene().getWindow();
        primaryStage.setScene(new Scene(FXMLLoader.load(MainApp.class.getResource("views/LoginView.fxml"))));
        primaryStage.centerOnScreen();
    }
}
