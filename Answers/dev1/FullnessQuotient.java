package saiPackage.dev1;

/**
 * Created by sachinkeshav on 1/2/15.
 */
public class FullnessQuotient {

    public static void main(String[] args) {
        System.out.println(fullnessQuotient(94));
        System.out.println(fullnessQuotient(1));
        System.out.println(fullnessQuotient(9));
        System.out.println(fullnessQuotient(360));
        System.out.println(fullnessQuotient(-4));
    }

    static int fullnessQuotient1(int n) {
        if (n < 1)
            return -1;

        int count = 0;

        for (int base = 2; base <= 9; base++) {
            boolean zeroFlag = false;
            for (int num = n; num > 0; num /= base) {
                if (num % base == 0) {
                    zeroFlag = true;
                    break;
                }
            }
            if (!zeroFlag)
                count++;
        }
        return count;
    }

    static int fullnessQuotient(int n) {
        if (n < 1)
            return -1;

        int count = 0;

        for (int base = 2; base <= 9; base++) {
            boolean zeroFlag = false;
            int number = n;
            while (number > 0) {
                if (number % base == 0) {
                    zeroFlag = true;
                    break;
                }
                number /= base;
            }

            if (!zeroFlag)
                count++;
        }
        return count;
    }
}
