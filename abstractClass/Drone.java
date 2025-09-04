package abstractClass;

public class Drone implements RcDevice {
    private int x = 0;
    private int y = 0;
    private int z = 0;
    private final double[][] coords;

    public Drone() {
        // Generate random coordinates for the flight plan
        coords = new double[100][3]; // each waypoint has X, Y, Z
        for (int i = 0; i < coords.length; i++) {
            coords[i][0] = Math.random() * 100; // X
            coords[i][1] = Math.random() * 100; // Y
            coords[i][2] = Math.random() * 100; // Z
        }
    }

    /**
     * Finds the waypoint farthest from the starting point (0,0,0).
     * This keeps it simple and avoids index errors.
     */
    public double[] flightPlan() {
        double[] farthest = new double[3];
        double maxDistance = -1;

        for (double[] point : coords) {
            double distance = Math.pow(point[0], 2) + Math.pow(point[1], 2) + Math.pow(point[2], 2);
            if (distance > maxDistance) {
                maxDistance = distance;
                farthest = point.clone(); // keep X,Y,Z
            }
        }
        return farthest;
    }

    // Example: change drone altitude
    public void changeHeight(int deltaZ) {
        z += deltaZ;
        System.out.println("Drone changed height to: " + z);
    }

    @Override
    public void turnOn() {
        System.out.println("Drone is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Drone is turning off.");
    }

    @Override
    public void turnLeft() {
        System.out.println("Drone is turning left.");
    }

    @Override
    public void turnRight() {
        System.out.println("Drone is turning right.");
    }

    @Override
    public void speedUp() {
        System.out.println("Drone is speeding up.");
    }

    @Override
    public void speedDown() {
        System.out.println("Drone is slowing down.");
    }

    @Override
    public void moveForward() {
        System.out.println("Drone is moving forward.");
    }

    @Override
    public void moveBackward() {
        System.out.println("Drone is moving backward.");
    }
}
