package IOStreams;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String s = "My name is nabajyoti modak";
        StringTokenizer st = new StringTokenizer(s);    // uses default delimiters
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.countTokens());
        System.out.println("-------");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        String s2 = "My, name is, nabajyoti, modak";
        StringTokenizer st2 = new StringTokenizer(s2,",",true);    // uses default delimiters
        System.out.println(st2.nextToken());
        System.out.println(st2.nextToken());
        System.out.println(st2.countTokens());
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
    }
}
