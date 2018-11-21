package az.shafag.testapp.utility;

import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileServer {

    public static byte[] getFile(String fileName, String fileExtension) throws IOException {

        File file = null;

        file = new ClassPathResource(fileName.concat(".").concat(fileExtension)).getFile();
        return Files.readAllBytes(file.toPath());
    }

    public static byte[] getFile(String path){
        File file = new File(path);
        try {
            return Files.readAllBytes(file.toPath());
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}
