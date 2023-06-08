package StaticMembers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("hello");
    }

    //  static blocks are executed before main method
    static {
        System.out.println("Static block 1");
    }
    static {
        System.out.println("Static block 2");
    }

}