package com.company.gamemechanics;

public interface HealthMechanics {
    int getHealth();
    int getDamage();
    void setInitialHealth();
    void setHealthAfterDamage(int healthAfterDamage);
}
