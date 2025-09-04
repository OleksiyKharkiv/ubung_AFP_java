
public class Bird {
    public int wings = 2;
    private String species;
    private int age;
    private String name;

    public Bird(String species, int age, String name) {
        this.species = species;
        this.age = age;
        this.name = name;
    }

    public Bird getBird() {
        return new Bird(species, age, name);
    }

    public void sing() {
        System.out.println(species + " is singing.");
    }

    public void fly() {
        System.out.println(species + " is flying.");
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj)        ;
    }
}
