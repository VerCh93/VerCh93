import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text:");
        String inputText = scanner.nextLine();

        if (inputText.length() > 16) {
            System.out.println("Lemme shorten your sentence...");
            String shortText = inputText.substring(0, 17);
            System.out.println("Here is your sentence shortened: " + shortText + "...");
        } else {
            System.out.println("Your text: " + inputText);
        }



    }
}
