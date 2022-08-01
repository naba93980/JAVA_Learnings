package constructor;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.format("id : %d, name : %s", this.id, this.name);
    }

    Employee() {
        System.out.println("put some value while initialising");
    }
}

public class Main {
    public static void main(String[] args) {
        new Employee();
        new Employee(56, "nabajyoti");
    }
}
