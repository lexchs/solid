package homework;

public class Saveing {
    private User user;

    public Saveing() {
    }

    public void saveUser(User user){
        Saveing saveing = new Saveing();
        saveing.save(user);
    }

    public void save(User user){
        System.out.println("Save user: " + user.getName());
    }
}