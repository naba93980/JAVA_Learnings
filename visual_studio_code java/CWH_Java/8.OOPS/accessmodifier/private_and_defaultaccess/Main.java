package accessmodifier.private_and_defaultaccess;

//default class Employee
class Employee {

    // private fields
    private int id;
    private String name;

    // mutator
    void set(int x, String nam) {
        id = x;
        name = nam;
    }

    // accessor
    // default fields

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }
};

public class Main {
    public static void main(String[] args) {
        Employee empOne = new Employee();
        empOne.set(19, "nabajyoti");
        System.out.println(empOne.getId());
        System.out.println(empOne.getName());

    }
}
