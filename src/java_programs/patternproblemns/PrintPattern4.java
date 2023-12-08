package java_programs.patternproblemns;

import java.util.Scanner;
//        7 7 7 7 7 7 7
//        6 6 6 6 6 6
//        5 5 5 5 5
//        4 4 4 4
//        3 3 3
//        2 2
//        1
public class PrintPattern4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Taking rows value from the user
        System.out.println("How many rows you want in this pattern?");
        int rows = sc.nextInt();
        System.out.println("Here is your pattern....!!!");
        for (int i = rows; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
        //Close the resources
        sc.close();
    }
}
