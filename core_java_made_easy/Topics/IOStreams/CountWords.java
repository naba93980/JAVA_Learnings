package IOStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CountWords {
    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;
        int count = 0;

        try {
            fr = new FileReader(new File("D:/Users/NABAJYOTI/JAVA/core_java_made_easy/Topics/IOStreams/myfile.txt"));
            br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreTokens()) {
                    System.out.println(st.nextToken());
                    count++;
                }
            }
            System.out.println("no. of words : " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
