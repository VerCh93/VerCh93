package Pirates;

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
    }
}
