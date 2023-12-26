package java_programs;

public class FibonacciSeries {
    public static void main(String[] args){
        int l1 = 0;
        int l2 = 1;
        int l = 10;
        int temp;
        System.out.println(l1);
        for(int i = 0;i<l;i++){
           temp =l1+l2;
           l1 = l2;
            l2= temp;
            System.out.println(l1);
            //System.out.println(l2);
        }

    }

    //method 2

    //static int n1=0,n2=1,n3=0;
    // static void printFibonacci(int count){
    //    if(count>0){
    //         n3 = n1 + n2;
    //         n1 = n2;
    //         n2 = n3;
    //         System.out.print(" "+n3);
    //         printFibonacci(count-1);
    //     }
    // }
    // public static void main(String args[]){
    //  int count=10;
    //  System.out.print(n1+" "+n2);//printing 0 and 1
    //  printFibonacci(count-2);//n-2 because 2 numbers are already printed
    // }
}
