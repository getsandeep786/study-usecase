package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

    public static void main(String ar[]) {
        SerializeEmployee emp = new SerializeEmployee("Pankaj");
        emp.setAge(35);
        emp.setGender("Male");
        emp.setRole("CEO");
        System.out.println(emp);
        serialize(emp);
        SerializeEmployee eq = (SerializeEmployee) deserialize("EmployeeObject.ser");
        System.out.println(eq);
    }

    public static Object deserialize(String fileName) {
        Object obj = null;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = ois.readObject();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return obj;
    }

    // serialize the given object and save it to file
    public static void serialize(Object obj) {
        try {
            FileOutputStream fos = new FileOutputStream("EmployeeObject.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // write object to file
            oos.writeObject(obj);
            System.out.println("Done");
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
