public class Task5 {

    private static long [][] array;
    int[][] Array = new int[8][5];

    public static void main(String[] args){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 99) + 10;
                System.out.print(array [i] [j]);
            }
        }
    }
}

