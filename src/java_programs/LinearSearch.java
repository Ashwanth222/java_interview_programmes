package java_programs;

public class LinearSearch {
    public static void main(String[] args){
        int arr[] ={3,60,35,2,45,320,5};
        int search = 2;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] == search){
                System.out.println("element found at index i=" + i);
            }
        }
    }
}
