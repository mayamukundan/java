package basics.io;

import java.io.*;

/**
 * Created by jrout on 7/3/19.
 */
public class FileResourceExample {
    public static void main(String[] args) {
        File batch30File = new File("/Users/jrout/Development/Github/batch30/CoreJava/src/basics/Batch30.txt");
        System.out.println("Writing something to the file");

        try(FileWriter writer1 = new FileWriter(batch30File)){
            writer1.write("\nHello World Good Morning/Evening Batch 30"+ new java.util.Date());
            writer1.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
