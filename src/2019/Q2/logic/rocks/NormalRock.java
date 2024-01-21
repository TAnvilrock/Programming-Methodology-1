package logic.rocks;

import logic.zombies.Zombie;

public class NormalRock {
    protected int damage;

    public NormalRock(int damage) {
        setDamage(damage);
    }

    public int dealDamage(Zombie zombie) {
        if (zombie.getDefense() >= damage)
            return 0;
        else
            zombie.setHealth(Math.max(0, zombie.getHealth() - Math.abs(zombie.getDefense() - damage)));
        return Math.min(Math.abs(zombie.getDefense() - damage), damage);
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
