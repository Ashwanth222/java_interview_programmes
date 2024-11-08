package java_programs;

public class FindLargestOfTwoArrays {
    public static  void main(String[] args) {
        double[] numArray = {23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5};
        double largest = numArray[0];
        for(int i = 1; i < numArray.length; i++){
            if(numArray[i] > largest){
                largest = numArray[i];
            }
        }
        System.out.println("largest " + largest);
    }
}
