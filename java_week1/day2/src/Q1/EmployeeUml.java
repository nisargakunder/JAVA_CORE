package Q1;


    class Employee{
        private int id;
        private String firstname;
        private String lastname;
        private int salary;



        public  Employee(int id, String firstname, String lastname, int salary) {
            this.id = id;
            this.firstname = firstname;
            this.lastname = lastname;
            this.salary = salary;
        }
        public int getId(){
            return id;
        }
        public String getFirstName(){
            return firstname;
        }
        public String getLastName(){
            return lastname;
        }
        public int getSalary(){
            return salary;
        }
        public void setSalary(int salary){
            this.salary=salary;
        }
        public int getAnnualSalary(){
            return salary*12;
        }
        public int raisesalary(int percent){
            return salary+(salary*percent/100);
        }
        public String toString(){
            return "Employee[id="+id+",name="+firstname+" "+lastname+",salary="+salary+"]";
        }
    }
    public class EmployeeUml {
        public static void main (String [] args){
            {
                Employee e=new Employee(1,"Nisarga","Kunder",10000);
                System.out.println(e.getSalary());
                e.setSalary(20000);
                System.out.println(e.getSalary());
                System.out.println(e.getAnnualSalary());
                System.out.println(e.raisesalary(10));
                System.out.println(e.toString());
            }
        }
    }

