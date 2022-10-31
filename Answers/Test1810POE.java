package saiPackage;

public class Test1810POE {
  public static void main(String[] args){
    System.out.println("POE is " + poe(new int[]{1,8,3,7,10,2}) + " for {1,8,3,7,10,2}");
    System.out.println("POE is " + poe(new int[]{1,5,3,1,1,1,1,1,1}) + " for {1,5,3,1,1,1,1,1,1}");
    System.out.println("POE is " + poe(new int[]{2,1,1,1,2,1,7}) + " for {2,1,1,1,2,1,7}");
    System.out.println("POE is " + poe(new int[]{1,2,3}) + " for {1,2,3}");
    System.out.println("POE is " + poe(new int[]{3,4,5,10}) + " for {3,4,5,10}");
    System.out.println("POE is " + poe(new int[]{1,2,10,3,4}) + " for {1,2,10,3,4}");
  }

  static int poe(int[] numbers){

    if (numbers.length < 3) return -1;
    
    int idx = 1;

    int left = 0;
    int right = numbers.length - 1;

    int leftSum = numbers[left];
    int rightSum = numbers[right];
   
    for (int i=1; i<numbers.length - 2; i++){
      if (leftSum < rightSum){
        left++;
        leftSum += numbers[left];
        idx = left + 1;   
      }else{
        right--;
        rightSum += numbers[right];
        idx = right - 1;
      } // end of if 
    }  // end of for

    if (leftSum == rightSum) 
      return idx ;
    else
      return -1;
  } // end of POE function
}










/*package me.sekayasin;

public class Question6 {

    public static void main(String[] args) {
        System.out.println(poe(new int[]{1,8,3,7,10,2}));
    }

    static int poe(int[] numbers) {
        if (numbers.length < 3) return -1;
        int i = 0;
        int j = numbers.length - 1;
        int idx = 1;
        int leftSum = numbers[i];
        int rightSum = numbers[j];
        for (int k = 1; k < numbers.length - 2; k++ ){
            if (leftSum < rightSum) {
                i++;
                leftSum += numbers[i];
                idx = i + 1;
            } else {
                j--;
                rightSum += numbers[j];
                idx = j - 1;
            }
        }
        if (leftSum == rightSum)
            return idx;
        else
            return -1;
    }

}
*/
