package saiPackage;

public class Test1810StackedNumber {
    public static void main(String[] args){
        System.out.println("Is 01 Stacked : " + isStacked(1));
        System.out.println("Is 02 Stacked : " + isStacked(2));
        System.out.println("Is 03 Stacked : " + isStacked(3));
        System.out.println("Is 07 Stacked : " + isStacked(7));
        System.out.println("Is 08 Stacked : " + isStacked(8));
        System.out.println("Is 09 Stacked : " + isStacked(9));
        System.out.println("Is 10 Stacked : " + isStacked(10));
        System.out.println("Is 15 Stacked : " + isStacked(15));
        System.out.println("Is 20 Stacked : " + isStacked(20));
    }

    static int isStacked(int n){
        int stackNum =0;
        int counter  =0;

        while (stackNum < n){
            stackNum += counter;
            counter++;
        }
        if (stackNum == n) return 1;
        else return 0;
    }

}
