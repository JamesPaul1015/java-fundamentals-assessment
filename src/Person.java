import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("Please Enter your last name");
        String lastName = scanner.nextLine();
        System.out.println(firstName + " " + lastName);
    }
}

