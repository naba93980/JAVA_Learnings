package interfaceinjava;

// all methods in interface are implicitly public

interface Bicycle {

    void applyBrake();

    void speedUp();

    // only static methods can be defined in interface and subclass doesnot inherit
    // static methods of interfaces
    static void gearChange() {
        System.out.println("changing gear");
    }

    // constant are final,public and static
    int a = 50;
}

interface Horn {
    void blowPee();
}

class Wheels {
    void noOfWheels(int n) {
        System.out.println(String.format("no of wheels are %d", n));
    }
}

class AvonCycle extends Wheels implements Bicycle, Horn {

    void blowHorn() {
        System.out.println("pee pee po po");
    }

    // implemented methods must be public bcoz all methods in interface are
    // implicitly public

    public void applyBrake() {
        System.out.println("Applying Brake");
    }

    public void speedUp() {
        System.out.println("Applying SpeedUp");
    }

    public void blowPee() {
        System.out.println("blowing pee");
    }

    // void gearChange() {
    // System.out.println("changing gear from method in avoncycle");
    // }
}

public class Main {
    public static void main(String[] args) {

        AvonCycle obj = new AvonCycle();
        obj.applyBrake();

        obj.noOfWheels(32);

        // System.out.println(obj.a); //ok
        // obj.gearChange(); // not ok if gearchange is not defined in class AvonCycle
        Bicycle.gearChange();
    }
}

// interfaces are reference type(class is also basically reference type) where
// all methods are abstract. (static methods can only have body)

// we cant extend multiple abstract class but we can implement multiple
// interfaces at a time.

// All abstract, default, and static methods in an interface are implicitly
// public.

// an interface can contain constant declarations. All constant values defined
// in an interface are implicitly public , static , and final.