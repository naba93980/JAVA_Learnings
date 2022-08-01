package inheritance.intro;

public class Main {
    public static void main(String[] args) {
        Derived obj = new Derived(12, 115);
        obj.get();    
        Derived obj2 = new Derived();   
        obj2.get();
    }
}
