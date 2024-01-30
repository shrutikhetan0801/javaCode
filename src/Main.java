//import utils.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.logging.Logger;

public class Main {

    static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws FileNotFoundException {
        //checking if filepath is provided or not
      if( args.length == 1 ) {
         File file = new File(args[0]);
         //to read a file
         Map<String,Integer> eachWordCounts = FileUtils.readAndOperateFile(file);
         FileUtils.printResult(eachWordCounts);
      } else {
          logger.info("Invalid Entry please provide the file path");
      }
    }
}