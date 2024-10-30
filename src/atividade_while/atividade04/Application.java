package atividade_while.atividade04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int devBackend = 0, mulherCisTransFrontend = 0, homemCisTransMobileMaior40 = 0, naoBinarioFullStackmenor30 = 0, totalPessoas = 0, somaIdade = 0;

        while (true) {
            List<Integer> dado = new ArrayList<>();

            System.out.println("Digite sua idade:");
            dado.add(read.nextInt());

            System.out.println("""
                    1 – Mulher Cis
                    2 – Homem Cis
                    3 – Não Binário
                    4 – Mulher Trans
                    5 – Homem Trans
                    6 – Outros
                    
                    Digite o código da seu genero:
                    """);
            dado.add(read.nextInt());

            System.out.println("""
                    1 – Backend
                    2 – Frontend
                    3 – Mobile
                    4 – FullStack
                    
                    Digite o código da sua area de desenvolvimento:
                    """);
            dado.add(read.nextInt());

            if (dado.get(2) == 1)
                devBackend++;


            if ((dado.get(1) == 1 || dado.get(1) == 4) && dado.get(2) == 2)
                mulherCisTransFrontend++;

            if ((dado.get(1) == 2 || dado.get(1) == 5) && dado.get(2) == 3 && dado.get(0) >= 40)
                homemCisTransMobileMaior40++;

            if (dado.get(1) == 3 && dado.get(2) == 4 && dado.get(0) <= 30)
                naoBinarioFullStackmenor30++;

            totalPessoas++;

            somaIdade += dado.get(0);

            System.out.println("Deseja continuar a leitura dos dados de um novo colaborador ou não (S/N)");
            var continuar = read.next().equalsIgnoreCase("s");

            if (!continuar)
                break;
        }

        System.out.printf("""
                Total de pessoas desenvolvedoras Backend: %s
                
                Total de Mulheres Cis e Trans desenvolvedoras Frontend: %s
                
                Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %s
                
                Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: %s
                
                O número total de pessoas que responderam à pesquisa: %s
                
                A média de idade das pessoas que responderam à pesquisa: %.2f
                """, devBackend, mulherCisTransFrontend, homemCisTransMobileMaior40, naoBinarioFullStackmenor30, totalPessoas, ((float) somaIdade / totalPessoas));
    }
}
