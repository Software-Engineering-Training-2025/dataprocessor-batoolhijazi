package output;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileOutput implements  OutputStrategy{
    public void output(double result) throws IOException {

        File file = new File("target/result.txt");


        file.getParentFile().mkdirs();

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Result = " + result);
        }
    }
}
