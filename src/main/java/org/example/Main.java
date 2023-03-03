package org.example;

import org.example.singleton.Singleton;
import org.example.singleton.SingletonMap;
import org.example.utils.properties.PropertiesUtils;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!"+ Singleton.INSTANCE);
        System.out.println("Hello world!"+ Singleton.INSTANCE);
        System.out.println(SingletonMap.singletonMap);
        // properties utils
        PropertiesUtils propertiesUtils = new PropertiesUtils();
        System.out.println(propertiesUtils.loadPropertiesFile("application.properties"));
    }
}