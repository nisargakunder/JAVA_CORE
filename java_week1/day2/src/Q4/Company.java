package Q4;

public class Company {
    public  static void main(String args[]){
        Employee e=new SalariedEmployee("neha","1234",3000,3);
        System.out.println(e.getpayment());

        System.out.println("salary after 12%increment for salaried employees "+e.setsalary(12));
        Employee e1=new HourlyEmployee("jks","1784",3,1000);
        System.out.println(e1.getpayment());

        System.out.println("salary after 13 %increment for salaried employees "+e1.setsalary(13));
        Employee e2= new CommissionEmployee("ria","7890",50,80);
        System.out.println(e2.getpayment());
        System.out.println("salary after 13 %increment for salaried employees "+e2.setsalary(13));


    }
}
