package basics.io;

import java.io.*;

/**
 * Created by jrout on 7/3/19.
 */
public class ByteStreamExample {
    public static void main(String[] args) {
        File batch30File = new File("/Users/jrout/Development/Github/batch30/CoreJava/src/basics/IIT Workforce--PPT.pdf");
        File batch30File22 = new File("/Users/jrout/Development/Github/batch30/CoreJava/src/basics/IIT WorkforceCopy.pdf");
        System.out.println("Writing something to the file");

        try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(batch30File));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(batch30File22))
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
