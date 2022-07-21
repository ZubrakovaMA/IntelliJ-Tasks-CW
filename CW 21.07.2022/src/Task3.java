import java.lang.reflect.Array;
import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        int[] array;
        array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10) + 1);

            System.out.print(array[i] + " ");

        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
        }
        System.out.println();

        System.out.println(Arrays.toString(array));

    }

}

