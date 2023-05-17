import java.util.Scanner;

public class Demo4 {
  public static void main(String[] arg) {

    Scanner scanner = new Scanner(System.in);

    // String name = scanner.nextLine();

    // System.out.print("Hello, ");
    // System.out.print(name);
    // System.out.println("!");

    // System.out.println("Hello " + name + "!");

    String firstName = scanner.nextLine();
    String lastName = scanner.nextLine();
    int age = Integer.parseInt(scanner.nextLine());
    String town = scanner.nextLine();

    System.out.printf("%s %s, %d, %s", firstName, lastName, age, town);

    scanner.close();
  }
}