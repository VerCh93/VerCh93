package Pirates;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Pirate jack = new Pirate("Jack", 0, 20, false);
        jack.work();
        jack.party();
        System.out.println(jack);

        Pirate smee = new Pirate("Mr. Smee", 0, 2, true);
        smee.party();
        smee.work();
        smee.work();
        smee.work();
        System.out.println(smee);

        Captain barbosa = new Captain("Barbosa", 0, 20, false);
        barbosa.work();
        barbosa.work();
        barbosa.work();
        barbosa.party();
        System.out.println(barbosa);

        Pirate frodo = new Pirate("Frodo", 0, 20, false);

        Ship ship = new Ship();
        ship.addPirate(jack);
        ship.addPirate(smee);
        System.out.println(ship.addPirate(barbosa));
        System.out.println(ship.addPirate(frodo));

        System.out.println("Number of crew members: " + ship.getCrewSize());

        System.out.println(ship.getTotalGold());

        for (String name : ship.getPoorPirates()) {
            System.out.println(name);
        }

        ship.lastDayOnShip();
        System.out.println(barbosa);


        ship.prepareForBattle();
        System.out.println(barbosa);

        smee.argue(jack);
        smee.argue(jack);
        smee.argue(jack);
        smee.argue(jack);
        smee.argue(jack);
        smee.argue(jack);

    }
}
