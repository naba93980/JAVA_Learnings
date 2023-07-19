package IOStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class TryWithResources {
    public static void main(String[] args) {

        int count = 0;
        // try with resources - u dont need to handle resource manually like fr.close()
        try (
            FileReader fr =  new FileReader(new File("D:/Users/NABAJYOTI/JAVA/core_java_made_easy/Topics/IOStreams/myfile.txt"));
            BufferedReader br = new BufferedReader(fr);
            ) {
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
