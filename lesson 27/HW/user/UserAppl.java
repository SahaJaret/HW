package HW.user;


public class UserAppl {
    public static void main(String[] args) {

        User user = new User("peter@gmail.com", "Qw12345!");
        System.out.println(user);

        user.setEmail("peter@gmail.com");
        System.out.println(user);

    }
}