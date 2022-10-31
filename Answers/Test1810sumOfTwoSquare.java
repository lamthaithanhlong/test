// This Question is the same as Question47
// This Question is the same as Question47
// This Question is the same as Question47

package saiPackage;

public class Question13sumOfTwoSquare{
  public static void main(String[] args){
    int ret = 0;

    if (answerOne(50) == 1)
      System.out.println(50 + ": can be expressed as a sum of two squares in exactly two different ways");
    else
      System.out.println(50 + ": cannot be expressed as a sum of two squares in exactly two different ways");
    if (answerOne(20) == 1)
      System.out.println(20 + ": can be expressed as a sum of two squares in exactly two different ways");
    else
      System.out.println(20 + ": cannot be expressed as a sum of two squares in exactly two different ways");
    if (answerOne(30) == 1)
      System.out.println(30 + ": can be expressed as a sum of two squares in exactly two different ways");
    else
      System.out.println(30 + ": cannot be expressed as a sum of two squares in exactly two different ways");

  }

  static int answerOne(int n){
    int count=0;
    for (int i=0; i<=n/2; i++){
      for (int j=0; j<=n/2; j++){
        if (n == i*i + j*j){
          count++;
          System.out.println("   " + n + " = " + i + "^2 + " + j + "^2");
        }
      }
    }
    if (count > 1)
      return 1;
    else 
      return 0;
  }
}




/*
package saiPackage;

public class Question13sumOfTwoSquare {

    public static void main(String[] args) {
        System.out.println(expressedAsSumOfTwoSquares(50));
        System.out.println(expressedAsSumOfTwoSquares(20));
        System.out.println(expressedAsSumOfTwoSquares(30));
    }

    static String expressedAsSumOfTwoSquares(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++) {
                if (n == i * i + j * j)
                    return n + " = " + i + "^2 + " + j + "^2";
            }
        }
        return n + " cannot be expressed as a sum of two squares";
    }
}
*/
