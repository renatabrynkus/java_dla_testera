public class MainApp {

    public static void main(String[] args) {

        Bug myFirstBug = new Bug("It is not possible to close the application", "tester@test.pl", 5, true);

        myFirstBug.showAllInfo();
        myFirstBug.showWhoReportedBug();
        System.out.println(myFirstBug.getBugPriority());
        myFirstBug.showBugStatus();

    }

}
