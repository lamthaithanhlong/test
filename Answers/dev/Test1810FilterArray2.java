package saiPackage.dev;

public class Test1810FilterArray2 {
    public static void main(String[] args){
        int[] a;

       System.out.print("\n{8, 4, 9, 0, 3, 1, 2}, 88 : " );
        a = filterArray(new int[]{8, 4, 9, 0, 3, 1, 2}, 88); displayArray(a);

       System.out.print("\n{9, -9}, 0             : " );
        a = filterArray(new int[]{9, -9}, 0); displayArray(a);

       System.out.print("\n{9, -9}, 1             : " );
        a = filterArray(new int[]{9, -9}, 1); displayArray(a);

       System.out.print("\n{9, -9}, 2             : " );
        a = filterArray(new int[]{9, -9}, 2); displayArray(a);

       System.out.print("\n{9, -9}, 3             : " );
        a = filterArray(new int[]{9, -9}, 3); displayArray(a);

       System.out.print("\n{9, -9}, 4             : " );
        a = filterArray(new int[]{9, -9}, 4); displayArray(a);

       System.out.print("\n{9, -9, 5}, 3          : " );
        a = filterArray(new int[]{9, -9, 5}, 3); displayArray(a);

       System.out.print("\n{0, 9, 12, 18, -6}, 11 : " );
        a = filterArray(new int[]{0, 9, 12, 18, -6}, 11); displayArray(a);
    }

   static int[] filterArray(int[] a, int n){
        int num       =n;
        int remainder =0;
        int count     =-1;
        int idx       =0;
        int[] tmp = new int[a.length];
        int[] result;

       while (num >0){
            remainder = num%2;
            num /=2;
            count++;

           if (remainder ==1){
                if (count < a.length){
                    tmp[idx] = a[count];
                    idx++;
                }
                else
                    return null;
            }
        }

       result = new int[idx];
        for (int i=0; i<idx; i++)
            result[i] =tmp[i];
        
        return result;
    }

   static void displayArray(int[] a){
        if      (a==null)     System.out.print("NULL");
        else if (a.length==0) System.out.print("{}");
        else{
            System.out.print("{" + a[0]);

           for (int i=1; i<a.length; i++)
                System.out.print(", " + a[i]);
            
            System.out.print("}");
        }
    }
}