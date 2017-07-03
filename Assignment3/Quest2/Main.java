package Assignment3.Quest2;

/**
 * Created by zemoso on 30/6/17.
 */
public class Main {

    public static void main(String args[]) {
        Unicycle uni = new Unicycle();
        Bicycle bi = new Bicycle();
        Tricycle tri = new Tricycle();

        Cycle[] cycle = {uni, bi, tri};


        /*  Cycle does not have balance() method. So The following lines give error.
        cycle[0].balance();
        cycle[1].balance();
        cycle[2].balance();
        */

        ((Unicycle) cycle[0]).balance();
        ((Bicycle) cycle[1]).balance();
        // ((Tricycle)cycle[2]).balance();  Tricycle does not have balance() method.
    }
}
