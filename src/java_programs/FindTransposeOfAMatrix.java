package java_programs;

public class FindTransposeOfAMatrix {
    public static void main(String[] args){
        int row = 2, column = 3;
        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };
        int[][] transpose = new int[column][row];
        Display(matrix);
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        Display(transpose);
    }

    private static void Display(int[][] matrix) {
        for (int[] arr: matrix){
            for(int a: arr){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
