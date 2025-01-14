package Q4;

public class Product {
    private String id;
    private String name;
    private double price;
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        StringBuilder s=new StringBuilder().append("Id: ").append(id).append(", ").append("Name: ").append(name).append(", ").append("Price: ").append(price);
        return s.toString();
    }

}
