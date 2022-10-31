/*
A Meera number is a number such that the number of nontrivial factors is a factor of the number.
For example, 6 is a Meera number because 6 has two nontrivial factors : 2 and 3. (A nontrivial factor
is a factor other than 1 and the number). Thus 6 has two nontrivial factors. Now, 2 is a factor of 6.
Thus the number of nontrivial factors is a factor of 6. Hence 6 is a Meera number. Another Meera
number is 30 because 30 has 2, 3, 5, 6, 10, 15 as nontrivial factors. Thus 30 has 6 nontrivial factors.
Note that 6 is a factor of 30. So 30 is a Meera Number. However 21 is not a Meera number. The
nontrivial factors of 21 are 3 and 7. Thus the number of nontrivial factors is 2. Note that 2 is not a
factor of 21. Therefore, 21 is not a Meera number.
*/



package saiPackage.dev;



public class Test1810MeeraNumber {
    public static void main(String[] args){
        System.out.println("Is  6 Meera Number : " + isMeera(6));
        System.out.println("Is 30 Meera Number : " + isMeera(30));
        System.out.println("Is 21 Meera Number : " + isMeera(21));
    }



   static int isMeera(int n){
        int count =0;
        int ret   =1;



       for(int i=2; i<=n/2; i++){
            if(n%i ==0) count++;
        }



       if(n%count !=0) ret =0;



       return ret;
    }
}
