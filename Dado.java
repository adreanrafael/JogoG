
import java.util.Random;

/**
 *
 * @author adrea
 */
public class Dado {

    private int sideUp; //valor da face do dado voutada para cima

    public Dado() { // metodo construtor sem parametros
        sideUp = 0;
    }

    public int getSideUp() {
        return sideUp;
    }

    public void setSideUp(int side) {
        sideUp = side;
    }

    public int roll() {
        Random ran = new Random();
        sideUp = ran.nextInt(6) + 1;

        return sideUp;
    }
}
