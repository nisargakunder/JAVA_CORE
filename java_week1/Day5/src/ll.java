
import java.util.*;

public class ll {
    public static void main(String[] args) {
        List<Integer> l=new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(70);

        System.out.println(l);
        ListIterator<Integer> itr=l.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
