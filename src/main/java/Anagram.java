
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Input first word:");
        String word = scanner.nextLine();
        System.out.println("Input second word:");
        String word2 = scanner.nextLine();

        if (word.length() != word2.length()) {
            System.out.println("Not an anagram");
        }

        boolean isAnagram = true;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
        }
        for (int j = 0; j < word2.length(); j++) {
            char ch2 = word2.charAt(j);
        }




    }
}
