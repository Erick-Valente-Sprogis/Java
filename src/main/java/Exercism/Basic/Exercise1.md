
# Task 1

Define the `expectedMinutesInOven()` method that does not take any parameters and returns how many minutes the lasagna should be in the oven. According to the cooking book, the expected oven time in minutes is 40:

```
Lasagna lasagna = new Lasagna();
lasagna.expectedMinutesInOven();
// => 40
```

18:54

## O que está sendo feito

Está sendo definido um **método** chamado `expectedMinutesInOven()` dentro de uma classe chamada `Lasagna`.

---

## Como funciona

java

```java
public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
}
```

**Passo a passo:**

1. `Lasagna lasagna = new Lasagna();` — cria um **objeto** (instância) da classe `Lasagna`
2. `lasagna.expectedMinutesInOven();` — chama o método nesse objeto, que retorna `40`

---

## Por que é feito assim

|Decisão|Motivo|
|---|---|
|Método sem parâmetros `()`|O tempo de forno é fixo, não depende de nenhuma entrada externa|
|Retorna `int`|Minutos são números inteiros|
|Valor fixo `40`|É uma **constante** definida pelo livro de receitas — nunca muda|
|Encapsulado num método|Boa prática: o valor fica centralizado; se mudar, altera-se em um só lugar|

## Resumo simples

> "Crie uma lasanha e pergunte a ela: _quanto tempo você fica no forno?_ — Resposta: **40 minutos**."

É um exemplo básico de **encapsulamento** em orientação a objetos — o objeto `Lasagna` sabe as próprias regras de preparo.


# Task 2

Define the `remainingMinutesInOven()` method that takes the actual minutes the lasagna has been in the oven as a parameter and returns how many minutes the lasagna still has to remain in the oven, based on the expected oven time in minutes from the previous task.

```
Lasagna lasagna = new Lasagna();
lasagna.remainingMinutesInOven(30);
// => 10
```

18:57

## O que está sendo feito

Define um método que calcula **quanto tempo falta** para a lasanha ficar pronta, recebendo como parâmetro o tempo que ela **já ficou** no forno.

---

## Como funciona

java

```java
public int remainingMinutesInOven(int minutesInOven) {
    return expectedMinutesInOven() - minutesInOven;
}
```

**Passo a passo do exemplo:**

1. A lasanha deveria ficar **40 minutos** no forno
2. Ela já ficou **30 minutos** (`lasagna.remainingMinutesInOven(30)`)
3. Logo: `40 - 30 = 10` minutos restantes

---

## Por que é feito assim

|Decisão|Motivo|
|---|---|
|Recebe `int minutesInOven`|O tempo já decorrido varia, então precisa ser informado|
|Chama `expectedMinutesInOven()`|**Reutiliza** o método anterior em vez de repetir o valor `40` — se o tempo mudar, só precisa alterar em um lugar|
|Faz uma subtração simples|A lógica é: _tempo total - tempo decorrido = tempo restante_|

## Resumo simples

> "Já faz 30 minutos que a lasanha está no forno. Quanto falta? **10 minutos.**"

O ponto mais importante aqui é a **reutilização** — o método chama `expectedMinutesInOven()` em vez de escrever `40` diretamente, seguindo o princípio **DRY** (_Don't Repeat Yourself_).


# Task 3

Define the `preparationTimeInMinutes()` method that takes the number of layers you added to the lasagna as a parameter and returns how many minutes you spent preparing the lasagna, assuming each layer takes you 2 minutes to prepare.

```
Lasagna lasagna = new Lasagna();
lasagna.preparationTimeInMinutes(2);
// => 4
```

19:04

Com base no que você já aprendeu, tente escrever o método antes de eu mostrar a resposta!

O raciocínio é o mesmo do anterior — recebe um parâmetro e faz uma conta simples com ele. O que você acha que seria?

Seria?

public int preparationTimeInMinutes(int layers) { return preparationTimeInMinutes() * layers; }

19:07

Quase! A lógica está certa, mas há um problema: você está chamando `preparationTimeInMinutes()` dentro dele mesmo — isso causaria um loop infinito.

O que você precisa é multiplicar `layers` pelo valor fixo `2` (minutos por camada):

java

```java
public int preparationTimeInMinutes(int layers) {
    return 2 * layers;
}
```

**Verificando com o exemplo:**

- `lasagna.preparationTimeInMinutes(2)` → `2 * 2 = 4` ✓

Sua lógica de multiplicar estava certa, só precisava multiplicar pelo `2` diretamente, não por um método.


# Task 4

Define the `totalTimeInMinutes()` method that takes two parameters: the first parameter is the number of layers you added to the lasagna, and the second parameter is the number of minutes the lasagna has been in the oven. The function should return how many minutes in total you've worked on cooking the lasagna, which is the sum of the preparation time in minutes, and the time in minutes the lasagna has spent in the oven at the moment.

```
Lasagna lasagna = new Lasagna();
lasagna.totalTimeInMinutes(3, 20);
// => 26
```

19:09

Tente você agora!

Dica: você já tem os métodos `preparationTimeInMinutes()` e `remainingMinutesInOven()` criados anteriormente — mas será que é o `remainingMinutesInOven()` que você precisa aqui, ou algo diferente?

Seria?

public int totalTimeInMinutes() { return (layers * 2) + minutesInOven; }

19:12

Quase certo! A lógica da conta está perfeita (`layers * 2 + minutesInOven`), mas faltou declarar os **parâmetros** no método — assim como você fez nos métodos anteriores:

java

```java
public int totalTimeInMinutes(int layers, int minutesInOven) {
    return (layers * 2) + minutesInOven;
}
```

**Verificando com o exemplo:**

- `lasagna.totalTimeInMinutes(3, 20)` → `(3 * 2) + 20 = 6 + 20 = 26` ✓

Ou, reutilizando o método anterior:

java

```java
public int totalTimeInMinutes(int layers, int minutesInOven) {
    return preparationTimeInMinutes(layers) + minutesInOven;
}
```

Ambas funcionam! A segunda é mais elegante pois **reutiliza** código já escrito.

# Full Exercise

public class Lasagna {

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutesInOven) { return preparationTimeInMinutes(layers) + minutesInOven; 
    }
}

**Usar constantes em vez de "números mágicos"** — um "número mágico" é um valor fixo jogado diretamente no código como `40` ou `2`, sem explicação. O problema é que quem lê não sabe o que significa aquele número.

Com constantes fica assim:

java

```java
public class Lasagna {

    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_TIME_PER_LAYER = 2;

    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }

    public int preparationTimeInMinutes(int layers) {
        return PREPARATION_TIME_PER_LAYER * layers;
    }

    public int totalTimeInMinutes(int layers, int minutesInOven) {
        return preparationTimeInMinutes(layers) + minutesInOven;
    }
}
```

**Por que usar constantes?**

||Número mágico|Constante|
|Legibilidade|`return 40` — o que é 40? |`return EXPECTED_MINUTES_IN_OVEN` — óbvio

|Manutenção|Precisa achar todos os `40` no código|Altera em um só lugar

|`private static final`|—|`private` = só usada nessa classe, `static` = pertence à classe, `final` = não pode ser alterada|
