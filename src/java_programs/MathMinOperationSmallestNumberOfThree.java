package java_programs;

public class MathMinOperationSmallestNumberOfThree {
    public static void main( String[] args ){
        java.util.Scanner input = new java.util.Scanner( System.in );

        System.out.print( "Enter to first number: " );
        int number1 = input.nextInt();

        System.out.print( "Enter to second number: " );
        int number2 = input.nextInt();

        System.out.print( "Enter to third number: " );
        int number3 = input.nextInt();

        System.out.printf( "The minimum number is: %d%n", minimumTree( number1, number2, number3 ) );
    }

    public static int minimumTree( int number1, int number2, int number3 )
    {
        return Math.min( number1, Math.min( number2, number3 ) );
    }


}
