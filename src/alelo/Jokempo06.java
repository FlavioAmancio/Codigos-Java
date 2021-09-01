package alelo;

import java.util.Scanner;

public class Jokempo06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro jogador, escolha a sua opção: (1) Pedra, (2) Papel, (3) Tesoura: ");
        int jogador01 = scanner.nextInt();

        System.out.print("Segundo jogador, escolha a sua opção: (1) Pedra, (2) Papel, (3) Tesoura: ");
        int jogador02 = scanner.nextInt();

        if (jogador01 == jogador02){
            System.out.print("Empate entre os jogadores!");
        } else if (jogador01 == 1 && jogador02 == 2 || jogador01 == 2 && jogador02 == 3 || jogador01 == 3 && jogador02 == 1 ){
            System.out.print("Vitória do segundo jogador :)");
        } else {
            System.out.println("Vitória do primeiro jogador :)");
        }

        scanner.close();
    }
}
