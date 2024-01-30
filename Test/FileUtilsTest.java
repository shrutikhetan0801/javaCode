import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

public class FileUtilsTest {

    @Test
    public void readFile() throws FileNotFoundException {

        File file = new File("Test/resources/TestDoc.rtf");
        Map<String,Integer> result = FileUtils.readAndOperateFile(file);

        Assert.assertEquals(5l,(long)result.get("eget"));

    }

    @Test
    public void readFileTest2Files() throws FileNotFoundException {

        File file = new File("Test/resources/TestDoc.rtf");
        Map<String,Integer> result = FileUtils.readAndOperateFile(file);

        File file2 = new File("Test/resources/SameTextDiffOrder.rtf");
        Map<String,Integer> result2 = FileUtils.readAndOperateFile(file2);

        Assert.assertEquals(result.get("eget"),result2.get("eget"));
    }
}