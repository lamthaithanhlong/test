package saiPackage;



public class Question375ncodeNumber{
    public static void main(String[] args){
        int number = 1200;
        int[] ret = encodeNumber(number);

//        if (ret.length == 0)
        if (ret == null)
            System.out.println(number + " : NULL");  
        else
            for (int data: ret)
                System.out.println(number + " : " + data);  
    }
  
    static int[] encodeNumber(int n){
    
        //if (n<2) return new int[0];
        if (n<2) return null;
    
        int     num  = n;
        int     count= 0;
        int     count_2= 0;
        boolean loop = true;
        int[] primeArray_temp = new int[0];
        int[] primeArray      = new int[0];
    
        for (int i=2; i<=n; i++){
          if (isPrime(i)==1){   // only when i is prime
            loop = true;
            count = 0;
            while(loop){
              if (num%i ==0){
                num = num/i;
                count++;
              }else{
                loop = false;
              }
            } // end of while
    
            primeArray_temp = new int[primeArray_temp.length + count];
            count_2 = primeArray.length;
    
            for(int j=0; j<primeArray.length; j++)
              primeArray_temp[j] = primeArray[j];



           for(int j=count_2; j<count_2+count; j++){
              primeArray_temp[j] = i;



           }
    
          } // end of if
          primeArray = primeArray_temp;
        }  // end of for



       return primeArray;
    
    }   // end of function
  
    
  
    static int isPrime(int p){
      int is_prime=1;
  
      for (int i=2; i<=p/2; i++)
        if (p%i ==0) is_prime=0;
  
      return is_prime;
    }
  
}