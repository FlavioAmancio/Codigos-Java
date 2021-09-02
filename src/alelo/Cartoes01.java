package alelo;

import java.util.Scanner;

public class Cartoes01 {

    public static void main (String[]args) {
        Scanner in = new Scanner(System.in);
        char executarNovamente = 's';


        System.out.print("Digite o saldo de seu cartão alimentação: ");
        double cartAli = in.nextDouble();

        System.out.print("Digite o saldo de seu cartão refeição: ");
        double cartRef = in.nextDouble();

        System.out.print("Digite o saldo de seu vale transporte: ");
        double valeTra = in.nextDouble();

        do {

            System.out.print("Está realizando a compra em qual cartão: 1 (CA) 2 (CR) 3 (CT) ? ");
            int cartao = in.nextInt();

            if (cartao == 1) {
                System.out.print("Digite o valor da sua compra: ");
                double compra = in.nextDouble();
                if ( compra > cartAli) {
                    System.out.println("Saldo insuficiente!");
                } else
                    cartAli = (cartAli - compra);
                    System.out.println("O saldo de seu cartão é: " + (cartAli) );
                    System.out.println("Deseja realizar outra entrada de compra? [ s ou n ]");
                executarNovamente = in.next().charAt(0);
            }

            else if (cartao == 2) {
                System.out.print("Digite o valor de sua compra: ");
                double compra02 = in.nextDouble();
                if (compra02 > cartRef) {
                    System.out.println("Saldo insuficiente!");
                } else
                    cartRef = (cartRef - compra02);
                    System.out.println("O saldo de seu cartão é: " + (cartRef));
                    System.out.println("Deseja realizar outra entrada de compra? [ s ou n ]");
                executarNovamente = in.next().charAt(0);
            }

            else if (cartao == 3) {
                System.out.print("Digite o valor de sua compra: ");
                double compra03 = in.nextDouble();
                if (compra03 > valeTra) {
                    System.out.println("Saldo insuficiente!");
                } else
                    valeTra = (valeTra - compra03);
                    System.out.println("O saldo de seu cartão é: " + (valeTra));
                    System.out.println("Deseja realizar outra entrada de compra? [ s ou n ]");
                    executarNovamente = in.next().charAt(0);
            }

            else {
                System.out.println("Opção inválida.");
            }

            }while (executarNovamente == 's');
        }



        }


