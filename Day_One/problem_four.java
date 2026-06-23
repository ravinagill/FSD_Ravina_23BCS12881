class HardwareLockException extends Exception {
    public HardwareLockException(String msg) {
        super(msg);
    }
}

class SensorCorruptionException extends RuntimeException {
    public SensorCorruptionException(String msg) {
        super(msg);
    }
}

class TelemetryStream implements AutoCloseable {

    public void readData() {
        System.out.println("Reading Telemetry...");
    }

    public void close() {
        System.out.println("Stream Closed");
    }
}

public class problem_four {

    public static void parseData() throws HardwareLockException {

        try (TelemetryStream ts = new TelemetryStream()) {

            ts.readData();

            if (true)
                throw new HardwareLockException("File Locked");

        }
    }

    public static void main(String[] args) {

        try {
            parseData();
        }
        catch (HardwareLockException e) {
            System.out.println(e.getMessage());
        }
    }
}