package Q3;

import java.io.Serializable;

public class Address implements Serializable {
    private String city;
    private String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        String s = new StringBuilder()
                .append("Address [city=")
                .append(city)
                .append(", state=")
                .append(state)
                .append("]")
                .toString();
        return s;
    }
}
