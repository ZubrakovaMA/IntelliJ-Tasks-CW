public class GameMap {
    char[][] mapAre;

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void showGameArea(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void moveToTheUp(Hero hero) {
        if (hero.x - 1 < 0 || mapAre[hero.x - 1][hero.y] == 'S') {
            System.out.println(ANSI_RED + "Нет возможности передвижения" + ANSI_RESET);
        } else {
            mapAre[hero.x - 1][hero.y] = 'P';
            mapAre[hero.x][hero.y] = '.';
            hero.x--;
        }
    }

    public void moveToTheDown(Hero hero) {
        if (hero.x + 1 > 9 || mapAre[hero.x + 1][hero.y] == 'S') {
            System.out.println(ANSI_RED + "Нет возможности передвижения" + ANSI_RESET);
        } else {
            mapAre[hero.x + 1][hero.y] = 'P';
            mapAre[hero.x][hero.y] = '.';
            hero.x++;
        }

    }

    public void moveToTheRight(Hero hero) {
        if (hero.y + 1 > 9 || mapAre[hero.x][hero.y + 1] == 'S') {
            System.out.println(ANSI_RED + "Нет возможности передвижения" + ANSI_RESET);
        } else {
            mapAre[hero.x][hero.y + 1] = 'P';
            mapAre[hero.x][hero.y] = '.';
            hero.y++;
        }

    }

    public void moveToTheLeft(Hero hero) {
        if (hero.y - 1 < 0 || mapAre[hero.x][hero.y - 1] == 'S') {
            System.out.println(ANSI_RED + "Нет возможности передвижения" + ANSI_RESET);
        } else {
            mapAre[hero.x][hero.y - 1] = 'P';
            mapAre[hero.x][hero.y] = '.';
            hero.y--;
        }
    }
}