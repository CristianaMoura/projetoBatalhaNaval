package model;

import java.util.Random;

/**
 * @author CrisMoura on 15/12/2022
 */
public class Tabuleiro {

    public void montaTabuleiro(Jogador jogador){
        Random gerador = new Random();

        int contador = 0;
        int linha, coluna;

        while (contador < 10) {
            linha = gerador.nextInt(10);
            coluna = gerador.nextInt(10);

            if (jogador.tabuleiro[linha][coluna] == null) {
                jogador.tabuleiro[linha][coluna] = "N";
                contador++;
            }
        }
    }

    public String[][] imprimeTabuleiro(Jogador jogador) {

        String letras[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        System.out.println("---------------------------------------------\n" +
                "              "+jogador.nome+" Pontos - "+ jogador.quantidadeAcertos +"                   \n" +
                "---------------------------------------------\n" +
                "|   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |\n" +
                "---------------------------------------------");

        for(int linha = 0; linha < jogador.tabuleiro.length; linha++ ){
            System.out.print("| "+letras[linha]+" ");//print das letras buscando a letra pelo index do for usando variavel "linha"
            for(int coluna = 0; coluna < jogador.tabuleiro.length; coluna++){
                if (jogador.tabuleiro[linha][coluna] == null) { //Se coluna e linha tiverem vazio preenche com "|   " e espaço.
                    System.out.print("|   ");
                }else { // Se não preenche com o "| " + valor encontrado + " ".
                    System.out.print("| " + jogador.tabuleiro[linha][coluna]+ " " );
                }
            }
            System.out.println("|");
        }
        System.out.println("---------------------------------------------\n");

        return jogador.tabuleiro;

    }
}
