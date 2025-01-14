package Q3;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BiggestDecimal {
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new FileReader(new File("C:\\JAVA_CORE\\java_week1\\Day5\\src\\Q3\\data.txt")))) {
            String line;
            double max=0.0;
            while((line=br.readLine())!=null){
                double num=Double.parseDouble(line);
                if(num>max)
                    max=num;
            }
            System.out.println(max);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

