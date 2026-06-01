import java.util.Scanner;

public class DigitFrequency {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int digit = scanner.nextInt();
    scanner.close();
    digitFrequency(number, digit);
  }

  public static void digitFrequency(int number, int digit) {
    int count = 0;
    while (number != 0) {
      int numberToCheck = number % 10;
      if (numberToCheck == digit)
        count++;
      number = number / 10;
    }
    System.out.println(count);
  }
}
