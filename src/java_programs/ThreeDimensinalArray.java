package java_programs;

public class ThreeDimensinalArray {
    public static void main(String[] args){

        int[][][] test = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };

        for(int[][] arr2D: test){
            for(int[] array1D: arr2D){
                System.out.print("array1D" + array1D);
            }
            System.out.println();
        }
    }
}
