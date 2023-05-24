import java.util.Scanner;

public class LoopsDemo{
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String text = scanner.nextLine();

    for (int index = 0; index <= text.length() - 1; index++) {
      System.out.println(text.charAt(index));
    }


    scanner.close();
  }
}