package utility;


package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;

    // Load the config file
    public static void loadConfig() {

        prop = new Properties();

        try {

            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");

            prop.load(fis);

        } catch (IOException e) {

            System.out.println("Config file not found");
            e.printStackTrace();

        }
    }

    // Get value from config file
    public static String getProperty(String key) {

        return prop.getProperty(key);

    }

}