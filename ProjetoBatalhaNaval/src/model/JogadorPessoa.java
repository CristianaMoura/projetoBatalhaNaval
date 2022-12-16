package model;

/**
 * @author CrisMoura on 15/12/2022
 */
public class JogadorPessoa extends Jogador{
    public JogadorPessoa() {
        this.tabuleiro  = new String[10][10];
        this.quantidadeAcertos = 0;
        this.nome = "Player 1";
    }


}
