package Q5;

public class Invoice implements Payable {
    private String partNum;
    private String partdesc;
    private double quality;
    private double priceperitem;

    public Invoice(String partNum, String partdesc, int quality, double priceperitem) {
        this.partNum = partNum;
        this.partdesc = partdesc;
        this.quality = quality;
        this.priceperitem = priceperitem;
    }
    public String getpartNum() {
        return partNum;
    }
        public String getpartdesc () {
            return partdesc;
        }
        public double getquality () {
            return quality;
        }
        public double getpriceperitem () {
            return priceperitem;
        }
        public void setpartNum(String partNum){
            this.partNum = partNum;
        }
        public void setPartdesc(String partdesc){
            this.partdesc = partdesc;
        }
        public void setquality ( int quality){
            this.quality = quality;
        }
        public void setpriceperitem ( double priceperitem){
            this.priceperitem = priceperitem;
        }
        public double getpayment () {
            return quality * priceperitem;
        }
        public String toString () {
             return "Invoice partNum=" + partNum + "partdesc=" + partdesc + ", quality=" + quality + ", priceperitem=" + priceperitem;
        }

}
