package boran;

import java.io.*;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.opencsv.stream.reader.LineReader;
import jdk.internal.access.JavaIOFileDescriptorAccess.*;

public class
DownloadCSV {
    private static BufferedReader Reader;


    // TODO: Der ink zur zum download der CSV date ist Hier:
    // https://www.rki.de/DE/Content/InfAZ/N/Neuartiges_Coronavirus/Projekte_RKI/Nowcasting_Zahlen_csv.csv?__blob=publicationFile

    public static void main(String[] args) {

        String file = "C:\\Program Files (x86)\\CoronaCSV\\Nowcasting_Zahlen_csv.csv"; //Speicherort der CSV
        BufferedReader reader = null;
        String line = "";

        try {
            Reader = new BufferedReader(new FileReader(file));
            //Regulars

            while((line = Reader.readLine()) != null) {
                String[] row = line.split(";");
                String LineReader;

                //TODO: Muss nochmal nach sehen wie diese CSV seperiert wird.
                for (String index : row) {
                    /*System.out.printf("%-10s ", index);
                    System.out.printf("%-10s ", index);
                    System.out.printf("%-10s ", index);
                    System.out.printf("%-10s ", index);
                    System.out.printf("%-10s ", index);
                    System.out.printf("%-10s ", index);
                    System.out.printf("%-10s \n \f", index);
                    */

                    if (index % 10 == 9) {
                        System.out.printf("\n");
                    }


                }
            }

            //TODO: Hier die Letzt versuchte Lösung. Für Morgen. https://stackoverflow.com/questions/10654120/error-could-not-find-or-load-main-class-in-intellij-ide
            System.out.println();
            //System.out.println(data + "***");
            //TODO: Nochmal nachscheuen warum das notwending ist
        } catch (Exception e) {
            e.printStackTrace();
            // Just in case not necessary
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}