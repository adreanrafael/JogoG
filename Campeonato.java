
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author adrea
 */
public class Campeonato {

    private final int MAXJO = 10;
    private final Jogador[] jogadores = new Jogador[MAXJO];
    private int posicao;
    private char tipo;
    private String nome;
    private int jogada;

    public Campeonato() {
        for (int i = 0; i < MAXJO; i++) {
            jogadores[i] = null;
        }
        posicao = 0;
        tipo = ' ';
        nome = null;
        jogada = 0;
    }

    public void incluirJogador() {
        /*Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do jogador: ");
        nome = teclado.nextLine();

        do {
            System.out.println("Digite o tipo de jogador [H: humano ou M: Maquina]: ");
            tipo = teclado.nextLine().charAt(0);
            if (tipo != 'h' && tipo != 'H' && tipo != 'm' && tipo != 'M') {
                System.out.println("Tipo de jogador INVALIDO!");
            }
        } while (tipo != 'h' && tipo != 'H' && tipo != 'm' && tipo != 'M');

        if (posicao < MAXJO) {
            jogadores[posicao] = new Jogador(nome, tipo);
            this.posicao++;
        }
        System.out.println(posicao);*/

        // para testar
        String[] j1 = {"adrean", "Souza", "Rafael", "Lucas", "Carteira", "Felipe", "Vitor", "Renan", "Lorenzo", "Diogo"};
        char m1 = 'm';
        
        
        //for(int i = 0; i < MAXJO; i++){
            System.out.println("Digite o nome do jogador: ");
            System.out.println(j1[posicao]);
            System.out.println("Digite o tipo de jogador [H: humano ou M: Maquina]: ");
            System.out.println(m1);
            
            jogadores[posicao] = new Jogador(j1[posicao], m1);
            posicao++;
        //}
    }

    public void excluirJogador() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do jogador: ");
        nome = teclado.nextLine();

        if (posicao == 1) {
            jogadores[posicao - 1] = null;
            posicao = 0;
        } else {
            int pos = -1;
            for (int i = 0; i < posicao; i++) {
                if (nome.equals(jogadores[i].getNome())) {
                    pos = i;
                }
            }
            if (pos != -1) {
                for (int j = pos; j < posicao - 1; j++) {
                    jogadores[j] = jogadores[j + 1];
                }
                this.posicao--;
            }

        }
        System.out.println(posicao);

    }

    public void iniciarCampeonato() {
        if (posicao > 0) {
            for (int i = 0; i < posicao; i++) {
                jogadores[i].ZerarJogadas();
            }
        }
        if (posicao == 0) {
            System.out.println("ERRO! Precisa de pelo menos um jogador para executar uma rodada!");
        } else {
            for (int k = 0; k < 13; k++) {
                for (int j = 0; j < posicao; j++) {
                    if (jogadores[j].getTipoJogador() == 'h' || jogadores[j].getTipoJogador() == 'H') {
                        Scanner teclado = new Scanner(System.in);

                        System.out.println("Rolando dados para: " + jogadores[j].getNome());
                        System.out.printf("Valores obtidos: ");
                        jogadores[j].JogarDados();

                        for (int i = 0; i < jogadores[j].getJogo().getDados().length; i++) {
                            System.out.printf("%d ", jogadores[j].getJogo().getDados()[i].getSideUp());
                        }

                        System.out.println();
                        System.out.println("Para qual jogada voce quer marcar: [1 - 13] " + jogadores[j].getNome() + "?");
                        jogadores[j].mostrarJogadasExecutadas();
                        jogada = teclado.nextInt();

                        jogadores[j].escolherJogada(jogada);
                    } else {
                        System.out.println("Rolando dados para: " + jogadores[j].getNome());
                        System.out.printf("Valores obtidos: ");
                        jogadores[j].JogarDados();

                        for (int i = 0; i < jogadores[j].getJogo().getDados().length; i++) {
                            System.out.printf("%d ", jogadores[j].getJogo().getDados()[i].getSideUp());
                        }

                        System.out.println();
                        System.out.println("Jogada escolhida por " + jogadores[j].getNome() + " " + jogadores[j].escolherJogadaMaquina());
                        jogadores[j].mostrarJogadasExecutadas();

                    }

                }
            }
        }

    }

    public void mostrarCartela() {
        System.out.println("-- Cartela de resultados --");
        for (int i = 0; i <= 15; i++) {
            for (int j = 0; j <= posicao; j++) {
                if (i == 0 && j == 0) {
                    System.out.printf(" \t");
                } else if (i == 0 && j != 0) {
                    System.out.printf(" \t%s(%c) ", jogadores[j - 1].getNome(), jogadores[j - 1].getTipoJogador());
                } else if (j == 0 && i != 0 && i < 14) {
                    if (i < 7) {
                        System.out.printf(" %d  \t", i);
                    } else if (i == 7) {
                        System.out.printf(" %d(T)  \t", i);
                    } else if (i == 8) {
                        System.out.printf(" %d(Q)  \t", i);
                    } else if (i == 9) {
                        System.out.printf(" %d(F)  \t", i);
                    } else if (i == 10) {
                        System.out.printf(" %d(S+)\t", i);
                    } else if (i == 11) {
                        System.out.printf(" %d(S-)\t", i);
                    } else if (i == 12) {
                        System.out.printf(" %d(G)\t", i);
                    } else if (i == 13) {
                        System.out.printf(" %d(X)\t", i);
                    }
                } else if (i < 14) {
                    if (jogadores[j - 1].getJogo().getJogadados()[i - 1] == -1) { // caso o jogador humano escolher uma jogada repetida
                        System.out.printf(" \tX\t");                         // uma jogada nao vai ser realizada entao printar X
                    } else {
                        System.out.printf(" \t%d\t", jogadores[j - 1].getJogo().getJogadados()[i - 1]);
                    }
                } else if (i == 15 && j == 0) {
                    System.out.printf("Total: \t");
                } else if (i == 14) {
                    for (int k = 0; k < 8; k++) {
                        System.out.printf(" -");
                    }
                } else {
                    jogadores[j - 1].setTotalJogadas();
                    System.out.printf(" \t%d\t", jogadores[j - 1].getTotalJogadas());
                }
            }
            System.out.println("");
        }
    }

}
