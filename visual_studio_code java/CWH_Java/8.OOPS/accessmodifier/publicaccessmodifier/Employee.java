package accessmodifier.publicaccessmodifier;

public class Employee {

    // private fields
    private int id;
    private String name;

    // mutator
    public void set(int x, String nam) {
        id = x;
        name = nam;
    }                                             

    // accessor
    // default fields

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
};

