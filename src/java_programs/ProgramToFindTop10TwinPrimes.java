package java_programs;

import java.util.*;

public class ProgramToFindTop10TwinPrimes {
    static boolean checkForPrime(int inputNumber)
    {
        boolean isItPrime = true;
        if(inputNumber <= 1)
        {
            isItPrime = false;
            return isItPrime;
        }
        else
        {
            for (int i = 2; i <= inputNumber/2; i++)
            {
                if ((inputNumber % i) == 0)
                {
                    isItPrime = false;
                    break;
                }
            }
            return isItPrime;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n : ");
        int n = sc.nextInt();
        int counter = 1;
        int first, second;
        System.out.println("The first "+n+" twin prime numbers :");
        int inputNumber = 2;
        while (counter <= n)
        {
            first = inputNumber;
            second = inputNumber + 2;
            if(checkForPrime(first) && checkForPrime(second))
            {
                System.out.println("("+first+", "+second+")");
                counter++;
                inputNumber++;
            }
            else
            {
                inputNumber++;
            }
        }
        sc.close();
    }
}
