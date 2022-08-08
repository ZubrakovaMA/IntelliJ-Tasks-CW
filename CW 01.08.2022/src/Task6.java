public class Task6 {

    int a;
    int b;
    int i;


    public static void main(String[] args) {
        Task6 obj = new Task6();
        String[] array = new String[100000];
        obj.array0_9(array);
        obj.array10_99(array);
        obj.array100_999(array);
        obj.array1000_9999(array);
        obj.array10000_99999(array);
    }

    public void array0_9(String[] array) {
        for (int i = 0; i < 9; i++) {
            array[i] = "" + i;
        }
    }

    public void array10_99(String[] array) {
        for (int i = 10; i < 99; i++) {
            array[i] = "" + i;
        }
    }

    public void array100_999(String[] array) {
        for (int i = 100; i < 999; i++) {
            array[i] = "" + i;
        }

    }

    public void array1000_9999(String[] array) {
        for (int i = 1000; i < 9999; i++) {
            array[i] = "" + i;
        }
    }

    public void array10000_99999(String[] array) {
        for (int i = 10000; i < 99999; i++) {
            array[i] = "" + i;
        }

    }
}








