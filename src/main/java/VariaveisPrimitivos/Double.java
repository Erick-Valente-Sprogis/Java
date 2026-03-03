package VariaveisPrimitivos;

import java.util.Locale;

// double: 15 casas decimais 123456789123456 (8 bytes de informação ou 64 bits)

public class Double {
    void main (){
        double x = 10.123456789123456;
        IO.println( "O valor de X é: "+ x);

        System.out.printf("%.2f%n", x);

        System.out.printf("%.4f%n", x);

        Locale.setDefault(Locale.US); //Faz com que o separador numérico seja o "." (ponto final) para os itens abaixo dele
        // diferente de como é na lingua portuguesa, no inglês é utilizado o "." (ponto final).

        System.out.printf("%.4f%n", x);
    }
}
