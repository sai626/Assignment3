package Assignment3.Quest1;

/**
 * Created by zemoso on 30/6/17.
 */
public class Gerbil extends Rodent {

    public Gerbil() {
        System.out.println("Gerbil");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil eat");
    }

    @Override
    public void move() {
        System.out.println("Gerbil create");
    }

    @Override
    public void die() {
        System.out.println("Gerbil die");
    }
}
