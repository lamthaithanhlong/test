// in some question paper, it is called Bunker ==> isBunker

package saiPackage.dev;

public class Test1810Smart {
    public static void main(String[] args){
        System.out.println("Is 11 smart : " + isSmart(11));
        System.out.println("Is 22 smart : " + isSmart(22));
        System.out.println("Is 08 smart : " + isSmart(8));

    }

    static int isSmart(int n){
        int ret =0;
        int num =1;
        int k   =1;

        while(num <= n){
            if (num == n) ret =1; 

            num +=k;
            k++;
        }

        return ret;
    }
}
