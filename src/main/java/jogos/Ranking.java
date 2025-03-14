package jogos;

import model.Jogador;

import java.util.ArrayList;
import java.util.Comparator;

public class Ranking {
    private ArrayList<Jogador> jogadores;

    public Ranking(){
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador){
        if(!this.jogadores.contains(jogador)){
            this.jogadores.add(jogador);
        }
    }

    public void exibirRanking(){
        // Ordenação reversa - do maior para o menor
        this.jogadores.sort(Comparator.comparingInt(Jogador::getPontuacao).reversed());

        StringBuilder ranking = new StringBuilder("\n== RANKING DOS JOGADORES == \n");
        for (int i = 0; i < this.jogadores.size(); i++){
            ranking.append((i+1)).append(" - ").append(this.jogadores.get(i)).append("\n");
        }

        System.out.println(ranking);
    }
}
