package decorator.coffeetypes;

import decorator.Beverage;

public class Decaf extends Beverage {
    @Override
    public double cost() {
        return 0;
    }
}
