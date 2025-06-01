import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Carlus", "hemmelighed123");
        User user2 = new User("Findus", "999888hhh", "peepo@peep.com");
        User user3 = new User("HeavyDrink", "poppypop7", "sambuca@live.dk", "20918232");
        User user4 = new User("Alan", "abekat", "zoo@gmail.com", "99887766");

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());

        System.out.println(); //spacing

        //Alphabetically sorted name list
        List<String> nameList = new ArrayList<String>();

        nameList.add(user1.getName());
        nameList.add(user2.getName());
        nameList.add(user3.getName());
        nameList.add(user4.getName());

        Collections.sort(nameList);

        for (String s : nameList) {
            System.out.println(s);
        }


    }
}
