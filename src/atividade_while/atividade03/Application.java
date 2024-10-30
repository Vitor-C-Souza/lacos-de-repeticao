package atividade_while.atividade03;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int menor21 = 0, maior50 = 0;
        while (true) {
            System.out.println("Digite uma idade: ");
            int idade = read.nextInt();

            if (idade < 0)
                break;

            if (idade > 50)
                maior50++;
            else if (idade < 21)
                menor21++;
        }

        System.out.printf("""
                Total de pessoas menores de 21 anos: %s
                
                Total de pessoas maiores de 50 anos: %s
                """, menor21, maior50);
    }
}
