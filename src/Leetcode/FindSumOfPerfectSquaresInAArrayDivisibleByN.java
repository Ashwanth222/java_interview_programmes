package Leetcode;

//Input: arr[] = {2, 3, 4, 6, 9, 10}, x = 13
//Output: Yes
//4 and 9 are the only perfect squares from the array
//sum = 4 + 9 = 13 (which is divisible by 13)
//
//Input: arr[] = {2, 4, 25, 49, 3, 8}, x = 9
//Output: No
public class FindSumOfPerfectSquaresInAArrayDivisibleByN {
public static boolean check(int[] a,int k,int l) {
    int sum = 0;
    for(int i = 0; i<l;i++){
    double d = Math.sqrt(a[i]);
        if(Math.floor(d) == Math.ceil(d)){
            sum = sum + a[i];
        }
    }
    if(sum%k == 0 ){
        return true;
    }else {
        return false;
    }
}
    public static void main(String[] args){

        int arr[] = { 2, 3, 4, 9, 10 };
        int n = arr.length ;
        int x = 13;

        if (check(arr, x, n)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

}
