package java_programs;

import java.util.Arrays;
import java.util.List;

public class AddTwoMatrices {
    public static void main(String[] args){
        int rows = 2, columns = 3;
        int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
        int[][] secondMatrix = { {-4, 5, 3}, {5, 6, 3} };
        int[][] result = new int[rows][columns];
        for(int i = 0; i<rows; i++){
            for(int j =i; j<columns; j++){
                result[i][j] = firstMatrix[i][j]+secondMatrix[i][j];
            }
        }

       Arrays.stream(result).forEach(System.out::println);

        for(int[] row : result) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
