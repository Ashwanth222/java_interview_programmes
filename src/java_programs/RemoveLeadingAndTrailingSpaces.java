package java_programs;

public class RemoveLeadingAndTrailingSpaces {
    public static void main(String[] args){
    String st = "    lsjklfj sjkljklks    ";
    String strip = st.strip();
    String stripLeading = st.stripLeading();
    String stripTrailing = st.stripTrailing();
        System.out.println(st);
        System.out.println(strip);
        System.out.println(stripLeading);
        System.out.println(stripTrailing);
        System.out.println(strip.chars().peek(System.out::println));


    }
}
