package java_programs;

import java.util.Scanner;
//A number is said to be a magic number if the eventual sum of digits of the number is one.
//Sample Input : 55
//Then, 5 + 5 = 10, 1 + 0 = 1
//Sample Output: Hence, 55 is a Magic Number.
//Similarly, 289 is a Magic Number.
public class MagicNumberOrNot {
    private static void isMagicNumber(int inputNumber)
    {
        //Copy inputNumber into copyOfInputNumber

        int copyOfInputNumber = inputNumber;

        //Initialize sum to 0

        int sum = 0;

        //Until we get single digit sum, add digits of inputNumber recursively.

        while (sum > 9 || inputNumber > 0)
        {
            //If inputNumber is 0,
            //then assign sum to inputNumber and 0 to sum

            if (inputNumber == 0)
            {
                inputNumber = sum;
                sum = 0;
            }

            //Extracting lastDigit from inputNumber

            int lastDigit = inputNumber % 10;

            //Adding lastDigit to sum

            sum = sum + lastDigit;

            //Removing lastDigit from inputNumber

            inputNumber = inputNumber / 10;
        }

        //If sum is 1, then given inputNumber is a magic number

        if (sum == 1)
        {
            System.out.println(copyOfInputNumber+" is a magic number");
        }
        else
        {
            System.out.println(copyOfInputNumber+" is not a magic number");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");

        int inputNumber = sc.nextInt();

        isMagicNumber(inputNumber);

        sc.close();
    }
}
