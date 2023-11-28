package java_programs;
//output//00000
//1111
//222
//33
//4
public class PrintTriangle4 {
    public static void main(String[] args){
        int n = 6;
        for(int i = 0; i<n;i++){
            for(int j = n-1; j>i;j--){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
