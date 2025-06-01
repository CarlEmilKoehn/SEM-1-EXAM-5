import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        User user1 = new User("Carlus", "cartel");
        User user2 = new User("Findus", "pedersen", "peepo@peep.com");
        User user3 = new User("Dennis", "dunse", "sambuca@live.dk", "20918232");
        User user4 = new User("Alan", "abekat", "zoo@gmail.com");

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

        System.out.println("Sorted name list:");
        for (String s : nameList) {
            System.out.println(s);
        }


    }
}
