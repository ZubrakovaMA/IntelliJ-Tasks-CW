
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Game game = new Game();

        GameMap map = new GameMap();

        Controller controlPayer = new Controller();

        Hero hero = new Hero();


        game.createMap(map);
        game.addStone(map);

        game.player(map, hero);
        map.showGameArea(map.mapAre);
        do {
            controlPayer.navigationPayer(map, hero);
        }
        while (hero.y != 9 || hero.x != 0);
        System.out.println();
        System.out.print(ANSI_GREEN + "You win" + ANSI_RESET);
    }

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void createMap(GameMap map) {
        map.mapAre = new char[10][10];
        for (int i = 0; i < map.mapAre.length; i++) {
            for (int j = 0; j < map.mapAre[i].length; j++) {
                map.mapAre[i][j] = '.';

            }
        }
    }

    public void addStone(GameMap map) {
        for (int i = 0; i < map.mapAre.length; i++) {
            for (int j = 0; j < map.mapAre[i].length; j++) {
                map.mapAre[i][j] = (char) (Math.random() * 100);
                if (map.mapAre[i][j] >= 50) {
                    map.mapAre[i][j] = 'S';
                } else {
                    map.mapAre[i][j] = '.';
                    map.mapAre[8][0] = '.';
                    map.mapAre[8][1] = '.';
                    map.mapAre[7][1] = '.';
                    map.mapAre[7][2] = '.';
                    map.mapAre[6][2] = '.';
                    map.mapAre[6][3] = '.';
                    map.mapAre[5][3] = '.';
                    map.mapAre[5][4] = '.';
                    map.mapAre[4][4] = '.';
                    map.mapAre[4][5] = '.';
                    map.mapAre[3][5] = '.';
                    map.mapAre[3][6] = '.';
                    map.mapAre[2][6] = '.';
                    map.mapAre[2][7] = '.';
                    map.mapAre[1][7] = '.';
                    map.mapAre[1][8] = '.';
                    map.mapAre[0][8] = '.';
                    map.mapAre[0][9] = '.';
                }
            }
        }
    }

    public void player(GameMap map, Hero hero) {
        map.mapAre[hero.x][hero.y] = 'P';
    }


}