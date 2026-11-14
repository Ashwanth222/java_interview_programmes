package Strings;

public class ProveStringsAreImmutable {
    public static void main(String[] args)
    {
        //Strings are immutable in Java, meaning their content cannot be changed after creation.
        // When we perform an operation such as concatenation (s1 = s1 + "J2EE"),
        // Java creates a new String object and assigns its reference to s1 rather than modifying
        // the existing "JAVA" object.
        // This is why s1 == s2 becomes false after concatenation.
        String s1 = "JAVA";

        String s2 = "JAVA";

        System.out.println(s1 == s2);         //Output : true

        s1 = s1 + "J2EE";

        System.out.println(s1 == s2);         //Output : false

        //Proof with Identity Hash Code
        String s3 = "JAVA";

        System.out.println(System.identityHashCode(s3));

        s3 = s3 + "J2EE";

        System.out.println(System.identityHashCode(s3));
    }
}
