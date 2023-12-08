package java_programs;

public class ReverseOfANumber {
    public static void main(String[] args){
        int a = 5432;
        int c = 0;
      while(a>0){
          int b = a%10;
          c = c*10+b;
          a = a/10;
      }
      System.out.println(c);
    }
}
