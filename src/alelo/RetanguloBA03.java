package alelo;

import java.util.Scanner;

public class RetanguloBA03 {
    public static void main (String args[]) {

        Scanner in = new Scanner(System.in);

                System.out.print("Digite o valor da base do retângulo: ");
                int baseRet = in.nextInt();

                System.out.print("Digite o valor da altura do retângulo: ");
                int altRet = in.nextInt();

                int areaRet = baseRet * altRet;
                System.out.println("O valor da área do triângulo é: " + areaRet );


        in.close();

    }
}
