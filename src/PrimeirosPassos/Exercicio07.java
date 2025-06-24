package PrimeirosPassos;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A,B,C, triangulo, circulo, trapezio, quadrado, retangulo;
        double pi = 3.14159;

        //área do triãngulo
        System.out.println("Digite a base :");
        A = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a altura :");
        C = sc.nextDouble();
        sc.nextLine();


        triangulo = (A * C) /2;
        System.out.println("A área do trângulo é  : " + triangulo);

        //ÁREA CIRCULO

        System.out.println("Digite o raio do circulo : ");
        C = sc.nextDouble();
        sc.nextLine();

        circulo = pi*C*C;
        System.out.println("A área do Circulo é  : " + circulo);

        // ÁREA DO TRAPÉZIO

        System.out.println("Digite a base 1 do trapézio : ");
        A = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a base 2 do trapézio : ");
        B = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a altura do trapézio : ");
        C = sc.nextDouble();
        sc.nextLine();

        trapezio = ((A+B)*C)/2;
        System.out.println("A área do trapézio é " + trapezio);

        //ÁREA DO QUADRADO

        System.out.println("Digite o lado do quadrado : ");
        A = sc.nextDouble();
        sc.nextLine();

        quadrado = A*A;
        System.out.println("A área do quadrado é " + quadrado);

        //ÁREA DO RETÂNGULO

        System.out.println("Digite o lado do retângulo : ");
        A = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a base do retângulo : ");
        B = sc.nextDouble();
        sc.nextLine();

        retangulo = A * B;

        System.out.println("A área do retângulo é " + retangulo);



    }
}
