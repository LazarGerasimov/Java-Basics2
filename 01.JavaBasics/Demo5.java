import java.util.Scanner;

public class Demo5 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String a = scanner.nextLine();
    String b = scanner.nextLine();

    String c = "5";
    String d = "5";

    System.out.println(a.equals(b)); // returns true; compares values regardless of reference 
    System.out.println(a == b); // return false (as data comes from input); compares reference
    System.out.println(c == d); // returns true (as data comes from String Pool; compares reference);

    // String Pool == Storage in JVM Heap Memory; 

    scanner.close();
  }
}
