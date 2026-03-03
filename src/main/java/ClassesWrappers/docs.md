# Classes Wrapper x Classes Primitivas

 Diferente das Classes Primitivas, as **Classes Wrapper** disponibilizam uma série de opções de métodos e
 recursos para melhor atender as necessidades do sistema desenvolvido.

 Por exemplo:

``` Java
 /* Se utilizarmos o byte primitivo, e adicionarmos um "." (ponto) quando
chamamos a variável, a IDE nos dá pouquíssimas opções de métodos.
 */
 byte numeroTeste = 15;
 IO.println(numeroTeste.)
```
 Já no **B**yte:

``` Java
 /* Se utilizarmos o Byte em wrapper, e adicionarmos um "." (ponto) quando
 chamamos a variável, a IDE nos dá muitas mais opções de métodos.
 */
 Byte numeroTeste = 15;
 IO.println(numeroTeste.)
```

 E isso ocorre para todas as variáveis. Na teoria, todas elas funcionam do mesmo jeito, o resultado da 
 equação continua sendo 15, mas com Wrapper, podemos ir mais além.