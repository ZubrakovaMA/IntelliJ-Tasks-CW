import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        task7 obj = new task7();
        Scanner sc = new Scanner(System.in);
        System.out.println("input  here any string");
        String st = sc.nextLine();
        char[] arrayOfChar = st.toCharArray();
        obj.showArray(arrayOfChar);
        obj.changeLetters(arrayOfChar);

    }

    public void changeLetters(char[] array) {
        for (int i = 0; i < array.length; i++) {
            char a = array[i];
            if (Character.isUpperCase(a)) {
                array[i] = Character.toLowerCase(a);
            }

        }
    }
    public void showArray(char[] arrayOfChar) {
        for (int i = 0; i < arrayOfChar.length; i++) {
            char a = arrayOfChar[i];
            if (Character.isUpperCase(a)) {
                arrayOfChar[i] = Character.toLowerCase(a);
            }
        }
        System.out.println(arrayOfChar);
    }
}