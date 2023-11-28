package Collections;

import java.util.Comparator;
import java.util.LinkedList;

public class ReverseALinkedList {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);

        ll.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
