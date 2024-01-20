package logic.rocks;

import logic.zombies.Zombie;

public class PoisonRock extends NormalRock {
    private int damageOverTime;

    public PoisonRock(int damage, int damageOverTime) {
        super(damage);
        setDamageOverTime(damageOverTime);
    }

    @Override
    public int dealDamage(Zombie zombie) {
        zombie.setDecay(damageOverTime);
        return Math.max(0 ,  damage - zombie.getDefense() );
    }

    @Override
    public String toString() {
        return "PoisonRock (" + getDamage() + ", DoT = " + getDamageOverTime();
    }

    public int getDamageOverTime() {
        return damageOverTime;
    }

    public void setDamageOverTime(int damageOverTime) {
        this.damageOverTime = Math.max(0, damageOverTime);
    }
}
