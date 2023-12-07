package java_programs;

public class SumOfFirstTenPrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        int target = 0;
        int sum = 0;
        for (int i = 3; i < 1000; i++) {
            if (target < 10) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count > 0) {
                    // System.out.println(i + "is not a prime");
                } else {
                    sum = sum + i;
                    System.out.println(i + "is a prime" + sum);
                    target++;
                }
                count = 0;
            }
        }
        System.out.println("total sum is: " + sum);
    }
}
