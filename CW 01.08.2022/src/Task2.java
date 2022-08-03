import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "";
        System.out.print("Input the sumbol's index");
        int index = sc.nextInt();

        for (int i = 1; i <= 1000; i++) {
            if (string.length() >= 1000) {
                break;
            } else {
                string = string + i;
            }

        }
        System.out.println(string.charAt(index));
    }
}
