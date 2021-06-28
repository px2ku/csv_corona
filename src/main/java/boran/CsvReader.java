package boran;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    private File coronaCsv;

    public CsvReader(File coronaCsv) {
        this.coronaCsv = coronaCsv;

    }

    public List<DataPoint> readDataPoints() {
        //2-480
        List<DataPoint> dataPoints = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Path.of(coronaCsv.getPath()));

            for (String line : lines) {

                DataPoint filteredLine = DataPoint.readLine(line);

                if (filteredLine != null) {
                    dataPoints.add(filteredLine);
//                    System.out.println(filteredLine);
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        return dataPoints;
    }
}

//            for (int rowIndex = 1; rowIndex < 480; rowIndex += 1) {
//                String currentLine = lines.get(rowIndex);
//
//                DataPoint.readLine(currentLine);
//
//
//                DataPoint filteredLine = DataPoint.readLine(currentLine);
//                System.out.println(filteredLine);
//
//
//            } //Welche Zeile zu starten