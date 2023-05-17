import java.util.Scanner;

public class Demo4 {
  public static void main(String[] arg) {

    Scanner scanner = new Scanner(System.in);

    String name = scanner.nextLine();

    System.out.print("Hello, ");
    System.out.print(name);
    System.out.println("!");

    scanner.close();
  }
}