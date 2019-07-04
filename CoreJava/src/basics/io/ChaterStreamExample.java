package basics.io;

import java.io.*;

/**
 * Created by jrout on 7/3/19.
 */
public class ChaterStreamExample {
    public static void main(String[] args) {
        File batch30File = new File("/Users/jrout/Development/Github/batch30/CoreJava/src/basics/IIT Workforce--PPT.pdf");
        File batch30File22 = new File("/Users/jrout/Development/Github/batch30/CoreJava/src/basics/IIT WorkforceCopy.pdf");
        System.out.println("Writing something to the file");

        try(
                BufferedReader inputStream = new BufferedReader(new FileReader(batch30File));
                BufferedWriter bufferedOutputStream = new BufferedWriter(new FileWriter(batch30File22))
        ){
            int c;
            while ((c = inputStream.read()) != -1) {
                bufferedOutputStream.write(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
