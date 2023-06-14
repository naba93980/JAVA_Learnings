package ExceptionHandling.Assertions;

public class Assertion {
    public static void main(String[] args) {
        int withdrawlamt=500;
        int currentBalance=1000;
        assert (withdrawlamt>currentBalance):"current balance is less";
    }
} 
// enable "java.debug.settings.vmArgs": "-ea", in settings.json of debugger for java extension for assert to work