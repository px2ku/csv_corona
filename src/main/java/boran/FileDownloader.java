package boran;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileDownloader {
    public FileDownloader() {
    }

    public File downloadFile(String csvCorona, String destinationPath) throws IOException {
        InputStream in = new URL(csvCorona).openStream();
        Files.copy(in, Paths.get(destinationPath), StandardCopyOption.REPLACE_EXISTING);
        return new File (destinationPath);
    }
}
