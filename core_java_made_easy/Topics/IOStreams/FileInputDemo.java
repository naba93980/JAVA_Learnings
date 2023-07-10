package IOStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {
    public static void main(String[] args) {

        FileInputStream fis=null;
        try {
            fis = new FileInputStream(new File("D:/Users/NABAJYOTI/JAVA/core_java_made_easy/Topics/IOStreams/myfile.txt"));
            System.out.println("File opened");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                System.out.println("\nFile closed");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
