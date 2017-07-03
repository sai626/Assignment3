package Assignment3.Quest1;

/**
 * Created by zemoso on 30/6/17.
 */
public class Mouse extends Rodent {

    public Mouse() {
        System.out.println("Mouse");
    }

    @Override
    public void eat() {
        System.out.println("Rodent eat");
    }

    @Override
    public void move() {
        System.out.println("Rodent create");
    }

    @Override
    public void die() {
        System.out.println("Rodent die");
    }
}
