package saiPackage;

public class Question54martianArray{
    public static void main(String[] args){
        System.out.println("Is {1, 3} Martian                      : " + isMartian(new int[]{1, 3}));
        System.out.println("Is {1, 2, 1, 2, 1, 2, 1, 2, 1} Martian : " + isMartian(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}));
        System.out.println("Is {1, 3, 2} Martian                   : " + isMartian(new int[]{1, 3, 2}));
        System.out.println("Is {1, 3, 2, 2, 1, 5, 1, 5} Martian    : " + isMartian(new int[]{1, 3, 2, 2, 1, 5, 1, 5}));
        System.out.println("Is {} Martian                          : " + isMartian(new int[]{}));
        System.out.println("Is {1} Martian                         : " + isMartian(new int[]{1}));
        System.out.println("Is {2} Martian                         : " + isMartian(new int[]{2}));
    }

    static int isMartian(int[ ] a){

        int is_martian =1;
        int no_of_one  =0;
        int no_of_two  =0;
        int prev_value =-1;

        for(int i=0; i<a.length; i++){
            if (a[i]==1) no_of_one++;
            if (a[i]==2) no_of_two++;

            if (i==0) prev_value = a[i];
            else {
                if (prev_value == a[i]) {
                    is_martian = 0; 
                    break;
                }
                else 
                    prev_value = a[i]; 
            }
        }

        if (is_martian !=0)
            if (no_of_one <= no_of_two)
                is_martian = 0;

        return is_martian;
    }


}
