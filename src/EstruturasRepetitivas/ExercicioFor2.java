package EstruturasRepetitivas;

import java.util.Scanner;

public class ExercicioFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i <N ; i++) {

            double A = sc.nextDouble();
            double B = sc.nextDouble();
            double C = sc.nextDouble();

            double media = (A*2 + B*3 + C *5)/10;
            System.out.println(media);
        }
    }
}
