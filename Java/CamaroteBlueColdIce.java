// Desafio

// No show da famosa banda Blue Cold Ice Cubes o vocalista, Antônio Queda, escolheu todas as pessoas que estavam na posição impar da fila para entrarem no camarote. Ele fez isso em diversos shows e as pessoas foram a loucura para competirem por essas posições. Você resolveu criar um programa para saber, de acordo com o número de pessoas na fila, quantas entrariam no camarote.
// Entrada: A entrada será o tamanho da fila que aguardava para ver o show.
// Saída: A saída deve ser o número de pessoas que foram colocadas no camarote. (sem as aspas)

import java.util.Scanner; 
    
public class CamaroteBlueColdIce {    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        int montante = tamanhoDaFila / 2;
        pessoasNoCamarote = montante;
        
        if (tamanhoDaFila % 2 == 0) {
          System.out.println(pessoasNoCamarote + " pessoas no camarote");
        } else {
          pessoasNoCamarote+=1;
          System.out.println(pessoasNoCamarote + " pessoas no camarote");
        }
        leitor.close();
    }
}