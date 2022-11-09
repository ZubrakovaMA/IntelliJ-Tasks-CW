import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Controller {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";


    private int getDirection() {
        int direction = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            direction = Integer.parseInt(br.readLine());
        } catch (Exception ex) {
            System.out.println(ANSI_RED + "Ошибка ввода" + ANSI_RESET);
        }
        return direction;
    }

    public void navigationPayer(GameMap map, Hero hero) {

        int move = getDirection();
        switch (move) {
            case (4): {
                map.moveToTheLeft(hero);
                map.showGameArea(map.mapAre);
                break;
            }
            case (6): {
                map.moveToTheRight(hero);
                map.showGameArea(map.mapAre);
                break;
            }
            case (8): {
                map.moveToTheUp(hero);
                map.showGameArea(map.mapAre);
                break;
            }
            case (2): {
                map.moveToTheDown(hero);
                map.showGameArea(map.mapAre);
                break;
            }
            default: {
                System.out.print(ANSI_RED + "Вы нажали не верную клавишу" + ANSI_RESET);
            }
        }
    }
}
