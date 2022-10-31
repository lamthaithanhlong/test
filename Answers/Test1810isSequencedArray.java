package saiPackage;



public class Question73isSequencedArray{
  public static void main(String[] args){
   System.out.println("Is ({1, 2, 3, 4, 5}, 1, 5)    sequenced array : " + isSequencedArray(new int[]{1, 2, 3, 4, 5}, 1, 5));
    System.out.println("Is ({1, 3, 4, 2, 5}, 1, 5)    sequenced array : " + isSequencedArray(new int[]{1, 3, 4, 2, 5}, 1, 5));
    System.out.println("Is ({-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2) sequenced array : " + isSequencedArray(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2));
    System.out.println("Is ({0, 1, 2, 3, 4, 5}, 1, 5) sequenced array : " + isSequencedArray(new int[]{0, 1, 2, 3, 4, 5}, 1, 5));
    System.out.println("Is ({1, 2, 3, 4}, 1, 5)       sequenced array : " + isSequencedArray(new int[]{1, 2, 3, 4}, 1, 5));
    System.out.println("Is ({1, 2, 5}, 1, 5)          sequenced array : " + isSequencedArray(new int[]{1, 2, 5}, 1, 5));
    System.out.println("Is ({5, 4, 3, 2, 1}, 1, 5)    sequenced array : " + isSequencedArray(new int[]{5, 4, 3, 2, 1}, 1, 5));
  }

 static int isSequencedArray(int[] a, int m, int n){

   if (m > n)     return 0;
    if (m != a[0]) return 0;
    if (n != a[a.length-1]) return 0;

   int diff = Math.abs(n-m);
    diff++;

   if (a.length < diff) return 0;

   int prev = a[0];
    int next    = prev+1;
    int result  = 1;

   for(int i=1; i<a.length-1; i++){
      if (a[i]!=next && a[i]!=prev){
        result =0;
        break;
      }

     if (a[i] == next) {
        prev = a[i];
        next   +=1;
      }
    }
   return result;
 }
}