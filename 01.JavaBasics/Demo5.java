import java.util.Scanner;

public class Demo5 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String a = scanner.nextLine();
    String b = scanner.nextLine();

    System.out.println(a.equals(b)); // returns true; compares values
    System.out.println(a == b); // return false; compares reference

    scanner.close();
  }
}
