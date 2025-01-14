package Q1;

import java.io.*;
import java.util.*;

public class FindFrequency {
    public static void main(String[] args) {
        Map <String,Integer> word=new HashMap<>() ;

        try(BufferedReader br=new BufferedReader(new FileReader(new File("C:\\JAVA_CORE\\java_week1\\Day5\\src\\Q1\\story.txt")))) {
           String line;
           while((line=br.readLine())!=null){
               String [] arr=line.split(" ");
               for (String i:arr){
                   word.put(i,word.getOrDefault(i,0)+1);
               }
                }
        }catch(FileNotFoundException e){
            System.out.println("Error Couldnt found the file");
            }catch(IOException e){
            System.out.println("Error reading this file");
            }
        for(Map.Entry<String,Integer> entry:word.entrySet()){
            System.out.println(entry.getKey()+" appears "+entry.getValue()+" times");

        }
    }
}
