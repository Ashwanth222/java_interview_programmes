package Java8_programs.groupBy;

import java.util.*;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewStreamCollectorsInJava9 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 5, 5);

        Map<Integer, Long> result = numbers.stream()
                .filter(val -> val > 3)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        System.out.println(result);


        Map<Integer, Long> result1 = numbers.stream()
                .collect(Collectors.groupingBy(i -> i,
                        Collectors.filtering(val -> val > 3, Collectors.counting())));
        System.out.println(result1);

        Blog blog1 = new Blog("1", List.of("Nice", "Very Nice"), 5);
        Blog blog2 = new Blog("2", List.of("Disappointing", "Ok", "Could be better"), 8);
        Blog blog3 = new Blog("3", List.of("okay", "good", "average"), 6);

        List<Blog> blogs = Arrays.asList(blog1, blog2, blog3);

        Map<String, Long> map1 = blogs.stream().collect(Collectors.groupingBy(Blog::getAuthorName, Collectors.counting()));
        System.out.println("map1" + map1);

       Map<String, List<Blog>> map2 =  blogs.stream()
               .collect(Collectors.groupingBy(Blog::getAuthorName, Collectors.filtering(e -> e.getLikes()>5,Collectors.toList())));
       System.out.println("map2" + map2);

        Map<String, LongSummaryStatistics> map3 =  blogs.stream()
                .collect(Collectors.groupingBy(Blog::getAuthorName, Collectors.summarizingLong(Blog::getLikes)));
        System.out.println("map3 " + map3);

        List<LongSummaryStatistics> map4 = map3.values().stream().toList();
        System.out.println("map4 " + map4.stream().findFirst().get().getAverage());
        System.out.println("map4 " + map4.stream().findFirst().get().getCount());
        System.out.println("map4 " + map4.stream().findFirst().get().getMax());
        System.out.println("map4 " + map4.stream().findFirst().get().getMin());
        System.out.println("map4 " + map4.stream().findFirst().get().getSum());

        Map<String, List<String>> authorComments2 = blogs.stream()
                .collect(Collectors.groupingBy(Blog::getAuthorName,
                        Collectors.flatMapping(blog -> blog.getComments().stream(),
                                Collectors.toList())));
        System.out.println("authorComments2 " + authorComments2);

        Map<String,  List<List<String>>> authorComments1 = blogs.stream()
                .collect(Collectors.groupingBy(Blog::getAuthorName,
                        Collectors.mapping(Blog::getComments, Collectors.toList())));
        System.out.println("authorComments1 " + authorComments1);

        Map<String, List<String>> mp2 = blogs.stream()
                .collect(Collectors.toMap(Blog::getAuthorName, Blog::getComments));
        System.out.println("mp2  "+ mp2);

        Map<Long, List<String>> authorComments3 = blogs.stream()
                .collect( Collectors.toMap(Blog::getLikes, Blog::getComments));
        System.out.println("authorComments3 " + authorComments3);

        Map<String, List<String>> mp1
                = blogs.stream().collect(Collectors.collectingAndThen(
                Collectors.toMap(Blog::getAuthorName, Blog::getComments),Collections::<String, List<String>>
                        unmodifiableMap));

        System.out.println("mp1   "+ mp1);

        Map<String, String> mp
                = Stream
                .of(new String[][] {
                        { "1", "Geeks" },
                        { "2", "For" },
                        { "3", "Geeks" } })
                .collect(
                        Collectors
                                .collectingAndThen(
                                        Collectors.toMap(p -> p[0], p -> p[1]),
                                        Collections::<String, String>
                                                unmodifiableMap));
        System.out.println(mp);

        Map<Boolean, List<Blog>> mp4 =blogs.stream()
                .collect(Collectors.partitioningBy(e -> e.getLikes()>5));
        System.out.println("mp4  " + mp4);

        Stream<Integer>
                s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using Collectors.counting() method
        // to count the number of elements in
        // the 2 partitions
        Map<Boolean, Long>
                map = s.collect(
                Collectors.partitioningBy(
                        num -> (num > 3), Collectors.counting()));

        // Displaying the result as a map
        // true if greater than 3, false otherwise
        System.out.println("Elements in stream "
                + "partitioned by "
                + "less than equal to 3: \n"
                + map);


      Map<String, Map<Long, Long>> map5 = blogs.stream()
                .collect(Collectors.groupingBy(Blog::getAuthorName, Collectors.groupingBy(Blog::getLikes, Collectors.counting())));

      System.out.println("map5" + map5);

        List<Blog> map6 = blogs.stream()
                .collect(Collectors.filtering(e -> e.getLikes()>5,Collectors.toList()));
        System.out.println("map6 " + map6);

        Optional<Blog> map7= blogs.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Blog::getLikes)));
        System.out.println("map7  " + map7);
       map7.ifPresent(e -> System.out.println(e));


        ConcurrentMap<String, List<String>> map8 = blogs.stream()
                .collect(Collectors.toConcurrentMap(Blog::getAuthorName, Blog::getComments));
        System.out.println("map8 :" + map8);

       Long reducing = blogs.stream()
                .map(b -> b.getLikes()).reduce(Long.valueOf(0),(a, b) -> a+ b);
       System.out.println("reducing" + reducing);

        List<String> fltmap = blogs.stream()
                .flatMap(b -> b.getComments().stream()).collect(Collectors.toList());
        System.out.println("fltmap" + fltmap);

        List<List<String>> fltmap1 = blogs.stream()
                .flatMap(b -> Stream.of(b.getComments())).collect(Collectors.toList());
        System.out.println("fltmap1" + fltmap1);

        List<Integer> fltmap2 = blogs.stream()
                .flatMap(b -> Stream.of(b.getComments().lastIndexOf("e"))).collect(Collectors.toList());
        System.out.println("fltmap2" + fltmap2);

        blogs.stream().map(e -> e.getLikes()).forEachOrdered(r -> System.out.println(r));
        blogs.stream().map(e -> e.getLikes()).forEach(r -> System.out.println(r));

        System.out.println("authorComments2 " + authorComments2);

        List<Blog> sortedBlogs = blogs.stream()
                .sorted(Comparator.comparingLong(Blog::getLikes))
                .toList();
        System.out.println("sortedBlogs" + sortedBlogs);

        Map<String,Long> map10 =blogs.stream()
                .collect(Collectors.toMap(Blog::getAuthorName, Blog::getLikes));
        System.out.println("map10" + map10);


//        Map<String, BigDecimal> totalByItem = orders.stream()
//                .flatMap(order -> order.getLineItems().stream())
//                .collect(Collectors.groupingBy(LineItem::getName,
//                        Collectors.mapping(LineItem::getPrice,
//                                Collectors.reducing(
//                                        BigDecimal.ZERO, BigDecimal::add))));
    }
}
