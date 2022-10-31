package saiPackage.dev;

public class Test1810SumSafe {
    public static void main(String[] args){
        System.out.println("{5,-5,0} : " + isSumSafe(new int[]{5,-5,0}));
        System.out.println("{5,-2,1} : " + isSumSafe(new int[]{5,-2,1}));
    }

    static int isSumSafe(int[] a){
        int total =0;
        int found =0;

        for (int i=0; i<a.length; i++)
            total +=a[i];

        for (int i=0; i<a.length; i++)
            if (total ==a[i]) found =1;

        return found;
    }

}
