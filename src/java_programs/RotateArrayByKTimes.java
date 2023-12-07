package java_programs;

public class RotateArrayByKTimes {
    public static void main(String[] args){
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int k = 3;
        int temp = 0;
        int l = a.length-1;
        while(k>0){
            for(int i = l-1; i>=0;i--){
                temp = a[i];
                a[l] = a[l];
            }
        }
    }
}
