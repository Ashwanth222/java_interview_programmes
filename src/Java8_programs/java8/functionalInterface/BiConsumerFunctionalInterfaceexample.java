package Java8_programs.java8.functionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterfaceexample {
    public static void main(String[] args){
        BiConsumer<String, Integer> biConsumer = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String i1, Integer i2) {
                System.out.println(i1+":"+i2);
            }
        };

        biConsumer.accept("Welcome",143);


    //==========================================

        BiConsumer<String, Integer> biConsumer1 = (p1, p2) -> System.out.println(p1 +" +" + p2);
        biConsumer1.accept("string", 101);

        Map<String, Integer> map=new HashMap<>();
        map.put("huyv",5000);
        map.put("ghvj",15000);
        map.put("ycub",12000);

        map.forEach((k,v)-> System.out.println(k+","+v));
    }
}
