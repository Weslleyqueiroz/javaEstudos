package EstruturasRepetitivas;

import java.util.Scanner;

public class ExercicioFor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite um valor : ");
        x = sc.nextInt();


        for (int i = 1; i <=x ; i++) {
            if (i % 2 != 0){
                System.out.println("Numeros impares são : " + i);
            }
        }
        sc.close();

    }
}
