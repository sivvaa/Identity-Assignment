package com.identity.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * Utility class with methods to read and return configuration values
 */
public class ConfigUtils {

    public static final String CONFIGURED_DIRECTORY = "directory";
    public static final String SUPPORTED_MIME_TYPES = "supported_mime_types";

    public static Properties properties = new Properties();


    /**
     * Return configuration defined in config.properties.
     * @return
     */
    public static Properties getConfiguration() {
        if(properties.isEmpty()) {
            try {
                properties.load(new FileInputStream(new File(System.getProperty("user.dir")).getParent() + "/config.properties"));
            } catch(FileNotFoundException fe) {
                System.out.println("Config file is not available -" +fe.getMessage());
            } catch(Exception e) {
                System.out.println("Config file is not available -" +e.getMessage());
            }
        }
        return properties;
    }

    /**
     * Method to return the directory configured in config.properties
     * @return
     */
    public static String getConfiguredDirectory() {
        return getConfiguration().getProperty(CONFIGURED_DIRECTORY);
    }

    /**
     * Method to return the configured MIME types in config.properties.
     * @return
     */
    public static String getConfiguredMimeTypes() {
        return getConfiguration().getProperty(SUPPORTED_MIME_TYPES);
    }
}
