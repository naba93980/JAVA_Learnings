package Abstract;

public abstract class BMW {

    BMW(){
        System.out.println("inside costructor of abstract class");
    }
    void commonFunc(){
        System.out.println("Inside commonFunc method");
    }
    abstract void accelarate();

    public static void main(String[] args) {
        System.out.println("Inside main of abstract class");
    }
}
