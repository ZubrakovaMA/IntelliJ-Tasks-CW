import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        int [] array1;
        array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int) (Math.random() * 5) + 0);

            System.out.print(array1[i] + " ");
        }

        System.out.println();

        int[] array2;
        array2 = new int[5];
        for (int j = 0; j < array2.length; j++) {
            array2[j] = ((int) (Math.random() * 5) + 0);

            System.out.print(array2[j] + " ");
        }
    }

}
