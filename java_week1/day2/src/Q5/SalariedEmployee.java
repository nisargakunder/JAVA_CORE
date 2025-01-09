package Q5;




public class SalariedEmployee extends Employee {
        private int noofhours;
        private double fixedsalary=10000;
        public SalariedEmployee(String name, String empid,double salary,int noofhours) {

            super(name, empid);
            this.noofhours=noofhours;

        }

        @Override
        public double getpayment() {

            return fixedsalary;
        }
    }


