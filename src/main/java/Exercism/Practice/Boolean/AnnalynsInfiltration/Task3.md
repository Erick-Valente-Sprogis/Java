# Annalyn's Infiltration

### Task 3

Exercism:

Implemente o método (estático) AnnalynsInfiltration.canSignalPrisoner(), 
que recebe dois valores booleanos indicando se o arqueiro e o prisioneiro, 
respectivamente, estão acordados. O método retorna true se o prisioneiro 
puder ser sinalizado com base no estado dos dois personagens. 
Caso contrário, ele retorna false:

Claude:

A regra diz: "pode sinalizar se o prisioneiro está acordado E 
o arqueiro está dormindo" Tente combinar && e ! dessa vez!

``` Java
static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
// seu código aqui
}
```

Me manda sua solução! 🐦

Minha resposta:

``` Java
public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
return !archerIsAwake && prisonerIsAwake;
}
```

Claude:

Perfeito! Solução 100% correta! ✅

A lógica ficou exatamente certa:

- !archerIsAwake → arqueiro dormindo
- && → ambas as condições precisam ser verdadeiras
- prisonerIsAwake → prisioneiro acordado