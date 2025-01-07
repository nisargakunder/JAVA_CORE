 class Passengers {
    private String name;
    public Passengers(String name) {
        this.name = name;
    }
    public void travel(String source,String destination,Vehicle vehicle){
        vehicle.move(source,destination);
    }

}
abstract class Vehicle{
   abstract public void move(String source,String destination);
}
class Metro extends Vehicle{
    public  void move(String source,String destination){

        System.out.println("Moving from "+source+" to "+destination+"using metro");


    }
}
class Bus extends Vehicle{
    public  void move(String source,String destination){
        System.out.println("Moving from "+source+" to "+destination+"using bus");
    }
}

public  class Passenger {
    public static void main(String[] args) {
        Vehicle vehicle=new Metro();
        Vehicle vehicle1=new Bus();
        Passengers p=new Passengers("Rahul");
        p.travel("A","B",vehicle);
        p.travel("whitefiled","pes",vehicle1);

    }
}