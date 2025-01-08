package Q4;

abstract class Employee {
    private String name;
    private String empid;
    public Employee(String name,String empid){
        this.name=name;
        this.empid=empid;

    }

    abstract public double getpayment();
     public double setsalary(double percentage){
        return getpayment()+(getpayment()*percentage/100);
    };
}
