import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void ListExercises(){
        List<User> users = new ArrayList<User>();
        var user = new User(0, "Joao");
        users.add(user);
        users.add(new User(1, "Claudio"));

        users.forEach(System.out::println);

    }


    public static void main(String[] args){


    }
}
