package saiPackage;

public class Question68UpdateMilage{
    public static void main(String[] args){
        int[] a = new int[]{8, 9, 9, 5, 0};
        updateMileageCounter(a, 1);
        System.out.print("Milage of {8, 9, 9, 5, 0}, 1        : {" + a[0]);
        printMilage(a);

        a = new int[]{8, 9, 9, 5, 0};
        updateMileageCounter(a, 2);
        System.out.print("Milage of {8, 9, 9, 5, 0}, 2        : {" + a[0]);
        printMilage(a);

        a = new int[]{9,9,9,9,9,9,9,9,9,9};
        updateMileageCounter(a, 1);
        System.out.print("Milage of {9,9,9,9,9,9,9,9,9,9}, 1  : {" + a[0]);
        printMilage(a);

        a = new int[]{9,9,9,9,9,9,9,9,9,9};
        updateMileageCounter(a, 13);
        System.out.print("Milage of {9,9,9,9,9,9,9,9,9,9}, 13 : {" + a[0]);
        printMilage(a);
    }

    static void updateMileageCounter(int[] a, int miles){

        a[0] += miles;

        for(int i=0; i<a.length; i++){
            if (a[i]>9){
                if (i < a.length-1)
                    a[i+1] += a[i]/10;

                a[i]    = a[i]%10;
            }
        }
    }

    static void printMilage(int[] a){
        
        for(int i=1; i<a.length; i++)
            System.out.print(", " + a[i]);

        System.out.print("}\n");
    }
}


