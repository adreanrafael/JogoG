
import java.io.Serializable;

public class Jogador implements Serializable{

    private String nome;
    private char tipoJogador;
    private JogoGeneral jogo;
    private int totalJogadas;
    
    //metodo costrutor com apenas um parametro
    public Jogador(String nome) {
        this.nome = nome;
        tipoJogador = 'm';
        jogo = new JogoGeneral();
        totalJogadas = 0;
    }
    //metodo contrutor com dois parametros
    public Jogador(String nome, char tipo) {
        this.nome = nome;
        tipoJogador = tipo;
        jogo = new JogoGeneral();
        totalJogadas = 0;
    }
    // metodo que retorna verdadeiro caso a string passada por parametro for igual ao nome encapsulado
   /* public Boolean equal(String s){
        int cont=0;
        for(int i=0; i<nome.length(); i++){
            if(nome.charAt(i) != s.charAt(i)){
                cont++;
            }
        }
        return cont != 0;       
    }*/
    
    // metodo acessador para o nome do jogador
    public String getNome() {
        return nome;
    }
    // metodo acessador para o tipo do jogador
    public char getTipoJogador() {
        return tipoJogador;
    }
    // metodo acessador para um jogoGeneral
    public JogoGeneral getJogo() {
        return jogo;
    }
    // metodo acessador para a soma total do vetor de jogadas
    public int getTotalJogadas() {
        return totalJogadas;
    }
    // metodo inicializador para o nome do jogador
    public void setNome(String nome) {
        this.nome = nome;
    }
    // metodo inializador para o tipo do jogador
    public void setTipo(char tipo) {
        this.tipoJogador = tipo;
    }
    // metodo inicializador para o vetor de pontuacao das jogadas
    public void setTotalJogadas() {
        this.totalJogadas = 0;

        for (int i = 0; i < jogo.getJogadas().length; i++) {
            if (jogo.getJogadas()[i] != -1) {
                this.totalJogadas += jogo.getJogadas()[i];
            }
        }
    }
    // metodo que que cham o metodo rolar dados para o jogador
    public void JogarDados() {
        this.jogo.rolarDados();
    }
    // metodo que passa a jogada escolhida pelo jogador como parametro e chama o metodo pontuar jogada
    public void escolherJogada(int j) {
        jogo.pontuarJogada(j);
    }
    // metodo que retorna jogada a ser realizada para o tipo de jogador maquina e chama o metodo pontuar jogada 
    public int escolherJogadaMaquina() {
        int jogada = 0; // variavel que guarda a jogada escolhida
        for (int i = jogo.getJogadas().length; i > 0; i--) { // percorrer os indices do vetor jogadas de tras para frente
            // verificas se a jogada(no indice atual) e valida e se a jogada ainda nao foi realizada e se é diferente de aleatoria
            // nessa estrategia a jogada aleatoria sera sempre a ultima opcao a ser escolhida
            if (jogo.validarJogada(i) == true && jogo.getJogadas()[i - 1] == -1 && i != 13) {
                jogada = i;
                jogo.pontuarJogada(jogada); 
                return jogada;
            } else if (jogo.getJogadas()[i - 1] == -1) { // verificar se a jogada nao foi realizada
                jogada = i;
            }
        }

        jogo.pontuarJogada(jogada);
        return jogada;
    }
    // metodo que chama o metodo inicializador de jogadas
    public void ZerarJogadas() {
        jogo.setJogadas();
    }
    // metodo que printa o vetor com a pontuacao atual do vetor de jogadas para um jogador
    public void mostrarJogadasExecutadas() {
        for (int i = 0; i < 2; i++) { // percorre duas linhas 
            for (int j = 0; j < jogo.getJogadas().length; j++) { // percorrer o vetor de jogadas
                if (i == 0) {       // condicao prar printar as jogadas
                    if (j == 6) {
                        System.out.printf("%d(T)\t", j + 1);
                    }
                    if (j == 7) {
                        System.out.printf("%d(Q)\t", j + 1);
                    }
                    if (j == 8) {
                        System.out.printf("%d(F)\t", j + 1);
                    }
                    if (j == 9) {
                        System.out.printf("%d(S+)\t", j + 1);
                    }
                    if (j == 10) {
                        System.out.printf("%d(S-)\t", j + 1);
                    }
                    if (j == 11) {
                        System.out.printf("%d(G)\t", j + 1);
                    }
                    if (j == 12) {
                        System.out.printf("%d(X)\t", j + 1);
                    } else if (j < 6) {
                        System.out.printf("%d\t", j + 1);
                    }
                }
                if (i == 1 && jogo.getJogadas()[j] == -1) {  // condicao para printar a pontuacao das jogadas se nao foi realizada
                    System.out.format("-\t");
                } else if (i == 1 && jogo.getJogadas()[j] != -1) {  // condicao para printar a pontuacao das jogadas se ja foi realizada
                    System.out.format("%d\t", jogo.getJogadas()[j]);
                }
            }
            System.out.println();
        }
    }
}
