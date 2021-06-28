package boran;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main extends Application {
    public static final String csvURL = "https://www.rki.de/DE/Content/InfAZ/N/Neuartiges_Coronavirus/Projekte_RKI/Nowcasting_Zahlen_csv.csv?__blob=publicationFile";

    public static void main(String[] args) {

        launch();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Nochmal nachdenken

        FileDownloader downloader = new FileDownloader();

        try {
            File csv = downloader.downloadFile(csvURL, "corona.csv");
            CsvReader reader = new CsvReader(csv);

            List<DataPoint> all_data_in_datapoints = reader.readDataPoints();;

            Graph graph = new Graph();
            Scene scene = new Scene(graph.createGraph(all_data_in_datapoints), 640, 480);
            primaryStage.setScene(scene);
            primaryStage.show();

            //lines.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

    }
}