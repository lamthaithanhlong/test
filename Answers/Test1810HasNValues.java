
package saiPackage;

public class Question63HasNValues{
    public static void main(String[] args){
        System.out.println("{1, 2, 2, 1}, 2                     : " + hasNValues(new int[]{1, 2, 2, 1}, 2));
        System.out.println("{1, 1, 1, 8, 1, 1, 1, 3, 3}, 3      : " + hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 3)); 
        System.out.println("{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 10 : " + hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 10));
        System.out.println("{1, 2, 2, 1}, 3                     : " + hasNValues(new int[]{1, 2, 2, 1}, 3));
        System.out.println("{1,1,1,8,1,1,1,3,3}, 2              : " + hasNValues(new int[]{1,1,1,8,1,1,1,3,3}, 2));
        System.out.println("{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 20 : " + hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 20));
    }

    static int hasNValues(int[] a, int n){
        int count =1;
        int idx   =0;
        int[] tmp_array =new int[a.length];
        int[] result;

        tmp_array[idx++] = a[0];

        for (int i=0; i<a.length; i++){

            boolean found =false;

            for  (int j=0; j<idx; j++){
                if (a[i] == tmp_array[j])
                    found = true;
            } 

            if (!found) tmp_array[idx++] = a[i];
        }
        result = new int[idx];

        for (int i=0; i<idx; i++){
            result[i] = tmp_array[i];
        }

        if (result.length == n) return 1;
        else                    return 0;
    }

}

