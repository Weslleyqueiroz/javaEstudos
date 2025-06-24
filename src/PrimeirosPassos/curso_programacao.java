package PrimeirosPassos;

import java.util.Locale;

public class curso_programacao {

    public static void main(String[] args) {

        String product1 = "computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender =  'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.println(product1 + " which price is $" + price1);
        System.out.println(product2 + ", which price is $" + price2);
        System.out.println("Record: " + age +"years old ," + code +"and gender:" + gender);
        Locale.setDefault(Locale.US);
        System.out.printf("Measue with eight decimal places " + "%.3f%n",measure);

    }

}
