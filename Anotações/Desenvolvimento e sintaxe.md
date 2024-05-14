# 💻 Ambiente de desenvolvimento e sintaxe java

Meus resumos e `comandos` sobre Java | Bootcamp java [DIO](https://www.dio.me/).

## 📚 Introdução
- Anatomia das classes
- Estrutura inicial;
- Padrão de nomeclatura;
- Declarar variaveis e metodos;
- Identação;
- Organizando arquivos;
- java beans
## 📚 Anatomia das classes 1
-  public class MinhaClasse {// seu código aqui}
- Primeira letra de cada palavra da classe deve ser maiuscula ex: MainClass. (Convenção)
- public static void main (String [ ] args){ System.out.print ("Hello, world");}
## 📚 Anatomia das classes 2
- Nome da minha classe deve ser a mesma do meu arquivo, que deve seguir o padrão de letras maiuscula, EX: `CalculadoraCientifica.java`.
- Toda variavel deve começar com minuscula, porem a partir da segunda com maiscula,ex:`calculadoraCientifica`.
- Se a variavel for toda maiuscula, quer dizer que ela é "final" ou seja, não podera ter valor alterado, no caso de duas palavras, devem ser conectadas por `_`. ex: `ANO_2000`.
- Variavel não pode iniciar com números, não pode ter espaço nem palavras chaves da linguagem, não pode, caracteres especiais tambem não podem com exceção de `$` e `_`.
## 📚 Anatomia das classes 3
- toda varialvel deve ter: Tipo Nomebemdefinido = valor
- estrutura = TipoRetorno NomeObjetivoNoInfinitivo (Parametro)\
Ex: `int` somar (`int` numeroUm, `int` numeroDois)\
String formatarCep (`long` cep)
## 📚 Anatomia das classes 4
- Boas praticas de identação.

## 📚 Anatomia das classes 5
- Organizando arquivos (dentro da pasta src).
- convenção de sub diretórios:/
`com.` = comercial, projeto de uma empresa.\
`edu.kelvin`= educação, projeto de estudos.\
- No vsCode, criar uma pasta por vez dentro do src.

## 📚 Anatomia das classes 6
- `Java beans`:
-  Não abreviar palavras;
- plural somente se foem um conjunto (arrays);
- usar somente um idioma, nao declarar variaveis em 2 idiomas.
-`métodos`:
- Verbos, primeira minuscula segunda em diante maiusculas.

## 📚 Tipos e variaveis 3
-  [tabela de tipos primitivos](https://glysns.gitbook.io/java-basico/sintaxe/variaveis).
- toda variável é composta por: tipo de dados + identificação + valor atribuído. Ex:
- `int idade`; //Tipo "int", nome "idade", com nenhum valor atribuído.
- `int anoFabricacao = 2021;` //tipo "int", nome "anoFabricacao", com valor 2021.
- `double salarioMinimo = 2.500;`

## 📚 Operadores 1
 [operadores](https://glysns.gitbook.io/java-basico/sintaxe/operadores)

## 📚 Operadores 4
- Ao invés de usar `numero = numero +1` podemos usar `numero ++` funciona com `--`.\
 Também há uma ordem de precedente ex: `numero = 5`\
`PrintIn = (numero ++)` = irá imprimir 5, pois a adição ocorreu depois.\
`PrintIn = (++ numero)` = irá imprimir 6, pois ocorre a adção antes de "chegar" no número.

- `boolean` = é a variavel que retorna `True` ou `False`, para inverter ela voce pode usar ex:\
`entrou = true`\
`PrintIn(!entrou)`\
Isso irá me retornar False, o `!` inverte a variavel.

## 📚 Operadores 5
- Operador ternário, pode ser usado no lugar de `if` para decisões de `true` ou `false` Ex:\
int a, b;\
a = 5;\
b = 6;\
String resultado = (a==b) ? "verdadeiro" : "false";

## 📚 Operadores 6
- `equals` = para comparativos de conteúdos, ex, string, devemos usar `equals`, para numeros podemos usar os operadores `==`.

## 📚 Operadores 7
- `&&` Operador Lógico "E".
- `||` Operador Lógico "OU".

## 📚 Métodos 2
Atributos são variaveis, métodos são funções ou ações.\
Métodos devem ser:
- Nomeados como verbo
- Seguir padrão `camelCase`(minhaPrimeiraClase)
- Caso um método não retorne nenhum valor, ele será representado pela palavra chave `void`.

## 📚 Métodos 3
- Projeto smartTv

## 📚 Escopo
Ambiente onde uma variavel pode ser acessada. [link](https://glysns.gitbook.io/java-basico/sintaxe/escopo)

## 📚 Palavras reservadas
 São 52 [palavras reservadas](https://glysns.gitbook.io/java-basico/sintaxe/palavras-reservadas) organizadas por classificação. 

 ## 📚 Java docs
 - Estudar [documentação java](https://glysns.gitbook.io/java-basico/sintaxe/documentacao).
 - No terminal execute o comando abaixo:\
`javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java`\
esse código fara que seja criado um arquivo de documentação do seu código.

 ## 📚 Terminal e argumentos 2
 Terminal:\
 Os arquivos que podem ser executados pelo terminal estão na pasta bin, são os arquivos compilados que são `.class`.\
No terminal usamos: `cd c:caminaho\doarquivo\bin>java nomearquivo` sem usar a extenção .class, e damos enter, isso executara o codigo no terminal sem uma ide.


[Trilha GitHub](https://github.com/digitalinnovationone/trilha-java-basico)