package EstruturasCondicionais;

import java.util.Scanner;


//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.
public class ExercicioCardapio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaração da variavel
        int codigo, qtd;
        double valorTotal;

        System.out.println("Digite o código do produto : ");
        codigo = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a quantidade do produto : ");
        qtd = sc.nextInt();
        sc.nextLine();

        if (codigo == 1){
            valorTotal = qtd*4;
        } else if (codigo == 2){
            valorTotal = qtd *4.50;
        } else if (codigo == 3) {
            valorTotal = qtd * 5;
        } else if (codigo == 4) {
            valorTotal = qtd * 2;
        }
        else {
            valorTotal = qtd * 1.50;
        }
        System.out.println("O valor total da compra é de : R$ " +valorTotal);
    }
}
