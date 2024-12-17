public class ODweller extends Adventurer{
    private int rage = 20;
    private int rageMax = 100;

    public ODweller(String name) {
        super(name, 10, 50);
    }
    public ODweller(String name, int HP, int damageAmount, int healAmount, int rage, int rageMax, int bars) {
        super(name, HP, damageAmount, healAmount);
        this.rage = rage;
        this.rageMax = rageMax;
    }

    public String getSpecialName() {
        return "Rage";
    }

    public int getSpecial() {
        return rage;
    }

    public void setSpecial(int n) {
        this.rage = n;
    }

    public int getSpecialMax() {
        return rageMax;
    }

    public String attack(Adventurer other) {
        if (rage == 0) {
            other.applyDamage(this.getDamageAmount());
            return this.getName() + " successfully hit up" + other.getName() + " for " + this.getDamageAmount();
        } else {
            other.applyDamage(this.getDamageAmount() + 10);
            rage --;
            return this.getName() + " successfully hit up" + other.getName() + " for " + (this.getDamageAmount() + 10);
        }
    }

    public String support(Adventurer other) {
        other.applyHeal(this.getHealAmount());
        return this.getName() + " successfully perc'd up " + other.getName() + " for " + this.getHealAmount();
    }

    public String support() {
        this.applyHeal(this.getHealAmount());
        return this.getName() + " successfully perc'd up yoself for " + this.getHealAmount() + " homie!";
    }

    public String specialAttack(Adventurer other) {
        for (Adventurer homie: Driver.getppl()) {
            if (homie.equals(other)) {
                continue;
            } else {
                this.attack(homie);
            }
        }
        return this.getName() + " successfully rapped everyone up cuh!";
    }
}
