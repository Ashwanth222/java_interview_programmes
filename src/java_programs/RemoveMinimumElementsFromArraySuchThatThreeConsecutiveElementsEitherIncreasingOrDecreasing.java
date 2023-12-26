package java_programs;

//Input : arr[] = {5, 2, 3, 6, 1}
//Output : 1
//Given arr[] is not in required form
//(2 < 3 < 6). So, after removal of
//6 or 3, array will be in required manner.
//
//Input : arr[] = { 4, 2, 6, 3, 10, 1}
//Output : 0
public class RemoveMinimumElementsFromArraySuchThatThreeConsecutiveElementsEitherIncreasingOrDecreasing {
    static int minimumDeletions(int a[],
                                int n)
    {
        if (n <= 2)
            return 0;

        // If number of element
        // is greater than 2.
        int count = 0;
        for (int i = 0; i < n - 2; i++)
        {
            // If three element are
            // consecutively increasing
            // or decreasing.
            if ((a[i] < a[i + 1] &&
                    a[i + 1] < a[i + 2]) ||
                    (a[i] > a[i + 1] &&
                            a[i + 1] > a[i + 2]))
                count++;
        }

        return count;
    }

    // Driver Code
    public static void main (String[] args)
    {
        int a[] = { 5, 2, 3, 6, 1 };
        int n = a.length;

        System.out.println(minimumDeletions(a, n));
    }
}
