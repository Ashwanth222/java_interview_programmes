package java_programs;

public class PrintTriangle2 {
    public static void main(String[] args){
        int n = 6;
        for(int i = 0; i<n;i++){
            for(int j = n-1; j>-1;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
