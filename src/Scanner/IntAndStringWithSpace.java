package Scanner;
import java.util.Scanner;
public class IntAndStringWithSpace {
    // Java program to show the Variable
// used in the lambda expression


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%07d%n",s1,x);

            }
            System.out.println("================================");

        }

}
