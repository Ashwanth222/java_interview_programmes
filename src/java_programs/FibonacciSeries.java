package java_programs;

public class FibonacciSeries {
    public static void main(String[] args) {
        int l1 = 0;
        int l2 = 1;
        int l = 10;
        int temp;
        System.out.println(l1);
        for (int i = 0; i < l; i++) {
            temp = l1 + l2;
            l1 = l2;
            l2 = temp;
            System.out.println(l1);
            //System.out.println(l2);
        }


        //method 2
        int i = 0;
        int j = 1;
        int c = 7;
        int k;
        System.out.println(i);
        for (int a = 1; a < c; a++) {
            k = i + j;
            System.out.println(k);
            i = j;
            j = k;
        }
    }
}
