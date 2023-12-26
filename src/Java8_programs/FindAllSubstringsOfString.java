package Java8_programs;
//The method subSequence() obtains a part of a String given the starting index and the
// length of the result. The method SubSequence() behaves in the same way as substring().
// The only difference is that it returns a CharSequence instead of a String.
public class FindAllSubstringsOfString {
    public static void main(String[] args){
        String str = "string";
        for(int i = 0; i<str.length();i++) {
            System.out.println(str.substring(0,i+1));
            System.out.println(str.subSequence(0,i));
        }
    }
}
