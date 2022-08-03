import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("input the string ");
        String words = sc.nextLine();
        String[] words1 = words.split(" ");

        int [] array1 = new int[words1.length];
        for (int i = 0; i < words1.length ; i++) {
            array1[i] = words1[i].length();
        }
        int sum = 0;
        for (int i = 0; i < words1.length; i++) {
            sum = sum + array1[i];
        }
        System.out.println(sum / words1.length);
    }

}
