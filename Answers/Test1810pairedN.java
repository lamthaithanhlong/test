package saiPackage;
    public class Question55pairedN{
        public static void main(String[] args){
            System.out.println("{1, 4, 1, 4, 5, 6}         ,5 : " + isPairedN(new int[] {1, 4, 1, 4, 5, 6},5));
            System.out.println("{1, 4, 1, 4, 5, 6}         ,6 : " + isPairedN(new int[] {1, 4, 1, 4, 5, 6},6));
            System.out.println("{0, 1, 2, 3, 4, 5, 6, 7, 8},6 : " + isPairedN(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8},6));
            System.out.println("{1, 4, 1}                  ,5 : " + isPairedN(new int[] {1, 4, 1},5));
            System.out.println("{8, 8, 8, 8, 7, 7, 7}     ,15 : " + isPairedN(new int[] {8, 8, 8, 8, 7, 7, 7},15));
            System.out.println("{8, -8, 8, 8, 7, 7, -7}  ,-15 : " + isPairedN(new int[] {8, -8, 8, 8, 7, 7, -7},-15));
            System.out.println("{3}                        ,3 : " + isPairedN(new int[] {3},3));
            System.out.println("{}                         ,0 : " + isPairedN(new int[] {},0));
        }

        static int isPairedN(int[] a, int n){
            int pairedN =0;

            if (a.length<2 || n<1)             return 0;
            if ((a.length-1 + a.length-2) < n) return 0;

            for (int i=0; i<=a.length/2; i++){
                int index_two = n-i;
                
                if ( n-i <= a.length-1){
                    if (a[i] + a[index_two] == n){
                        pairedN = 1;
                        break;
                    }
                }
            }
            return pairedN;
        }
    }

