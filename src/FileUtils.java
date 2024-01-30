import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileUtils {


    public static Map<String,Integer> readAndOperateFile(File file) throws FileNotFoundException {
        Scanner scanFile = new Scanner(file).useDelimiter("[^a-zA-Z0-9]");
        int lineNumber = 1;
        HashMap<String,Integer> checkCount = new HashMap<>();
        while(scanFile.hasNext()){
            String line = scanFile.next();
            checkCount.put(line.toLowerCase(),checkCount.getOrDefault(line.toLowerCase(),0) + 1) ;
        }
        return checkCount;
    }

    public static void printResult(Map<String,Integer> eachWordCount) {
        for(Map.Entry<String,Integer> keyValueSet : eachWordCount.entrySet()) {
            System.out.println(keyValueSet.getKey() +": " + keyValueSet.getValue());
        }
    }
}
