import model.Bug;
import model.User;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        List<Bug> bugs = new ArrayList<>();

        bugs.add(new Bug("App not working", "test1@gmail.com", 1));
        bugs.add(new Bug("Cannot close the app", "test2@gmail.com", 3));
        bugs.add(new Bug("App crashes", "test3@gmail.com", 2));
        bugs.add(new Bug("Cannot log in", "test4@gmail.com", 3));
        bugs.add(new Bug("App not working", "test1@gmail.com", 1));
        bugs.add(new Bug("App too slow", "test5@gmail.com", 5));

//        for (Bug bug:bugs
//             ) {
//            System.out.println(bug);
//        }


        Set<Bug> bugsSet = new HashSet<>(bugs);
        Set<Bug> sortedBugs = new TreeSet<>(bugsSet);



        for (Bug bug : sortedBugs
             ) {
            System.out.println(bug);
            
        }



    }

}
