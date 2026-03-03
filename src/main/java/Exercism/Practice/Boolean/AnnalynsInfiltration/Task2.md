# Annalyn's Infiltration

### Task 2

Exercism:

Implemente o método (estático) AnnalynsInfiltration.canSpy(), 
que recebe três valores booleanos indicando se o cavaleiro, o arqueiro e 
o prisioneiro, respectivamente, estão acordados. O método retorna true 
se o grupo puder ser espiado com base no estado dos três personagens. 
Caso contrário, ele retorna false:

Claude:

A regra diz: "pode espionar se pelo menos um deles está acordado"
Tente usando o operador || (OR)! O método recebe três booleanos e retorna true se qualquer um deles for true.

``` Java
static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, 
boolean prisonerIsAwake) {
// seu código aqui
}
```

Me manda sua solução quando terminar! 🕵️

Minha resposta:

``` Java
public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
return false || true || false;
}
```

Claude:

Quase lá! A lógica do || está certa, mas você usou os valores 
fixos (true/false) em vez das variáveis do método. Assim, seu código 
sempre retorna true, independente do estado dos personagens. 
Troque pelos parâmetros:

``` Java
public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
return knightIsAwake || archerIsAwake || prisonerIsAwake;
}
```

    knightIsAwake | archerIsAwake | prisonerIsAwake | Pode espionar?
    false         | false         | false           | ❌
    true          | false         | false           | ✅
    false         | true          | false           | ✅
    false         | false         | true            | ✅