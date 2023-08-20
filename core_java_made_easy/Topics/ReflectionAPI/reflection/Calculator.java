package ReflectionAPI.reflection;

public class Calculator {

    private double num1;
    private double num2;

    public Calculator() {
        System.out.println("Default constructor");
    }

    public Calculator(int x) {
        System.out.println("Para constructor");
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

}
