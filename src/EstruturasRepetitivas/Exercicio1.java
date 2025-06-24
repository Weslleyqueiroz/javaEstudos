package EstruturasRepetitivas;

import java.util.Scanner;


//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senhaCorreta = 2002, senha;

        System.out.println("Digite a senha : ");
        senha = sc.nextInt();
        sc.nextLine();


        while (senha != senhaCorreta){
            System.out.println("Senha inválida ! Digite novamente :");
            senha = sc.nextInt();
            sc.nextLine();

        }
        System.out.println("Senha correta!");

    }
}
