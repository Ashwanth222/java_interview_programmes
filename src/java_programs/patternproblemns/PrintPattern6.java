package java_programs.patternproblemns;

import java.util.Scanner;
//        7 6 5 4 3 2 1
//        7 6 5 4 3 2
//        7 6 5 4 3
//        7 6 5 4
//        7 6 5
//        7 6
//        7
public class PrintPattern6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Taking rows value from the user
        System.out.println("How many rows you want in this pattern?");
        int rows = sc.nextInt();
        System.out.println("Here is your pattern....!!!");
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >=i; j--) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
