package PrimeirosPassos;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  A,B,C,D;


        System.out.println("Digite o valor de A : " );
        A = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o valor de B : ");
        B = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o valor de C : ");
        C = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o valor de D : ");
        D = sc.nextInt();
        sc.nextLine();
        int diferenca = (A * B - C * D);
        System.out.println("O resultado da diferenca de " + A + " * " + B + " - " + C + " * " + D + " é :" + diferenca);








    }
}
