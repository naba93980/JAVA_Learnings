package CliArgs;

public class CliArgs {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Please provide cli argument");
            System.exit(0);
        }
        else{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int result = a+b;
            System.out.println(Integer.toString(result));
        }
    }
}
