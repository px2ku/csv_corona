/*package com.mkyong.io.csv.opencsv;
//Import now
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class OpenCsvExample {

    public static void main(String[] args) throws IOException, CsvException {

        String fileName = "C:\\Program Files (x86)\\CoronaCSV\\Nowcasting_Zahlen_csv.csv";

        List<String[]> r;
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            r = reader.readAll();
        }

        int listIndex = 0;
        for (String[] arrays : r) {
            System.out.println("\nString[" + listIndex++ + "] : " + Arrays.toString(arrays));

            int index = 0;
            for (String array : arrays) {
                System.out.println(index++ + " : " + array);
            }
        }
    }
}*/