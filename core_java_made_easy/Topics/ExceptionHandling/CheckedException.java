package ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("")) {
        } catch (IOException e1) {
            e1.printStackTrace();
            System.out.println("Bye Bye");
        }
    }
}

// check exception as exception is thrown at compile time