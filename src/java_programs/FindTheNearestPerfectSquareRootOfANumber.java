package java_programs;

//for nearest square root of a number we need to find square root first and then
//make round which eliminates digits after point(.) , which gets first number, for
// second number increment the first number, after that by using ternary operator
// we will calculate the nearest perfect square number to given number
//then we will square root the number and remove the numbers after point(.)
public class FindTheNearestPerfectSquareRootOfANumber {
    public static void main(String[] args){
        int i = 39;
        double k = Math.sqrt(i);
        System.out.println("square root of a number"+k);
        long l = Math.round(k);
        System.out.println(l);
        long m = l+1;
        System.out.println(m);
        long n = l*l;
        System.out.println(n);
        long o = m*m;
        System.out.println(o);
        long p = i-n;
        System.out.println(p);
        long q = o-i;
        System.out.println(q);
        long r = Math.min(p,q);
        long res=(p<q) ? (i-r):(i+r);
        System.out.println(res);
        System.out.println("Nearest perfect number is:" + Math.round(Math.sqrt(res)));
    }
}
