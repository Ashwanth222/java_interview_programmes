package StackImplementation;

import java.util.LinkedList;
import java.util.List;

public class StackUtil {
   public List<Integer> integers = new LinkedList<>();


    public void push(int i) {
        integers.add(i);

    }

    public void pop() {
        integers.remove(integers.size()-1);

    }
}
