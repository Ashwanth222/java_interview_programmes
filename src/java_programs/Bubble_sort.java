package java_programs;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String []args){
        int arr[] ={3,60,35,2,45,320,5};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }  //sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        //

        int arr1[] ={3,60,35,2,45,320,5};
        for(int i = 0; i<arr1.length;i++){
            for(int j = 1; j<arr1.length;j++){
                if(arr1[j-1] < arr1[j]) {
                    temp = arr1[j-1];
                    arr1[j-1] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));


        //alternate
        //descending order
        int arr2[] ={3,60,35,2,45,320,5};
        for(int i = 0; i<arr2.length;i++){
            for(int j = i; j<arr2.length;j++){
                if(arr2[i] < arr2[j]) {
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        System.out.println("arr2 --> " + Arrays.toString(arr2));


        //Ascending order
        int arr3[] ={3,60,35,2,45,320,5};
        for(int i = 0; i<arr3.length;i++){
            for(int j = i; j<arr3.length;j++){
                if(arr3[i] > arr3[j]) {
                    temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }
            }
        }
        System.out.println("arr3 --> " + Arrays.toString(arr3));
    }
}
