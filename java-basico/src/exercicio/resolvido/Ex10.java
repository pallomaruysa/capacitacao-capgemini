package exercicio.resolvido.palloma_soares;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        /*
            Algoritmo  que leia dois valor x e y e criar
            com linha X  e coluna Y e imprimir os valores dos elementos
         */

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int [][] matriz = new int[x][y];

        for(int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
