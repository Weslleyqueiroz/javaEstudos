package PrimeirosPassos;

import java.util.Scanner;

public class RaioCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159, raio, area;
        System.out.println("Digite o raio : ");
        raio = sc.nextDouble();
        sc.nextLine();

        //calculos

        area = raio = Math.pow(raio,2);
        System.out.println("A área calculada é : " + area);
        System.out.println("Com um raio de : " +raio);
    }

}
