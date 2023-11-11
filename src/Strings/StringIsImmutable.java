package Strings;
        //To show String is immutable you have to show that once you create one, you won't
        // be able to change it. So you have to show that all public methods of the class
        // don't change it. But you also have to show that you can not inherit from it because
        // that could be a way to break this characteristic (or else that it state couldn't be
        // changed by overriders).
public class StringIsImmutable {
    public static void main(String[] args){
        String a = "abc";
        String b = a;
        a = a.concat("d");
        System.out.println(a);
        System.out.println(b);

        StringBuffer c = new StringBuffer("abc");
        StringBuffer d = c;
        c.append("d");
        System.out.println(c);
        System.out.println(d);
    }
}
