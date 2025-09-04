package abstractClass;

public class Boat implements RcDevice {
    int x = 0;
    int y = 0;
    int z = 0;
    int speed = 0;

    @Override
    public void turnOn() {
        System.out.println("Boat is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Boat is turning off.");
    }

    @Override
    public void turnLeft() {
        System.out.println("Boat is turning left.");
    }

    @Override
    public void turnRight() {
        System.out.println("Boat is turning right.");
    }

    @Override
    public void speedUp() {
        speed++;
        System.out.println("Boat is speeding up.");
    }

    @Override
    public void speedDown() {
        speed--;
        System.out.println("Boat is slowing down.");
    }

    @Override
    public void moveForward() {
        x++;
        System.out.println("Boat is moving forward.");
    }

    @Override
    public void moveBackward() {
        x--;
        System.out.println("Boat is moving backward.");
    }
}
