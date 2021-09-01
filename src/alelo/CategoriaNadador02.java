package alelo;

import java.util.Scanner;

public class CategoriaNadador02 {

    public static void main (String [] args) {

        Scanner in = new Scanner (System.in);

        System.out.println("Digite a idade do nadador: ");
        int idade = in.nextInt();

            if(idade >= 5 && idade <= 7){
            System.out.println("Nadador da categoria Infantil A.");
        }
            else if (idade >= 8 && idade <= 11){
            System.out.println("Nadador da categoria Infantil B.");
        }
            else if (idade >= 12 && idade <= 13){
            System.out.println("Nadador da categoria Juvenil A.");
        }
            else if (idade >= 14 && idade <= 17){
            System.out.println("Nadador da categoria Juvenil B.");
        }
            else if (idade >= 18){
                System.out.println("Nadador da categoria Adulto.");
            }
            else {
            System.out.println("Nadador menos de 5 anos.");
        }

        in.close();
    }
}
