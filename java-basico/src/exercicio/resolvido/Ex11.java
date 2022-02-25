package exercicio.resolvido.palloma_soares;

import java.util.Scanner;

public class Ex11 {
    /*      1 - criar uma matriz quadrada
            2 - apresentar os valores da diagonal principal
            3 - apresentar os elementos negativos da matriz;
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elementos da diagonal principal");
        for(int i = 0; i<n; i++){
            System.out.print(matriz[i][i]+" ");
        }
        System.out.println();

        int qntNumerosNegativos = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(matriz[i][j]<0){
                    qntNumerosNegativos++;
                }
            }
        }
        System.out.printf("Quantidade de numeros negativos %d %n", qntNumerosNegativos);
        sc.close();
    }
}
