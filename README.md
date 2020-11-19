# Getting Starter
O spintec-tiss, é um utilitário que reúne classes para comunicação utilizando o padrão TISS. Não é objetivo deste projeto efetivar de fato a comunicação, mas apenas disponibilizar classes para padronização.

Para que a comunicação seja efetiva de fato, se faz necessário a implementação da chamada de webservices enviando as informações de acordo com os modelos disponibilizados pelo spintec-tiss.

A estrutura de diretórios hoje suporta diferentes versões para a comunicação TISS, portanto é necessário se ter um cuidado excessivo quanto a resiliência para com as outras versões. As classes são, em sua maioria, geradas através do [wsimport](https://docs.oracle.com/javase/8/docs/technotes/tools/unix/wsimport.html), presente por padrão no Java 8.

A pesar das classes serem geradas através do _wsimport_ que é disponibilizado nativamente com o JDK 8, o spintec-tiss está utilizado o JDK 11 para a sua compilação. É importante que permaneça assim para que não se gere incompatibilidade entre as dependências.

## Importando WS  
Para gerar uma nova classe para padronização de comunicação tiss, é recomendado que seja utilizado o wsimport presente por padrão no JDK 8.

Siga o exemplo abaixo para gerar uma nova classe de padronização:

```
"C:/Program Files/Java/jdk1.8.0_251/bin/wsimport.exe" -keep -Xnocompile http://url_webservice:8080/TISS30500OPS/tissSolicitacaoProcedimento?wsdl
```

> **IMPORTANTE:** O comando de acima deve ser executado a partir do diretório `./src/main/java`.

**-keep:** Mantém os arquivos `.java` gerados pelo wsimport.<br />
**-Xnocompile:** Não gera os arquivos `.class`.