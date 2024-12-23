package java_programs;

public class FactorialOfANumber {
    public static void main(String[] args){
        int n = 6;
        int fact = 1;
        for(int i =1 ; i<n+1; i++){
            fact = fact*i;
        }
        System.out.println(fact);

        //alternate
         int num = 6;
             for(int i = num-1; i>1;i--){
                 num = num*i;
             }
             System.out.println(num);

             //alternate
        int fact1 = 1;
        for(int i = 6; i>0; i--){
            fact1 = fact1*i;
        }
        System.out.println(fact1);

        //alternate
        //alternate
        int num1 = 6;
        int factorial = 1;
        for(int i = 1; i<num1+1; i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);

    }
}
