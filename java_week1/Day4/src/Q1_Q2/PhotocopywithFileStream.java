package Q1_Q2;

import java.io.*;

public class PhotocopywithFileStream {
    public static void main(String[] args) {

        try(FileInputStream fr=new FileInputStream("C:\\JAVA_CORE\\java_week1\\Day4\\src\\Q1\\Retriver.jpg")){

            FileOutputStream fo=new FileOutputStream("C:\\JAVA_CORE\\java_week1\\Day4\\src\\Q1\\Retriver1.jpg");
            long start=System.currentTimeMillis();
            int byteread=1;
            while((byteread=fr.read())!=-1){
                fo.write(byteread);
            }
            long end=System.currentTimeMillis();
            System.out.println("Time Taken By BufferedStream "+(end-start)+"ms");
        }catch(IOException e){
            System.out.println("Io error");

        }


    }
}
