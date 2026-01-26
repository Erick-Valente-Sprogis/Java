package Exercicios.variaveis;

import java.util.Locale;

public class Exercicio1 {
    void main(){

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 1200.0;
        double measure = 53.234567;

        System.out.printf("Products:%n %s, which price is $ %.2f", product1, price1);
        System.out.printf("%n %s, which price is $ %.2f", product2, price2);

        System.out.printf("%n%n Record: %d years old, code %d and gender: %s", age, code, gender);

        System.out.printf("%n%n Measure with eight decimal places: %.8f" , measure);
        System.out.printf("%n Rounded (three decimal places) %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("%n US decimal point: %.3f%n", measure);
    }
}
