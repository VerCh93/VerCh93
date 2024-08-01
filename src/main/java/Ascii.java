public class Ascii {
    public static void main(String[] args) {
        char znak;

        System.out.println("ASCII tabulka");
        for (int hodnotaAscii = 33; hodnotaAscii < 256; hodnotaAscii++) {
            znak = (char)hodnotaAscii;
            System.out.printf("%d:%c%n", hodnotaAscii, znak);
        }
    }
}
