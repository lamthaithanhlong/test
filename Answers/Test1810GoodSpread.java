package saiPackage;

public class Test1810GoodSpread {
    public static void main(String[] args){
        System.out.println("{2, 1, 2, 5, 2, 1, 5, 9} : " + goodSpread(new int[]{2, 1, 2, 5, 2, 1, 5, 9}));
        System.out.println("{3, 1, 3 ,1, 3, 5, 5, 3} : " + goodSpread(new int[]{3, 1, 3 ,1, 3, 5, 5, 3}));

    }

    static int goodSpread(int[] a){
        int ret   =1;
        int count =0;

        for(int i=0; i<a.length; i++){
            count =1;
            for(int j=0; j<a.length; j++){
                if(i!=j)
                    if(a[i]==a[j]) count++;
            }
            if (count >3) {ret =0; break;}
        }

        return ret;
    }
}

/*
Write a function called goodSpread that returns 1 if no value in its array argument occurs more than 3 times in the array.
For example, goodSpread(new int[] {2, 1, 2, 5, 2, 1, 5, 9} returns 1 because no value occurs more than three times.
But goodSpread(new int[ ] {3, 1, 3 ,1, 3, 5, 5, 3} ) returns 0 because the value 3 occurs four times. If you are writing in Java or C#, the function signature is
int goodSpread (int[ ] a)
*/

