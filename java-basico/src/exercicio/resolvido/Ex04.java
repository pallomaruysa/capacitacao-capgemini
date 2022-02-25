package exercicio.resolvido.palloma_soares;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3;

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if (n1 < n2 && n1<n3){
            System.out.println("Menor número é: "+n1);
        }
        else if(n2 < n3){
            System.out.println("Menor número é: "+n2);
        }
        else{
            System.out.println("Menor número é: "+n3);
        }

        sc.close();
    }
}
