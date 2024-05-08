import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Animals {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(Path.of("C:\\Users\\chlum\\Dropbox\\IntellijProjects\\BabySteps\\src\\main\\java\\animals.txt"));
        double heaviest = 0;
        String heaviestAnimal = "";
        while(sc.hasNext()) {
            String line = sc.nextLine();
            String[] animals = line.split(":");
            String animalName = animals[0].trim();
            double weight = Double.parseDouble(animals[1].trim().split(" ")[0]);
            if (weight > heaviest) {
                heaviest = weight;
                heaviestAnimal = animalName;
            }
        }
        System.out.printf("The heaviest animal is the %s with a weight of %f kg", heaviestAnimal, heaviest);
    }
}
