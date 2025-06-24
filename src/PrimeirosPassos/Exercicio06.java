package PrimeirosPassos;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd1,codigo1,codigo2,qtd2;
        double valorTotal, preco1,preco2;

        //peça e código 1
        System.out.println("Digite o código da peça 1 : ");
        codigo1 = sc .nextInt();
        sc.nextLine();

        System.out.println("Digite o numero comprado de peças 1 : ");
        qtd1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o preco das peças 1 : ");
        preco1 = sc.nextDouble();
        sc.nextLine();

        //peça e codigo 2

        System.out.println("Digite o código da peça 2 : ");
        codigo2 = sc .nextInt();
        sc.nextLine();

        System.out.println("Digite o numero comprado de peças 2 : ");
        qtd2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o preco das peças 1 : ");
        preco2 = sc.nextDouble();
        sc.nextLine();

        valorTotal = qtd1 * preco1 + qtd2 *preco2;
        System.out.println("O valor total da sua compra de peças 1 é : " + valorTotal);




    }
}
