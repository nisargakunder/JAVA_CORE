package Q4;

public class CommissionEmployee extends Employee{
    private double salespercent;
    private double weeklysale;
    public CommissionEmployee(String name, String empid,double salespercent,double weeklysale) {
        super(name, empid);
        this.weeklysale=weeklysale;
        this.salespercent=salespercent;

    }

    @Override
    public double getpayment() {
        return weeklysale*salespercent/100;
    }

}
