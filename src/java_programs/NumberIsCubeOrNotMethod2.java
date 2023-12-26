package java_programs;

public class NumberIsCubeOrNotMethod2 {
    public static void main(String[] args){
       // int num = 27;
        int num = 29;
        double n = Math.cbrt(num);
        System.out.println(n);
        if(n*n*n == num){
            System.out.println("number is a cube" + n);

        }else{
              System.out.println("number is not a cube" + n);
        }
    }
}
