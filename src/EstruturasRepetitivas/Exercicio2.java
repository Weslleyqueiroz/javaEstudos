package EstruturasRepetitivas;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;

        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0){
             if (x > 0 && y > 0){
                 System.out.println("1 quadrante");
             } else if (x < 0 && y > 0) {
                 System.out.println("2 quadrante");
             } else if (x < 0 && y < 0) {
                 System.out.println(" 3 quadrante");
             } else{
                 System.out.println("4 quadrante");
             }
                x = sc.nextInt();
                y = sc.nextInt();
        }


    }
}
