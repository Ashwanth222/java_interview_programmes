package java_programs;

public class FactorialOfANumber {
    public static void main(String[] args){
        int n = 6;
        int fact = 1;
        for(int i =1 ; i<n+1; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
