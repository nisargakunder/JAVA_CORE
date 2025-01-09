package Q5;




public class HourlyEmployee extends Employee {
    private int noofhours;
    private double rate;
    public HourlyEmployee(String name, String empid,int noofhours,double rate) {
        super(name, empid);
        this.noofhours=noofhours;
        this.rate=rate;

    }

    @Override
    public double getpayment() {
        return rate*noofhours;
    }

}