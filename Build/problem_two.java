class PowerManager {

    private byte sectorStates = 0;

    public void turnOnSector(int sectorIndex) {
        sectorStates = (byte) (sectorStates | (1 << sectorIndex));
    }

    public void turnOffSector(int sectorIndex) {
        sectorStates = (byte) (sectorStates & ~(1 << sectorIndex));
    }

    public boolean isSectorOn(int sectorIndex) {
        return (sectorStates & (1 << sectorIndex)) != 0;
    }
}

public class problem_two {
    public static void main(String[] args) {

        PowerManager p = new PowerManager();

        p.turnOnSector(2);
        p.turnOnSector(5);

        System.out.println(p.isSectorOn(2));
        System.out.println(p.isSectorOn(4));
    }
}