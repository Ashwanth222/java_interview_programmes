package Java8_programs.groupBy;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class groupBy {
    public static void main(String[] args){

        BlogPost bg1 = new BlogPost("title1", "author1", BlogPostType.NEWS, 10 );
        BlogPost bg2 = new BlogPost("title2", "author1", BlogPostType.GUIDE, 20 );
        BlogPost bg3 = new BlogPost("title3", "author3", BlogPostType.NEWS, 30 );
        BlogPost bg4 = new BlogPost("title4", "author4", BlogPostType.REVIEW, 40 );
        BlogPost bg5 = new BlogPost("title5", "author5", BlogPostType.NEWS, 50 );
        BlogPost bg6 = new BlogPost("title6", "author6", BlogPostType.GUIDE, 60 );

        List<BlogPost> posts = Arrays.asList(bg1, bg2, bg3, bg4, bg5, bg6);

        Map<BlogPostType, List<BlogPost>> postsPerType = posts.stream()
                .collect(groupingBy(BlogPost::getType));
        System.out.println(postsPerType);

        Map<BlogPostType, Set<BlogPost>> postsPerTypeSet = posts.stream()
                .collect(groupingBy(BlogPost::getType, toSet()));
        System.out.println(postsPerTypeSet);

        Map<String, Map<BlogPostType, List<BlogPost>>> map = posts.stream()
                .collect(groupingBy(BlogPost::getAuthor, groupingBy(BlogPost::getType)));
        System.out.println(map);

        Map<BlogPostType, Double> averageLikesPerType = posts.stream()
                .collect(groupingBy(BlogPost::getType, averagingInt(BlogPost::getLikes)));
        System.out.println(averageLikesPerType);

        Map<BlogPostType, Integer> likesPerType = posts.stream()
                .collect(groupingBy(BlogPost::getType, summingInt(BlogPost::getLikes)));
        System.out.println(likesPerType);

        Map<BlogPostType, Optional<BlogPost>> maxLikesPerPostType = posts.stream()
                .collect(groupingBy(BlogPost::getType,
                        maxBy(comparingInt(BlogPost::getLikes))));
        System.out.println(maxLikesPerPostType);
        System.out.println(maxLikesPerPostType.entrySet().stream().findFirst().get().getValue().get().getLikes());

        Map<BlogPostType, IntSummaryStatistics> likeStatisticsPerType = posts.stream()
                .collect(groupingBy(BlogPost::getType,
                        summarizingInt(BlogPost::getLikes)));
        System.out.println("likeStatisticsPerType" +likeStatisticsPerType);

        Map<String, BlogPost.PostCountTitlesLikesStats> postsPerAuthor = posts.stream()
                .collect(groupingBy(BlogPost::getAuthor, collectingAndThen(toList(), list -> {
                    long count = list.stream()
                            .map(BlogPost::getTitle)
                            .collect(counting());
                    String titles = list.stream()
                            .map(BlogPost::getTitle)
                            .collect(joining(" : "));
                    IntSummaryStatistics summary = list.stream()
                            .collect(summarizingInt(BlogPost::getLikes));
                    return new BlogPost.PostCountTitlesLikesStats(count, titles, summary);
                })));
            System.out.println("postsPerAuthor" +postsPerAuthor);

        int maxValLikes = 17;
        Map<String, BlogPost.TitlesBoundedSumOfLikes> postsPerAuthor1 = posts.stream()
                .collect(toMap(BlogPost::getAuthor, post -> {
                    int likes = (post.getLikes() > maxValLikes) ? maxValLikes : post.getLikes();
                    return new BlogPost.TitlesBoundedSumOfLikes(post.getTitle(), likes);
                }, (u1, u2) -> {
                    int likes = (u2.boundedSumOfLikes() > maxValLikes) ? maxValLikes : u2.boundedSumOfLikes();
                    return new BlogPost.TitlesBoundedSumOfLikes(u1.titles().toUpperCase() + " : " + u2.titles().toUpperCase(), u1.boundedSumOfLikes() + likes);
                }));

        System.out.println("postsPerAuthor1" + postsPerAuthor1);

        Map<BlogPostType, String> postsPerType2 = posts.stream()
                .collect(groupingBy(BlogPost::getType,
                        mapping(BlogPost::getTitle, joining(", ", "Post titles: [", "]"))));
        System.out.println("postsPerType2" + postsPerType2);

        EnumMap<BlogPostType, List<BlogPost>> postsPerType3 = posts.stream()
                .collect(groupingBy(BlogPost::getType,
                        () -> new EnumMap<>(BlogPostType.class), toList()));
        System.out.println("postsPerType3" + postsPerType3);

        //concurrent operation

        ConcurrentMap<BlogPostType, List<BlogPost>> postsPerType4 = posts.parallelStream()
                .collect(groupingByConcurrent(BlogPost::getType));
        System.out.println("postsPerType4" + postsPerType4);


    }
}
