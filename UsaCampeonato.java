
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author adrea
 */
public class UsaCampeonato {

    public static void main(String[] args) {
        Campeonato camp = new Campeonato();
        char op;

        Scanner teclado = new Scanner(System.in);
<<<<<<< HEAD

        do {
            System.out.println("  \n..:: Menu interativo ::..");
            System.out.println("(a) Incluir jogador. ");
            System.out.println("(b) Remover jogador (pelo nome). ");
            System.out.println("(c) Executar rodada. ");
            System.out.println("(d) Mostrar a cartela de resultados. ");
            System.out.println("(e) Gravar os dados do campeonato em arquivo. ");
            System.out.println("(f) Ler os dados do campeonato em arquivo. ");
            System.out.println("(g) Sair da aplicacao. ");
            System.out.print("\nEntre com a opcao do menu: ");
=======
        System.out.println("..:: Menu interativo ::..");
        System.out.println("(a) Incluir jogador. ");
        System.out.println("(b) Remover jogador (pelo nome). ");
        System.out.println("(c) Executar rodada. ");
        System.out.println("(d) Mostrar a cartela de resultados. ");
        System.out.println("(e) Gravar os dados do campeonato em arquivo. ");
        System.out.println("(f) Ler os dados do campeonato em arquivo. ");
        System.out.println("(g) Sair da aplicacao. ");

        do {
            System.out.print("Entre com a opcao do menu: ");
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
            op = teclado.next().charAt(0);

            switch (op) {
                case 'a':
                    camp.incluirJogador();
                    break;
                case 'b':
                    camp.excluirJogador();
                    break;
                case 'c':
                    camp.iniciarCampeonato();
                    break;
                case 'd':
                    camp.mostrarCartela();
                    break;
<<<<<<< HEAD
                case 'e':
                    camp.gravarEmArquivo();
                    break;
                case 'f':
                    camp.lerEmArquivos();
                    break;
=======
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
                default:
                    if (op == 'g') {
                        System.out.println("Jogo Encerrado!");
                    } else {
                        System.out.println("Opcao invalida. Tente novamente");
                    }
            }
        } while (op != 'g');
    }
}
<<<<<<< HEAD
=======

// comentar codigos
// gravar em arquivos
// ler em arquivos
// atribuir zero na pontuacao humano
>>>>>>> 5979ab46f578c078c46478b700133d63ee424b45
