
import java.util.Scanner;
<<<<<<< HEAD
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
=======
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45

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
<<<<<<< HEAD
    private Jogador[] jogadores = new Jogador[MAXJO];
    private int sideJog;
    private int jogada;
    private File arquivo = new File("jog.dat");

    public Campeonato() {
        for (int i = 0; i < MAXJO; i++) {
          jogadores[i] = null;
        }
        sideJog = 0;
=======
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
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
        jogada = 0;
    }

    public void incluirJogador() {
<<<<<<< HEAD
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do jogador: ");
        String nome = teclado.nextLine();
        char tipo;
=======
        /*Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do jogador: ");
        nome = teclado.nextLine();
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45

        do {
            System.out.println("Digite o tipo de jogador [H: humano ou M: Maquina]: ");
            tipo = teclado.nextLine().charAt(0);
            if (tipo != 'h' && tipo != 'H' && tipo != 'm' && tipo != 'M') {
                System.out.println("Tipo de jogador INVALIDO!");
            }
        } while (tipo != 'h' && tipo != 'H' && tipo != 'm' && tipo != 'M');

<<<<<<< HEAD
        if (sideJog < MAXJO) {
            jogadores[sideJog] = new Jogador(nome, tipo);
            this.sideJog++;
        }
=======
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
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
    }

    public void excluirJogador() {
        Scanner teclado = new Scanner(System.in);
<<<<<<< HEAD
        
        for(int i=0; i<sideJog; i++){
            System.out.println(jogadores[i].getNome());
        }

        System.out.println("Digite o nome do jogador que voce deseja exclir: ");
        String nome = teclado.nextLine();

        if (sideJog == 1) {
            if(jogadores[0].getNome().equals(nome)){
                jogadores[sideJog - 1] = null;
                sideJog = 0;
            } else{
                System.out.println("Jogador nao encontrado, verifique se digitou o nome corretamente!");
            }  
        } else {
            int pos = -1;
            for (int i = 0; i < sideJog; i++) {
                if (jogadores[i].getNome().equals(nome)) {
=======

        System.out.println("Digite o nome do jogador: ");
        nome = teclado.nextLine();

        if (posicao == 1) {
            jogadores[posicao - 1] = null;
            posicao = 0;
        } else {
            int pos = -1;
            for (int i = 0; i < posicao; i++) {
                if (nome.equals(jogadores[i].getNome())) {
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
                    pos = i;
                }
            }
            if (pos != -1) {
<<<<<<< HEAD
                for (int j = pos; j < sideJog - 1; j++) {
                    jogadores[j] = jogadores[j + 1];
                }
                this.sideJog--;
            } else if(pos == -1){
                System.out.println("Jogador nao encontrado, verifique se digitou corretamente!");
            }

        }
        //System.out.println(posicao);
=======
                for (int j = pos; j < posicao - 1; j++) {
                    jogadores[j] = jogadores[j + 1];
                }
                this.posicao--;
            }

        }
        System.out.println(posicao);
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45

    }

    public void iniciarCampeonato() {
<<<<<<< HEAD
        if (sideJog > 0) {
            for (int i = 0; i < sideJog; i++) {
                jogadores[i].ZerarJogadas();
            }
        }
        if (sideJog == 0) {
            System.out.println("ERRO! Precisa de pelo menos um jogador para executar uma rodada!");
        } else {
            for (int k = 0; k < 13; k++) {
                for (int j = 0; j < sideJog; j++) {
                    if (jogadores[j].getTipoJogador() == 'h' || jogadores[j].getTipoJogador() == 'H') {
                        Scanner teclado = new Scanner(System.in);

                        System.out.println("Rolando dados para: " + jogadores[j].getNome() + "(" + jogadores[j].getTipoJogador() + ")");
=======
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
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
                        System.out.printf("Valores obtidos: ");
                        jogadores[j].JogarDados();

                        for (int i = 0; i < jogadores[j].getJogo().getDados().length; i++) {
<<<<<<< HEAD
                            if (i < (jogadores[j].getJogo().getDados().length - 1)) {
                                System.out.printf("%d-", jogadores[j].getJogo().getDados()[i].getSideUp());
                            } else {
                                System.out.printf("%d ", jogadores[j].getJogo().getDados()[i].getSideUp());
                            }
=======
                            System.out.printf("%d ", jogadores[j].getJogo().getDados()[i].getSideUp());
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
                        }

                        System.out.println();
                        System.out.println("Para qual jogada voce quer marcar: [1 - 13] " + jogadores[j].getNome() + "?");
                        jogadores[j].mostrarJogadasExecutadas();
                        jogada = teclado.nextInt();

                        jogadores[j].escolherJogada(jogada);
<<<<<<< HEAD
                        System.out.println("");
=======
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
                    } else {
                        System.out.println("Rolando dados para: " + jogadores[j].getNome());
                        System.out.printf("Valores obtidos: ");
                        jogadores[j].JogarDados();

                        for (int i = 0; i < jogadores[j].getJogo().getDados().length; i++) {
<<<<<<< HEAD
                            if (i < (jogadores[j].getJogo().getDados().length - 1)) {
                                System.out.printf("%d-", jogadores[j].getJogo().getDados()[i].getSideUp());
                            } else {
                                System.out.printf("%d ", jogadores[j].getJogo().getDados()[i].getSideUp());
                            }
                        }

                        System.out.println();
                        System.out.println("Jogada escolhida por " + jogadores[j].getNome() + "(" + jogadores[j].getTipoJogador() + ") [1 - 13]: " + jogadores[j].escolherJogadaMaquina());
                        jogadores[j].mostrarJogadasExecutadas();
                        System.out.println("");
=======
                            System.out.printf("%d ", jogadores[j].getJogo().getDados()[i].getSideUp());
                        }

                        System.out.println();
                        System.out.println("Jogada escolhida por " + jogadores[j].getNome() + " " + jogadores[j].escolherJogadaMaquina());
                        jogadores[j].mostrarJogadasExecutadas();
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45

                    }

                }
            }
        }

    }

    public void mostrarCartela() {
<<<<<<< HEAD
        String vencedor = null;
        int maiorPont = 0;
        System.out.println("-- Cartela de resultados --");
        for (int i = 0; i <= 15; i++) {
            for (int j = 0; j <= sideJog; j++) {
=======
        System.out.println("-- Cartela de resultados --");
        for (int i = 0; i <= 15; i++) {
            for (int j = 0; j <= posicao; j++) {
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
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
<<<<<<< HEAD
                    if (jogadores[j - 1].getJogo().getJogadas()[i - 1] == -1) { // caso o jogador humano escolher uma jogada repetida
                        System.out.printf(" \tX\t");                         // uma jogada nao vai ser realizada entao printar X
                    } else {
                        System.out.printf(" \t%d\t", jogadores[j - 1].getJogo().getJogadas()[i - 1]);
=======
                    if (jogadores[j - 1].getJogo().getJogadados()[i - 1] == -1) { // caso o jogador humano escolher uma jogada repetida
                        System.out.printf(" \tX\t");                         // uma jogada nao vai ser realizada entao printar X
                    } else {
                        System.out.printf(" \t%d\t", jogadores[j - 1].getJogo().getJogadados()[i - 1]);
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
                    }
                } else if (i == 15 && j == 0) {
                    System.out.printf("Total: \t");
                } else if (i == 14) {
<<<<<<< HEAD
                    for (int k = 0; k < 7; k++) {
=======
                    for (int k = 0; k < 8; k++) {
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
                        System.out.printf(" -");
                    }
                } else {
                    jogadores[j - 1].setTotalJogadas();
                    System.out.printf(" \t%d\t", jogadores[j - 1].getTotalJogadas());
<<<<<<< HEAD
                    if (maiorPont < jogadores[j - 1].getTotalJogadas()) {
                        maiorPont = jogadores[j - 1].getTotalJogadas();
                        vencedor = jogadores[j - 1].getNome();
                    }
=======
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
                }
            }
            System.out.println("");
        }
<<<<<<< HEAD
        if (vencedor != null && sideJog > 1) {
            System.out.println(vencedor + " ganhou essa rodada!");
        }

    }

    public void gravarEmArquivo() {
        try {
            FileOutputStream fout = new FileOutputStream(arquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            // gravando o vetor de pessoas no arquivo
            oos.writeObject(jogadores);
            oos.writeObject(sideJog);
            oos.flush();
            oos.close();
            fout.close();

            System.out.println("Arquivo gravado com sucesso!");
        } catch (Exception ex) {
            System.err.println("erro: " + ex.toString());
        }
    }

    public void lerEmArquivos() {
        try {
            FileInputStream fin = new FileInputStream(arquivo);
            ObjectInputStream oin = new ObjectInputStream(fin);
            /*Lendo os objetos de um arquivo e fazendo a coercao de tipos*/

            jogadores = (Jogador[]) oin.readObject();
            oin.close();
            fin.close();

            System.out.println("Aquivo lido com sucesso!");
        } catch (Exception ex) {
            System.err.println("erro: " + ex.toString());
        }
=======
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
    }

}
