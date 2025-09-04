package abstractClass;

public class Carp extends Fish {
    public Carp(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    String name = "Carp";

    @Override
    public Double mwst(double a, double b) {
           double mwst = a * b * 0.07;
           return mwst;
    }

    public void deepDive() {
        System.out.println(name + " is swimming deep.");
    }

    public String noise(String noise) {
        return noise;
    }

    public void description() {
        getName();
    }
}
