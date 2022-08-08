import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Task8 obj = new Task8();
        Scanner sc = new Scanner(System.in);
        System.out.println("input  the name of variable");
        String st = sc.nextLine();
        char[] arrayOfChar = st.toCharArray();
        obj.showArray(arrayOfChar);
        obj.defineTheLanguage(arrayOfChar);
        obj.convertingLanguages(arrayOfChar);
    }

    public void defineTheLanguage(char[] array){
        for (int i = 0; i < array.length; i++) {
            char a = array[i];
            if(Character.isUpperCase(a)){
                System.out.println("This is Java");
                break;
            } else if (Character.isLowerCase(a) || a == '_'){
                System.out.println("this is C++");
            } break;
        }
    }
    public void convertingLanguages(char[] array){
        if (defineTheLanguage(array).equals ("This is Java"));
        
    }

    public void showArray(char[] arrayOfChar) {
        for (int i = 0; i < arrayOfChar.length; i++) {
        }
        System.out.println();
    }
}

