// reading property file and set up program

package com.dragonsong.help;

import javax.xml.bind.PropertyException;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class PropertyReader {
    private static File[] propertyFiles;
    private static Map<String, String> propertyDict = new HashMap<>();
    public PropertyReader() throws IOException, PropertyException {
        propertyFiles = new File("./src").listFiles(new FilenameFilter() {
            private Pattern pName = Pattern.compile("dragonsong.properties");
            @Override
            public boolean accept(File dir, String name) {
                return pName.matcher(name).matches();
            }
        });

        if(propertyFiles.length == 0)
            throw new FileNotFoundException("No property file found: dragonsong.properties");

        BufferedReader bf = new BufferedReader(new FileReader(propertyFiles[0]));
        String s;
        while((s = bf.readLine()) != null) {
            String propPair[] = s.split("=");
            if(propPair.length > 2) throw new PropertyException("Wrong property format");
            System.out.println(propPair[0] + " " + propPair[1]);
            propertyDict.put(propPair[0], propPair[1]);
        }
    }

    public static Map<String, String> getPropertyDict() {
        return propertyDict;
    }
}
