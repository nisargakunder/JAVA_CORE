import java.util.Scanner;

public class Grading {
    public static  void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of stduents");
        int nostudents=sc.nextInt();
        int[] grades=new int[nostudents];
        for (int i=0;i<nostudents;i++){
            int grade;
            while (true){
                System.out.println("enter grade"+(i+1)+":");
                grade=sc.nextInt();
                if (grade>=0 && grade<=100){
                    grades[i]=grade;
                    break;
                }
                else{
                    System.out.println("Invalid grade,Try again");

                }

            }

        }
   float sum=0;
        for (int i=0;i<nostudents;i++){
            sum+=grades[i];
        }
        float avg=sum/nostudents;
        System.out.println("The average score is:"+avg);





    }
}
