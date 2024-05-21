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
antlr4 -o ../garbage -visitor pdraw.g4 -listener pdraw.g4
cat ../../examples/p1.pdraw  | antlr4-test pdraw main -gui
```

## Relatório

- Cadeira: Compiladores
- Ano Letivo: 2023/2024

Este projeto tem como objectivo construir uma linguagem de programação em que seja possível executar desenhos a 2D com a uso de canetas. Com o ANTLR (ANother Tool for Language Recognition) atingimos este objetivo, um poderoso gerador para ler, processar, executar ou traduzir texto estruturado ou ficheiros binários.

O [ANTLR4](https://www.antlr.org/download.html) (versão 4) é o que foi usado na implementação do pdraw.

Para além desta poderosa ferramenta foi necessário o envolvimento com **StringTemplates** para a geração de código na linguagem destino (Python).

## Contribuições

- Use esta secção para expôr as contribuições individuais dos vários elementos do grupo e que
  justificam as participações individuais globais apresentadas no início.
