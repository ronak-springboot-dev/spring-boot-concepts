package decorator.coffeetypes;

import decorator.Beverage;

public class Espresso extends Beverage {
    @Override
    public double cost() {
        return 80.99;
    }
}
