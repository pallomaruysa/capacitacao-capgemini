package exercicio.resolvido.palloma_soares;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tamanhoVetor = sc.nextInt();

        double[] vetorReal = new double[tamanhoVetor];

        //Entrada de valor no vetor
        for(int i = 0; i < tamanhoVetor; i++){
            vetorReal[i] = sc.nextDouble();
        }

        // impressao do elementos do vetor
        double soma=0.0;
        for(int i = 0; i < tamanhoVetor; i++){
            System.out.print(vetorReal[i]+" ");
            soma += vetorReal[i];
        }
        System.out.println();
        System.out.printf("Soma: %.2f%n", soma);

        double media = soma / tamanhoVetor;
        System.out.printf("Média: %.2f%n", media);

        sc.close();
    }
}
