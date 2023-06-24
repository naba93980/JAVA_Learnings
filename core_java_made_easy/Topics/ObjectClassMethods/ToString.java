package ObjectClassMethods;

class Helper {
    int x = 5;

    // override toString() whenever u want some meaningful info when u print an object
    public String toString() {
        return "Nabajyoti here";
    }
}

public class ToString {

    public static void main(String[] args) {
        Helper h=new Helper();
        System.out.println(h);  // calls toString() method, whenever u print an object
    }
}

// default implementation of toString() in object class :
// getClass().getName()+"@"+Integer.toHexString(hashCode())
