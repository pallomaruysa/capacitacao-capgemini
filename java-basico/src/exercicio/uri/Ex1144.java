package exercicio.uri.palloma_soares;

import java.util.Scanner;

public class Ex1144 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        N *= 2;
        int p2=1, p3=1;

        int matriz [][] = new int[N][4];
        if (N%2==0) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= 3; j++) {
                    matriz[i][j] = i;
                    System.out.print(matriz[i][j]);
                    for (j = 2; j <= 3; j++) {
                        matriz[i][j] = i * i + 1;
                        System.out.print(matriz[i][j]);
                    }
                    for (j = 3; j <= 3; j++) {
                        matriz[i][j] = i * i * i + 1;
                        System.out.println(matriz[i][j]);
                    }
                }
            }
        }else{
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= 3; j++) {
                    matriz[i][j] = i;
                    System.out.print(matriz[i][j]);
                    for (j = 2; j <= 3; j++) {
                        matriz[i][j] = i * i;
                        System.out.print(matriz[i][j]);
                    }
                    for (j = 3; j <= 3; j++) {
                        matriz[i][j] = i * i * i;
                        System.out.println(matriz[i][j]);
                    }
                }
            }
        }



        /*for (int i = 1; i <= N; i++){
            for (int j = 1; j<=3; j++){
                if (i%2==1){
                    System.out.print(i + " ");
                    for (j = 2; j <= 3; j++){
                        p2 = i*i;
                        System.out.print(p2 + " ");
                        for (j=3; j<=3; j++){
                            p3 = i*i*i;
                            System.out.println(p3 + " ");
                        }
                    }
                } else {
                    System.out.print(i-1 + " ");
                    for (j = 2; j <= 3; j++){
                        p2 = i*i+1;
                        System.out.print(p2 + " ");
                        for (j=3; j<=3; j++){
                            p3 = i*i*i+1;
                            System.out.println(p3 + " ");
                        }
                    }
                }
            }*/


        }

    }

