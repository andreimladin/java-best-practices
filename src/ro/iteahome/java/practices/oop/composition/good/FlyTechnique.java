package ro.iteahome.java.practices.oop.composition.good;

public class FlyTechnique {

    public void apply(Flyable flyable) throws InterruptedException {
        System.out.println("-----------------------------");
        System.out.println("Starting the flying procedure.....");
        Thread.sleep(1000);
        System.out.println("Checking the wings: " + flyable.getNoOfWings());
        Thread.sleep(1000);
        System.out.println("Checking the energy required for a flight");
        Thread.sleep(1000);

        if (flyable.hasEnoughEnergy()) {
            System.out.println("Procedure completed");
            System.out.println("The flight has just started");
        } else {
            System.out.println("!!!!Start procedure failed due to low energy. Please get more: " + flyable.getSourceOfPower());
        }
        System.out.println("-----------------------------");
    }

}
