# Annalyn's Infiltration

### Task 4

Exercism: Implemente o método (estático) AnnalynsInfiltration.canFreePrisoner(), 
que recebe quatro valores booleanos. Os três primeiros parâmetros indicam 
se o cavaleiro, o arqueiro e o prisioneiro, respectivamente, estão 
acordados. O último parâmetro indica se o cão de estimação da Annalyn 
está presente. O método retorna true se o prisioneiro puder ser libertado 
com base no estado dos três personagens e na presença do cão de estimação 
da Annalyn. Caso contrário, ele retorna false:

Claude: Esse tem duas condições possíveis, releia a regra com atenção:

- Com o cachorro: pode libertar se o arqueiro está dormindo

- Sem o cachorro: pode libertar se o prisioneiro está acordado E o cavaleiro E o arqueiro estão dormindo

Tente usar || para separar os dois cenários, e && dentro de cada um!

``` Java
static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, 
boolean prisonerIsAwake, boolean petDogIsPresent) {
// seu código aqui
}
```

Me manda sua solução! 🗝️

Minha resposta:
``` Java
static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
return archerIsAwake || !prisonerIsAwake && archerIsAwake && knightIsAwake
}
```

Claude:

Quase lá, mas há alguns erros lógicos! Vamos revisar:
Problemas:

- Falta o ! em archerIsAwake no primeiro cenário
- Falta checar petDogIsPresent
- Falta o ! em knightIsAwake e archerIsAwake no segundo cenário
- Falta o ponto e vírgula no final

Releia as regras e tente novamente:

    Situação | Condições

    Com cachorro 🐕 | arqueiro dormindo

    Sem cachorro    | prisioneiro acordado + cavaleiro dormindo + arqueiro dormindo

Tente mais uma vez! 💪

Minha resposta:

``` Java
public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
return petDogIsPresent !archerIsAwake || prisonerIsAwake && !archerIsAwake && !knightIsAwake;
}
```

Muito perto! Só falta um && entre petDogIsPresent e !archerIsAwake no primeiro cenário:

``` Java
java// ❌ seu código
return petDogIsPresent !archerIsAwake || ...

// ✅ correto
return petDogIsPresent && !archerIsAwake || ...
```

Tente corrigir e me manda de novo! 💪

Minha resposta:

``` Java
public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
return petDogIsPresent && !archerIsAwake || prisonerIsAwake && !archerIsAwake && !knightIsAwake;
}
```

Claude:

Perfeito! Solução 100% correta! ✅

A lógica ficou exatamente certa:

    petDogIsPresent | archerIsAwake | knightIsAwake | prisonerIsAwake | Resultado
    true            | false         | qualquer      | qualquer        | ✅
    false           | false         | false         | true            | ✅
    false           | true          | qualquer      | qualquer        | ❌