package Java8_programs.groupBy;

import java.util.List;

public class Blog {
    private String authorName;
    private List<String> comments;

    private long likes;

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public Blog(String authorName, List<String> comments, Integer likes) {
        this.authorName = authorName;
        this.comments = comments;
        this.likes = likes;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "authorName='" + authorName + '\'' +
                ", comments=" + comments +
                ", likes=" + likes +
                '}';
    }
}

