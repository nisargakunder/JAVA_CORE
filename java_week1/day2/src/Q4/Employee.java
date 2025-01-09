package Q4;

abstract class Employee{
    private String name;
    private String empid;
    private int count=0;

    public Employee(String name,String empid){
        this.name=name;
        this.empid=empid;

    }

     abstract public double getpayment();
     public double increasesalary(double percentage){
        return getpayment()+(getpayment()*percentage/100);
    }
}
