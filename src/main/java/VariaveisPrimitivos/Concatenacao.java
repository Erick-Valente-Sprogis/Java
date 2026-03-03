package VariaveisPrimitivos;

public class Concatenacao {
    void main (){
        int x = 500;
        IO.println("Resultado = " + x + " metros");

        System.out.printf("Resultado = %.2f metros%n", (double) x);

        // Concatenação de múltiplas variáveis:

        String nome = "Maria";

        int idade = 31;

        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
