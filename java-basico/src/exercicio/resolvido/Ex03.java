package exercicio.resolvido.palloma_soares;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

    //desvio fluxo
    //fazer algoritmo para ler duas notas de um aluno e calcular a media
    // se a media dor menor que 6.0   "REPROVADO!" senao "APROVADO!

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media;

        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) /2;

        if(media<6.0){
            System.out.println("REPROVADO! Sua média foi de: "+media);
        }
        else{
            System.out.println("APROVADO! Sua média foi de: "+media);
        }

        sc.close();
    }
}
