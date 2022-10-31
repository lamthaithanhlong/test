package saiPackage;

public class Test1810mostOccurringNumber {
  public static void main(String[] args){
    System.out.println("Most occurring no. in {6,8,1,8,3} is " + answerTwo(new int[]{6,8,1,8,3}));
    System.out.println("Most occurring no. in {6,8,1,8,6} is " + answerTwo(new int[]{6,8,1,8,6}));
    System.out.println("Most occurring no. in {6,8,1,8,6,8} is " + answerTwo(new int[]{6,8,1,8,6,8}));
    System.out.println("Most occurring no. in {6,8,6,8,6,8} is " + answerTwo(new int[]{6,8,6,8,6,8}));
  }

  static int answerTwo(int[] a){
    int most_occur_num = 0, frequency = 0;

    for (int i=0; i<a.length; i++){

      int tmp_occur_num = 0, tmp_frequency = 0;

      for (int j=0; j<a.length; j++){
        if ( i!=j ){
          if (a[i] == a[j]){
            tmp_occur_num = a[i]; 
            tmp_frequency++;
          }
        }
      }
      if (frequency < tmp_frequency){
        most_occur_num = tmp_occur_num;
        frequency = tmp_frequency;
      }
    }
    return most_occur_num;
  }
}



/*package me.sekayasin;

public class Question14 {

    public static void main(String[] args) {
        System.out.println(mostOccurringNumber(new int[]{6,8,1,8,2}));
    }

    static int mostOccurringNumber(int[] a) {
        int counter = 0;
        int temp = 0;
        int mostOccurredNumber = a[0];
        int newLength = a.length;

        // loop to calculate the size of an array with no Duplicates
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    newLength--;
                    break;
                }
            }
        }

        // now we know the size of the array without duplicates
        int[] newArray = new int[newLength];
        newArray[0] = a[0];
        boolean isDuplicate;
        int idx = 1;

        // loop to populate the newArray with no Duplicates
        for (int i = 1; i < a.length; i++) {
            isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newArray[idx] = a[i];
                idx++;
            }
        }

        // compare the array with no Duplicates to the original array and return the most occurred number
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (newArray[i] == a[j]) {
                    counter++;
                }
            }
            if (counter >= temp) {
                temp = counter;
                mostOccurredNumber = newArray[i];
            }
            counter = 0;
        }
        return mostOccurredNumber;
    }
}
*/
