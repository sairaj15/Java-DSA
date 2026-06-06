package basetobaseaddition;

import java.util.Scanner;

public class BaseToBaseAddition {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int base = scanner.nextInt();
    int firstNumber = scanner.nextInt();
    int secondNumber = scanner.nextInt();
    System.out.println(baseToBaseAddition(base, firstNumber, secondNumber));
    scanner.close();
  }

  public static int baseToBaseAddition(int base, int firstNumber, int secondNumber) {
    int overflow = 0;
    int result = 0;
    int finalDigit;
    int power = 1;

    while (firstNumber != 0 || secondNumber != 0 || overflow != 0) {
      int digitOfFirstNumber = firstNumber % 10;
      firstNumber /= 10;
      int digitOfSecondNumber = secondNumber % 10;
      secondNumber /= 10;
      int digitAdditionResult = digitOfFirstNumber + digitOfSecondNumber + overflow;
      overflow = digitAdditionResult / base;
      if (digitAdditionResult >= base) {
        finalDigit = digitAdditionResult - base;
      } else
        finalDigit = digitAdditionResult;
      result += finalDigit * power;
      power *= 10;
    }
    return result;
  }
}
