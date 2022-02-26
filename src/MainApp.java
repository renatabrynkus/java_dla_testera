import model.Bug;

public class MainApp {

    public static void main(String[] args) {

        Bug myFirstBug = new Bug("It is not possible to close the application", "tester@test.pl",
                5);

        myFirstBug.showAllInfo();

        myFirstBug.setBugDescription("App not working");
        myFirstBug.setEmail("test@com");
        myFirstBug.setPriority(3);

        myFirstBug.showAllInfo();




    }

}
