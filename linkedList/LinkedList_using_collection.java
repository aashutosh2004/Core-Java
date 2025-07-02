import java.sql.SQLOutput;
import java.util.LinkedList;

public class LinkedList_using_collection {
    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("BYD");
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Volvo");
        System.out.println(cars);
        cars.remove("Mazda");
        System.out.println(cars);
        cars.addFirst("Rolls-Royce");
        System.out.println(cars);
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());

    }
}
