package saiPackage.dev;

public class Test1810Matches {
    public static void main(String[] args){
      System.out.println(" {1, 2, 3, -5, -5, 2, 3, 18}, {3, -2, 3}                 : " + matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[] {3, -2, 3}));
      System.out.println(" {1, 2, 3, -5, -5, 2, 3, 18}, {2, 1, -1, -1, 2, 1}       : " + matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[] {2, 1, -1, -1, 2, 1} ));
      System.out.println(" {1, 2, 3, -5, -5, 2, 3, 18}, {1, 2, -1, -1, 1, 2}       : " + matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[] {1, 2, -1, -1, 1, 2} ));
      System.out.println(" {1, 2, 3, -5, -5, 2, 3, 18}, {2, 1, -2, 3}              : " + matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[] {2, 1, -2, 3} ));
      System.out.println(" {1, 2, 3, -5, -5, 2, 3, 18}, {1, 1, 1, -1, -1, 1, 1, 1} : " + matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[] {1, 1, 1, -1, -1, 1, 1, 1}));
      System.out.println(" {1, 2, 3, -5, -5, 2, 3, 18}, {4, -1, 3}                 : " + matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[] {4, -1, 3}));
      System.out.println(" {1, 2, 3, -5, -5, 2, 3, 18}, {2, -3, 3}                 : " + matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[] {2, -3, 3}));
      System.out.println(" {1, 2, 3, -5, -5, 2, 3, 18}, {8}                        : " + matches(new int[] {1, 2, 3, -5, -5, 2, 3, 18}, new int[] {8}));
    }

    static int matches(int[] a, int[] p){
        int start = 0;
        int end   = 0;
        int ret   = 1;

        for (int i=0; i<p.length; i++){
            start = end;
            end   = start + Math.abs(p[i]);

            for (int j=start; j<end; j++){
                if (p[i] < 0){
                    if (a[j] > 0) ret =0;
                }
                if (p[i] > 0){
                    if (a[j] < 0) ret =0;
                }
            }
        }
        return ret;
    }
}

