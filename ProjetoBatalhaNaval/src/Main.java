/* o desafio consiste em implementar esse jogo em um programa Java, mas para facilitar um pouco,
vamos alterar levemente as especificações do jogo:
Em nossa versão, teremos apenas navios do tipo submarino (1 quadrado).
• Cada jogador deverá posicionar em sua grelha dez submarinos.
• O programa aceitará apenas um jogador, pois o oponente será o computador.
• Para não precisarmos utilizar cores no terminal vamos usar as marcações:
. Navio posicionado N (ene maiúsculo)
. Tiro certeiro * (asterisco)
. Tiro na água – (traço)
. Tiro certeiro com navio posicionado X (xis maiúsculo)
. Tiro na água com navio posicionado n (ene minúsculo)
• Durante a partida o programa exibirá apenas a situação atual do jogador.
• Ao final do jogo, devemos indicar o vencedor e imprimir os dois
tabuleiros.
OBSERVAÇÕES: letra e número nas jogadas
- letra representa a linha e número a coluna; switch case
-
DIVISÃO:
- CRIAR TABULEIROS - falta formatação (Cris)
- INSERIR NAVIOS (criar opções RANDOM, ESCOLHE JOGADAS) e computador sempre random (herança)-
classe Jogador - random padrão - @Override sobreescreve para preenchimento manual
- classe Tabuleiro ok
- Preenchimento das Jogadas com frases
- Comparação em cada jogada contador com placar
-
-
- FRASE DO QUE ACONTECEU E PLACAR
-
 */


import model.*;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static boolean existeGanhador = false;
    public static JogadorPessoa jogadorPessoa = new JogadorPessoa();
    public static JogadorMaquina jogadorMaquina = new JogadorMaquina();

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro();
        Partida partida = new Partida();

        System.out.println("Iniciando Tabuleiro Batalha Naval!");

        partida.solicitaNomeDosJogadores("Jogador1", jogadorPessoa);
        partida.solicitaNomeDosJogadores("Jogador2", jogadorMaquina);

        tabuleiro.montaTabuleiro(jogadorPessoa);
        tabuleiro.montaTabuleiro(jogadorMaquina);

        tabuleiro.imprimeTabuleiro(jogadorPessoa);
        tabuleiro.imprimeTabuleiro(jogadorMaquina);

        while (!existeGanhador){

            jogadorPessoa.fazJogadaContra(jogadorMaquina);
            jogadorMaquina.fazJogadaContra(jogadorPessoa);

            partida.verificaSeExisteUmGanhador(jogadorPessoa);
            partida.verificaSeExisteUmGanhador(jogadorMaquina);
        }
        System.out.println("JOGO FINALIZADO");

    }
}