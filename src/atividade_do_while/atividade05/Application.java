package atividade_do_while.atividade05;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int somaPositivos = 0, numero;
        do {
            System.out.println("Digite um número:");
            numero = read.nextInt();

            if (numero > 0) {
                somaPositivos += numero;
            }
        } while (numero != 0);

        System.out.printf("A soma dos números positivos é: %s", somaPositivos);
    }
}
