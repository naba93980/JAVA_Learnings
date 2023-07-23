package IOStreams;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student id,name,score");
        int id = scanner.nextInt();
        // int is consumed by nextInt(), buffer left with \n which is not a token, so hasNext() below waits() for next token input
        System.out.println(scanner.hasNext());  //  This method may block while waiting for input to scan.
        String name = scanner.next();
        double score = scanner.nextDouble();
        scanner.close();

        System.out.println("Student Details");
        System.out.println("Id " + id);
        System.out.println("name " + name);
        System.out.println("score " + score);

    }
}
