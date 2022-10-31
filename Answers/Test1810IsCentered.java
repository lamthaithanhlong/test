package saiPackage;

public class Question01IsCentered {

    public static void main(String[] args) {
        System.out.println("{3,2,1,4,1} : " + isCentered(new int[]{3,2,1,4,1}));
        System.out.println("{3,2,1,4,5} : " + isCentered(new int[]{3,2,1,4,5}));
        System.out.println("{3,2,1,4,1} : " + isCentered(new int[]{3,2,1,4,1}));
        System.out.println("{1,2,3,4}   : " + isCentered(new int[]{1,2,3,4}));
        System.out.println("{}          : " + isCentered(new int[]{}));
        System.out.println("{10}        : " + isCentered(new int[]{10}));
    }

    static int isCentered(int[] items) {
        if (items.length == 0 || items.length % 2 == 0)
            return 0;
        int midIndex = items.length / 2;
        int middleItem = items[midIndex];
        for (int i = 0; i < items.length; i++) {
            if (i != midIndex && middleItem >= items[i])
                return 0;
        }
        return 1;
    }
}
