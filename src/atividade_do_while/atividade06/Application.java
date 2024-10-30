package atividade_do_while.atividade06;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int numero, count = 0, somaTotal = 0;
        do {

            System.out.println("Digite um número: ");
            numero = read.nextInt();

            if (numero == 0)
                break;

            if (numero % 3 == 0) {
                count++;
                somaTotal += numero;
            }
        } while (true);

        System.out.printf("A média de todos os números múltiplos de 3 é: %.1f", ((float) somaTotal / count));
    }
}
