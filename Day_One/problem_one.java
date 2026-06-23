abstract class SpaceVessel {
    short shipId;          // max 30000
    boolean active;
    char fleetClass;

    SpaceVessel(short shipId, boolean active, char fleetClass) {
        this.shipId = shipId;
        this.active = active;
        this.fleetClass = fleetClass;
    }
}

class MiningShip extends SpaceVessel {
    float[][] cargoHold;

    MiningShip(short shipId, boolean active, char fleetClass, float[][] cargoHold) {
        super(shipId, active, fleetClass);
        this.cargoHold = cargoHold;
    }

    public float calculateTotalOreWeight() {
        float total = 0;

        for (float[] bay : cargoHold) {
            for (float weight : bay) {
                total += weight;
            }
        }
        return total;
    }

    public float findHeaviestContainer() {
        float max = 0;

        for (float[] bay : cargoHold) {
            for (float weight : bay) {
                if (weight > max)
                    max = weight;
            }
        }
        return max;
    }
}

public class problem_one {
    public static void main(String[] args) {

        SpaceVessel[] fleet = new SpaceVessel[1];

        float[][] cargo = {
                {1000.5f, 2000.2f},
                {5000.8f, 3000.4f}
        };

        MiningShip m = new MiningShip((short)101, true, 'A', cargo);

        fleet[0] = m;

        System.out.println(m.calculateTotalOreWeight());
        System.out.println(m.findHeaviestContainer());
    }
}