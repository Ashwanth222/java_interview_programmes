package Arrays;

public class EqualityOfTwoArrays {
    public static void main(String[] args)
    {
        int[] arrayOne = {2, 5, 1, 7, 4};

        int[] arrayTwo = {2, 5, 1, 7, 4};

        boolean equalOrNot = true;

        if(arrayOne.length == arrayTwo.length)
        {
            for (int i = 0; i < arrayOne.length; i++)
            {
                if(arrayOne[i] != arrayTwo[i])
                {
                    equalOrNot = false;
                }
            }
        }
        else
        {
            equalOrNot = false;
        }

        if (equalOrNot)
        {
            System.out.println("Two Arrays Are Equal");
        }
        else
        {
            System.out.println("Two Arrays Are Not equal");
        }

        //alternate
        boolean isArrayEqual = true;
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        if(arr1.length != arr2.length){
            System.out.println("arrays are not equal");

        }else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    System.out.println("arrays are not equal");
                    isArrayEqual = false;
                    break;
                }
            }
        }
        System.out.println("isArrayEqual :" + isArrayEqual);
    }
}
