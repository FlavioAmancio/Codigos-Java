package alelo;

import java.util.Scanner;

public class ParouImpar01 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é par ou ímpar: ");
        double num = in.nextInt();


        if (num == num /2) {
            System.out.println("O número digitado é par!");
        }   else {
            System.out.println("O número informado é ímpar!");
        }
        in.close();
    }
}
