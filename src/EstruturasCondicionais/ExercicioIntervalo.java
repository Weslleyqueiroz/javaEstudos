package EstruturasCondicionais;


import java.util.Locale;
import java.util.Scanner;

//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
public class ExercicioIntervalo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valorQualquer;


        System.out.println("Digite um valor qualquer: ");
        valorQualquer = sc.nextDouble();
        sc.nextLine();

        if (valorQualquer >=0 && valorQualquer<25 ){
            System.out.println("O número está no intervalo de  : [0,25]");
        } else if (valorQualquer >=25 && valorQualquer <=50) {
            System.out.println("O número está no intervalo de  : [25,50]");
        } else if (valorQualquer >=50 && valorQualquer <=75) {
            System.out.println("O número está no intervalo de  : [50,75]");
        } else if (valorQualquer >=75 && valorQualquer <=100) {
            System.out.println("O número está no intervalo de  : [75,100]");
        }else {
            System.out.println("Fora de intervalo");
        }


    }

}
