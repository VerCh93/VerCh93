package Pirates;

import java.util.Random;

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
        if (hasWoodenLeg && (goldAmount < 15)) {
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
    public boolean isCaptain() {
        return false;
    }

    public void argue(Pirate pirate) {
        System.out.println(this.name + " is arguing with " + pirate.getName());
        Random random= new Random();
        switch (random.nextInt(2) + 1){
            case 1:
                System.out.println(this.name + " punched " + pirate.getName());
                break;
            case 2: System.out.println(pirate.getName() + " punched " + this.name);
                break;
        }
    }
    public void battle(Pirate pirate) {

    }


}
