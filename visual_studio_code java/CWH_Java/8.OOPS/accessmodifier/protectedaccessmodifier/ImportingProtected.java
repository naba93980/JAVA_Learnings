package accessmodifier.protectedaccessmodifier;

public class ImportingProtected {
    public static void main(String[] args) {
        Employee empOne = new Employee();
        empOne.set(87, "daredevils");
        System.out.println(empOne.getId());
        System.out.println(empOne.getName());
    }
}
