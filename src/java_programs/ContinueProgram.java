package java_programs;

public class ContinueProgram {
    public static void main(String[] args){
                for (int i = 0; i < 10; i++) {
                    if (i == 4 || i == 6 || i == 8) {
                        // Using continue statement to skip the
                        // execution of loop when i==6 or i==8 or i==4
                        continue;
                    }
                    System.out.println(i);
                }
    }
}
