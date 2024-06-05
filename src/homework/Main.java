package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Anna");
        Reporting reporting =new Reporting();
        Saveing saveing =new Saveing();
        User user1=new User("Maria");
        User user2=new User("Eve");
        User user3=new User("Eve");
        saveing.saveUser(user);
        reporting.report(user);
        saveing.saveUser(user1);
        saveing.saveUser(user2);
        reporting.report(user3);
    }
}

//