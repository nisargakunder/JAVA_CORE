public class Merchandise {
    private String Itemid;
    private int quantity;
    private double price;
   public Merchandise(String Itemid, int quantity, double price) {
       this.Itemid = Itemid;
       this.quantity = quantity;
       this.price = price;
   }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemid() {
        return Itemid;
    }

    public void setItemid(String itemid) {
        Itemid = itemid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Merchandise{" +
                "Itemid='" + Itemid + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
