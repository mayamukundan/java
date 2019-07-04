package basics.io;

import java.io.*;

/**
 * Created by jrout on 7/3/19.
 */
public class CharacterStreamExample {
    public static void main(String[] args) {
        File batch30File = new File("/Users/jrout/Development/Github/batch30/CoreJava/src/basics/HelloWorld.java");
        System.out.println("Writing something to the file");

        try(BufferedReader reader = new BufferedReader(new FileReader(batch30File))){
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char)c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
