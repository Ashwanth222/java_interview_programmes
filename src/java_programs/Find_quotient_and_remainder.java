package java_programs;


public class Find_quotient_and_remainder {
    // Java program to find quotient and remainder
        static void findQuotientAndRemainder(int dividend,
                                             int divisor,
                                             int[] qr)
        {
            qr[0] = 0;
            qr[1] = dividend;
            while (qr[1] >= divisor) {
                qr[1] -= divisor;
                qr[0] += 1;
            }
        }

        // Driver Code
        public static void main(String[] args)
        {
            int dividend = 10;
            int divisor = 3;
            int[] qr = new int[2];

            findQuotientAndRemainder(dividend, divisor, qr);

            System.out.println("Quotient: " + qr[0]);
            System.out.println("Remainder: " + qr[1]);
        }


}
