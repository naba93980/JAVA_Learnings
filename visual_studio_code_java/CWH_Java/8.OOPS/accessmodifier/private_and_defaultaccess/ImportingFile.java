package accessmodifier.private_and_defaultaccess;

public class ImportingFile {
    public static void main(String[] args) {
        Employee empOne = new Employee();
        empOne.set(12, "jhontu");
        System.out.println(empOne.getId());
        System.out.println(empOne.getName());
        // getName and getId default fields of Employee class are automatically
        // imported.
    }
}
