package saiPackage;

public class Question38isOnionArrray{
    public static void main(String[] args){
        System.out.println("Is {1, 2, 19, 4, 5} Onion Array : " + isOnionArray(new int[]{1, 2, 19, 4, 5}));
        System.out.println("Is {1, 2, 3, 4, 15} Onion Array : " + isOnionArray(new int[]{1, 2, 3, 4, 15}));
        System.out.println("Is {1, 3, 9, 8} Onion Array : " + isOnionArray(new int[]{1, 3, 9, 8}));
        System.out.println("Is {2} Onion Array : " + isOnionArray(new int[]{2}));
        System.out.println("Is {} Onion Array : " + isOnionArray(new int[]{}));
        System.out.println("Is {-2, 5, 0, 5, 12} Onion Array : " + isOnionArray(new int[]{-2, 5, 0, 5, 12}));
    }

    static int isOnionArray(int[] a){
        if (a.length == 0)            return 1;
        if (a.length == 1 && a[0]<10) return 1;

        for (int j=0, k=a.length-1; j<k; j++, k--){
            if (a[j]+a[k] > 10) return 0;
        }
        return 1;
    }

}
