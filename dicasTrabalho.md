# Dicas prof Artur

## o que é um compilador

- Tradutor de linguagem

- No nosso caso recebe os ficheiros de exmplo e traduz para py ou java ou cpp

## Vamos supor coisas

- Imaginando a introducao de um agl num compilador, o resultado deve ser um programa python 

- Codigo do compilador tem de ser java - ou seja agl que passa pelo compiler java e depois com ST gera py

- O visitor do compilador é um ST 

- A main cria o ficheiro .py

- devem existir 2 visitors

- main: structure
	- parser
	- lxer
	- compiler

- CENA IMPORTANTE DO PROF: A MALTA ESQUECE-SE
	- COIAS DOS IMPORTS NAO DEVEM SER FEITOS NO COMPILADOR MAS SO NO INTERPRETADOR
	- IMPORTS SAO TRANSFORMADOS EM ----> PARSING EM RUNTIME O VISITOR PARA UMA LINGUAGEM TEM DE SER PYTHON E O LEXER E O PARSER TB .... FUCK GERAR OS VISITORS E PARSERS E CENAS EM PYTHON OU SEJA LINGUAGEM AUXILIAR TEM TUDO FEITO NA LINGUAGEM TARGET(PYTHON) 
	- VALORIZACAO DE USO DE STRING TEMPLATES

- GRAMATICA DA LINGUAGEM PRINCIPAL

- VISITORS

- CLASSES DO ANALISADOR SEMANTICO (HELPER)

- ALTERACAO DO MAIN

- GRAMATICA DA LING SEC

- VISITOR DA LINGUAGEM SECUNDARIA

- ...

- ENRIQUECER A LINGUAGEM COM COISAS NOSSAS OU SEJA ADICIONAR FEATURES

- MORE THINGS...


- Nunca esquecer alterar a main
