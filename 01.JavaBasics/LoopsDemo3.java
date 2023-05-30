import java.util.Scanner;

public class LoopsDemo3 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int number = 1; 

    while (number <= 10) {
      System.out.println(number);
      number++;
      //same as JS while 
    }

    scanner.close();
  }
}