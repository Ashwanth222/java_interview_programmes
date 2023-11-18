package Java8_programs;

import java.util.Random;

public class ProgramToPrintTenRandomNumbers {
    public static void main(String[] args){
        Random random = new Random();
        Random r = new Random(10);
        random.ints().limit(10).forEach(System.out::println);
        r.ints(8).forEach(System.out::println);
    }
}
