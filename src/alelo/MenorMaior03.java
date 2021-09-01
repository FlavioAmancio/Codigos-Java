package alelo;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MenorMaior03 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num01 = scanner.nextInt();
        System.out.println("Digite o segunda número: ");
        int num02 = scanner.nextInt();

            if (num01 > num02){
                System.out.println("O maior número é: " + num01);
            } else {
                System.out.println("O maior número é: " + num02);
            }
                if (num01 < num02){
                System.out.println("O menor número é: " +num01);
            } else {
                System.out.println("O menor número é: " + num02);
            }
            scanner.close();
    }
}
