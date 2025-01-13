import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(70);
        Iterator<Integer> itr=l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(l);
    }
}
//u shld always itr.next() before removing the node otherwise u get an exception
//u cant use to reverse iterator..only forward and delete but u can use listiterator on array list too

