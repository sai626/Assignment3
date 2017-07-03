package Assignment3.Quest4;

/**
 * Created by zemoso on 30/6/17.
 */
public class Factory {

    public static void createCycle(CycleFactory factory) {
        Cycle cycle = factory.getCycle();
        cycle.create();
    }

    public static void main(String args[]) {

        Factory.createCycle(new UnicycleFactory());
        Factory.createCycle(new BicycleFactory());
        Factory.createCycle(new TricycleFactory());
    }
}
