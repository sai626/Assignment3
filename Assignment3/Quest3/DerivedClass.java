package Assignment3.Quest3;

/**
 * Created by zemoso on 30/6/17.
 */
public class DerivedClass extends ConcreteClass implements Interface {
    @Override
    public void f1_I1() {
        System.out.println("f1_I1");
    }

    @Override
    public void f2_I1() {
        System.out.println("f2_I1");
    }

    @Override
    public void f1_I2() {
        System.out.println("f1_I2");
    }

    @Override
    public void f2_I2() {
        System.out.println("f2_I2");
    }

    @Override
    public void f1_I3() {
        System.out.println("f1_I3");
    }

    @Override
    public void f2_I3() {
        System.out.println("f2_I3");
    }

    @Override
    public void function() {
        System.out.println("function");
    }
}
