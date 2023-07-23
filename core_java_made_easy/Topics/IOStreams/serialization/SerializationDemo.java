package IOStreams.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static void main(String[] args) {

        Student obj = new Student(101, "Nabajyoti", 2282212);

        try (FileOutputStream fos = new FileOutputStream(new File("D:/Users/NABAJYOTI/JAVA/core_java_made_easy/Topics/IOStreams/serialization/demo.ser"))) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
