package decimalToBase;

import java.util.Scanner;

public class DecimalToBase {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int decimalNumber = scanner.nextInt();
    int base = scanner.nextInt();
    int baseNumber = 0;
    baseNumber = decimalToBase(decimalNumber, baseNumber, base);
    System.out.println(baseNumber);
    scanner.close();
  }

  public static int decimalToBase(int decimalNumber, int baseNumber, int base) {
    int power = 1;
    while (decimalNumber != 0) {
      int remainder = decimalNumber % base;
      baseNumber += remainder * power;
      power *= 10;
      decimalNumber /= base;
    }
    return baseNumber;
  }
}
