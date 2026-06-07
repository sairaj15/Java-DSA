package anyBaseSubtraction;

import java.util.Scanner;

public class AnyBaseSubtraction {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int base = scanner.nextInt();
    int biggerNumber = scanner.nextInt();
    int smallerNumber = scanner.nextInt();
    System.out.println(anyBaseSubtraction(base, biggerNumber, smallerNumber));
    scanner.close();
  }

  public static int anyBaseSubtraction(int base, int biggerNumber, int smallerNumber) {
    int power = 1;
    int carry = 0;
    int finalDigit;
    int result = 0;
    while (biggerNumber != 0 || smallerNumber != 0 || carry != 0) {
      int digitOfBiggerNumber = biggerNumber % 10;
      biggerNumber /= 10;
      int digitOfSmallerNumber = smallerNumber % 10;
      smallerNumber /= 10;
      if (digitOfSmallerNumber > digitOfBiggerNumber - carry) {
        finalDigit = digitOfBiggerNumber + base - digitOfSmallerNumber - carry;
        carry = 1;
      } else {
        finalDigit = digitOfBiggerNumber - digitOfSmallerNumber - carry;
        carry = 0;
      }
      result += finalDigit * power;
      power *= 10;
    }
    return result;
  }
}
