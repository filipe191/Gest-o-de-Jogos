
// Classe Jogador.java (model/Jogador.java)
package model;

public class Jogador {
    private String nome;
    private int pontuacao;

    public Jogador(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public void adicionarPontuacao(int pontos){
        this.pontuacao += pontos;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    @Override
    public String toString() {
        return String.format("Jogador: %s | Pontuação: %d", this.nome, this.pontuacao);
    }
}