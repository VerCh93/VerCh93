import java.util.Scanner;
import java.util.Arrays;
public class ConsonantsVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");

        int vowels = 0;
        int consonants = 0;
        int space = 0;

        System.out.println("Write something: ");
        String input = scanner.nextLine().toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'y' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch == ' ') {
                space++;
            } else {
                consonants++;
            }

        }
        System.out.printf("Number of vowels is %d and of consonants is %d. There are %d spaces.", vowels, consonants, space);

    }
}
