package Assignment3.Quest1;

/**
 * Created by zemoso on 30/6/17.
 */
public class Hamster extends Rodent {

    public Hamster() {
        System.out.println("Hamster");
    }

    @Override
    public void eat() {
        System.out.println("Hamster eat");
    }

    @Override
    public void move() {
        System.out.println("Hamster create");
    }

    @Override
    public void die() {
        System.out.println("Hamster die");
    }
}
