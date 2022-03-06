import model.Bug;
import model.BugReporter;

public class MainApp {

    public static void main(String[] args) {

        Bug myFirstBug = new Bug("It is not possible to close the application",
                new BugReporter("Harry", "Potter", "hp@gmail.com"),
                5);

        myFirstBug.setIsBugClosed(true);
        System.out.println(myFirstBug);






    }

}
