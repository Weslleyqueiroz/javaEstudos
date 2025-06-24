package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

//Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//duas casas decimais.
public class ExercicioDesconto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, impostoDeRenda;

        System.out.println("Digite o seu salário :");
        salario = sc.nextDouble();
        sc.nextLine();

        if (salario <=2000){
            impostoDeRenda = 0.0;

        } else if (salario <=3000.00) {
            impostoDeRenda = (salario - 2000 )* 0.08;

        } else if (salario <=4500.00) {
            impostoDeRenda = (salario - 3000 ) * 0.18 + 1000 * 0.8;

        }else{
            impostoDeRenda = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;

        }
        if (impostoDeRenda == 0.0) {
            System.out.println("Insento");
        }
        else {
            System.out.printf("R$ %.2f%n ", impostoDeRenda);
        }



    }
}
