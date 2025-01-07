import java.util.Scanner;

public class Copyclass {
    public static int[] copyof(int [] arr){
        int [] copy=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        return copy;



    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter element "+(i+1));
            arr[i]=sc.nextInt();
        }
        int [] copy=copyof(arr);
        for (int i=0;i<copy.length;i++){
            System.out.println(copy[i]);
        }
        
    }
}
