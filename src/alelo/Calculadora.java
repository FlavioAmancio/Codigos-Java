package alelo;

import java.util.Scanner;

public class Calculadora {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);

             System.out.print("Qual operação deseja realizar? ( A, S, M, D ): ");
                char operacao = in.next().charAt(0);

             System.out.print("Digite o valor: ");
                double valor01 = in.nextDouble();

             System.out.print("Digite outro valor: ");
                double valor02 = in.nextDouble();

                    double resultado;

                switch (operacao) {

                    case 'A':
                        resultado = valor01 + valor02;
                        System.out.print("A soma entre os valores é: " + resultado);
                        break;

                    case 'S':
                        resultado = valor01 - valor02;
                        System.out.print("A subtração entre os valores é: " + resultado);
                        break;

                    case 'M':
                        resultado = valor01 * valor02;
                        System.out.print("A multiplicação entre os valores é: " + resultado);
                        break;

                    case 'D':
                        if (valor02 == 0) {
                            System.out.print("Não há divisão por 0");
                        } else {
                            resultado = valor01 / valor02;
                            System.out.print("A divisão entre os valores é: " + resultado);
                        }

                        break;
                    default:
                        System.out.println("Opção indisponível");
                }

                in.close();
            }


        }


