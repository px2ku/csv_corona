package boran;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class Graph {


    public LineChart createGraph(List<DataPoint> allDatapoints) {
        /*
        ObservableList<String> dates = FXCollections.
                observableArrayList(allDatapoints
                        .stream()
                        .map(DataPoint::date)
                        .collect(Collectors
                                .toList()));
        */


        ObservableList<String> dates = FXCollections.observableArrayList();

        ObservableList<XYChart.Data> krankeLeuteZahl = FXCollections.observableArrayList();

        int index = 0;

        for (var datapoint : allDatapoints) {

            if (index % 10 == 0) dates.add(datapoint.date());

            krankeLeuteZahl.add(new XYChart.Data(datapoint.date(), datapoint.krankeLeute()));
            index++;
        }

        CategoryAxis xAxis = new CategoryAxis(dates);

        xAxis.setLabel("Datum");
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("UG_PI_Neuerkrankungen");
        LineChart linechart = new LineChart(xAxis, yAxis);

        XYChart.Series series = new XYChart.Series();
        series.setName("Corona Zahlen");



/*
            allDatapoints
                .stream()
                .map(dataPoint -> (new XYChart.Data(dataPoint.date(), dataPoint.krankeLeute())))
                .collect(Collectors.toList())
*/

        series.getData().addAll(krankeLeuteZahl);
        linechart.getData().add(series);

        return linechart;

    }

}
