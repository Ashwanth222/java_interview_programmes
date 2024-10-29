package QueueImplementation;

public class QueueImplementationMain {
    public static void main(String[] args){
        QueueUtil queue = new QueueUtil();
        queue.add(5);
        System.out.println(queue.integerList);
        queue.add(6);
        System.out.println(queue.integerList);
        queue.add(7);
        System.out.println(queue.integerList);

        queue.remove();
        System.out.println(queue.integerList);
        queue.remove();
        System.out.println(queue.integerList);
        queue.remove();
        System.out.println(queue.integerList);
    }
}
