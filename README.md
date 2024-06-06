# Relatório - tema **PDraw**, grupo **pdraw-t02**

Cadeira: Compiladores

Ano Letivo: 2023/2024

O presente projeto tem como objetivo construir um compilador e um interpretador para a linguagem **PDraw** e **iPdraw**, respetivamente. A linguagem **PDraw** compila os programas **PDraw** para Python. O programa compilado pode eventualmente executar um _script_ **iPdraw** que será interpretado em tempo de execução.
Ambas as linguagens permitem aos utilizadores a criação imagens e formas, proporcionando-lhes uma tela virtual. A linguagem segue a abstração da biblioteca python `turtle`.

---

## Index

[Relatório - tema **PDraw**, grupo **pdraw-t02**](#relatório---tema-pdraw-grupo-pdraw-t02)

- [Relatório - tema **PDraw**, grupo **pdraw-t02**](#relatório---tema-pdraw-grupo-pdraw-t02)
  - [Index](#index)
  - [1. Constituição do grupo e participação individual](#1-constituição-do-grupo-e-participação-individual)
  - [2. Como executar](#2-como-executar)
  - [3. Estrutura](#3-estrutura)
  - [4. Pdraw](#4-pdraw)
    - [4.1. Gramática](#41-gramática)
    - [4.2. Visitors](#42-visitors)
      - [Exemplo - InstructionPenAction](#exemplo---instructionpenaction)
    - [4.3. Variáveis, métodos, operadores e tipos de dados](#43-variáveis-métodos-operadores-e-tipos-de-dados)
      - [Variáveis e métodos](#variáveis-e-métodos)
      - [Operadores](#operadores)
      - [Tipos de dados](#tipos-de-dados)
    - [4.4 Caneta](#44-caneta)
    - [4.5 Canvas](#45-canvas)
    - [4.6 Setas de atributos](#46-setas-de-atributos)
    - [4.7 Instruções condicionais e loops](#47-instruções-condicionais-e-loops)
      - [If](#if)
      - [For](#for)
      - [While/Until](#whileuntil)
      - [Pipeline de comandos](#pipeline-de-comandos)
    - [4.8 StringTemplates (ST)](#48-stringtemplates-st)
    - [4.9 Funções](#49-funções)
    - [4.10 Pipeline de comandos](#410-pipeline-de-comandos)
    - [4.11 Escrever texto no ecrã](#411-escrever-texto-no-ecrã)
  - [5. iPdraw](#5-ipdraw)
    - [5.1. Gramática](#51-gramática)
    - [5.2. Visitors](#52-visitors)
    - [5.3 Variáveis, Loops, Conditional Structures, Pipeline de comandos,Escrever texto no ecrã](#53-variáveis-loops-conditional-structures-pipeline-de-comandosescrever-texto-no-ecrã)
    - [5.4 Arrays](#54-arrays)
  - [6. Exemplos](#6-exemplos)
  - [7. Contribuições](#7-contribuições)

---

## 1. Constituição do grupo e participação individual

|  NMec  | Nome                           | Participação |
| :----: | :----------------------------- | :----------: |
| 112974 | ANDRÉ PEDRO RIBEIRO            |    28.8%     |
| 68264  | BRUNO RAFAEL DOS SANTOS LOPES  |     6.8%     |
| 108712 | DIOGO ALEXANDRE MARQUES FALCÃO |     6.8%     |
| 107927 | RUBEN TAVARES GARRIDO          |    28.8%     |
| 113170 | VIOLETA BATISTA RAMOS          |    28.8%     |

## 2. Como executar

Dar permissão para executar o script _run.sh_ (_workflow_: antlr4-build,run,cria enviroment):

```bash
chmod +x ./run.sh
./run.sh [options] <filename>
```

> [!Note]
> O script _run.sh_ foi criado para facilitar a compilação e execução do pdraw.

## 3. Estrutura

Organização do repositório (diretórios):

```tree
├── doc
├── examples
│   └── self_made
├── scripts
└── src
    ├── compiler
    │   ├── st
    │   └── types
    └── generated_files
```

- **doc**: Documentação e assets do projeto
- **examples**: Exemplos de programas em **PDraw**
- **scripts**: Scripts de apoio ao desenvolvimento
- **src**: Código fonte do projeto
  - **compiler**: Código fonte do compilador
    - **st**: Código fonte dos templates _StringTemplate_
    - **types**: Código fonte dos tipos de dados
  - **generated_files**: Ficheiros gerados pelo ANTLR4

## 4. Pdraw

A linguagem **PDraw** é uma linguagem de programação compilada que compila programas para Python.

Todas as instruções são executadas em relação a uma caneta que é configurada com várias variáveis. Permite ter várias canetas numa determinada janela. As canetas são movidas para cima ou para baixo (_'levantadas/colocadas do/no papel'_), rodadas (_clockwise ou anticlockwise_) e deslizadas para a esquerda ou direita permitindo ao utilizador desenhar formas e imagens no ecrã.

Todas as instruções de atributos da caneta devem acabar com um ponto e vírgula e todas as linhas devem permitir a criação de comentários com o símbolo %.

### 4.1. Gramática

Em ANTLR4 ao definirmos uma gramática formulamos regras sintáticas(_parser_) e léxicas(_lexer_) gerando uma árvore sintática em que cada nó corresponde a um token. Neste projeto a gramática tem a seguinte estrutura.

| Ficheiros       | Descricão                                                 |
| --------------- | --------------------------------------------------------- |
| **Elements.g4** | Definição de expressões aritmétricas e comandos da caneta |
| **Class.g4**    | Criação e configuração de Canvas e Pens                   |
| **pgdraw**      | Gramática Principal                                       |

O _pgdraw.g4_ importa a _Elements.g4_ e _Class.g4_ para ter maior abstração e uma melhor organização da gramática.

### 4.2. Visitors

Como já mencionado anteriormente, na árvore de análise sintática (_parse tree_) gerada pelo parser, pretendemos interagir com cada nó e é aqui que entra o **Visitor**.
Com esta ferramenta podemos configurar com ações especifícas e personalizadas sobre a estrutura de objetos tornando o código mais modular, reutilizável e fácil manutenção.

**Compiler** e **SemanticAnalysis** são os Visitors que foram implementados neste projeto.

A seguir, demonstramos um exemplo de fluxo do projeto (caneta pode fazer **up** e **down**), passando pela gramática, depois pela análise semântica e acabando no compilador com o tipo StringTemplate.

#### Exemplo - InstructionPenAction

1. Gramática

```antlr4
instruction:
	variable (move | rotate | pause | write)+	# InstructionMoveRotateAction
	| variable penAction						          # InstructionPenAction
	| variable '<-' arrowProps					      # InstructionArrowProps;

```

2. Análise semântica

```java
@Override
  public Boolean visitInstructionPenAction(
    pdrawParser.InstructionPenActionContext ctx
  ) {
    String variable = ctx.variable().getText();
    if (!symbolTable.containsKey(variable)) {
    // if variable (pen) is not in the Symbol Table.
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s not defined", variable)
      );
      return false;
    }
    // variable is Type PEN. We only allow for the words "down" and "up". If so, the return value is true and it passes the semantic analysis.
    Type type = symbolTable.get(variable).getType();
    if (type instanceof PenTAD) {
      Boolean penAction =
        ctx.penAction().getText().equals("down") ||
        ctx.penAction().getText().equals("up");
      if (penAction) {
        return true;
      }
      ErrorHandling.printError(ctx, "Instructions are not valid");
      return false;
    }
    ErrorHandling.printError(
      ctx,
      String.format("Variable %s is not a pen", variable)
    );
    return false;
  }

```

3. String template

```s
instruction(variable, action, value, fontsize) ::= "<variable>.<action>(<value><if(fontsize)>, <fontsize><endif>)"
```

4. Compiler

```java
  @Override
  public ST visitInstructionPenAction(
    pdrawParser.InstructionPenActionContext ctx
  ) {
    // add tokens in StringTemplate
    ST res = pdrawTemplate.getInstanceOf("instruction");
    res.add("variable", visit(ctx.variable()));
    res.add("action", ctx.penAction().getText());
    return res;
  }
```

### 4.3. Variáveis, métodos, operadores e tipos de dados

#### Variáveis e métodos

As variáveis em **PDraw** são declaradas com o tipo de dados e o nome da variável. Atributos podem ser definidos para as variáveis e as Strings têm de ser concatenadas.

```matlab
int add = 3 + 1;
int sub = 3 - 1;
int mul = 3 * 1;
real div = 3 / 1;
int dre = 3 // 1;
int pow = 3 ^ 2;
int par = (3 + 2) * 4;
par = sub--;
par = add++;
mult++;
string word = "Love" "C"; % Concatenation
int i,x,t; % Default value
int k=0, w=0;
pen p = new PenType1;
```

As variáveis também podem ser declaradas com input.

```matlab
int x = int(stdin "x: ");
int y = int(stdin "y: ");
string w = stdin stdin "Choose your stdin name: ";
```

Por último, podemos dar print de variáveis.

```c
p2 -> stdout;
"\n" -> stdout;
"FALHOU" -> stderr;
```

#### Operadores

| Operador | Descrição                          |
| -------- | ---------------------------------- |
| +        | Adição                             |
| ++       | Incremento                         |
| --       | Decremento                         |
| -        | Subtração                          |
| /        | Divisão                            |
| //       | Divisão inteira                    |
| \*       | Multiplicação                      |
| ^        | Potência                           |
| ==       | Igual                              |
| !=       | Diferente                          |
| <        | Menor que                          |
| <=       | Menor ou igual a                   |
| >        | Maior que                          |
| >=       | Maior ou igual a                   |
| and      | E lógico                           |
| or       | Ou lógico                          |
| up       | Levanta a caneta                   |
| down     | Baixa a caneta                     |
| pause    | Pausa o programa por microsegundos |

> [!NOTE]
> A árvore sintática não está a fazer a verificação da precedência para os operadores **and**, **or**, **\***, **^**,**/**,**//**, no entanto, inferimos as regras do python e por isso não criámos regras novas. Por isso, o **and** precede o **or**. No caso **==** (igual), criámos regras para que este tenha menor precedência do que as setas.

#### Tipos de dados

Tipos (**Type**):

- **Angle**
- **Bool**
- **Canvas**
- **Function**
- **Int**
- **PenTAD**
- **Pen**
- **Point**
- **Real**
- **String**
- **Symbol**
- **Tuple**

O cast de tipos de dados também é possível:

```
int i = 5;
string s = string(i);

string t = "5";
t = string(8);

real r = 5.0;
r = real(1);
r = real("1");
```

### 4.4 Caneta

Existem 2 formas de criar uma caneta em **PDraw**:

1. **Caneta com atributos**: A caneta com atributos é criada com atributos específicos. A declaração da caneta é feita com a definição dos atributos.

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

2. **Caneta por defeito**: A caneta herdada por defeito é herdada com os atributos anteriormente definidos.

```
pen p1 = new PenType1;
```

ou com valores por defeito

```
pen psec = new;
```

| Variável        | Descricão                                                     |
| --------------- | ------------------------------------------------------------- |
| **color**       | Cor da caneta que pode ser uma palvra ou um valor hexadecimal |
| **position**    | Posição inicial representada por um ponto (tuplo)             |
| **orientation** | Ângulo em graus da orientação da caneta                       |
| **thickness**   | Espessura da caneta                                           |
| **pressure**    | Pressão com que a caneta está a ser usada                     |
| **speed**       | Velocidade da caneta a desenhar                               |

Podemos também adicionar/subtrair pontos à caneta (o que resulta na alteração da posição da caneta):

```
pen p1 = new PenType1;
p1 = p1 + (5,5);
```

### 4.5 Canvas

A canvas é a tela virtual onde são desenhadas as figuras. Por predifinição, a canvas tem 500x500 de tamanho, sem nome e branco. Porém, pode ser alterada:

```
define canvas Canvas1 "Example 1" (100,100);
```

![Canvas](doc/circle.gif)

```
Canvas2 background red;
```

Podemos também definir qual a canvas ativa:

```
set Canvas1;
```

### 4.6 Setas de atributos

As setas de atributos são usadas quando queremos alterar um atributo de uma caneta. Por exemplo, se quisermos alterar a cor de uma caneta, podemos fazer:

```
p1 <- color = red;
```

Assim como se quisermos mudar a posição da caneta (tendo o x e y já anteriormente definidos):

```
p1 <-position (x,y);
p1 <-speed 100+x;

```

### 4.7 Instruções condicionais e loops

#### If

Para o **if**, tivemos que tomar em atenção as operações lógicas e aritméticas, assim como elifs e else, para além disso também tivemos em atenção o scope dos ifs, variáveis definidas no if só estão disponiveis no if.

```
if (myStringVar == "Hello") {
    "Hello bestie" -> stdout;
} else if (myStringVar == "Hi") {
    "Hi bestie" -> stdout;
} else {
    "Bye bestie" -> stdout;
};
```

#### For

Para o **for**, tivemos que tomar em atenção a inicialização, condição, incremento e scope.

```
for (int i = 0; i < 5; i++) {
   i -> stdout;
};
```

#### While/Until

Exemplo de um **until**:

```
until (done) {
   length = int(stdin "length: ");
   angle = real(stdin "rotation angle (degrees): ") / 180 * PI;
   string t = stdin "finish (y/N)?: ";
   done = t;
};
```

#### Pipeline de comandos

Exemplo de uma **Pipeline**:

```matlab
p1 forward 10 right 144º forward 10 right 144º;
p1 forward 20 right 100º pause 1000 forward 10 pause 2000 right 144º;
```

### 4.8 StringTemplates (ST)

Como StringTemplates divimos também em três secções para ser mais legível de leitura e compreensão.

Por exemplo temos a _Class.stg_:

```s
createPenClass(className, classProps) ::= <<
class <className>(Pen):
    def __init__(self) -> None:
        super().__init__()
        <classProps; separator="\n">
>>

classProps(prop, expression) ::= "self.<prop> = <expression>"
```

Temos a _pdraw.stg_:

```s
assignment(assignVar, assignPen, reassignVar, variable, object, expression, type) ::= <%
<if(assignVar)>
<variable>: <type> = <expression>
<elseif(assignPen)>
<object>
<elseif(reassignVar)>
<variable> = <expression>
<endif>
%>

```

e por último a _Elements.stg_:

```s
tuple(e1, e2) ::= "(<e1>,<e2>)"
```

A utilização destes templates vai permitir gerar código ou texto de saída durante a compilação.

### 4.9 Funções

As funções em **PDraw** são definidas com o tipo de retorno, o nome da função e os argumentos. A função tem de ser chamada com os argumentos necessários e com o tipo correto. Todas as variáveis definidas dentro da função são locais e não podem ser acedidas fora da função.

Exemplo de uma função que desenha um círculo:

```python
def int recursiveWithPen(pen p, int i){
    if (i < 100){
        p left (360 / 100) deg;
        p forward 10 * PI;
        return recursiveWithPen(p,i+1);
    };
    return 0;
};
```

### 4.10 Pipeline de comandos

A pipeline de comandos é uma sequência de comandos que são executados em sequência. Cada comando é separado por um espaço.

```matlab
p1 forward 10 right 144º forward 10 right 144º;
p1 forward 20 right 100º pause 1000 forward 10 pause 2000 right 144º;
```

### 4.11 Escrever texto no ecrã

Para escrever texto no ecrã, usamos a função **write**. Esta função recebe uma string e escreve-a no ecrã.

```matlab
pen p1 = new PenType1;
p1 down;
% pen write texto, fontsize;
p1 write "ola", 30;
```

## 5. iPdraw

A linguagem **iPdraw** é uma linguagem de programação interpretada que executa programas **iPdraw**. A linguagem **iPdraw** permite todas as operações que a linguagem **PDraw** permite (com exceção de funções) com a adição de manipulação de arrays, no entanto, apenas permite a execução de comandos para uma Pen.

### 5.1. Gramática

A gramática do **iPdraw** é muito semelhante à gramática do **PDraw**. No entanto, a gramática do **iPdraw** é mais simples e não permite a definição de funções e permite a criação/manipulação de arrays.

### 5.2. Visitors

O visitor `interpreter.py` é responsável por interpretar o código **iPdraw** e fazer a verificação semântica comando a comando que é feita em execution time.

### 5.3 Variáveis, Loops, Conditional Structures, Pipeline de comandos,Escrever texto no ecrã

Todas as estruturas desta secção são declaradas exatamente da mesma forma que em **PDraw**.

### 5.4 Arrays

A linguagem **iPdraw** permite a criação e manipulação de arrays.

```c
int arr =[10,20, 30,40,50,60,70,80,90,100,110,120,140];

arr[0]=20;
arr[10]=30;

arr[0] -> stdout;
len arr -> stdout;
del arr[1];
len arr -> stdout;

int j;

while (j lt len arr){
    arr[j] -> stdout;
    j++;
};

```

## 6. Exemplos

Como mencionado anteriormente o _p1.ipdraw_, _p1.pdraw_ , _p2.pdraw_, _p3.pdraw_, _p4.pdraw_ e exemplos criados personalizados para cada ocasião onde é testada cada operação para efeitos de testes. Os exemplos criados por nós estão na pasta `self_made`

```bash
examples
├── p1.ipdraw
├── p1.pdraw
├── p2.pdraw
├── p3.pdraw
├── p4.pdraw
└── self_made
    ├── test_addpoint.pdraw
    ├── test_assignment.pdraw
    ├── test_atributtesarrows.pdraw
    ├── test_canvas_background.pdraw
    ├── test_casts.pdraw
    ├── test_compiler_definepen.pdraw
    ├── test_compiler_onevar.pdraw
    ├── test_compiler_vars_defines.pdraw
    ├── test_create_canvas.pdraw
    ├── test_definepen_assignpen.pdraw
    ├── test_for.pdraw
    ├── test_function.pdraw
    ├── test_if.pdraw
    ├── test_ipdraw.ipdraw
    ├── test_multiple_ass_one_line.pdraw
    ├── test_operation.pdraw
    ├── test_pdraw3_addpoint.pdraw
    ├── test_pipeline.pdraw
    ├── test_stdin.pdraw
    ├── test_while.pdraw
    └── test_write.pdraw
```

## 7. Contribuições

<table>
    <tr>
        <th>Funcionalidade</th>
        <th>Scope</th>
        <th>Autor</th>
    </tr>
    <tr>
        <td>Arrays</td>
        <td>Interpretador</td>
        <td>André e Violeta</td>
    </tr>
    <tr>
        <td rowspan="2">Casts entre tipos de dados</td>
        <td>Compilador</td>
        <td>Diogo e Rúben</td>
    </tr>
    <tr>
        <td>Interpretador</td>
        <td>André e Violeta</td>
    </tr>
    <tr>
        <td rowspan="2">Constants</td>
        <td>Compilador</td>
        <td>Rúben</td>
    </tr>
    <tr>
        <td>Interpretador</td>
        <td>André e Violeta</td>
    </tr>
    <tr>
        <td>Escrita de texto no canvas</td>
        <td>Compilador e Interpretador</td>
        <td>André e Violeta</td>
    </tr>
    <tr>
        <td>Escrita de texto no stdout</td>
        <td>Compilador</td>
        <td>Rúben</td>
    </tr>
    <tr>
        <td>Executar interpretador</td>
        <td>Compilador</td>
        <td>Rúben</td>
    </tr>
    <tr>
        <td rowspan="2"><code>for</code> loop</td>
        <td>Compilador</td>
        <td>Rúben</td>
    </tr>
    <tr>
        <td>Interpretador</td>
        <td>André e Violeta</td>
    </tr>
    <tr>
        <td>Funções</td>
        <td>Compilador</td>
        <td>André e Violeta</td>
    </tr>
    <tr>
        <td rowspan="2"><code>if</code> condition</td>
        <td>Compilador</td>
        <td>Rúben</td>
    </tr>
    <tr>
        <td>Interpretador</td>
        <td>André e Violeta</td>
    </tr>
    <tr>
        <td rowspan="2">Increment / Decrement</td>
        <td>Compilador</td>
        <td>Rúben</td>
    </tr>
    <tr>
        <td>Interpretador</td>
        <td>André e Violeta</td>
    </tr>
    <tr>
        <td>Instrução de pausa</td>
        <td>Compilador</td>
        <td>Rúben</td>
    </tr>
    <tr>
        <td rowspan="2">Leitura de texto do stdin</td>
        <td>Compilador</td>
        <td>Rúben</td>
    </tr>
    <tr>
        <td>Interpretador</td>
        <td>André e Violeta</td>
    </tr>
    <tr>
        <td rowspan="2">Mudança de atributos de canetas</td>
        <td>Compilador</td>
        <td>Diogo</td>
    </tr>
    <tr>
        <td>Interpretador</td>
        <td>André e Violeta</td>
    </tr>
    <tr>
        <td rowspan="2">Movimento de canetas</td>
        <td>Compilador</td>
        <td>Bruno</td>
    </tr>
    <tr>
        <td>Compilador</td>
        <td>André e Violeta</td>
    </tr>
    <tr>
        <td rowspan="2">Operações de relação e igualdade</td>
        <td>Compilador</td>
        <td>Rúben</td>
    </tr>
    <tr>
        <td>Interpretador</td>
        <td>André e Violeta</td>
    </tr>
    <tr>
        <td rowspan="2">Pipelines de canetas</td>
        <td>Compilador</td>
        <td>Rúben</td>
    </tr>
    <tr>
        <td>Interpretador</td>
        <td>André e Violeta</td>
    </tr>
    <tr>
        <td>Relatório</td>
        <td>Outros</td>
        <td>Todos</td>
    </tr>
    <tr>
        <td>Script de execução</td>
        <td>Outros</td>
        <td>André e Rúben</td>
    </tr>
    <tr>
        <td>Somar pontos a canetas</td>
        <td>Compilador</td>
        <td>André, Bruno e Violeta</td>
    </tr>
    <tr>
        <td>Variáveis sem valor inicial</td>
        <td>Compilador e Interpretador</td>
        <td>André, Rúben e Violeta</td>
    </tr>
    <tr>
        <td>Verificação semântica de tipos</td>
        <td>Compilador e Interpretador</td>
        <td>André e Violeta</td>
    </tr>
    <tr>
        <td rowspan="2"><code>while</code> & <code>until</code> loops</td>
        <td>Compilador</td>
        <td>Rúben</td>
    </tr>
    <tr>
        <td>Interpretador</td>
        <td>André e Violeta</td>
    </tr>
</table>
