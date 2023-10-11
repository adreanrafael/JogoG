
<<<<<<< HEAD
import java.io.Serializable;

=======
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
/**
 *
 * @author adrea
 */
<<<<<<< HEAD
public class JogoGeneral implements Serializable {  // declaracao de classe 
=======
public class JogoGeneral {  // declaracao de classe 
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45

    private final Dado[] dados = new Dado[5];   // vetor com os 5 dados de tamnho constante
    private int SomaDados;  // variavel contadora para armazenar a soma das faces voltadas para cima
    private final int[] jogadas = new int[13];  // vetor que que guarda a pontuacao das jogadas com tamnho constante

    public JogoGeneral() {  // metodo contrutor
        for (int i = 0; i < dados.length; i++) {   // inicializar vetor de dados
            dados[i] = new Dado();
        }

        for (int i = 0; i < jogadas.length; i++) {  //inicializar vetor jogadas
            jogadas[i] = -1;
        }

        SomaDados = 0;  // inicializar variavel contadora
    }

    public void setJogadas() { // metodo setter para zerar as jogadas  
        for (int i = 0; i < jogadas.length; i++) {
            jogadas[i] = -1;
        }
    }

<<<<<<< HEAD
    public int[] getJogadas() {   // metoro getter para vetor jogadas
=======
    public int[] getJogadados() {   // metoro getter para vetor jogadas
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
        return jogadas;
    }

    public Dado[] getDados() {  // metodo getter para vetor dados
        return dados;
    }

    public void rolarDados() {  // metodo que rola os cinco dados
        for (var i = 0; i < dados.length; i++) {
            dados[i].roll();    // atribui um valor pseudo randomico como face voutada para cima de cada dado
        }

        for (int i = 0; i < dados.length; i++) {    //esse trecho ordena o vetor que contem os valores das faces voltadas para cima pelo metodo bolha
            for (int j = 0; j < i; j++) {
                if (dados[j].getSideUp() > dados[i].getSideUp()) {
<<<<<<< HEAD
                    int aux = dados[j].getSideUp();
=======
                    int aux = dados[j].getSideUp();    
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
                    dados[j].setSideUp(dados[i].getSideUp());
                    dados[i].setSideUp(aux);
                }
            }
        }
    }

    public int SomaDados() {    // metodo que retorna a soma dos valores das faces voltadas para cima dos cinco dados 
        SomaDados = 0;  // zerar a cada jogada
        for (int i = 0; i < dados.length; i++) {
            SomaDados += dados[i].getSideUp();
        }
        return SomaDados;
    }

    public boolean validarJogada(int num) { // metodo que verifica se uma jogada pontua ou nao(true ou false) para o conjunto de dados encapsulado
        if (num <= 6 && num > 0) {  // verifica as jogadas de 1 a 6
            for (int i = 0; i < dados.length; i++) {    // percorre os elementos vetor de dados e se o numero da jogada aparecer uma vez ja retorna verdadeiro
<<<<<<< HEAD
                if (dados[i].getSideUp() == num) {
=======
                if (dados[i].getSideUp() == num) {       
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
                    return true;
                }
            }
            return false; // retorna faso caso o valor entre 1 e 6 passado como parametro nao esteja no vetor de dados
        } else if (num == 7) {  //verifica se uma jogada de trinca(7) pontua ou nao 
            int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0; // variaveis auxiliares contadoras inicializadas em zero
            // cada variavel contadora armazena a ocorrencia de uma valor de face do dado no vetor de dados
            for (int i = 0; i < dados.length; i++) {    // percorre o vetor de dados
                // verificar cada elemento do vetor de dados e atribuir +1 para sua respectiva variavel contadora
<<<<<<< HEAD
                switch (dados[i].getSideUp()) {
                    case 1 ->
                        n1++;
                    case 2 ->
=======
                switch (dados[i].getSideUp()) {     
                    case 1 ->
                        n1++;
                    case 2 ->               
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
                        n2++;
                    case 3 ->
                        n3++;
                    case 4 ->
                        n4++;
                    case 5 ->
                        n5++;
                    case 6 ->
                        n6++;
                    default -> {
                    }
                }
                // verificar se a ocorrencia é maior ou igual a 3 e retorna verdadeiro
<<<<<<< HEAD
                if (n1 >= 3 || n2 >= 3 || n3 >= 3 || n4 >= 3 || n5 >= 3 || n6 >= 3) {
=======
                if (n1 >= 3 || n2 >= 3 || n3 >= 3 || n4 >= 3 || n5 >= 3 || n6 >= 3) { 
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
                    return true;
                }
            }
            return false;

        } else if (num == 8) { //verifica se uma jogada de quadra(8) pontua ou nao 
            // variaveis auxiliares contadoras inicializadas em zero
            int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;

            for (int i = 0; i < dados.length; i++) {
                switch (dados[i].getSideUp()) {
                    case 1 ->
                        n1++;
                    case 2 ->
                        n2++;
                    case 3 ->
                        n3++;
                    case 4 ->
                        n4++;
                    case 5 ->
                        n5++;
                    case 6 ->
                        n6++;
                    default -> {
                    }
                }
                // verificar se a ocorrencia de algum valor de face é maior ou igual a 4 e retorna verdadeiro
                if (n1 >= 4 || n2 >= 4 || n3 >= 4 || n4 >= 4 || n5 >= 4 || n6 >= 4) {
                    return true;
                }
            }
            return false;
        } else if (num == 9) { //verifica se uma jogada de fullrand(9) pontua ou nao 
            // variaveis auxiliares contadoras inicializadas em zero
            int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;

            for (int i = 0; i < dados.length; i++) {
                switch (dados[i].getSideUp()) {
                    case 1 ->
                        n1++;
                    case 2 ->
                        n2++;
                    case 3 ->
                        n3++;
                    case 4 ->
                        n4++;
                    case 5 ->
                        n5++;
                    case 6 ->
                        n6++;
                    default -> {
                    }
<<<<<<< HEAD
                }// verificar se a ocorrencia de algum valor de face é maior ou igual a 3 e se outro valor é meior ou igual a 2 e retorna verdadeiro
                if ((n1 == 3 || n2 == 3 || n3 == 3 || n4 == 3 || n5 == 3 || n6 == 3) && (n1 == 2 || n2 == 2 || n3 == 2 || n4 == 2 || n5 == 2 || n6 == 2)) {
=======
                }
                // verificar se a ocorrencia de algum valor de face é maior ou igual a 3 e se outro valor é meior ou igual a 2 e retorna verdadeiro
                if ((n1 >= 3 || n2 >= 3 || n3 >= 3 || n4 >= 3 || n5 >= 3 || n6 >= 3) && (n1 >= 2 || n2 >= 2 || n3 >= 2 || n4 >= 2 || n5 >= 2 || n6 >= 2)) {
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
                    return true;
                }
            }
            return false;
        } else if (num == 10) { //verifica se uma jogada de sequencia maior(10) pontua ou nao 
            // variaveis auxiliares contadoras inicializadas em zero
            int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;

            for (int i = 0; i < dados.length; i++) {
                switch (dados[i].getSideUp()) {
                    case 1 ->
                        n1++;
                    case 2 ->
                        n2++;
                    case 3 ->
                        n3++;
                    case 4 ->
                        n4++;
                    case 5 ->
                        n5++;
                    case 6 ->
                        n6++;
                    default -> {
                    }
                }
                // verificar as ocorrencias 
                if (n1 == 0 && n2 == 1 && n3 == 1 && n4 == 1 && n5 == 1 && n6 == 1) {
                    return true;
                }
            }
            return false; // retornar falso caso nao as ocorrencias  
        } else if (num == 11) { //verifica se uma jogada de sequencia menor(11) pontua ou nao 
            // variaveis auxiliares contadoras inicializadas em zero
            int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;

            for (int i = 0; i < dados.length; i++) {
                switch (dados[i].getSideUp()) {
                    case 1 ->
                        n1++;
                    case 2 ->
                        n2++;
                    case 3 ->
                        n3++;
                    case 4 ->
                        n4++;
                    case 5 ->
                        n5++;
                    case 6 ->
                        n6++;
                    default -> {
                    }
                }
                // verificar as ocorrencias 
                if (n1 == 1 && n2 == 1 && n3 == 1 && n4 == 1 && n5 == 1 && n6 == 0) {
                    return true;
                }
            }
            return false;
        } else if (num == 12) {
            // variaveis auxiliares contadoras inicializadas em zero
            int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;

            for (int i = 0; i < dados.length; i++) {
                switch (dados[i].getSideUp()) {
                    case 1 ->
                        n1++;
                    case 2 ->
                        n2++;
                    case 3 ->
                        n3++;
                    case 4 ->
                        n4++;
                    case 5 ->
                        n5++;
                    case 6 ->
                        n6++;
                    default -> {
                    }
                }
                // verificar as ocorrencias 
                if (n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5 || n6 == 5) {
                    return true;
                }
            }
            return false;
        } else {
            return num == 13; // se for uma jogada aleatoria(13) qualquer combinacao pontua 
        }
    }

    public void pontuarJogada(int j) { // metodo que recebe uma variavel inteira como parametro e atribui uma pontuacao no vetor jogadas para respectiva jogada
        if (j >= 1 && j <= 6) { // pontua jogadas de 1 a 6 no vetor de jogadas
            if (validarJogada(j) == true) { // verificar se a jodada e valida
                int cont = 0; // variavael contaroa auxiliar para armazenar ocorrencia
<<<<<<< HEAD
                for (int i = 0; i < dados.length; i++) {
=======
                for (int i = 0; i < dados.length; i++) {  
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
                    if (dados[i].getSideUp() == j) {
                        cont++;     // contar occorrencia do valor ecolhido
                    }
                }
                if (jogadas[j - 1] == -1) {     // verificar se a jogada ainda nao foi realizada
                    jogadas[j - 1] = cont * j;  // caso nao foi realizada ainda, atribuir a pontuacao
                } else {
                    System.out.println("Jogada ja realizada!"); // caso ja foi realizada imprime uma menssagem e nao atribuir pontuacao alguma
                }
            } else { // caso jogada nao valida 
                if (jogadas[j - 1] == -1) {     //verificar se a jogada ja foi realizada
                    jogadas[j - 1] = 0;         // caso nao foi realizada atribuir pontuacao zero
                } else {
                    System.out.println("Jogada ja realizada!");  // caso ja foi realizada imprimir uma menssagem e nao pontua
                }
            }

        } else if (j == 7) {    // pontua jogada de trinca(7) no vetor de jogadas
            if (validarJogada(j) == true) { // verificar se a jodada e valida
                if (jogadas[j - 1] == -1) {     // verificar se a jogada ainda nao foi realizada
                    jogadas[j - 1] = this.SomaDados();  // caso nao foi realizada ainda, atribuir a respectiva pontuacao
                } else { // caso ja foi realizada imprime uma menssagem e nao atribui pontuacao alguma
                    System.out.println("Jogada já realizada!");
                }
            } else { // caso jogada nao valida 
                if (jogadas[j - 1] == -1) {  // verificar se a jogada ainda nao foi realizada
                    jogadas[j - 1] = 0;     // atribuir pontuacao zero
                } else {    // caso jogada ja realizada, imprimir mensagem e nao pontuar
                    System.out.println("Jogada já realizada!");
                }
            }
<<<<<<< HEAD
            // repete o mesmo procedimento do caso acima para as outras jogadas
=======

>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
        } else if (j == 8) {
            if (validarJogada(j) == true) {
                if (jogadas[j - 1] == -1) {
                    jogadas[j - 1] = this.SomaDados();
                } else {
                    System.out.println("Jogada já realizada!");
                }
            } else {
                if (jogadas[j - 1] == -1) {
                    jogadas[j - 1] = 0;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            }
        } else if (j == 9) {
            if (validarJogada(j) == true) {
                if (jogadas[j - 1] == -1) {
                    jogadas[j - 1] = 25;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            } else {
                if (jogadas[j - 1] == -1) {
                    jogadas[j - 1] = 0;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            }
        } else if (j == 10) {
            if (validarJogada(j) == true) {
                if (jogadas[j - 1] == -1) {
                    jogadas[j - 1] = 30;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            } else {
                if (jogadas[j - 1] == -1) {
                    jogadas[j - 1] = 0;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            }
        } else if (j == 11) {
            if (validarJogada(j) == true) {
                if (jogadas[j - 1] == -1) {
                    jogadas[j - 1] = 40;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            } else {
                if (jogadas[j - 1] == -1) {
                    jogadas[j - 1] = 0;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            }
        } else if (j == 12) {
            if (validarJogada(j) == true) {
                if (jogadas[j - 1] == -1) {
                    jogadas[j - 1] = 50;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            } else {
                if (jogadas[j - 1] == -1) {
                    jogadas[j - 1] = 0;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            }
        } else if (j == 13) {
            if (validarJogada(j) == true) {
                if (jogadas[j - 1] == -1) {
                    jogadas[j - 1] = this.SomaDados();
                } else {
                    System.out.println("Jogada já realizada!");
                }
            } else {
                if (jogadas[j - 1] == -1) {
                    jogadas[j - 1] = 0;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            }
        }
    }
}
