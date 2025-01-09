package Q5;


 abstract class Employee implements Payable {
        private String name;
        private String empid;
        private int count=0;

        public Employee(String name,String empid){
            this.name=name;
            this.empid=empid;

        }

       abstract public double getpayment();


        public double setsalary(double percentage){
            return getpayment()+(getpayment()*percentage/100);
        }
    }


