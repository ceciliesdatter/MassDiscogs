import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling {

    public static void fileExists(File testFile) throws FileNotFoundException {
        if(!testFile.exists())
            throw new FileNotFoundException("File does not exist.");
    }

    public static void checkFileRead(File testFile) throws IOException {
        if (!testFile.canRead())
            throw new IOException("File cannot be read.");
    }
}
