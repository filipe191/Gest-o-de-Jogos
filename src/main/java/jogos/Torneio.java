// Classe Torneio.java (jogos/Torneio.java)
package jogos;

import model.Jogador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Torneio {

    private String nome;
    private ArrayList<Jogador> jogadores;
    private Random random;
    private int numeroRodadas;

    public Torneio(String nome, int numeroRodadas) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
        this.random = new Random();
        this.numeroRodadas = numeroRodadas;
    }

    public void adicionarJogador(Jogador jogador) {
        if (!jogadores.contains(jogador)) {
            jogadores.add(jogador);
        }
    }

    public void simularTorneio() {
        System.out.println("\nSimulando " + numeroRodadas + " rodada(s) do " + this);

        for (int rodada = 1; rodada <= numeroRodadas; rodada++) {
            System.out.println("Rodada " + rodada + ":");
            for (Jogador jogador : jogadores) {
                int pontos = random.nextInt(401) + 100; // Pontos entre 100 e 500
                jogador.adicionarPontuacao(pontos);
                System.out.println("  " + jogador.getNome() + " ganhou " + pontos + " pontos");
            }
        }
    }

    public void exibirRankingFinal() {
        // Ordenação decrescente
        jogadores.sort(Comparator.comparingInt(Jogador::getPontuacao).reversed());

        StringBuilder ranking = new StringBuilder("\n== RANKING FINAL DO " + this + " ==\n");
        for (int i = 0; i < jogadores.size(); i++) {
            ranking.append(i + 1).append(" - ").append(jogadores.get(i)).append("\n");
        }

        // Função para exibir o vencedor
        Jogador vencedor = jogadores.get(0);
        ranking.append("\n🏆 VENCEDOR: ").append(vencedor.getNome())
                .append(" com ").append(vencedor.getPontuacao()).append(" pontos!");

        System.out.println(ranking);
    }

    @Override
    public String toString() {
        return "Torneio " + nome;
    }
}