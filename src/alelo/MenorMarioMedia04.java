package alelo;

import java.util.Scanner;

public class MenorMarioMedia04 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num01 = scanner.nextInt();
        System.out.println("Digite o segunda número: ");
        int num02 = scanner.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num03 = scanner.nextInt();

        if (num01 > num02 && num02 > num03){
            System.out.println("O maior número é: " + num01);
        } else if (num01 < num02 && num02 > num03){
            System.out.println("O maior número é: " + num02);
        } else {
            System.out.println("O maior número é: " + num03);
        }
        if (num01 < num02 && num02 < num03){
            System.out.println("O menor número é: " +num01);
        } else if (num01 > num02 && num02 < num03){
            System.out.println("O menor número é: " + num02);
        } else {
            System.out.println("O menor número é: " + num03);
        }
        System.out.println("A média dos números é: " + (num01 + num02 + num03) / 2f) ;

        scanner.close();
    }
}
