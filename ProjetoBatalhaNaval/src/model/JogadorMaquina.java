package model;

/**
 * @author CrisMoura on 15/12/2022
 */
public class JogadorMaquina extends Jogador{
    public JogadorMaquina() {
        this.tabuleiro  = new String[10][10];
        this.quantidadeAcertos = 0;
        this.nome = "Player Maquina";
    }

}
