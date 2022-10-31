package saiPackage;

public class Question32doIntegerBasedRounding{
    public static void main(String[] args){
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}     , 2);
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}     , 3);
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}     , -3);
        doIntegerBasedRounding(new int[]{-1, -2, -3, -4, -5}, 3);
        doIntegerBasedRounding(new int[]{-18, 1, 2, 3, 4, 5}, 4);
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}     , 5);
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}     ,100);
    }

    static void doIntegerBasedRounding(int[] a, int n){

        int[] result = new int[a.length];
        int temp   =0;
        boolean loop = false;

        if (n<=0)
            result = a;
        else{
            for(int i = 0;i<a.length;i++){
                if(a[i] >= 0){
                    int lowerBound = (a[i]/n)*n;
                    int upperBound = lowerBound +n;
                    int middleElement = n%2==0 ? lowerBound + n/2 : lowerBound + n/2 +1;
                    if(a[i] >= middleElement) result[i] = upperBound;
                    else result[i] = lowerBound;
                }else
                    result[i] = a[i];
            } // end of for
        }  // end of else

        System.out.print("Base " + n + " of Old Array is : {");
        for (int i=0; i<a.length; i++) 
            if (i<a.length-1)
                System.out.print(a[i] + ", ");
            else
                System.out.print(a[i] + "}\n");

        System.out.print("Base " + n + " of New Array is : {");
        for (int i=0; i<result.length; i++) 
            if (i<result.length-1)
                System.out.print(result[i] + ", ");
            else
                System.out.print(result[i] + "}\n");

        System.out.println("");

    }


}
