import java.util.Scanner;

public class Demo2 {
  public static void main(String[] arg) {

    // String randomStr = "a";
    // double randomNum = 5;
    // System.out.println(randomStr);
    // System.out.println(randomNum);

    Scanner scanner = new Scanner(System.in);
    
    try {
      String name = scanner.nextLine();
      System.out.println(name);
    } finally {
      in.close();
    }
  }
}