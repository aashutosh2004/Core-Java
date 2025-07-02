import java.util.ArrayList;
import java.util.Collections;

public class merge_2arraylist {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Mango");
        list1.add("Cherry");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Pineapple");
        list2.add("Grapes");
        list2.add("Orange");
        list2.add("Kiwi");

        list1.addAll(list2);

        Collections.sort(list1);
        System.out.println("Sorted List 1: " + list1);

    }
}
