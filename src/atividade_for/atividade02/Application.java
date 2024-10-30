package atividade_for.atividade02;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int par = 0, impar = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %sº número: \n", (i + 1));
            int numero = read.nextInt();

            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.printf("""
                Total de números pares: %s
                
                Total de números ímpares: %s
                """, par, impar);
    }
}
