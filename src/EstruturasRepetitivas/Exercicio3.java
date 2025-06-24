package EstruturasRepetitivas;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite o número do combustivel desejado : ");
        int fim = sc.nextInt();
        sc.nextLine();

        while (fim != 4) {
            if (fim == 1) {
                alcool += 1;
                System.out.println("vc escolheu o alcool");
            } else if (fim == 2) {
                gasolina += 1;
                System.out.println("vc escolheu a gasolina");
            } else if (fim == 3) {
                diesel += 1;
                System.out.println("vc escolheu o diesel");
            }
                fim = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);


        }
    }
