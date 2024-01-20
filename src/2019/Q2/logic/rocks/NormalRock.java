package logic.rocks;

import logic.zombies.Zombie;

public class NormalRock {
    protected int damage;

    NormalRock(int damage) {
        setDamage(damage);
    }

    public int dealDamage(Zombie zombie) {
        if (zombie.getDefense() >= damage)
            return 0;
        else
            return zombie.getDefense() + zombie.getHealth() - damage;
    }

    @Override
    public String toString() {
        return "NormalRock (" + getDamage() + ')';
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = Math.max(0, damage);
    }
}
