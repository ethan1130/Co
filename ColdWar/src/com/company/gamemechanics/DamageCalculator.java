package com.company.gamemechanics;

    import java.util.Random;

public class DamageCalculator {

    public static int calculateDamage(int health, int maxDamage) {
        Random random = new Random();
        int damage = random.nextInt(maxDamage);
        System.out.println("Damage taken: " + damage);
        return health - damage;
    }
}
