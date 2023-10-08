
public class Jogador {

    private String nome;
    private char tipoJogador;
    private JogoGeneral jogo;
    private int jogada;
    private int totalJogadas;

    public Jogador(String nome) {
        this.nome = nome;
        tipoJogador = 'm';
        jogo = new JogoGeneral();
        jogada = 1;
        totalJogadas = 0;
    }

    public Jogador(String nome, char tipo) {
        this.nome = nome;
        tipoJogador = tipo;
        jogo = new JogoGeneral();
        jogada = 1;
        totalJogadas = 0;
    }

    public String getNome() {
        return nome;
    }

    public char getTipoJogador() {
        return tipoJogador;
    }

    public JogoGeneral getJogo() {
        return jogo;
    }
    
    public int getTotalJogadas() {
        return totalJogadas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(char tipo) {
        this.tipoJogador = tipo;
    }

    public void JogarDados() {
        this.jogo.rolarDados();
    }

    public void setTotalJogadas() {
        this.totalJogadas = 0;

        for (int i = 0; i < jogo.getJogadados().length; i++) {
            if (jogo.getJogadados()[i] != -1) {
                this.totalJogadas += jogo.getJogadados()[i];
            }
        }
    }

    public void escolherJogada(int j) {
        jogo.pontuarJogada(j);
    }

    public int escolherJogadaMaquina() {
        for (int i = jogo.getJogadados().length; i > 0; i--) {
            if (jogo.validarJogada(i) == true && jogo.getJogadados()[i - 1] == -1) {
                jogada = i;
                jogo.pontuarJogada(jogada);
                return jogada;
            } else if (jogo.getJogadados()[i - 1] == -1) {
                jogada = i;
            }
        }

        jogo.pontuarJogada(jogada);
        return jogada;
    }

    public void ZerarJogadas() {
        jogo.setJogadas();
    }

    public void mostrarJogadasExecutadas() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < jogo.getJogadados().length; j++) {
                if (i == 0) {
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
                if (i == 1 && jogo.getJogadados()[j] == -1) {
                    System.out.format("-\t");
                } else if (i == 1 && jogo.getJogadados()[j] != -1) {
                    System.out.format("%d\t", jogo.getJogadados()[j]);
                }
            }
            System.out.println();
        }
    }
}
