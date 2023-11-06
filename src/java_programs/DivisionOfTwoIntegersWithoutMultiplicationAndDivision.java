package java_programs;


/*Java implementation to Divide two
//integers without using multiplication,
//division and mod operator*/
public class DivisionOfTwoIntegersWithoutMultiplicationAndDivision {
    // Function to divide a by b and
    // return floor value it
    static long divide(long dividend, long divisor)
    {

        // Calculate sign of divisor i.e.,
        // sign will be negative only if
        // either one of them is negative
        // otherwise it will be positive
        long sign
                = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        // Update both divisor and
        // dividend positive
        dividend = Math.abs(dividend);
        System.out.println("dividend"+dividend);

        divisor = Math.abs(divisor);
        System.out.println("divisor"+divisor);

        // Initialize the quotient
        long quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            ++quotient;
        }
        // if the sign value computed earlier is -1 then
        // negate the value of quotient
        if (sign == -1)
            quotient = -quotient;
        System.out.println("quotient"+quotient);

        return quotient;
    }

    public static void main(String[] args)
    {
        int a = -2147483648;
        int b = -1;

        System.out.println(divide(a, b));

        a = 43;
        b = -8;

        System.out.println(divide(a, b));
    }

}
