package ro.iteahome.java.practices.oop.composition.good;

public interface Flyable {

    int getNoOfWings();

    String getSourceOfPower();

    boolean hasEnoughEnergy();

    void fly() throws InterruptedException;
}
