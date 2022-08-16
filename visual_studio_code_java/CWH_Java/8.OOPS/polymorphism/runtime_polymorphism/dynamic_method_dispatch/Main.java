package polymorphism.runtime_polymorphism.dynamic_method_dispatch;

class Phone {
    public void time() {
        System.out.println("here is time");
    }

    public void on() {
        System.out.println("my phone is on");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("smartphone is playing music");
    }

    public void on() {
        System.out.println("my smart phone is on");
    }
}

class Main {
    public static void main(String[] args) {

        // Phone obj = new Phone();
        // SmartPhone smObj = new SmartPhone();

        Phone obj = new SmartPhone();
        obj.on(); // runs the method from sub class, this is called dynamic method dispatch in
                  // java while in c++ this is achieved using virtual function
        obj.time();
        // obj.music(); // illegal -> base class reference cannot point to derived class
        // method

    }
}

// a smartphone is a phone but a phone is not necessarily a smartphone
// a smartphone i.e a phone can be in 'on' state
// only smartphone can play music
// a smartphone i.e a phone can show time