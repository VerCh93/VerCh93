package Pirates;

public class Captain extends Pirate{

    public Captain(String name, int goldAmount, int healthPoints, boolean hasWoodenLeg) {
        super(name, goldAmount, healthPoints, hasWoodenLeg);
    }
    public void party() {
        healthPoints += 5;
    }
    public void work() {
        goldAmount += 4;
        healthPoints -= 3;
    }
    @Override
    public boolean isCaptain() {
        return true;
    }
}
