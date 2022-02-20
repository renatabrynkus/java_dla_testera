public class MainApp {

    public static void main(String[] args) {

        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;

        boolean isFirstAndSecondEven = (first + second) % 2 == 0;
        boolean isThirdAndFourthEven = (third + fourth) % 2 ==0;

        if (isFirstAndSecondEven && isThirdAndFourthEven) {
            System.out.println("All numbers are even.");
           }
        else {
            System.out.println("Not all numbers are even.");
        }
    }
}
