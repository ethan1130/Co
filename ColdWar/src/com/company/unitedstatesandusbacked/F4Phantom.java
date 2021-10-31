package com.company.unitedstatesandusbacked;

import com.company.gamemechanics.HealthMechanics;

public class F4Phantom implements HealthMechanics {

    private static final int NAPALM_DAMAGE = 400;
    private static int F4_PHANTOM_STARTING_HEALTH = 350 + NAPALM_DAMAGE;
    private static final int F4_PHANTOM_DAMAGE = 450;
    int f4PhantomHealth;


    @Override
    public int getHealth() {
        return F4_PHANTOM_STARTING_HEALTH;
    }

    @Override
    public int getDamage() {
        return F4_PHANTOM_DAMAGE;
    }

    @Override
    public void setInitialHealth() {
        this.f4PhantomHealth = F4_PHANTOM_STARTING_HEALTH;
    }
}
