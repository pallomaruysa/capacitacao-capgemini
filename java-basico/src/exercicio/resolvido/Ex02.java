package exercicio.resolvido.palloma_soares;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a medida da largura do terreno (com uma casa decimal)");
        double  largura = sc.nextDouble();
        System.out.println("Digite a medida do comprimento do terreno (com uma casa decimal)");
        double  comprimento = sc.nextDouble();
        System.out.println("Digite a medida do metro quadrado do terreno (com duas casas decimais)");
        double  metro2 = sc.nextDouble();

        double area = largura * comprimento;
        double preco = metro2 * area;

        System.out.printf("Área do Terreno Retangular: %.2f%n", area);
        System.out.printf("Preço do Terreno Retangular: %.2f%n", preco);

        sc.close();
    }
}
