public class Logicdate {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    //track no of days in a month
    public static int noofdays(int month,int year){
        int arr[] = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month==2){
            if(isLeapYear(year)){
                arr[2]=29;
            }
        }
        return arr[month];
    }


    public  static void main(String [] args){
        int d=31;
        int m=12;
        int y=2024;
        System.out.println("date is"+d+"/"+m+"/"+y);
        d=d+1;
        if (d>noofdays(m,y)){
            d=1;
            m++;
            if (m>12){
                m=1;
                y++;
            }
        }
        System.out.println("date is"+d+"/"+m+"/"+y);
    }
}
