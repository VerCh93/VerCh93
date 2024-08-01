package Person;

import java.util.Scanner;
public class PersonInstances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        Person person = new Person ();
        System.out.println("Type name:");
        String name = scanner.nextLine();
        person.setName(name);

        System.out.println("Type email:");
        String email = scanner.nextLine();
        person.setEmail(email);

        System.out.println("Type age: ");
        int age = Integer.parseInt(scanner.nextLine());
        person.setAge(age);

        System.out.println("Person Details: ");
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

    }
}
