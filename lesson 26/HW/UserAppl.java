

public class UserAppl {
    public static void main(String[] args) {
        User user5 = new User("anna@example.com", "Anna123!");
        System.out.println(user5);
        user5.setEmail("annaexample.com");
        System.out.println(user5);

        User user6 = new User("alex@domain.com", "Alex_123");
        System.out.println(user6);
        user6.setPassword("Alex_123!");
        System.out.println(user6);
    }
}
