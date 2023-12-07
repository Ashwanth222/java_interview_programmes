package java_programs;

public class PrimeNumber {
    public static void main(String[] args){
        int num = 101;
        int count =0;
       for(int i =2;i<num;i++){
           if(num%i == 0){
               count++;
           }
       }
       if(count>0){
           System.out.println("is not a prime");
       }else{
           System.out.println("is a prime");
       }
    }
}
