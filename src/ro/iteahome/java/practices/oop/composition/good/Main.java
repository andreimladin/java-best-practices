package ro.iteahome.java.practices.oop.composition.good;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Duck duck = new Duck();
        duck.setLastLunch(LocalDateTime.MIN);
        System.out.println("Duck wants to fly");
        duck.fly();
        System.out.println("Let's feed the duck");
        duck.setLastLunch(LocalDateTime.now());
        System.out.println("Duck ready to fly");
        duck.fly();

        Helicopter helicopter = new Helicopter();
        System.out.println("Helicopter wants to fly");
        helicopter.fly();
        System.out.println("Let's put some oil");
        helicopter.setFuel(50);
        System.out.println("Helicopter ready now to fly");
        helicopter.fly();

    }
}
