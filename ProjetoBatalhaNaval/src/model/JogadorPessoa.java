package model;

import java.util.Scanner;

/**
 * @author CrisMoura on 15/12/2022
 */
public class JogadorPessoa extends Jogador{
    public JogadorPessoa() {
        this.tabuleiro  = new String[10][10];
        this.quantidadeAcertos = 0;
    }

    @Override
    public void fazJogadaContra(Jogador jogadorOponente) {
        String linhaJogadaLetra;
        int colunaJogada;
        Partida partida = new Partida();

        Scanner entrada = new Scanner(System.in);
        System.out.println(this.nome +" - Informe a jogada que deseja letra e número: ");
        linhaJogadaLetra = entrada.nextLine();
        colunaJogada = entrada.nextInt();

        partida.jogada(this, jogadorOponente, linhaJogadaLetra, colunaJogada);
    }
}
