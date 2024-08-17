package decorator;

public abstract class Beverage {

    private String description;
    private boolean soy;
    private boolean milk;
    private boolean mocha;
    private boolean whip;

    public Beverage(String description, boolean soy, boolean milk, boolean mocha, boolean whip) {
        this.description = description;
        this.soy = soy;
        this.milk = milk;
        this.mocha = mocha;
        this.whip = whip;
    }


    public abstract double cost();

    public Beverage() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
