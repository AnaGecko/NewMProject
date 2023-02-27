package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties properties = new Properties();
    public ReadConfig()
    {
        File src = new File("./Configuration/config.properties");
        try{
            FileInputStream fis = new FileInputStream(src);
            properties.load(fis);
        } catch (Exception e){
            System.out.println("Exception is"+e.getMessage());
        }
    }

    public String getApplicationURL()
    {
        return properties.getProperty("baseURL");
    }


}
