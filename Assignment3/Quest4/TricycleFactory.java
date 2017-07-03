package Assignment3.Quest4;

/**
 * Created by zemoso on 30/6/17.
 */
public class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
