package CollectionsFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
} 

public class SerialiseAndDeserialiseOfTheObject {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(1, "Thiyagu", 24);
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(s1);
            fileOut.close();
            out.close();

            System.out.println("Object serialized successfully.");

            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Student s2 = (Student) in.readObject();
            fileIn.close();
            in.close();

            System.out.println("Object deserialized successfully.");
            System.out.println("ID : " + s2.id);
            System.out.println("Name : " + s2.name);
            System.out.println("Age : " + s2.age);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
