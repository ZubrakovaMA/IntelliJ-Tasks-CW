import java.util.Scanner;
import java.util.regex.Matcher;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("input the string ");
        String frase = sc.nextLine();

        System.out.print("input the char ");
        String cchar = sc.nextLine();


        int index1 = frase.indexOf(cchar);
        while (index1 >= 0) {
            System.out.print(index1);
            index1 = frase.indexOf(cchar, index1 + 1);
            System.out.println("");


        }
        String newStr = frase.replaceAll(cchar, "");
        int count1 = (frase.length() - newStr.length()) / cchar.length();
        System.out.println(" this " + cchar + " shows us " + count1);


        if(index1 == - 1) {
            System.out.println("symbol " + cchar + " not found ");
        }
    }
}
