package StaticMembers;
public class StaticVariables {
    static int number;
    public static void main(String[] args) {
        System.out.println(StaticVariables.number);
    }
    static {
        System.out.println(StaticVariables.number);
    }
}
