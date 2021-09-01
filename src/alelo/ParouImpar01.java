package alelo;

import java.util.Scanner;

public class ParouImpar01 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é par ou ímpar: ");
        double num = in.nextInt();


        if (num % 2 == 0) {
            System.out.println("O número digitado é par!");
        }   else {
            System.out.println("O número informado é ímpar!");
        }
        in.close();
    }
}
