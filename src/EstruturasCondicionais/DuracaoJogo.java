package EstruturasCondicionais;

import java.util.Scanner;


//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
public class DuracaoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaração da variavel
        int horaInicial, horaFinal;


        System.out.println("Digite quando começou o jogo :");
        horaInicial = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite quando terminou o jogo :");
        horaFinal = sc.nextInt();
        sc.nextLine();

        int duracao;

        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;

        }else{
            duracao = 24 - horaInicial +horaFinal;
            System.out.println("A duração do jogo foi de : " + duracao + "Horas");
        }














    }
}
