package exercicio.resolvido.palloma_soares;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        /*
            algoritmo que le N numero inteiro e armazena em vetor
            mostrar os valores negativos
         */

        Scanner sc = new Scanner(System.in);
        int tamanhoVetor = sc.nextInt();
        int[] listaNumeros = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++){
            listaNumeros[i] = sc.nextInt();
        }

        for (int i = 0; i < tamanhoVetor; i++){
            if (listaNumeros[i] < 0){
                System.out.println(listaNumeros[i] + " ");
            }
        }


        sc.close();
    }
}
