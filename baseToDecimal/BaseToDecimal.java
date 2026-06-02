package baseToDecimal;

import java.util.Scanner;

public class BaseToDecimal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int base = scanner.nextInt();
    int decimalNumber = baseToDecimal(number, base);
    System.out.println(decimalNumber);
    scanner.close();
  }

  public static int baseToDecimal(int number, int base) {
    int power = 1;
    int decimalNumber = 0;
    while (number != 0) {
      int digit = number % 10;
      decimalNumber += digit * power;
      power *= base;
      number /= 10;
    }
    return decimalNumber;
  }
}
