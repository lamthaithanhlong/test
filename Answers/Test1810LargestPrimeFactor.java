package saiPackage;

public class Question74LargestPrimeFactor{
  public static void main(String[] args ){
    System.out.println("Largest Prime Factor of   10 is : " + largestPrimeFactor(10));
    System.out.println("Largest Prime Factor of 6936 is : " + largestPrimeFactor(6936));
    System.out.println("Largest Prime Factor of    1 is : " + largestPrimeFactor(1));
  }

 static int largestPrimeFactor(int n){
    if (n<2) return 0;  // Prime starts from 2;

   int largestPrime=2;

   for (int i=2; i<=n; i++)
      if (n%i == 0) //it is a factor of n
        if (isPrime(i) == 1) largestPrime=i;
    return largestPrime;
 }

 static int isPrime(int p){
    int is_prime = 1;

   for (int i=2; i<=p/2; i++)
      if ( p%i ==0) is_prime =0;
   
    return is_prime;
  }
}