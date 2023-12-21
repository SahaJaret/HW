import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class ForumImpl implements Forum {
    private Post[] posts;
    private int size;

    public ForumImpl(int capacity) {
        posts = new Post[capacity];
        size = 0;
    }

    @Override
    public boolean addPost(Post post) {
        if (size < posts.length) {
            posts[size++] = post;
            Arrays.sort(posts, 0, size, Comparator.comparing(Post::getAuthor));
            return true;
        }
        return false;
    }

    @Override
    public boolean removePost(int postId) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostId() == postId) {
                System.arraycopy(posts, i + 1, posts, i, size - i - 1);
                posts[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePost(int postId, String content) {
        for (Post post : posts) {
            if (post != null && post.getPostId() == postId) {
                post.setContent(content);
                return true;
            }
        }
        return false;
    }

    @Override
    public Post getPostById(int postId) {
        for (Post post : posts) {
            if (post != null && post.getPostId() == postId) {
                return post;
            }
        }
        return null;
    }

    @Override
    public Post[] getPostsByAuthor(String author) {
        return Arrays.stream(posts, 0, size)
                .filter(post -> post != null && post.getAuthor().equals(author))
                .toArray(Post[]::new);
    }

    @Override
    public Post[] getPostsByAuthor(String author, LocalDate dateFrom, LocalDate dateTo) {
        return Arrays.stream(posts, 0, size)
                .filter(post -> post != null &&
                        post.getAuthor().equals(author) &&
                        !post.getDate().toLocalDate().isBefore(dateFrom) &&
                        !post.getDate().toLocalDate().isAfter(dateTo))
                .toArray(Post[]::new);
    }

    @Override
    public int size() {
        return size;
    }
}
