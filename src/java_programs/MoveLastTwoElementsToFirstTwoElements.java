package java_programs;

import java.util.Arrays;

//Shift last two position elements to first two positions
public class MoveLastTwoElementsToFirstTwoElements {
    public static void main(String[] args) {
        int[] inp1 = {3, 4, 1, 33, 11, 56, 21, 77};
//Output: [21, 77, 3, 4, 1, 33, 11, 56]
        int temp = 0;
        for (int i = 0; i < inp1.length; i++) {
            for (int j = inp1.length - 1; j > inp1.length - 3; j--) {
                temp = inp1[j];
                inp1[j] = inp1[i];
                inp1[i] = temp;
            }
        }
        System.out.println(Arrays.toString(inp1));
    }
}
