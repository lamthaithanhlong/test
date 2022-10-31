package saiPackage;

public class Test1810isBean {

    public static void main(String[] args) {
        System.out.println(" {4,9,8} is : " + isBean(new int[]{4,9,8}));
        System.out.println(" {3,8,4} is : " + isBean(new int[]{3,8,4}));
        System.out.println(" {2,2,5,11,23} is : " + isBean(new int[]{2,2,5,11,23}));
        System.out.println(" {7,7,3,6} is : " + isBean(new int[]{7,7,3,6}));
    }

    static int isBean(int[] a) {
        int isBean = 1;
        int[] isBeanBool = new int[a.length];

        for (int i=0; i<isBeanBool.length; i++) isBeanBool[i]=0;

        for (int i = 0; i < a.length; i++) {
//            System.out.println("i is : " + i);
            for (int j = 0; j < a.length; j++) {
//                System.out.println("   j is : " + j);
                if (a[i] == 2*a[j] || a[i] == 2*a[j] + 1 || a[i] == a[j]/2) {
                    //isBean = 1;
                    isBeanBool[i] = 1;
                    break;
                }
            }
            //return isBean;
        }
        for (int i=0; i<isBeanBool.length; i++){
          if (isBeanBool[i]==0) 
          {
            isBean = 0;
            break;
          }
        }
        return isBean;
    }
}
