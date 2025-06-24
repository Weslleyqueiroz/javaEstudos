package PrimeirosPassos;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        int numero1,numero2, soma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero1= sc.nextInt();
        sc.nextLine();
        System.out.println("Digite um número para somar : ");
        numero2 = sc.nextInt();
        sc.nextLine();

        soma = numero1 + numero2;

        System.out.println("O resultado da soma  é : " + soma);
        sc.close();


    }
}
