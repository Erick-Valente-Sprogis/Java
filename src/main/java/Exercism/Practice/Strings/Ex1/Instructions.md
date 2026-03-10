Instruções
Neste exercício, você processará linhas de log 
(registros do sistema). Cada linha de log é uma 
string formatada da seguinte forma: 

"[<NÍVEL>]: <MENSAGEM>".

Existem três níveis de log diferentes:

INFO

WARNING

ERROR

Você tem três tarefas; cada uma receberá uma 
linha de log e solicitará que você faça algo 
com ela.

1. Obter a mensagem de uma linha de log 
Implemente o método (estático) 
LogLevels.message() para retornar a mensagem 
de uma linha de log:

```Java
    LogLevels.message("[ERROR]: Invalid operation")
// => "Invalid operation"
```

Qualquer espaço em branco no início ou no final deve ser removido:

```Java
    LogLevels.message("[WARNING]:  Disk almost full\r\n")
// => "Disk almost full"
```

2. Obter o nível de log de uma linha de log
   Implemente o método (estático) 
LogLevels.logLevel() para retornar o nível de 
log de uma linha, que deve ser retornado em 
letras minúsculas:

```Java
    LogLevels.logLevel("[ERROR]: Invalid operation")
// => "error"
```

3. Reformatar uma linha de log
   Implemente o método (estático) 
LogLevels.reformat() que reformata a linha de 
log, colocando a mensagem primeiro e o nível de 
log depois, entre parênteses:

```Java
    LogLevels.reformat("[INFO]: Operation completed")
// => "Operation completed (info)"
```