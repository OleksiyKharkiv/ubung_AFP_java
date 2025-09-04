package abstractClass;

public abstract class Animal {
    String name;
    public abstract Double mwst (double a, double b);
    public void getName (){
        System.out.println("My name is : " + name);
    }
}