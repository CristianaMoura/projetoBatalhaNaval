package model;

import java.util.Random;

/**
 * @author CrisMoura on 15/12/2022
 */
public class JogadorMaquina extends Jogador{
    public JogadorMaquina() {
        this.tabuleiro  = new String[10][10];
        this.quantidadeAcertos = 0;
    }

    @Override
    public void fazJogadaContra(Jogador jogadorOponente) {
        String letras[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        Random gerador = new Random();
        Partida partida = new Partida();

        String linhaJogadaLetraMaquina;
        int colunaJogadaMaquina;

        System.out.println("Iniciando Jogada do Computador!");

        linhaJogadaLetraMaquina = letras[gerador.nextInt(10)];
        colunaJogadaMaquina = gerador.nextInt(10);

        System.out.println("Jogada do Computador! " + linhaJogadaLetraMaquina +" " + colunaJogadaMaquina);

        partida.jogada(this, jogadorOponente, linhaJogadaLetraMaquina, colunaJogadaMaquina);
    }
}
