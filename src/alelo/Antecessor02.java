package alelo;

import java.util.Scanner;

public class Antecessor02 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        System.out.println("O antecessor é: ");
        System.out.println(numero -1);

        scanner.close();

    }
}
