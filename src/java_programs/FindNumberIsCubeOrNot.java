package java_programs;

public class FindNumberIsCubeOrNot {
    public static void main(String[] args){
        int num = 729;
        for(int i = 1; i<num;i++){
            if(i*i*i == num){
                System.out.println("number is a cube" + i);
                break;
            }else{
              //  System.out.println("number is not a cube");
            }
        }
    }
}
