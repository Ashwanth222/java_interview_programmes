package java_programs;
//output  *
//        *
//        *
//        *
//        *
//        *
public class PrintTriangle3 {
    public static void main(String[] args){
        int n = 6;
        for(int i = 0; i<n;i++){
            for(int j = i; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
