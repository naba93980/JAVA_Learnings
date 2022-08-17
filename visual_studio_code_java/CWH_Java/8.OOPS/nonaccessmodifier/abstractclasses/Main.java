package nonaccessmodifier.abstractclasses;

abstract class Timing {
    Timing() {
        System.out.println("constructor of Timing class");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();
}

class Morning extends Timing {
    public void greet() {
        System.out.println("good morning");
    }
}

class Afternoon extends Timing {
    public void greet() {
        System.out.println("good afternoon");
    }
}

class Night extends Timing {
    @Override
    public void greet() {
        System.out.println("good night");
    }
}

abstract class DeepNight extends Timing {
    DeepNight() {
        System.out.println("constructor of DeepNight class");
    }
}

public class Main {
    public static void main(String[] args) {

        Morning objM = new Morning();
        Afternoon objA = new Afternoon();
        Night objN = new Night();
        objM.greet();
        objM.sayHello();
        objA.greet();
        objA.sayHello();
        objN.greet();
        objN.sayHello();
        System.out.println("-------------");
        Timing objNight = new Night();
        objNight.sayHello();
        objNight.greet();
    }
}

/*
 * Abstract class in java (pure virtual function makes a class abstract in c++)
 * are classes that is
 * declared abstract - it may or may not include abstract methods.
 */

// If a class includes abstract methods, then the class itself must be declared
// abstract.

// Abstract classes cannot be instantiated, but they can be subclassed,
// if a sub class doesnot provide implementation of all the abstract methods
// then it
// also must be declared abstract class.

// Abstract method - a method that is declared without an implementation
