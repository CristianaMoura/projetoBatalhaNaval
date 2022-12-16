import model.Jogador;

public class Tabuleiro {


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
