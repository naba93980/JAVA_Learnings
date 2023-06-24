package StringHandling;

public class StringReversal {

    public String firstWay(String actual) {
        String reversed = "";
        for (int i = actual.length() - 1; i >= 0; i--) {
            reversed += actual.charAt(i);
        }
        return reversed;
    }

    public String secondWay(String actual) {
        byte[] s1 = actual.getBytes();
        byte[] s2 = new byte[s1.length];

        for (int i = 0; i <= s1.length - 1; i++) {
            s2[i] = s1[s1.length - i - 1];
        }
        String reversed = new String(s2);
        return reversed;
    }

    public static void main(String[] args) {
        String str = "Nabajyoti";
        StringReversal sr = new StringReversal();
        System.out.println(sr.firstWay(str));
        System.out.println(sr.secondWay(str));
    }
}