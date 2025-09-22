import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qntJogadores = 3;
        int qntCartas = 7;
        List<String> bar = new ArrayList<>();

        List<Jogador> jogadores = new ArrayList<>();
        for(int i = 0;i < qntJogadores;i++) {
            System.out.println("Digite o nome do jogador: ");
            String nome = in.nextLine();
            Jogador jogador = new Jogador(nome);
            jogadores.add(jogador);
        }

        bar = Baralho.gerarBaralho();
        Collections.shuffle(bar);
        System.out.println("Baralho embaralhado!");

        for(int i = 0;i < jogadores.size();i++) {
            jogadores.get(i).setMao(Baralho.distribuirCartas(bar,qntCartas));
            System.out.println(jogadores.get(i).getNome() +" recebeu : " + jogadores.get(i).getMao());

        }



    }
}
