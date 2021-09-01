package alelo;

import java.util.Scanner;

public class Eleitores04 {

        public static void main (String args[]) {

            Scanner in = new Scanner(System.in);

                System.out.print("Digite o número de eleitores: ");
                int totEleitor = in.nextInt();

                System.out.print("Digite o número de votos válidos: ");
                int totVotValido = in.nextInt();

                System.out.print("Digite o número de votos brancos: ");
                int totVotVBranco = in.nextInt();

                System.out.print("Digite o número de votos nulos: ");
                int totVotNulo = in.nextInt();

                System.out.printf("O percentual de votos válidos é: %.2f%%%n ", totVotValido  * 100f / totEleitor);

                int percVotBranco = totVotVBranco * 100 / totEleitor;
                System.out.printf("O percentual de votos brancos é: %.2f%%%n ", percVotBranco * 100f / totEleitor);

                int percVotNulo = totVotNulo * 100 / totEleitor;
                System.out.printf("O percentual de votos nulos é: ", percVotNulo * 100f / totEleitor);


        in.close();

    }

}
