package saiPackage.dev;

public class Test1810Trivalent {
    public static void main(String[] args){
        System.out.println("{22, 19, 10, 10, 19, 22, 22, 10}  : " + 
              isTrivalent(new int[]{22, 19, 10, 10, 19, 22, 22, 10} ));
        System.out.println("{1, 2, 2, 2, 2, 2, 2}             : " + 
              isTrivalent(new int[]{1, 2, 2, 2, 2, 2, 2}));
        System.out.println("{2, 2, 3, 3, 3, 3, 2, 41, 65}     : " + 
              isTrivalent(new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65}));
        System.out.println("{-1, 0, 1, 0, 0, 0}               : " + 
              isTrivalent(new int[]{-1, 0, 1, 0, 0, 0}));
        System.out.println("{}                                : " + 
              isTrivalent(new int[]{}));
        System.out.println("{ 2147483647, -1, -1, -2147483648} : " + 
              isTrivalent(new int[]{ 2147483647, -1, -1, -2147483648} ));
    }

    static int isTrivalent(int[] a){
        int[] tri = new int[3];
        int idx   =1;
        int ret   =1;


        if (a.length==0) return 0;

        tri[0]    =a[0];

        for (int i=1; i<a.length; i++){
            boolean found =false;
            for (int j=0;j<idx; j++){
                if (tri[j] == a[i]) {found =true;}
            }

            if (!found && idx<3){
                tri[idx] = a[i];
                idx++;
            }
            else if ((!found)&& (idx>2)) { 
                ret =0; 
            }

        }
            if (idx<3) ret =0;

            for (int j=0; j<idx; j++){
                 System.out.print(tri[j] + ",");
            }
            System.out.print("idx = " + idx + "\n");

        return ret;
    }
}

