package Polymorphism;

public class OverloadingMain {
    public static void main(String[] args) {

        // overloading of main method doesnot work, as it always calls this main method
        System.out.println("default main method");
        main(233);  // call the overloaded main method here
    }

    public static void main(int arg) {
        System.out.println("overloaded main method called");
    }
}
