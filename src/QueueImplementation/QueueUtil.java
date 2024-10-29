package QueueImplementation;

import java.util.ArrayList;
import java.util.List;

public class QueueUtil {

    List<Integer> integerList = new ArrayList<>();
    public void add(int i) {
        integerList.add(i);
    }

    public void remove() {
        integerList.remove(integerList.get(0));
    }
}
