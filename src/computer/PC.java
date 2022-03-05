package computer;

public class PC extends Computer {

    private boolean isPowerSupply;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        isPowerSupply = false;
    }

    public void setPowerSupply(boolean powerSupply) {
        isPowerSupply = powerSupply;
    }

    public int volumeUp() {
        return volumeLevel += 1;
    }

    public int volumeUp(int up) {
        volumeLevel += up;
        if (volumeLevel >= 100) {
            volumeLevel = 100;
        }
            return volumeLevel;
        }

    public int volumeDown() {
        return volumeLevel -= 1;
    }

    public int volumeDown(int down) {
        volumeLevel -= down;
        if (volumeLevel <= 0) {
            volumeLevel = 0;
        }
            return volumeLevel;
        }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isPowerSupply) {
            super.switchOn();
        } else {
            System.out.println("It is not possible to turn on the computer!");
        }
    }

}
