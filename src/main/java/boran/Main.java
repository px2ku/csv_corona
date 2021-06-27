package boran;


import org.apache.commons.lang3.ObjectUtils;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static final String csvURL = "https://www.rki.de/DE/Content/InfAZ/N/Neuartiges_Coronavirus/Projekte_RKI/Nowcasting_Zahlen_csv.csv?__blob=publicationFile";

    public static void main(String[] args) throws IOException {

        System.out.println("test");

        FileDownloader downloader = new FileDownloader();




        File csv = null;


        try {
            csv = downloader.downloadFile(csvURL, "corona.csv");
            CsvReader reader = new CsvReader(csv);
            reader.readDataPoints();

            //lines.forEach(System.out::println);



        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }


        //        https://www.rki.de/DE/Content/InfAZ/N/Neuartiges_Coronavirus/Projekte_RKI/Nowcasting_Zahlen_csv.csv?__blob=publicationFile
    }

}