
// Classe Main.java (main/Main.java)
package main;

import jogos.Torneio;
import model.Jogador;

public class Main {
    public static void main(String[] args) {
        // Criando primeiro torneio - Torneio de Verão com 4 jogadores e 3 rodadas
        Torneio torneioVerao = new Torneio("de Verão", 3);
        torneioVerao.adicionarJogador(new Jogador("Maria", 0));
        torneioVerao.adicionarJogador(new Jogador("João", 0));
        torneioVerao.adicionarJogador(new Jogador("Pedro", 0));
        torneioVerao.adicionarJogador(new Jogador("Luiza", 0));

        System.out.println("\n🔹 Iniciando " + torneioVerao + "...");
        torneioVerao.simularTorneio();
        torneioVerao.exibirRankingFinal();

        // Criando segundo torneio - Torneio de Inverno com 5 jogadores e 2 rodadas
        Torneio torneioInverno = new Torneio("de Inverno", 2);
        torneioInverno.adicionarJogador(new Jogador("José", 0));
        torneioInverno.adicionarJogador(new Jogador("Ana", 0));
        torneioInverno.adicionarJogador(new Jogador("Carlos", 0));
        torneioInverno.adicionarJogador(new Jogador("Beatriz", 0));
        torneioInverno.adicionarJogador(new Jogador("Felipe", 0));

        System.out.println("\n🔹 Iniciando " + torneioInverno + "...");
        torneioInverno.simularTorneio();
        torneioInverno.exibirRankingFinal();
    }
}