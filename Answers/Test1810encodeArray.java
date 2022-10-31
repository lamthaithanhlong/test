package saiPackage;

public class Question40encodeArray{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);

        System.out.print("Encode Array of " + n + " is : {" );

        int[] a = encodeArray(n);

        for(int i=0; i<a.length; i++){
            if (i>0)
                System.out.print(", ");

            System.out.print(a[i]); 
        }
        System.out.print("}\n");

    }

    static int[] encodeArray(int n){
        int[] tmp_ret   = new int[0];
        int[] ret       = new int[0];
        int   arr_len = tmp_ret.length;
        int   num       =Math.abs(n);
        int   remainder =0;
        int   i         =0;
        int   j         =0;

        while (num>=0){
            remainder =num%10;
            num       =num/10;

            if (num ==0) num = -1;

            arr_len   = remainder + 1;
            tmp_ret   = new int[tmp_ret.length + arr_len];

            // encode  remainder to tmp_ret
            for (i=0; i<remainder; i++){
                if (remainder > 0)
                    tmp_ret[i] = 0; 
            }
            tmp_ret[i] = 1;
          
            // copy  ret to tmp_ret
            for ( j=i+1, i=0; i<ret.length; i++, j++){
                tmp_ret[j] = ret[i];
            }

            ret = tmp_ret;
        }
        // handle negative value
        if (n<0){
            ret = new int[ret.length+1];
            ret[0] = -1;

            for (i=0; i<tmp_ret.length; i++)
                ret[i+1] = tmp_ret[i];
        }

        return ret;
    }
}
