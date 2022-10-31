package saiPackage.dev;

public class Test1810ClusterCompression {
    public static void main(String[] args){
        int[] a;

       System.out.print("\n{0, 0, 0, 2, 0, 2, 0, 2, 0, 0}          : " );
        a = clusterCompression(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0});
        displayArray(a);

       System.out.print("\n{18}                                    : " );
        a = clusterCompression(new int[]{18});
        displayArray(a);

       System.out.print("\n{}                                      : " );
        a = clusterCompression(new int[]{});
        displayArray(a);

       System.out.print("\n{-5, -5, -5, -5, -5}                    : " );
        a = clusterCompression(new int[]{-5, -5, -5, -5, -5});
        displayArray(a);

       System.out.print("\n{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1} : " );
        a = clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1});
        displayArray(a);

       System.out.print("\n{8, 8, 6, 6, -2, -2, -2}                : " );
        a = clusterCompression(new int[]{8, 8, 6, 6, -2, -2, -2});
        displayArray(a);

       System.out.println(" ");
    }

   static int[] clusterCompression(int[] a){
        if (a.length==0) return new int[0];
        int[] result;
        int[] tmp   = new int[a.length];
        int   count =1;
        int   num   =a[0];
         
        tmp[0] =num;

       for(int i=1; i<a.length; i++){
            if(a[i] !=num){
                tmp[count] =a[i];
                num        =a[i];
                count++;
            }
        }

       result = new int[count];

       for(int j=0; j<count; j++)
            result[j] =tmp[j];

       return result;
    }

   static void displayArray(int[] a){
        System.out.print("{");

       if (a.length >0){
            System.out.print(a[0]);

           for(int i=1; i<a.length; i++)
                System.out.print(", "+ a[i]);
       }
        System.out.print("}");
    }
}