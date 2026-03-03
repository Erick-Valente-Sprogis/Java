# Annalyn's Infiltration

### Task 1

Exercism: 

Implemente o método (estático) AnnalynsInfiltration.canSpy(), que recebe 
três valores booleanos indicando se o cavaleiro, o arqueiro e o 
prisioneiro, respectivamente, estão acordados. O método retorna true se 
o grupo puder ser espiado com base no estado dos três personagens. 
Caso contrário, retorna false:

Claude:

Tente resolver você mesmo primeiro! Aqui vai um esqueleto para começar:

``` Java
class AnnalynsInfiltration {
    static boolean canFastAttack(boolean knightIsAwake) {
        // seu código aqui
    }
```

Dica: releia a regra do fast attack — ela depende diretamente do estado do cavaleiro. Um único operador booleano já resolve!
Quando tiver uma solução, me manda para eu dar um feedback.

Minha resposta:

Eu realmente não entendi como isso funciona...

``` Java
class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        canFastAttack = !true
    }
}
```

Claude:

Sem problema! Vamos por partes.

O que o método precisa fazer?

A regra diz: "o ataque rápido pode ser feito se o cavaleiro está dormindo"
Ou seja:

- Cavaleiro acordado → false (não pode atacar)

- Cavaleiro dormindo → true (pode atacar)

O parâmetro *knightIsAwake* já te diz se ele está acordado. Você só precisa inverter esse valor com !.

Problemas no seu código

``` Java
canFastAttack = !true  // ❌ isso tenta sobrescrever o método com um valor fixo
// ❌ sem return
// ❌ sem ponto e vírgula
``` 

Código correto

``` Java
class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake; // se ele está acordado=true, retorna false (e vice-versa)
    }
}
```
    knightIsAwake | !knightIsAwake | Pode atacar? 

        true      |      false     |      ❌

        false     |      true      |      ✅