## Introdução ao Java: Variáveis e Tipagem

Java é uma linguagem **estaticamente tipada**, o que significa que o tipo de uma variável é conhecido em tempo de compilação. Atribuir um valor a um nome é chamado de **definir uma variável**. Uma variável é definida especificando explicitamente o seu tipo.

Java

```
int explicitVar = 10;
```

A atualização do valor de uma variável é feita através do operador `=`. Aqui, o `=` não representa igualdade matemática; ele simplesmente **atribui um valor** a uma variável. Uma vez definida, o tipo de uma variável nunca pode mudar.

Java

```
int count = 1; // Atribui o valor inicial
count = 2;     // Atualiza para um novo valor

// Erro de compilação ao tentar atribuir um tipo diferente:
// count = false;
```

---

## Classes e Métodos

Java é uma **linguagem orientada a objetos** e exige que todas as funções sejam definidas dentro de uma `class` (classe). A palavra-chave `class` é usada para esse fim.

Java

```
class Calculator {
    // ...
}
```

Uma função dentro de uma classe é referida como um **método**. Cada método pode ter zero ou mais parâmetros. Todos os parâmetros devem ser **explicitamente tipados**, pois não há inferência de tipo para eles. Da mesma forma, o tipo de retorno também deve ser declarado explicitamente.

Os valores são retornados dos métodos usando a palavra-chave `return`. Para permitir que um método seja chamado por outras classes, deve-se adicionar o modificador de acesso `public`.

Java

```
class Calculator {
    public int add(int x, int y) {
        return x + y;
    }
}
```

Invocar ou chamar um método é feito especificando sua classe e nome, passando argumentos para cada um dos parâmetros do método.

Java

```
int sum = new Calculator().add(1, 2);  // Aqui o método "add" foi chamado para realizar a tarefa de adição
```

---

## Escopo e Comentários

O **escopo** no Java é definido entre os caracteres `{` e `}`. Além disso, a linguagem suporta dois tipos de comentários:

- **Comentários de linha única:** São precedidos por `//`.
    
- **Comentários de múltiplas linhas:** São inseridos entre `/*` e `*/`.


## Definindo Métodos

Aqui está um exemplo de uma declaração típica de método:

Java

```
public double calculateAnswer(double wingSpan, int numberOfEngines,
                              double length, double grossTons) {
    // realize o cálculo aqui
}
```

Os únicos elementos obrigatórios de uma declaração de método são o **tipo de retorno**, o **nome**, um par de parênteses `()` e o **corpo** entre chaves `{}`.

De forma mais geral, as declarações de métodos possuem seis componentes, nesta ordem:

1. **Modificadores:** Como `public`, `private` e outros que você aprenderá mais tarde.
    
2. **O tipo de retorno:** O tipo de dado do valor retornado pelo método, ou `void` se o método não retornar nenhum valor.
    
3. **O nome do método:** As regras para nomes de campos (variáveis) também se aplicam aos nomes de métodos, mas a convenção é um pouco diferente.
    
4. **A lista de parâmetros entre parênteses:** Uma lista de parâmetros de entrada separados por vírgulas, precedidos por seus tipos de dados. Se não houver parâmetros, você deve usar parênteses vazios.
    
5. **Uma lista de exceções:** A ser discutida posteriormente.
    
6. **O corpo do método:** O código do método, incluindo a declaração de variáveis locais, fica aqui.
    

> **Definição:** Dois dos componentes da declaração de um método compõem a **assinatura do método** (method signature) — o nome do método e os tipos dos parâmetros.

A assinatura do método declarado acima é: `calculateAnswer(double, int, double, double)`

---

## Nomeando um Método

Embora o nome de um método possa ser qualquer identificador legal, as convenções de código restringem esses nomes. Por convenção, os nomes de métodos devem ser um **verbo em letras minúsculas** ou um nome composto que comece com um verbo em minúsculas, seguido de adjetivos, substantivos, etc.

Em nomes compostos, a primeira letra de cada palavra subsequente deve ser maiúscula (padrão conhecido como **camelCase**). Exemplos:

- `run`
    
- `runFast`
    
- `getBackground`
    
- `isEmpty`
    

Normalmente, um método possui um nome único dentro de sua classe. No entanto, um método pode ter o mesmo nome que outros devido à **sobrecarga de métodos**.

---

## Sobrecarga de Métodos (Overloading)

A linguagem de programação Java suporta a **sobrecarga** de métodos, e o Java consegue distinguir entre métodos com diferentes assinaturas. Isso significa que métodos dentro de uma classe podem ter o mesmo nome se tiverem listas de parâmetros diferentes.

Imagine uma classe que desenha vários tipos de dados (strings, inteiros, etc.). Em vez de criar nomes como `drawString` ou `drawInteger`, você pode usar o mesmo nome `draw` para todos, passando argumentos diferentes.

Java

```
public class DataArtist {
    public void draw(String s) {
        // desenha uma string
    }
    public void draw(int i) {
        // desenha um inteiro
    }
    public void draw(double f) {
        // desenha um double
    }
    public void draw(int i, double f) {
        // desenha um inteiro e um double
    }
}
```

### Regras Importantes:

- Métodos sobrecarregados são diferenciados pelo **número e tipo de argumentos**.
    
- Você **não pode** declarar mais de um método com o mesmo nome e a mesma assinatura (mesmo número e tipos de argumentos), pois o compilador não saberia qual chamar.
    
- O compilador **não considera o tipo de retorno** ao diferenciar os métodos. Portanto, você não pode declarar dois métodos com a mesma assinatura mesmo que eles retornem tipos diferentes.
    

_Dica: Use a sobrecarga com moderação, pois o uso excessivo pode tornar o código menos legível._


## Tipos de Dados Primitivos

O Java é uma linguagem **estaticamente tipada**, o que significa que todas as variáveis devem ser declaradas antes de serem usadas. Ao fazer `int gear = 1;`, você informa ao programa que existe um campo chamado "gear", que ele guarda dados numéricos e começa com o valor "1".

O tipo de dado determina quais valores a variável pode guardar e quais operações podem ser feitas com ela. Além do `int`, existem outros sete tipos primitivos:

### Tipos Inteiros (Números Inteiros)

- **byte:** Inteiro de 8 bits. Valores de -128 a 127. Útil para economizar memória em grandes arrays.
    
- **short:** Inteiro de 16 bits. Valores de -32.768 a 32.767.
    
- **int:** Inteiro de 32 bits. É o padrão para números inteiros. Desde o Java 8, pode representar um inteiro não assinalado (unsigned) de 0 até $2^{32}-1$.
    
- **long:** Inteiro de 64 bits. Use quando precisar de valores maiores que o `int`.
    

### Tipos de Ponto Flutuante (Números Decimais)

- **float:** Ponto flutuante de 32 bits (precisão simples). Economiza memória em arrays massivos, mas **nunca** deve ser usado para valores precisos, como moedas/dinheiro.
    
- **double:** Ponto flutuante de 64 bits (precisão dupla). É a escolha padrão para valores decimais. Assim como o float, não use para cálculos financeiros (para isso, use `java.math.BigDecimal`).
    

### Outros Tipos

- **boolean:** Possui apenas dois valores: `true` (verdadeiro) ou `false` (falso).
    
- **char:** Um único caractere Unicode de 16 bits.
    

> **Nota sobre Strings:** A classe `String` não é um tipo primitivo, mas o Java dá um suporte especial a ela. Elas são **imutáveis**: uma vez criada, o valor de uma String não pode ser alterado.

---

## Valores Padrão (Default Values)

Campos declarados em uma classe que não são inicializados recebem um valor padrão do compilador. **Importante:** Isso não se aplica a variáveis locais (dentro de métodos); variáveis locais não inicializadas causam erro de compilação se você tentar usá-las.

|**Tipo de Dado**|**Valor Padrão (para campos)**|
|---|---|
|`byte`, `short`, `int`|`0`|
|`long`|`0L`|
|`float`|`0.0f`|
|`double`|`0.0d`|
|`char`|`'\u0000'` (nulo)|
|`boolean`|`false`|
|`String` (ou qualquer objeto)|`null`|

---

## Literais

Um **literal** é a representação direta de um valor fixo no seu código-fonte, sem necessidade de cálculo.

### Literais Inteiros

Você pode representar números em diferentes sistemas:

- **Decimal:** Base 10 (ex: `26`)
    
- **Hexadecimal:** Base 16, prefixo `0x` (ex: `0x1a`)
    
- **Binário:** Base 2, prefixo `0b` (ex: `0b11010`)
    
- **Longs:** Devem terminar com a letra `L` ou `l` (recomenda-se `L` maiúsculo para não confundir com o número 1).
    

### Literais de Ponto Flutuante

- **Float:** Termina com `F` ou `f`.
    
- **Double:** Opcionalmente termina com `D` ou `d` (é o padrão). Aceita notação científica (ex: `1.234e2`).
    

### Sequências de Escape (char e String)

Java suporta caracteres especiais:

- `\t` (Tab), `\n` (Nova linha), `\r` (Retorno de carro), `\"` (Aspas duplas), `\'` (Aspas simples) e `\\` (Barra invertida).
    

---

## O Uso de Underscores (_) em Literais Numéricos

Desde o Java 7, você pode usar sublinhados (`_`) para separar grupos de dígitos e melhorar a leitura, como se fossem pontos de milhar.

**Exemplos Válidos:**

Java

```
long cartaoCredito = 1234_5678_9012_3456L;
long hexBytes = 0xFF_EC_DE_5E;
float pi = 3.14_15F;
```

**Regras de Onde NÃO Usar:**

1. No início ou no fim do número (`_52` ou `52_` são inválidos).
    
2. Adjacente ao ponto decimal (`3._14` é inválido).
    
3. Antes dos sufixos `F` ou `L`.
    
4. Em posições onde se espera uma string de dígitos (como dentro do prefixo `0x`).
