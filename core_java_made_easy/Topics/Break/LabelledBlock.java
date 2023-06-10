package Break;

public class LabelledBlock {
    public static void main(String[] args) {
        int x=5;
        B1:{
            if(true){
                System.out.println("Block begins");
                System.out.println(x);
                break B1;
            }
            System.out.println("Block ends");
        }
    }
}
