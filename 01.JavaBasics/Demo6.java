import java.util.Scanner;

public class Demo6 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Formatting strings
    // System.out.printf("%.2f", 123.254) === 123.25
    // %.2f === toFixed(2) in JS;

    // Math library same as JS Math

    // Process finished with exit code 0 === no errors in execution

    String randomString = "randomString";

    if (randomString.equals("randomString")) {
      String success = "Success";
      System.out.println(success);
    } else {
      System.out.println("Not Found");
    }

    scanner.close();
  }
}