package StringBufferComparator;

import java.util.Comparator;

public class StrLenComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        // return Integer.compare(o1.length(), o1.length());
        int l1=o1.length();
        int l2=o2.length();

        if(l1<l2){
            return -1;
        }else if(l1>l2){
            return 1;
        }else{
            return o1.compareTo(o2);
        }
    }
}
