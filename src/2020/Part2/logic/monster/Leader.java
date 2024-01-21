package logic.monster;

import logic.attack.Attack;

public class Leader extends Monster {
    private int maxChargeTurns;
    private int currentChargeTurns;
    private boolean isGuard;

    public Leader(String name, int hp, int def, int sp_def, Attack attack, int chargeTurns) {
        super(name, hp, def, sp_def, attack);
        setMaxChargeTurns(chargeTurns);
        setCurrentChargeTurns(0);
    }

    public int takeDamage(Attack attack) {
        if (isGuard()) return 0;
        else if (attack.isLeader()) {
            if (getHp() - attack.calculateDamage(this) <= 0)
                setDead(true);
            return super.takeDamage(attack);
        } else {
            if (getHp() - attack.getPower() <= 0)
                setDead(true);
            return (int) Math.ceil(attack.calculateDamage(this) * 0.5);
        }
    }

    public int getMaxChargeTurns() {
        return maxChargeTurns;
    }

    public void setMaxChargeTurns(int maxChargeTurns) {
        this.maxChargeTurns = maxChargeTurns;
    }

    public int getCurrentChargeTurns() {
        return currentChargeTurns;
    }

    public void setCurrentChargeTurns(int currentChargeTurns) {
        this.currentChargeTurns = Math.max(0, Math.min(currentChargeTurns, maxChargeTurns));
    }

    public boolean isGuard() {
        return isGuard;
    }

    public void setGuard(boolean guard) {
        isGuard = guard;
    }
}
