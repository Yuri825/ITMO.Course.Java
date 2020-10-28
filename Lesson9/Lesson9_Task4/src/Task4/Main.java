// Написать метод для копирования файла (побайтно, или массивами байт).

package Task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        Files.copy(Paths.get("file1.txt"), Paths.get("file4.txt"));
    }


}
