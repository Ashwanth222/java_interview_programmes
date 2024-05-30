package Java8_programs.FunctionalInterfaces;

interface Drawable{
    public String draw();


}
public class LamdaExpressionForFunctionalInterface {
    public static void main(String[] args) {

        Drawable d = () -> {
            return "inside draw method";
        };

        System.out.println(d.draw());
    }
}
