package abstractClass;

public abstract class Fish extends Animal {
    String name = "Nemo";
    public Fish(String name) {
        this.name = name;
    }
    abstract void deepDive();
    abstract String noise (String noise);
    void description (){
        getName();
    }
    

}
