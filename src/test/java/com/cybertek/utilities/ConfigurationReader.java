package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {
        // this the path to the location of the file
        String path = "configuration.properties";

        try {
            //reader for the file, java cannot read files directly, it needs inputstream to read files
            //inputstream takes the location of the file as a constructor
            FileInputStream fileInputStream = new FileInputStream(path);

            //Properties class is used to read specifically Properties files, files with key=value pairs
            properties = new Properties();

            //file contents are load to properties from the inputstream
            properties.load(fileInputStream);

            //all input streams must be closed
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //returns the value of specific property
    public static String getProperty(String property){
        return properties.getProperty(property);
    }
}
