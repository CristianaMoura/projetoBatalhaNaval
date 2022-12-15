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


import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[][] tabuleiroJogador = new String[10][10];
        String[][] tabuleiroComputador = new String[10][10];

        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.imprimeTabuleiro(tabuleiroJogador);

        Random gerador = new Random();

        int contador = 10;
        int linha, coluna;

        while (contador > 0) {
            linha = gerador.nextInt(10);
            coluna = gerador.nextInt(10);
            tabuleiroJogador[linha][coluna] = "N";
            linha = gerador.nextInt(10);
            coluna = gerador.nextInt(10);
            tabuleiroComputador[linha][coluna] = "N";
            contador--;
        }

        System.out.println("Iniciando Tabuleiro Batalha Naval!");
        tabuleiro.imprimeTabuleiro(tabuleiroJogador);
        tabuleiro.imprimeTabuleiro(tabuleiroComputador);



        String linhaJogadaLetra;
        int colunaJogada, contadorAtaque = 10;

        while (contadorAtaque > 0) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Informe a jogada que deseja letra e número: ");
            linhaJogadaLetra = entrada.nextLine();
            colunaJogada = entrada.nextInt();
            int linhaJogadaNumero = converterLetra(linhaJogadaLetra);

            if (tabuleiroJogador[linhaJogadaNumero][colunaJogada] == null) {

                if (tabuleiroComputador[linhaJogadaNumero][colunaJogada] == null) {
                    tabuleiroJogador[linhaJogadaNumero][colunaJogada] = "-";
                    System.out.println("Ops... Tiro na água!");
                } else if (tabuleiroComputador[linhaJogadaNumero][colunaJogada] == "N") {
                    tabuleiroJogador[linhaJogadaNumero][colunaJogada] = "*";
                    System.out.println("Parabéns... Submarino Atingido!");

                } else {
                    System.out.println("Jogada Inválida. Tente novamente!");
                }

            } else if (tabuleiroJogador[linhaJogadaNumero][colunaJogada] == "N") {

                if (tabuleiroComputador[linhaJogadaNumero][colunaJogada] == null) {
                    tabuleiroJogador[linhaJogadaNumero][colunaJogada] = "n";
                    System.out.println("Ops... Tiro na água!");
                } else if (tabuleiroComputador[linhaJogadaNumero][colunaJogada] == "N") {
                    tabuleiroJogador[linhaJogadaNumero][colunaJogada] = "X";
                    System.out.println("Parabéns... Submarino Atingido!");
                } else {
                    System.out.println("Jogada Inválida. Tente novamente!");
                }
            } else {
                System.out.println("Jogada Inválida. Tente novamente!");
            }
            tabuleiro.imprimeTabuleiro(tabuleiroJogador);
            contadorAtaque--;
        }


       /* String jogadaLetra = new String();

        int jogadaNumero = 0;

        int contadorNavio = 0;*/








//        do {
//            Scanner entrada = new Scanner(System.in);
//            System.out.println("Digite a posição do Navio "+ contadorNavio);
//
//            System.out.println("Digite uma letra e um número");
//            jogadaLetra = entrada.nextLine();
//            jogadaNumero = entrada.nextInt();
//
//            int letraConvertida = converterLetra(jogadaLetra);
//
//            tabuleiro[letraConvertida][jogadaNumero] = ("N" + "\t");
//            contadorNavio++;
//
//            tabuleiroManual.imprimeTabuleiro(tabuleiro);
//
//        } while(contadorNavio <= 9);

    }


    public static int converterLetra(String letra) {
        switch (letra.toLowerCase()) {
            case "a":
                return 0;
            case "b":
                return 1;
            case "c":
                return 2;
            case "d":
                return 3;
            case "e":
                return 4;
            case "f":
                return 5;
            case "g":
                return 6;
            case "h":
                return 7;
            case "i":
                return 8;
            case "j":
                return 9;
            default:
                System.out.println("Número Inválido");
        }

        return 0;
    }




    }