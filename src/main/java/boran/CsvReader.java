package boran;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CsvReader {
    private File coronaCsv;

    public CsvReader(File coronaCsv) {
        this.coronaCsv = coronaCsv;

    }

    public List<DataPoint> readDataPoints() {
        //2-480
        try {
            List<String> lines = Files.readAllLines(Path.of(coronaCsv.getPath()));
            for (int rowIndex = 0; rowIndex < 480; rowIndex += 1) {
                String currentLine = lines.get(rowIndex);
                System.out.println(currentLine);

            } //Welche Zeile zu starten


        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }


    }
}