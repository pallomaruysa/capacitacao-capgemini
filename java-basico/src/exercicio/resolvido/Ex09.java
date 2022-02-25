package exercicio.resolvido.palloma_soares;

import java.util.Locale;
import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tamanhoVetores = sc.nextInt();
        String[] listaNomes = new String[tamanhoVetores];
        int[] idades = new int[tamanhoVetores];
        double[] altura = new double[tamanhoVetores];

        double soma = 0.0;

        for(int i = 0; i < tamanhoVetores; i++){
            listaNomes[i] = sc.next();
            idades[i] = sc.nextInt();
            altura[i] = sc.nextDouble();

             soma +=altura[i];
        }

        double media = soma/tamanhoVetores;
        System.out.printf("Média de altura: %.2f%n",media);

        int qntMenor16 = 0;
        for (int i = 0; i < tamanhoVetores; i++){
                if (idades[i]<16){
                    qntMenor16 ++;
                }
        }

        double percentPessoas = (double) qntMenor16 * 100.00 / tamanhoVetores;
        System.out.printf(" %d pessoas com menos de 16 anos são %.1f%%%n", qntMenor16, percentPessoas);

        sc.close();
    }
}
