package Pirates;

public class Pirate {
    protected String name;
    protected int goldAmount = 0;
    protected int healthPoints = 20;
    protected boolean hasWoodenLeg = false;

    protected boolean isDying = false;

    public Pirate(String name, int goldAmount, int healthPoints, boolean hasWoodenLeg){
        this.name = name;
        this.goldAmount = goldAmount;
        this.healthPoints = healthPoints;
        this.hasWoodenLeg = hasWoodenLeg;
    }

    public String getName() {
        return name;
    }

    public int getGoldAmount() {
        return goldAmount;
    }
    public boolean isPoor() {
        if (!hasWoodenLeg && (goldAmount < 15)) {
            return true;
        } else {
            return false;
        }
    }
    public void work() {
        goldAmount += 1;
        healthPoints -= 1;
        if (healthPoints <= 0) {
            healthPoints = 0;
            isDying = true;
        }
    }
    public void party() {
        healthPoints += 1;
    }
    @Override
    public String toString() {
        if (hasWoodenLeg) {
            if (isDying) {
                return "Hello! I'm " + getName() + ", I have a wooden leg, " + getGoldAmount() + " gold, and I'm dying...";
            } else {
                return "Hello! I'm " + getName() + ", I have a wooden leg, " + getGoldAmount() + " gold, and health at " + healthPoints;
            }
        } else {
            return "Hello! I'm " + getName() + ", I still have my real legs, " + getGoldAmount() + " gold, and health at " + healthPoints;
        }
    }
}
