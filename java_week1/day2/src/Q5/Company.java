package Q5;


public class Company {
    public static void main(String[] args) {

        Employee e=new SalariedEmployee("neha","1234",3000,3);
        Invoice i=new Invoice("1234","laptop",5,1000);
        System.out.println("Salaried Employee Salary");
        System.out.println(e.getpayment());
        System.out.println("Details of Invoice");
        System.out.println(i.toString());
        System.out.println(i.getpayment());

        Employee e1=new HourlyEmployee("jks","1784",3,1000);
        System.out.println("Hourly Employee Salary");
        System.out.println(e1.getpayment());
        System.out.println("Commission  Employee Salary");
        Employee e2= new CommissionEmployee("ria","7890",50,80);
        System.out.println(e2.getpayment());

    }
}
