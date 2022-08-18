package interfaceinjava;

// all methods in interface are implicitly public
// methods in interface can be default or static access specified

interface Bicycle {

    void applyBrake();

    void speedUp();

    private void color() {
        System.out.println("red");
    }

    default void turnLightson() {
        System.out.println("light are on...");
        color();
    }

    // only static methods can be defined in interface and subclass doesnot inherit
    // static methods of interfaces
    static void gearChange() {
        System.out.println("changing gear");
    }

    // variable are final,public and static
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

    // public void turnLightson() {
    // System.out.println("light are on in avoncycle class...");
    // }

    // void gearChange() {
    // System.out.println("changing gear from method in avoncycle");
    // }
}

public class Main {
    public static void main(String[] args) {

        AvonCycle obj = new AvonCycle();
        obj.applyBrake();
        obj.turnLightson();
        obj.noOfWheels(32);

        // System.out.println(obj.a); //ok
        // obj.gearChange(); // not ok if gearchange is not defined in class AvonCycle
        Bicycle.gearChange();

        Bicycle kk = new AvonCycle();
        kk.turnLightson();
    }
}

// interfaces are reference type(class is also basically reference type) where
// all methods are abstract. (static and default methods can only have body)

// we cant extend multiple abstract class but we can implement multiple
// interfaces at a time.

// all abstract, default, and static methods in an interface are implicitly
// public.

// default method can be overridden

// an interface can contain constant declarations. All constant values defined
// in an interface are implicitly public , static , and final.

// for methods in interface only public(available everywhere), private(available
// within interface only), abstract(definition in subclass), default(definition
// in interface, can be overriden in subclass), static(definition in interface
// and can be accessed only with interface name) and
// strictfp modifiers are available,
// for variables final,public and static are available