package EstruturasCondicionais;

import java.util.Scanner;

public class ExercicioBonusSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,C, soma;


        System.out.println("Digite o valor de A :");
        A = sc.nextInt();
        sc.nextLine();


        System.out.println("Digite o valor de B :");
        B = sc.nextInt();
        sc.nextLine();

        soma = A+B;


        System.out.println("Digite o valor de C :");
        C = sc.nextInt();
        sc.nextLine();

        if (soma <C){
            System.out.println("A soma é :" + soma + " é menor que C:");
        }else{
            System.out.println("A soma é maior");
        }


    }
}
