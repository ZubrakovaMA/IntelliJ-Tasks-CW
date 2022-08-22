public class Game {
    public static void main(String[] args) {
        Game game = new Game();
        Map map = new Map();
        Map.gameMap(map);
        
    }
    public void gameMap (Map map){
        char [][] mapArray = new char[10][10];
        for (int i = 0; i < mapArray.length ; i++) {
            for (int j = 0; j < mapArray [i].length; j++) {
                mapArray[i][j] = '-';
            }
        }
    }
    public void adding (Map map){
        for (int i = 0; i < map.mapArray.length; i++) {
            for (int j = 0; j < map.mapArray[i].length; j++) {
                map.mapArray [i][j] = (char) (Math.random()*100);
                if (map.mapArray [i][j]>=80){
                    map.mapArray[i][j] = 'I';
                } else{
                    map.mapArray[i][j] = '_';
                }
            }
        }
    }
}
