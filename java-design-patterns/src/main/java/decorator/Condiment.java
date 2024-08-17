package decorator;

/**
 * Inheritance is being used for the type matching but for the behavior we are providing has-a relationship
 */
public abstract class Condiment extends Beverage {

     protected Beverage beverage;


    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
