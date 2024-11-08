package java_programs;

public class CalculateAverageUsingArrays {
    public static void main(String[] args){
        double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
        double sum = 0;
        double average;
        for (double number :numArray){
            sum += number;
        }
        System.out.println(sum);
        average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }
}
