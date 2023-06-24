package StringHandling;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello:world:Naba:9436";
        System.out.println("length : " + s.length());
        System.out.println("indexof : " + s.indexOf('l'));
        System.out.println("indexof : " + s.indexOf("lo"));
        System.out.println("charAt : " + s.charAt(1));
        System.out.println("substring with beginning index : " + s.substring(1, 3));
        System.out.println("substring with beginning index : " + s.substring(1));
        System.out.println("lowercase: "+s.toLowerCase());
        System.out.println("uppercase: "+s.toUpperCase());
        System.out.println(s.replace("ll", "LL"));
        System.out.println(s.replaceAll("o", "rr"));

        byte[] b=s.getBytes();
        for (byte c : b) {
            System.out.println((char)c);
        }

        String[] splitStrings= s.split(":");
        for (String string : splitStrings) {
            System.out.println(string);
        }
        
    }
}
