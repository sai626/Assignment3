package Assignment3.Quest1;

/**
 * Created by zemoso on 30/6/17.
 */
public class Main {
    public static void main(String args[]) {
        Rodent[] r = new Rodent[3];

        r[0] = new Gerbil();
        r[1] = new Hamster();
        r[2] = new Mouse();

        System.out.println("Gerbil Rodent");
        r[0].eat();
        r[0].move();
        r[0].die();

        System.out.println("Hamster Rodent");
        r[1].eat();
        r[1].move();
        r[1].die();

        System.out.println("Mouse Rodent");
        r[2].eat();
        r[2].move();
        r[2].die();
    }
}
