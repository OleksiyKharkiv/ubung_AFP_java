package abstractClass;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

/*
 * Package-private interface to keep the example self-contained.
 * In real projects, put interfaces into their own files.
 */
interface RcDevice {
    void changeHeight();     // adjust height (no-arg version required by legacy interface)
    void turnOn();
    void turnOff();
    void turnLeft();
    void turnRight();
    void speedUp();
    void speedDown();
    void moveForward();
    void moveBackward();
}

/**
 * Drone class — simple, single responsibility: manage coordinates and basic RC actions.
 * Comments in English. Principles: KISS, DRY, SOLID (example-level).
 */
public class Drone implements RcDevice {
    // Current integer coordinates (could be replaced with a Position value object).
    private int x = 0;
    private int y = 0;
    private int z = 0;

    // Flight waypoints: each waypoint is {x, y, z}.
    private final double[][] coords;
    private static final int WAYPOINT_COUNT = 100;

    /**
     * Constructor: generate random waypoints in [0, 100).
     * Keeping waypoint array as WAYPOINT_COUNT x 3 to avoid index errors.
     */
    public Drone() {
        coords = new double[WAYPOINT_COUNT][3];
        for (int i = 0; i < WAYPOINT_COUNT; i++) {
            coords[i][0] = ThreadLocalRandom.current().nextDouble(0, 100); // X
            coords[i][1] = ThreadLocalRandom.current().nextDouble(0, 100); // Y
            coords[i][2] = ThreadLocalRandom.current().nextDouble(0, 100); // Z
        }
    }

    /**
     * Return the single waypoint chosen as the "flight plan".
     * Here we pick the waypoint farthest from the reference (0,0,0) — simple and safe.
     * @return a copy of the farthest waypoint {x, y, z}
     */
    public double[] flightPlan() {
        double[] origin = {0.0, 0.0, 0.0};
        return getFarthestFrom(origin);
    }

    /**
     * Helper: find the farthest waypoint from a reference point.
     * DRY: distance calculation extracted to a helper method.
     */
    private double[] getFarthestFrom(double[] reference) {
        double maxDistSq = -1.0;
        double[] farthest = new double[3];
        for (double[] point : coords) {
            double d = distanceSquared(point, reference);
            if (d > maxDistSq) {
                maxDistSq = d;
                farthest = Arrays.copyOf(point, 3); // defend against aliasing
            }
        }
        return farthest;
    }

    /**
     * Distance squared between two 3D points. Avoids unnecessary sqrt for comparison.
     */
    private static double distanceSquared(double[] a, double[] b) {
        double dx = a[0] - b[0];
        double dy = a[1] - b[1];
        double dz = a[2] - b[2];
        return dx * dx + dy * dy + dz * dz;
    }

    /**
     * No-arg changeHeight to satisfy RcDevice interface.
     * Simple behavior: increase altitude by 1.
     */
    @Override
    public void changeHeight() {
        z += 1;
        System.out.println("Drone changed height (no-arg) to: " + z);
    }

    /**
     * Overloaded, more flexible version — not part of the legacy interface but convenient.
     * Use this when you need to change height by a specific delta.
     */
    public void changeHeight(int deltaZ) {
        z += deltaZ;
        System.out.println("Drone changed height by " + deltaZ + " to: " + z);
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

    // Simple helper to format a waypoint for console output.
    private static String waypointToString(double[] wp) {
        return String.format("[%.2f, %.2f, %.2f]", wp[0], wp[1], wp[2]);
    }

    /**
     * Demo main — shows basic usage.
     */
    public static void main(String[] args) {
        Drone drone = new Drone();

        System.out.println("First waypoint: " + waypointToString(drone.coords[0]));
        double[] farthest = drone.flightPlan();
        System.out.println("Farthest waypoint from origin: " + waypointToString(farthest));

        drone.turnOn();
        drone.changeHeight();      // interface-compliant call
        drone.changeHeight(5);     // flexible overload
        drone.moveForward();
        drone.turnLeft();
        drone.speedUp();
        drone.turnOff();
    }
}
