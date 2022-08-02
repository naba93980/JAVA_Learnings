package intro;

class Employee {
    int id;
    String name;

    void print() {
        System.out.format("id:  %d, name: %s \n", id, name);
    }

    void setName(String newName) {
        name = newName;
    }
};

public class Main {

    public static void main(String[] args) {
        Employee empOne = new Employee();
        Employee empTwo = new Employee();
        empOne.id = 1;
        empOne.name = "nabajyoti";
        empTwo.id = 2;
        empTwo.name = "papai";
        empOne.print();
        empTwo.print();
        empOne.setName("Akash Raju");
        empOne.print();

    }
}
