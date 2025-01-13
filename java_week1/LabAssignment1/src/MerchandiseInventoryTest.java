import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MerchandiseInventoryTest {

    public static void main(String[] args) {
        ArrayList<Merchandise> merchandise = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(new File("input.txt")))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(" ");

                if (!arr[0].isEmpty() && !arr[1].isEmpty() && !arr[2].isEmpty()) {
                    merchandise.add(new Merchandise(arr[0], Integer.parseInt(arr[1]), Double.parseDouble(arr[2])));
                } else {
                    System.out.println("Invalid format");
                }

            }
        } catch (IOException e) {
            System.out.println("Couldnt parse the file");
        }
        for (Merchandise merch : merchandise) {
            System.out.println(merch.toString());
        }
        System.out.println("Ascending Order Of Name");
        Collections.sort(merchandise,new Comparator<Merchandise>() {
            @Override
            public int compare(Merchandise o1, Merchandise o2) {
                return o1.getItemid().compareTo(o2.getItemid());
            }});

        for (Merchandise merch : merchandise) {
        System.out.println(merch.toString());
    }
        System.out.println("Descending Order Of Price");
    Collections.sort(merchandise, new Comparator<Merchandise>() {
        @Override
        public int compare(Merchandise o1, Merchandise o2) {
            return Double.compare(o2.getPrice(), o1.getPrice());
        }}
    );


        for (Merchandise merch : merchandise) {
            System.out.println(merch.toString());
        }
    }
}
