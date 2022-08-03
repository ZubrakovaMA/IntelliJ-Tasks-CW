import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("input the string ");
        String word = sc.nextLine();

        String[] array = word.split(" ");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() % 2 == 0) {
                count++;
            }
        }
        System.out.print(count);
        System.out.println(" - the number of words in a line, for an even number of letters ");
    }
}
