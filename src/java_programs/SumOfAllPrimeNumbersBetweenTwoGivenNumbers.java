package java_programs;

public class SumOfAllPrimeNumbersBetweenTwoGivenNumbers {
    public static void main(String[] args){

            int num1 = 100;
            int num2 = 200;
            int count = 0;
            int sum = 0;
            for (int i = num1; i <= num2; i++) {
                for (int j = 2; j < i; j++) {
                    if (i%j == 0) {
                        count++;
                    }
                }
                if(count>0){
                   // System.out.println("is not a prime"+i);
                }else{
                    sum = sum+ i;
                    System.out.println(i +"is a prime"+"sum is: "+ sum);
                }
                count =0;
            }
        System.out.println("total sum is " + sum);
    }
}
