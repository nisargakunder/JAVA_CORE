import java.util.Scanner;

public class fibonacci {
    public static int calculate(int n) {
        if (n==1 ||n==2){
            return 1;
        }
        else {
            return calculate(n-1)+calculate(n-2);
        }

    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int n=scanner.nextInt();
        float sum=0;
        for (int i=1;i<=n;i++)
        {    sum=sum+calculate(i);
            System.out.print(calculate(i)+" ");
        }
        System.out.println(sum/n);




    }
}
