import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Station11 {

    public static void q1(Path inputFile, Path outputFile) {
        // ここから
        try{
            // file read
            String str = Files.readString(inputFile);
            // String to int
            int num = Integer.parseInt(str);
            // int * 2
            num *= 2;
            // int to String
            str = String.valueOf(num);
            // file write
            Files.writeString(outputFile, str);
        }catch(IOException e){
            System.out.println("IOException: " + e.getMessage());
        }
        // ここまで
    }
}
