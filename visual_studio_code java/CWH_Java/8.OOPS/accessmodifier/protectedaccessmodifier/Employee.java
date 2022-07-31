package accessmodifier.protectedaccessmodifier;

public class Employee {
    protected int id;
    protected String name;

    // mutator
    protected void set(int x, String nam) {
        id = x;
        name = nam;
    }

    // accessor
    // default fields

    protected String getName() {
        return name;
    }

    protected int getId() {
        return id;
    }
}
