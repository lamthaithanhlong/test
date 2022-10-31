package saiPackage.dev1;

/**
 * Created by sachinkeshav on 12/29/14.
 */
public class SumFactor {

    static int sumFactor(int[] a) {
        int sum = 0;
        int factor = 0;

        for (int anA : a) {
            sum += anA;
        }

        for (int anA : a) {
            if (anA == sum)
                factor++;
        }

        return factor;
    }
}
