import java.util.Scanner;

public class Demo3 {
  public static void main(String[] arg) {

    Scanner scanner = new Scanner(System.in);

    // String input = scanner.nextLine();
    // int number = Integer.parseInt(input);

    int inputNumber = Integer.parseInt(scanner.nextLine());
    int randomNumber = Integer.parseInt(scanner.nextLine());

    int result = inputNumber + randomNumber;

    System.out.println(result);
    scanner.close();
  }
}