import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp
{
    static Properties prop;
    static FileInputStream input;
    static String fileName = "TestDataConfig.properties";
    static String fileLocation = "C:\\Users\\Kavis 101\\IdeaProjects\\DemoclassMaven";

    public String getProperty(String key)
    {
        prop = new Properties();
        try
        {
            input = new FileInputStream("C:\\Users\\Kavis 101\\IdeaProjects\\DemoclassMaven\\src\\main\\Resources")
        ;
            prop.load(input);
            input.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}


