# Getting Starter
O spintec-tiss, � um utilit�rio que re�ne classes para comunica��o utilizando o padr�o TISS. N�o � objetivo deste projeto efetivar de fato a comunica��o, mas apenas disponibilizar classes para padroniza��o.

Para que a comunica��o seja efetiva de fato, se faz necess�rio a implementa��o da chamada de webservices enviando as informa��es de acordo com os modelos disponibilizados pelo spintec-tiss.

A estrutura de diret�rios hoje suporta diferentes vers�es para a comunica��o TISS, portanto � necess�rio se ter um cuidado excessivo quanto a resili�ncia para com as outras vers�es. As classes s�o, em sua maioria, geradas atrav�s do [wsimport](https://docs.oracle.com/javase/8/docs/technotes/tools/unix/wsimport.html), presente por padr�o no Java 8.

A pesar das classes serem geradas atrav�s do _wsimport_ que � disponibilizado nativamente com o JDK 8, o spintec-tiss est� utilizado o JDK 11 para a sua compila��o. � importante que permane�a assim para que n�o se gere incompatibilidade entre as depend�ncias.

## Importando WS  
Para gerar uma nova classe para padroniza��o de comunica��o tiss, � recomendado que seja utilizado o wsimport presente por padr�o no JDK 8.

Siga o exemplo abaixo para gerar uma nova classe de padroniza��o:

```
"C:/Program Files/Java/jdk1.8.0_251/bin/wsimport.exe" -keep -Xnocompile http://url_webservice:8080/TISS30500OPS/tissSolicitacaoProcedimento?wsdl
```

> **IMPORTANTE:** O comando de acima deve ser executado a partir do diret�rio `./src/main/java`.

**-keep:** Mant�m os arquivos `.java` gerados pelo wsimport.<br />
**-Xnocompile:** N�o gera os arquivos `.class`.