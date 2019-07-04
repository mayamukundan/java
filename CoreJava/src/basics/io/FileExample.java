package basics.io;

import java.io.*;

/**
 * Created by jrout on 7/3/19.
 */
public class FileExample {
    public static void main(String[] args) {
        File batch30File = new File("/Users/jrout/Development/Github/batch30/CoreJava/src/basics/Batch30.txt");
        try {
            if (!batch30File.exists()) {
                boolean newFileCreated = batch30File.createNewFile();
                System.out.println("File Created = "+ newFileCreated);
            }else {
                System.out.println("File already exists..");

                System.out.println(batch30File.canExecute());
                System.out.println(batch30File.canRead());
                System.out.println(batch30File.canWrite());
                System.out.println(batch30File.getAbsolutePath());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File directory = new File("/Users/jrout/Development/Github/batch30/CoreJava/src/basics");
        System.out.println(directory.isDirectory());

        System.out.println("Writing something to the file");
        FileWriter writer = null;
        try {
//            writer = new FileWriter(batch30File,true);
            writer = new FileWriter(batch30File);
            writer.write("\nHello World Good Morning/Evening Batch 30"+ new java.util.Date());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        System.out.println("**************Reading Content from the File************");
        FileReader fileReader = null;
        try {
            char[] inBag = new char[500];
            fileReader = new FileReader(batch30File);
            int read = fileReader.read(inBag);

            System.out.println(" Bytes read = "+ read);

            for(char c: inBag) {
                System.out.print(c);
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }finally {
            try{
                if(fileReader != null)
                    fileReader.close();
            }catch (IOException ioe){
                ioe.printStackTrace();
            }

        }
    }
}
