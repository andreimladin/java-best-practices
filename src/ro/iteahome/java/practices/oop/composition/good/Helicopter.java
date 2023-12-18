package ro.iteahome.java.practices.oop.composition.good;

public class Helicopter implements Flyable{

    private FlyTechnique flyTechnique = new FlyTechnique();

    private int fuel;

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public int getNoOfWings() {
        return 0;
    }

    @Override
    public String getSourceOfPower() {
        return "oil";
    }

    @Override
    public boolean hasEnoughEnergy() {
        return fuel > 10;
    }

    @Override
    public void fly() throws InterruptedException {
        flyTechnique.apply(this);
    }
}
