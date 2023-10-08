
import java.util.Random;
import java.io.Serializable;

/**
 *
 * @author adrea
 */
public class Dado implements Serializable {

    private int sideUp; //valor da face do dado voutada para cima

    public Dado() { // metodo construtor sem parametros
        sideUp = 0;
    }

    public int getSideUp() { // retornar o valor da face voutada para cima do dado
        return sideUp;
    }

    public void setSideUp(int side) { // setar o valor da face voutada para cima do dado
        sideUp = side;
    }

    public int roll() { // gerar um numero randomico de 1 a 6 e retornar esse vslor
        Random ran = new Random();
        sideUp = ran.nextInt(6) + 1;

        return sideUp;
    }
}
