package ro.iteahome.java.practices.oop.composition.good;

import java.time.Instant;
import java.time.LocalDateTime;

public class Duck implements Flyable {

    private FlyTechnique flyTechnique = new FlyTechnique();

    private LocalDateTime lastLunch;

    public void setLastLunch(LocalDateTime lastLunch) {
        this.lastLunch = lastLunch;
    }

    @Override
    public int getNoOfWings() {
        return 2;
    }

    @Override
    public String getSourceOfPower() {
        return "food";
    }

    @Override
    public boolean hasEnoughEnergy() {
        return lastLunch.isAfter(LocalDateTime.now().minusHours(4));
    }

    @Override
    public void fly() throws InterruptedException {
        flyTechnique.apply(this);
    }
}
