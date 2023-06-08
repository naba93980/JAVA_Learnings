package NonStaticMembers;

public class NonStaticMember {
    int num=6;

    NonStaticMember(){
        System.out.println("Inside the constructor");
    }

    // non static block is executed before constructor is executed
    {
        System.out.println("Inside the non static block");
    }

    static {
        System.out.println("Inside the static block");
    }
    public static void main(String[] args) {
        System.out.println("Inside main fn");
        NonStaticMember x = new NonStaticMember();
        System.out.println(x.num);
    }
}
