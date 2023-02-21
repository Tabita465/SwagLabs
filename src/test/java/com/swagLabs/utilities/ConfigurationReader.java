package com.swagLabs.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("configurations.properties");

            properties.load(file);

            file.close();
        } catch (IOException e) {
            System.out.println("Error ocurr while reading configuration file");
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);


    }
}
