package baseToBase;

import java.util.Scanner;

public class BaseToBase {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int baseOfNumber = scanner.nextInt();
    int baseToConvert = scanner.nextInt();
    int convertedNumber = baseToBase(number, baseOfNumber, baseToConvert);
    System.out.println(convertedNumber);
    scanner.close();
  }

  public static int baseToBase(int number, int baseOfNumber, int baseToConvert) {
    int decimalNumber = baseToDecimal(number, baseOfNumber);
    int convertedNumber = decimalToBase(decimalNumber, baseToConvert);
    return convertedNumber;
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

  public static int decimalToBase(int decimalNumber, int base) {
    int baseNumber = 0;
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
