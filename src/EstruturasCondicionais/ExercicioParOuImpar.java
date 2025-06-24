package EstruturasCondicionais;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
public class ExercicioParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declaração da variavel para verificar

        int parOuImpar;

        System.out.println("Digite um número para ver se é par ou impar :");
        parOuImpar = sc.nextInt();
        sc.nextLine();

        if (parOuImpar % 2 ==0){
            System.out.println("O número é par!");

        }else{
            System.out.println("O número é impar!");
        }
    }
}
