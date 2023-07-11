package IOStreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw=null;
        fr=new FileReader(new File("D:/Users/NABAJYOTI/JAVA/core_java_made_easy/Topics/IOStreams/myfile.txt"));
        fw=new FileWriter("D:/Users/NABAJYOTI/JAVA/core_java_made_easy/Topics/IOStreams/myfilewritten.txt");
        int data;
        while ((data = fr.read()) != -1) {
            fw.write(data);
        }
        fr.close();
        fw.close();
    }
}
