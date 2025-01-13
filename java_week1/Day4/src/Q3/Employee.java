package Q3;

import java.io.Serializable;

public class Employee implements Serializable {

    private int id;
    private String name;
    private Address address;
    private transient double salary;

    public Employee(int id, String name, Address address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Details:");
        System.out.println("ID: " +getId());
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + getSalary());
    }
}