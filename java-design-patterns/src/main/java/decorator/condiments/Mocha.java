package decorator.condiments;

import decorator.Beverage;
import decorator.Condiment;

public class Mocha extends Condiment {


    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost() + 20;
    }

    public Mocha() {
    }

    public Mocha(Beverage beverage) {
        this.beverage = beverage;

    }


}
