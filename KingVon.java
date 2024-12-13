public class KingVon extends Adventurer {
    private int rage, rageMax, bars;
    public KingVon(String name, int HP, int damageAmount, int healAmount, int rage, int rageMax, int bars) {
        super(name, HP, damageAmount, healAmount);
        this.rage = rage;
        this.rageMax = rageMax;
        this.bars = bars;
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
        other.applyDamage(this.getDamageAmount());
        return this.getName() + " successfully hit up" + other.getName() + " for " + this.getDamageAmount();
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