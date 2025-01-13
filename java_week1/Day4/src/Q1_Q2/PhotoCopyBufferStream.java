package Q1_Q2;

import java.io.*;

public class PhotoCopyBufferStream {
    public static void main(String[] args) {

        try(BufferedInputStream br=new BufferedInputStream(new FileInputStream("C:\\JAVA_CORE\\java_week1\\Day4\\src\\Q1\\Retriver.jpg"))){

            BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream("C:\\JAVA_CORE\\java_week1\\Day4\\src\\Q1\\Retriver2.jpg"));
             long start=System.currentTimeMillis();
            int byteread=1;
            while((byteread=br.read())!=-1){
    bo.write(byteread);
            }
            long end=System.currentTimeMillis();
            System.out.println("Time Taken By BufferedStream "+(end-start)+"ms");
        }catch(IOException e){
            System.out.println("Io error");

        }


    }
}
