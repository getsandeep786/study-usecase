package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class SetExample {
    
    public static void main(String[] args) throws FileNotFoundException {

        //HashSet<String> names = new HashSet<>();
        TreeSet<String> names = new TreeSet<>();
        //LinkedHashSet<String> names = new LinkedHashSet<>();
//        tNames.add("Good");
//        tNames.add("For");
//        File file = new File("");
//        file.getAbsolutePath();
//        FileInputStream stream = new FileInputStream(file);

        try {
            names.add("Sandu");
            names.add("Meenu");
            names.add(null);
            names.add(null);
            names.add("Vandu");
            names.add("Chicku");
            names.add("nandu");
            names.add(null);
            names.add("chimbu");
            names.forEach(x -> System.out.println(x));

        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            System.out.println("Finally executed");
        }

    }
}