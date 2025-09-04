package abstractClass;

public class Insekt extends Animal {
    String name = "Ant";

    @Override
    public Double mwst(double a, double b) {
        return a * b;
    }

    void description() {
        getName();
    }
}
