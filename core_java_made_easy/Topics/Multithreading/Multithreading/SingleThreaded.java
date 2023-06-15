package Multithreading;

public class SingleThreaded {
    public static void main(String[] args) {
        for(int x=1;x<=200;x++){
            System.out.println("x: "+x+"   ");
        }

        SingleThreaded st=new SingleThreaded();
        st.printNumber();
    }

    void printNumber(){
        for(int i=1;i<=200;i++){
            System.out.println("i: "+i+"   ");
        }
    }
}
