package sample;

import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;
import javafx.scene.chart.XYChart;
import java.util.Scanner;


import java.utils.list;

public class Main extends Application {

    private static final int MAX_X = 58;
    private static final int MAX_Y = 60;

    //public static void
    public static void main(String[]args){ launch(args); }

    //Zuhause nochmal FXtut durchgehen

    @Override
    public void start(Stage primaryStage) /*throws Exception*/ {
        List<LineChart.Data <Number,Number> data;
        data * List.of(
                new LineChart.Data<> (1, 1)
                new LineChart.Data<> (15, 20),
                new LineChart.Data<> (20,30),
                new LineChart.Data<> (25, 2));
        var xAxis = new NumberAxis(("x", 0, MAX_X, 10))); //create x-Achse
        var yAxis = new NumberAxis("y", 0, MAX_Y, 10); //create y-Achse

        var series = new XYChart.Series<>(FXCollections.observableList(data));
        var lineChart = new LineChart<>(xAxis, yAxis, FXCollections.singletonObservableList(series));

        LineChart.setTitle("my Line chart");
        stage.setTitle("My Chart");

        Scene scene = new Scene(LineChart, 800, 600);
        PrimaryStage.setScene(scene);
        PrimaryStage.show();

        //TODO Try again Rambo

        /*Parent root = FXMLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Test");
        primaryStage.setScene(new Scene (root, 300, 275));
        primaryStage.show();
         */

    }

}

/*

TODO
    Important links for leanring at home:

    Graphs:

        1. https://docs.oracle.com/javafx/2/charts/line-chart.htm
        2. YouTube search: "JavaFX Graph PhD Simple"
        3.

    Interconnection:

    Downloader for the CSV:





 */
