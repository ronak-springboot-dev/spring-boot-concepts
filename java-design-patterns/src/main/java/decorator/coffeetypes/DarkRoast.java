package decorator.coffeetypes;

import decorator.Beverage;

public class DarkRoast extends Beverage {


    @Override
    public double cost() {
        return 0;
    }
}
