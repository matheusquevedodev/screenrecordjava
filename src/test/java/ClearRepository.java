import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ClearRepository {

    public void deleteFile() {
        try {
            Path pathOffile = Paths.get("./test-recordings/" + ScreenRecorderUtil.getName());
            boolean result = Files.deleteIfExists(pathOffile);

            if (result) {
                System.out.println("File is deleted");
            } else {
                System.out.println("File does not exist");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
