import java.util.concurrent.atomic.AtomicInteger;

class DroneHive {

    AtomicInteger totalDronesReturned = new AtomicInteger(0);

    volatile boolean emergencyAbort = false;

    public void droneReturned() {
        totalDronesReturned.incrementAndGet();
    }

    public void detectStorm() {
        emergencyAbort = true;
    }
}

public class problem_five {
    public static void main(String[] args) {

        DroneHive hive = new DroneHive();

        hive.droneReturned();
        hive.droneReturned();

        hive.detectStorm();

        System.out.println(hive.totalDronesReturned.get());
        System.out.println(hive.emergencyAbort);
    }
}