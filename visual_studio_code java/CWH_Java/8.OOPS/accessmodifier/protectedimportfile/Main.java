package accessmodifier.protectedimportfile;

import accessmodifier.protectedaccessmodifier.*;

public class Main extends Employee {
    
    void access(int x, String name) {
        set(x, name);
        System.out.println(getId());
        System.out.println(getName());
    }
    public static void main(String[] args) {
        Main obj = new Main();
       obj.access(14, "peacock");
        
    }
}

/*
 * we have successfully accessed the protected members directly as these are
 * inherited by the Child class and can be accessed without using any reference.
 * The protected members are inherited by the child classes and can access them
 * as its own members. But we can’t access these members using the reference of
 * the parent class. We can access protected members only by using child class
 * reference.
 * 
 */