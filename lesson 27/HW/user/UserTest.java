package HW.user;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class UserTest {
    private User user;

    @Before
    public void setUp() {
        user = new User("peter@gmail.com", "Qw12345!");
    }

    @Test
    public void testSetEmail() {
        user.setEmail("john@example.com");
        assertEquals("john@example.com", user.getEmail());

        user.setEmail("invalidemail.com");
        assertNotEquals("invalidemail.com", user.getEmail());

        user.setEmail("invalid@em@ail.com");
        assertNotEquals("invalid@em@ail.com", user.getEmail());

        user.setEmail("invalid@gmailcom");
        assertNotEquals("invalid@gmailcom", user.getEmail());

        user.setEmail("invalid@example.c");
        assertNotEquals("invalid@example.c", user.getEmail());

        user.setEmail("inv@lid!email.com");
        assertNotEquals("inv@lid!email.com", user.getEmail());
    }

    @Test
    public void testSetPassword() {
        user.setPassword("NewPassword123!");
        assertEquals("NewPassword123!", user.getPassword());

        user.setPassword("Short1!");
        assertNotEquals("Short1!", user.getPassword());

        user.setPassword("lowercase123!");
        assertNotEquals("lowercase123!", user.getPassword());

        user.setPassword("UPPERCASE123!");
        assertNotEquals("UPPERCASE123!", user.getPassword());

        user.setPassword("NoDigit!");
        assertNotEquals("NoDigit!", user.getPassword());

        user.setPassword("NoSpecialCharacter1");
        assertNotEquals("NoSpecialCharacter1", user.getPassword());

        user.setPassword("Password With Spaces!");
        assertNotEquals("Password With Spaces!", user.getPassword());
    }
}
