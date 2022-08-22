import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
    public void navigatePlayer(Map map){
        int movie = getDirection();
        getDirection();
        switch (movie){
            case (4):{
                map.goToLeft();
                        break;
            }
            case (8): {
                map.goToUp();
                break;
            }
            case (2): {
                map.goToDown();
                break;
            }
            case (6): {
                map.goToRight();
                break;
            }
            default:{
                System.out.println("You input incorrect number");
            }
        }
    }
    private int getDirection(){
        int direction = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    System.in
            ));
            direction = Integer.parseInt(br.readLine());
        } catch (I0Exception | IOException ex) {
            System.out.println("");
        }
        return direction;
        }
    }

