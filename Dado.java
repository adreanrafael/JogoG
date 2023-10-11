
import java.util.Random;
<<<<<<< HEAD
import java.io.Serializable;
=======
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45

/**
 *
 * @author adrea
 */
<<<<<<< HEAD
public class Dado implements Serializable {
=======
public class Dado {
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45

    private int sideUp; //valor da face do dado voutada para cima

    public Dado() { // metodo construtor sem parametros
        sideUp = 0;
    }

<<<<<<< HEAD
    public int getSideUp() { // retornar o valor da face voutada para cima do dado
        return sideUp;
    }

    public void setSideUp(int side) { // setar o valor da face voutada para cima do dado
        sideUp = side;
    }

    public int roll() { // gerar um numero randomico de 1 a 6 e retornar esse vslor
=======
    public int getSideUp() {
        return sideUp;
    }

    public void setSideUp(int side) {
        sideUp = side;
    }

    public int roll() {
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
        Random ran = new Random();
        sideUp = ran.nextInt(6) + 1;

        return sideUp;
    }
}
