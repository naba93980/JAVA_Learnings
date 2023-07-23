package IOStreams.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;

public class DerializationDemo {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream(new File("D:/Users/NABAJYOTI/JAVA/core_java_made_easy/Topics/IOStreams/serialization/demo.ser"))) {
            
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student obj = (Student) ois.readObject();
            obj.print();
            
            System.out.println(obj.name);
            System.out.println(obj.roll);
            System.out.println(obj.ssn);
            
            for (Method method:obj.getClass().getMethods()) {
                System.out.println(method);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
