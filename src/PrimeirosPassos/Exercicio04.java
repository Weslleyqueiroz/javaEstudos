package PrimeirosPassos;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, horasTrabalhadas;
        double salario, salarioHora;


        System.out.println("O número do funcionario é : ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite as suas horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o valor da sua hora : ");
        salarioHora = sc.nextDouble();

        salario = horasTrabalhadas * salarioHora;
        System.out.printf("Seu salario é de: %.2f%n ", salario);





    }
}
