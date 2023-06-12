package Interface;

public class MyCircle implements Circle, CircleTwo {
    public static void main(String[] args) {
        
    }

    @Override
    public void calculateArea(){
        System.out.println(CircleTwo.pi);   // common variables from parent interfaces needs to be qualified
    }

    @Override
    public void calculateArea(int radius) {
 
    }
}
