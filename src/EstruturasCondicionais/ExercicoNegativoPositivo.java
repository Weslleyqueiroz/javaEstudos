package EstruturasCondicionais;


import java.util.Scanner;

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
public class ExercicoNegativoPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declaração da variavel para verificar

        int numero;

        System.out.println("Digite um número para a verificação :");
        numero = sc.nextInt();
        sc.nextLine();

        if (numero<0){
            System.out.println("O número digitado é negativo!");
        }else{
            System.out.println("O número é positivo!");
        }

    }
}
