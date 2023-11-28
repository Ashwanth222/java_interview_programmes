package java_programs;

public class PrintTriangle6 {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 0; i<n;i++){
            for(int j = i+1; j<n;j++){
                //  for(int j = i+1; j<n;j++){
                //  System.out.print(j/j);
                System.out.print(j+i);
            }
            System.out.println("");
        }
    }

}
