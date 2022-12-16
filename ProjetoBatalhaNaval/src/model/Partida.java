package model;

import java.util.Scanner;

/**
 * @author CrisMoura on 15/12/2022
 */
public class Partida {

    public void solicitaNomeDoJogador(String jogadorNumero, Jogador jogador) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do " + jogadorNumero);
        jogador.nome = entrada.next();
    }

    public void verificaSeGanhou(Jogador jogador, boolean existeGanhador) {
        if (jogador.quantidadeAcertos == 10){
            System.out.println("Parabens "+ jogador.nome + " !!! Vc é o ganhador!!");
            existeGanhador = true;
        }
        existeGanhador =  false;
    }


    public void jogada(Jogador jogadorPrincipal, Jogador jogadorOponente, String linhaJogadaLetra , int colunaJogada){
        Tabuleiro tabuleiro = new Tabuleiro();
        int linhaJogadaNumero = converterLetra(linhaJogadaLetra);

        if (jogadorPrincipal.tabuleiro[linhaJogadaNumero][colunaJogada] == null) {

            if (jogadorOponente.tabuleiro[linhaJogadaNumero][colunaJogada] == null) {
                jogadorPrincipal.tabuleiro[linhaJogadaNumero][colunaJogada] = "-";
                System.out.println("Ops... Tiro na água!");
            } else if (jogadorOponente.tabuleiro[linhaJogadaNumero][colunaJogada] == "N") {
                jogadorPrincipal.tabuleiro[linhaJogadaNumero][colunaJogada] = "*";
                jogadorPrincipal.quantidadeAcertos++;
                System.out.println("Parabéns... Submarino Atingido!");

            } else {
                System.out.println("Jogada Inválida. Tente novamente!");
            }

        } else if (jogadorPrincipal.tabuleiro[linhaJogadaNumero][colunaJogada] == "N") {

            if (jogadorOponente.tabuleiro[linhaJogadaNumero][colunaJogada] == null) {
                jogadorPrincipal.tabuleiro[linhaJogadaNumero][colunaJogada] = "n";
                System.out.println("Ops... Tiro na água!");
            } else if (jogadorOponente.tabuleiro[linhaJogadaNumero][colunaJogada] == "N") {
                jogadorPrincipal.tabuleiro[linhaJogadaNumero][colunaJogada] = "X";
                jogadorPrincipal.quantidadeAcertos++;
                System.out.println("Parabéns... Submarino Atingido!");
            } else {
                System.out.println("Jogada Inválida. Tente novamente!");
            }
        } else {
            System.out.println("Jogada Inválida. Tente novamente!");
        }
        tabuleiro.imprimeTabuleiro(jogadorPrincipal);

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
