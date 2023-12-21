import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ForumImplTest {
    private Forum forum;
    private Post post1;
    private Post post2;

    @BeforeEach
    void setUp() {
        forum = new ForumImpl(10);
        post1 = new Post(1, "Title1", "Author1", "Content1", LocalDateTime.now());
        post2 = new Post(2, "Title2", "Author2", "Content2", LocalDateTime.now().minusDays(1));
        forum.addPost(post1);
        forum.addPost(post2);
    }

    @Test
    void addPost() {
        Post post3 = new Post(3, "Title3", "Author3", "Content3", LocalDateTime.now());
        assertTrue(forum.addPost(post3));
        assertEquals(3, forum.size());
    }

    @Test
    void removePost() {
        assertTrue(forum.removePost(1));
        assertNull(forum.getPostById(1));
        assertEquals(1, forum.size());
    }

    @Test
    void updatePost() {
        String newContent = "Updated Content";
        assertTrue(forum.updatePost(2, newContent));
        assertEquals(newContent, forum.getPostById(2).getContent());
    }

    @Test
    void getPostById() {
        assertEquals(post1, forum.getPostById(1));
    }

    @Test
    void getPostsByAuthor() {
        Post[] posts = forum.getPostsByAuthor("Author1");
        assertNotNull(posts);
        assertEquals(1, posts.length);
        assertEquals(post1, posts[0]);
    }
}
