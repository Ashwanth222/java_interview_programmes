package Exception;

public class NullPointerException {
    public static void main(String[] args){
        String s = null;
        int count =3;
        print1(s,count);
    }

    private static void print1(String s, int count) {
        for(int i= 0; i<count; i++){
           char c = s.charAt(i);
           System.out.println(c);
        }
    }
}
