package IOStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutputDemo {
    public static void main(String[] args) {

        FileInputStream fis=null;
        FileOutputStream fos=null;

        try {
            fis = new FileInputStream(new File("D:/Users/NABAJYOTI/JAVA/core_java_made_easy/Topics/IOStreams/download-sky.jpg"));
            fos=new FileOutputStream("D:/Users/NABAJYOTi/JAVA/core_java_made_easy/Topics/IOStreams/copied-sky.jpg");
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
