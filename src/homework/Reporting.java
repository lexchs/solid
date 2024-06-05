package homework;

public class Reporting {
    private User user;

    public Reporting() {
    }

    public void report(User user) {
        System.out.println("User get report: " + user.getName());
    }
}