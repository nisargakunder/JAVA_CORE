class Employee{
    private String name;
    private double salary;
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public void   Printemplyeedetails(){
        System.out.println("name="+name);
        System.out.println("salary="+salary);
    }

}
class Company{
    private String name;
    private int maxemployees;
    private int counter;
    private String location;
    private Employee[] employees;
    public Company(String name,int maxemployees,String location){
        this.name=name;
        this.maxemployees=maxemployees;
        this.location=location;
        counter=0;
        this.employees=new Employee[maxemployees];
    }
    public void addEmployee(Employee employee){
        if(counter<maxemployees){
            employees[counter++]=employee;
        }
        else{
            System.out.println("company is full");
        }
    }
}
public class CompositionEx {
    public static void main(String[] args) {
        Employee employee=new Employee("Rahul",10000);
        Company company=new Company("TCS",10,"Bangalore");
        company.addEmployee(employee);
        employee.Printemplyeedetails();
    }
}
