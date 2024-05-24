# Tema **PDraw**, grupo **pdraw-t02**

---

## Constituição dos grupos e participação individual global

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

## Relatório

- Cadeira: Compiladores
- Ano Letivo: 2023/2024

Este projeto tem como objectivo construir uma linguagem de programação em que seja possível executar desenhos a 2D com a uso de canetas. Com o ANTLR (ANother Tool for Language Recognition) atingimos este objetivo, um poderoso gerador para ler, processar, executar ou traduzir texto estruturado ou ficheiros binários.

O [ANTLR4](https://www.antlr.org/download.html) (versão 4) é o que foi usado na implementação do pdraw.

Para além desta poderosa ferramenta foi necessário o envolvimento com **StringTemplates** para a geração de código na linguagem destino (Python).

# Caneta

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

## Contribuições

- Use esta secção para expôr as contribuições individuais dos vários elementos do grupo e que
  justificam as participações individuais globais apresentadas no início.

## Duvidas

O classProps deve aceitar variaveis globais?
dEVE SER POSSIVEL redifinir as pens

```pdraw
define pen penTypeGrossa {

    color= "black";
    thickness= 10000;
}

ou seja redifinir?

define pen penTypeGrossa {

    color= "black";
    thickness= 10000;
    position=(0,0);
}
```
