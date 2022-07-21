import java.lang.reflect.Array;

public class Array12 {
    public static void main(String[] args) {

        int[] MaxIntArray = new int[12];
        int maxNumber = - 15;
        int maxIndex = 0;


        for (int i = 0; i < MaxIntArray.length; i++) {
            MaxIntArray[i] = (int)(Math.random()*31)-15;
            if(maxNumber <= MaxIntArray[i]){
                maxNumber = MaxIntArray[i];
                maxIndex = i;
            }
        }

        System.out.println("Индекс максимального элемента: " + maxIndex);
    }
}
