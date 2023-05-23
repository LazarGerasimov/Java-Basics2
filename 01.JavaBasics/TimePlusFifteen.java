import java.util.Scanner;

public class TimePlusFifteen {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // receives current time as input

    // should output current time + fifteen minutes in time format with decimal
    // integer conversion

    int hours = Integer.parseInt(scanner.nextLine());
    int minutes = Integer.parseInt(scanner.nextLine());

    int totalMinutes = hours * 60 + minutes + 15;

    int newTimeHours = totalMinutes / 60;
    int newTimeMinutes = totalMinutes - (newTimeHours * 60); // or totalMinutes % 60 to return the remainder

    if (newTimeHours > 23) {
      newTimeHours = 0;
      System.out.printf("%d:%02d", newTimeHours, newTimeMinutes);
    } else {
      System.out.printf("%d:%02d", newTimeHours, newTimeMinutes);
    }

    // %02d performs decimal integer conversion d, formatted with zero padding (0
    // flag), with width 2.

    scanner.close();
  }
}