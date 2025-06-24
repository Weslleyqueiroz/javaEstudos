package EstruturasCondicionais;

import java.util.Scanner;

public class ExercicioBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minuto;

        System.out.println("Digite quantos minutos você usou : ");
        minuto = sc.nextInt();
        sc.nextLine();

        double plano = 50.0;
        if (minuto > 100){
            plano = plano + (minuto - 100 ) * 2;
            System.out.println("Você tem a pagar R$" + plano + " de excesso");
        }else{
            System.out.println("Dentro do plano");
        }


    }
}
