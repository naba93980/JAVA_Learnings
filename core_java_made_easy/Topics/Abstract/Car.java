package Abstract;

public final class Car extends BMW {
    final static int WHEELS=4;
    @Override
    void accelarate() {
        System.out.println("inside accelarate");
    }

    public static void main(String[] args) {
        System.out.println(Car.WHEELS);
    }
}
