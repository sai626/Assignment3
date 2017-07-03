package Assignment3.Quest3;

/**
 * Created by zemoso on 30/6/17.
 */
public class Main {

    public void i1(I1 inter) {
        inter.f1_I1();
        inter.f2_I1();
    }

    public void i2(I2 inter) {
        inter.f1_I2();
        inter.f2_I2();
    }

    public void i3(I3 inter) {
        inter.f1_I3();
        inter.f2_I3();
    }

    public void inter(Interface inter) {
        inter.function();
    }

    public static void main(String args[]) {
        DerivedClass derivedClass = new DerivedClass();

        Main main = new Main();
        main.i1(derivedClass);
        main.i2(derivedClass);
        main.i3(derivedClass);
        main.inter(derivedClass);
    }
}
