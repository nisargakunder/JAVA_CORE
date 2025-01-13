package Q3;

import java.io.*;

public class Serialization {
    public static  void main(String[] args) {
        Employee emp = new Employee(101, "Alice", new Address("New York", "NY"), 75000.0);
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("serialised.txt"))) {
            os.writeObject(emp);
            System.out.println("Employee object serialized");
        } catch (IOException e) {
            System.err.println("Could'nt Serialize object");
        }
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("serialised.txt"))) {
            Employee deserializedEmp = (Employee) is.readObject();
            System.out.println("Employee object deserialized.");
            deserializedEmp.display(); // Salary will be 0.0 as it's transient
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization error: " + e.getMessage());
        }
    }


    }

