package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class Throws {

    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("");
        System.out.println(fis);
    }

    public static void main(String[] args) /* throws FileNotFoundException (if enabled no need of try catch jvm default handler will handle the error) */ {
        Throws th = new Throws();
        try {
            th.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
