package atividade_for.atividade01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        List<Integer> intervalo = new ArrayList<>();

        System.out.println("Digite o primeiro número do intervalo:");
        intervalo.add(read.nextInt());
        System.out.println("Digite o último número do intervalo:");
        intervalo.add(read.nextInt());

        if (intervalo.get(0) < intervalo.get(1)) {
            System.out.printf("No Intervalo entre %s e %s: \n", intervalo.get(0), intervalo.get(1));

            for (int i = intervalo.get(0); i <= intervalo.get(1); i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.printf("%s é múltiplo de 3 e 5\n", i);
                }
            }
        }
    }
}
