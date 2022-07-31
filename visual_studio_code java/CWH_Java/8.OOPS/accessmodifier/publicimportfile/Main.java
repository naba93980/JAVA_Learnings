package accessmodifier.publicimportfile;

import accessmodifier.publicaccessmodifier.Employee;

public class Main {
    public static void main(String[] args) {
        Employee empOne = new Employee();
        empOne.set(32, "nabajyoti modak");
        System.out.println(empOne.getId());
        System.out.println(empOne.getName());
    }
}
