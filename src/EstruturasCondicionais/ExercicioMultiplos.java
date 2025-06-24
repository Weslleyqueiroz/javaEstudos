package EstruturasCondicionais;

import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.
public class ExercicioMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaração da variavel para verificar
        int A, B;

        System.out.println("Digite o valor A :");
        A = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o valor B :");
        B = sc.nextInt();
        sc.nextLine();

        if(A % B ==0 || B % A == 0){
            System.out.println("Os números são multiplos!");
        }else{
            System.out.println("Não são multiplos!");
        }
    }
}
