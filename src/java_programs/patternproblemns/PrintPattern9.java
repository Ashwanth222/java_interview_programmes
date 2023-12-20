package java_programs.patternproblemns;

import java.util.Scanner;

//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6
//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
public class PrintPattern9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Taking rows value from the user
        System.out.println("How many rows you want in this pattern?");
        int rows = sc.nextInt();
        System.out.println("Here is your pattern....!!!");
        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        for (int i = rows; i >=1; i--) {
            for (int j = 1; j <=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
