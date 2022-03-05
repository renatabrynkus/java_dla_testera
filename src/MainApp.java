import computer.Computer;
import computer.Laptop;
import computer.PC;

public class MainApp {

    public static void main(String[] args) {

        Computer officeComputer = new PC("Office computer", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 0);

        System.out.println(gamingLaptop.volumeUp(100));
        System.out.println(gamingLaptop.volumeUp(14));
        System.out.println(gamingLaptop.volumeUp(15));
        System.out.println(gamingLaptop.volumeDown(30));
        System.out.println(gamingLaptop.volumeDown(150));






    }
}
