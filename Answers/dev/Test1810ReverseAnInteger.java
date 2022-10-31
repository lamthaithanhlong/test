package saiPackage.dev;

public class Test1810ReverseAnInteger {
  public static void main(String args[]){
    System.out.println("1234   : " + reverseIntWithNumericOps(1234));
    System.out.println("12005  : " + reverseIntWithNumericOps(12005));
    System.out.println("1      : " + reverseIntWithNumericOps(1));
    System.out.println("1000   : " + reverseIntWithNumericOps(1000));
    System.out.println("0      : " + reverseIntWithNumericOps(0));
    System.out.println("-12345 : " + reverseIntWithNumericOps(-12345));
  }

  static int reverseIntWithNumericOps(int number){
    int reverse=0;

    if (number == 0) return 0;

    while (number != 0){
      reverse = (reverse*10) + (number%10);
      number /= 10;
    }
    return reverse;
  }
}
