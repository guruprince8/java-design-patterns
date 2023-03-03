package org.example.utils.properties;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class PropertiesUtils {
    public static Map<String,String> loadPropertiesFile(String fileName) throws IOException {
        Map<String,String> propertiesMap= new HashMap<>(); String propertiesLine="";
        File propertiesFile = new File(fileName);
        if (propertiesFile.exists()){
            FileReader fileReader = new FileReader(propertiesFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((propertiesLine = bufferedReader.readLine()) != null) {
                if(propertiesLine.trim() != ""){
                    String [] propertiesLineArray = propertiesLine.split("=");
                    if ( propertiesLineArray.length == 2 ) {
                        propertiesMap.put(propertiesLineArray[0],propertiesLineArray[1]);
                    }
                }
            }
        } else {
            throw new FileNotFoundException(fileName+" is not found in the location");
        }
        return propertiesMap;
    }

    public static Map<String,String> loadPropertiesFile(File file) throws IOException {
        return loadPropertiesFile(file.getAbsolutePath());
    }
}
