package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    public static Properties prop;

    public static void loadConfig() {

        try {

            prop = new Properties();

            FileInputStream fis =
                    new FileInputStream("C:\\Users\\rahul sahu\\git\\repository7\\CleartripAutomation\\src\\test\\resources\\config.properties");

            prop.load(fis);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {

        return prop.getProperty(key);

    }

}