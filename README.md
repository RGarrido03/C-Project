# Tema **PDraw**, grupo **pdraw-t02**

---

## Index

- [Tema **PDraw**, grupo **pdraw-t02**](#tema-pdraw-grupo-pdraw-t02)
  - [Index](#index)
  - [1. Constituição dos grupos e participação individual global](#1-constituição-dos-grupos-e-participação-individual-global)
  - [**run like this**](#run-like-this)
  - [2. Relatório](#2-relatório)
- [3. Caneta](#3-caneta)
- [4. Estrutura](#4-estrutura)
- [5. Gramática](#5-gramática)
- [6. Visitors](#6-visitors)
- [7. StringTemplates (ST)](#7-stringtemplates-st)
- [](#)
  - [Contribuições](#contribuições)
  - [Duvidas](#duvidas)

## 1. Constituição dos grupos e participação individual global

|  NMec  | Nome                           | Participação |
| :----: | :----------------------------- | :----------: |
| 112974 | ANDRÉ PEDRO RIBEIRO            |     0.0%     |
| 68264  | BRUNO RAFAEL DOS SANTOS LOPES  |     0.0%     |
| 108712 | DIOGO ALEXANDRE MARQUES FALCÃO |     0.0%     |
| 107927 | RUBEN TAVARES GARRIDO          |     0.0%     |
| 113170 | VIOLETA BATISTA RAMOS          |     0.0%     |

## **run like this**

```bash
antlr4 -o ../compiler -visitor pdraw.g4 -listener pdraw.g4
cd src
../antlr4-build_mod.sh -o compiler
# TO RUN WITH GUI
# cat ../../examples/p1.pdraw  | antlr4-test pdraw main -gui
```

## 2. Relatório

- Cadeira: Compiladores
- Ano Letivo: 2023/2024

Este projeto tem como objectivo construir uma linguagem de programação em que seja possível executar desenhos a 2D com a uso de canetas. Com o ANTLR (ANother Tool for Language Recognition) atingimos este objetivo, um poderoso gerador para ler, processar, executar ou traduzir texto estruturado ou ficheiros binários.

O [ANTLR4](https://www.antlr.org/download.html) (versão 4) é o que foi usado na implementação do pdraw.

Para além desta poderosa ferramenta foi necessário o envolvimento com **StringTemplates** para a geração de código na linguagem destino (Python).

# 3. Caneta

Exemplo de como definir a caneta e as suas variáveis.

```
define pen PenType1 {
  color = green;
  position = ( 10 , 10 ) ;
  orientation = 45º;
  thickness = 10 ;
  pressure = −1;
}

pen p1 = new PenType1;
```

| Variável        | Descricão                                                     |
| --------------- | ------------------------------------------------------------- |
| **color**       | Cor da caneta que pode ser uma palvra ou um valor hexadecimal |
| **position**    | Posição inicial representada por um ponto (tuplo)             |
| **orientation** | Ângulo em graus da orientação da caneta                       |
| **thickness**   | Espessura da caneta                                           |
| **position**    | Pressão com que a caneta está a ser usada (_up_, _down_)      |

# 4. Estrutura

Organização do repositório (diretórios):

```
├── doc
├── examples
│   └── self_made
├── gen
├── scripts
└── src
    ├── compiler
    │   ├── st
    │   └── types
    ├── gen
    ├── generated_files
    └── grammar
```

- **doc** documentação extra
- **examples** exemplos ilustrativos das linguagens geradas
- **gen** ficheiros gerados pelo ANTLR4
- **scripts** ficheiros bash do ANTLR4 modificados ` antlr4-build, antlr4-run, antlr4-clean`
- **src** código fonte

> [!NOTE]
> A estrutura vai se atualizando à medida do tempo

# 5. Gramática

Em ANTLR4 ao definirmos uma gramática formula-se regras sintáticas(_parser_) e léxicas(_lexer_) gerando uma árvore sintática em que cada nó corresponde a um token. Neste projeto a gramática tem a seguinte estrutura.

| Ficheiros       | Descricão                                                 |
| --------------- | --------------------------------------------------------- |
| **Elements.g4** | Definição de expressões aritmétricas e comandos da caneta |
| **Class.g4**    | Criação e configuração de objetos de classes              |
| **pgdraw**      | Gramática Principal                                       |

O _pgdraw.g4_ importa a _Elements.g4_ e _Class.g4_ para ter mais simplicidade e organização da gramática.

# 6. Visitors

Já mencionado anteriormanete na árvore de análise sintática (_parse tree_) gerada pelo parser pretendemos interagir com cada nó e é aqui que entra o **Visitor**.
Com esta ferramenta podemos configurar com ações especifícas e personalizadas sobre a estrutura de objetos tornando o código mais modular, reutilizável e fácil manutenção.

**Compiler** e **SemanticAnalysis** são os Visitors que foram implementados neste projeto.

# 7. StringTemplates (ST)

#

## Contribuições

- Use esta secção para expôr as contribuições individuais dos vários elementos do grupo e que
  justificam as participações individuais globais apresentadas no início.

## Duvidas

```bash

# on root directory (pdraw-t02)
cd src/generated_files

python -m venv env
#or
python3 -m venv env

source env/bin/activate
pip install antlr4-python3-runtime

# nao precisa de ser o `mod`
antlr4-build -python
# DO NOT USE ANTLR4-RUN BECAUSE IS USES THE GLOBAL INTERPRETER
# antlr4-run -python pdrawMain.py <-- THIS NEVER
# USE ALWAYS VIRTUAL ENVIRONMENT
python pdrawMain.py




```
