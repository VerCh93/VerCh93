package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Pirate> crew;

    public Ship() {
        this.crew = new ArrayList<>();
    }

    public int getCrewSize() {
        return crew.size();
    }

    public boolean addPirate(Pirate pirate) {
        if (pirate.isCaptain()) {
            for (Pirate captain : crew) {
                if (captain.isCaptain()) {
                    return false;
                }
            }
        }
        return crew.add(pirate);
    }

    public int getTotalGold() {
        int gold = 0;
        for (Pirate pirate : crew) {
            gold += pirate.getGoldAmount();
        }
        return gold;
    }
    public List<String> getPoorPirates() {
        List<String> names = new ArrayList<>();
        for (Pirate pirate : crew) {
            if (pirate.isPoor()) {
                names.add(pirate.getName());
            }
        }
        return names;
    }
    public void lastDayOnShip() {
        for (Pirate pirate : crew) {
            pirate.party();
        }
    }
    public void prepareForBattle() {
        for (Pirate pirate : crew) {
            for (int i = 0; i < 5; i++) {
                pirate.work();
            }
        }
        lastDayOnShip();

    }

}
