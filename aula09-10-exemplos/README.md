# Laços de repetição

## O que é um laço de repetição ou loop

Derivado dos termos em inglês, looping ou loops, laços de repetição são uma estrutura de programação que permite que o programador possa executar um determinado trecho de código várias vezes sem ter que repeti-lo.

Os laços de repetição podem ser classificados como laços iterativos ou interativos. Os laços iterativos executam um número previsto de vezes de forma automática. Já os laços interativos necessitam da intervenção do usuário para repetir a sua execução.

Podemos encontrar até 6 formas diferentes de se escrever laços de repetição, sendo que na maior parte das linguagens, apenas 3 formas ou menos podem ser usadas.

As três principais formas de laços de repetição presentes na maioria das linguagens de programação são:
- Laço com controle condicional pré-teste (while)
- Laço com controle condicional pós-teste (do while)
- Laço incondicional

## Variáveis de controle

Tradicionalmente, nos laços do tipo iterativo é utilizada uma variável de controle com o nome `i` (letra i). Isso é um hábito entre a maioria dos programadores, pois, a letra i é a abreviação de iteração ou iteration em inglês. 

## Laço condicional pré-teste

O laço condicional com verificação pré-teste é usado para quando se quer executar um bloco de instruções de acordo com a validade do resultado lógico de uma condição pré-estabelecida.

Caso o resultado lógico seja verdadeiro, o bloco de instruções seguinte será executado. Na próxima execução, caso o resultado da válidação seja falso, o laço é encerrado e programa segue para instrução após o fim do laço.

Para os laços de condição pré-teste, existem duas formas de utilização: a de fluxo condicional verdadeiro e a de fluxo condicional falso.

### Laço de fluxo de condicional verdadeiro

Este tipo de laço irá executar o bloco de instruções interno a ele enquanto o valor da condição for verdadeiro. No momento em que a condição for falsa, a execução do laço é encerrada automaticamente.

Representação gráfica e código em portugês estruturado:

- Exemplo 01 - laço iterativo

Elaborar um programa que efetue a entrada de um valor numérico inteiro qualquer. Em seguida, processar o cálculo do valor de entrada, multiplicando-o por 3 e apresentando seu resultado. Proceder à execução dos passos anteriores cinco vezes.

- Exemplo 02 - laço interativo

Elaborar um programa que efetue a entrada de um valor numérico inteiro qualquer. Em seguida, calcular o valor entrado, multiplicando-o por 3 e apresentando seu resultado. Ao final da apresentação do resultado, o programa deve perguntar ao usuário se ele deseja novo cálculo. Se a resposta for sim, deve executar novamente as instruções subordinadas ao bloco adjacente. Se a resposta for diferente de sim, o programa deve parar a execução.

### Laço de fluxo de condicional falso

Este tipo de laço irá executar o bloco de instruções interno a ele enquanto o valor da condição for falso. No momento em que a condição for verdadeira, a execução do laço é encerrada automaticamente.

Representação gráfica e código em portugês estruturado:

- Exemplo 03 - laço iterativo

Elaborar um programa que efetue a entrada de um valor numérico inteiro qualquer. Em seguida, calcular o valor entrado, multiplicando-o por 3 e apresentando seu resultado. Proceder à execução dos passos anteriores cinco vezes

- Exemplo 04 - laço interativo

Elaborar um programa que entre um valor numérico inteiro qualquer. Em seguida, calcular o valor de entrada, multiplicando-o por 3 e apresentando seu resultado. Ao final da apresentação do resultado, o programa deve perguntar ao usuário se ele deseja novo cálculo. Se a resposta for diferente de não, deve executar novamente as instruções subordinadas ao bloco adjacente. Se a resposta for não, o programa deve parar a execução.


- Exemplo 05 - Laço condicional pós-teste iterativo de condição falsa
Elaborar um programa que efetue a entrada de um valor numérico inteiro qualquer. Em seguida, calcular o valor entrado, multiplicando-o por 3 e apresentando seu resultado. Proceder à execução dos passos anteriores cinco vezes

- Exemplo 06 - Laço condicional pós-teste interativo de condição falsa
Elaborar um programa que efetue a entrada de um valor numérico inteiro qualquer. Em seguida, calcular o valor de entrada, multiplicando-o por 3 e apresentando seu resultado. Ao final, o pro-grama deve perguntar ao usuário se ele deseja novo cálculo. Se a resposta for sim, deve executar novamente as instruções subordinadas ao bloco adjacente. Se a resposta for não, o programa deve parar a execução

- Exemplo 07 - Laço condicional pós-teste iterativo de condição verdadeira
Elaborar um programa que efetue a entrada de um valor numérico inteiro qualquer. Em seguida, calcular o valor de entrada, multiplicando-o por 3 e apresentando seu resultado. Proceder à execução dos passos anteriores cinco vezes

- Exemplo 08 - Laço condicional pós-teste interativo de condição verdadeira
Elaborar um programa que efetue a entrada de um valor numérico inteiro qualquer. Em seguida, calcular o valor de entrada, multiplicando-o por 3 e apresentando seu resultado. Ao final, o programa deve per-guntar ao usuário se ele deseja novo cálculo. Se a resposta for sim, deve executar novamente as instruções subordinadas ao bloco adjacente. Se a resposta for não, o programa deve parar a execução.

- Exemplo 09 - Laço condicional seletivo (while)
Elaborar um programa que efetue a entrada de um valor numérico inteiro qualquer. Em seguida, calcular o valor de entrada, multiplicando-o por 3 e apresentando seu resultado. Se o passo for maior que 4, finalize a execução. Proceder à execução dos passos anteriores cinco vezes. 

- Exemplo 10 - Laço incondicional (for)
Elaborar um programa que efetue a entrada de um valor numérico inteiro qualquer. Em seguida, calcular o valor entrado, multiplicando-o por 3 e apresentando seu resultado. Proceder à execução dos passos anteriores cinco vezes

## Exercícios

1- Faça um programa que simule um jogo de adivinhação. O programa deve gerar um número aleatório entre 1 e 100, e pedir para o usuário tentar adivinhar o número. A cada tentativa do usuário, o programa deve informar se o número a ser adivinhado é maior ou menor do que o número informado pelo usuário. O jogo termina quando o usuário acerta o número. 

2 - Faça um programa que calcule a média de um conjunto de números informados pelo usuário. O programa deve continuar pedindo números até que o usuário informe um valor negativo.

3 - Faça um programa que peça ao usuário para digitar um número e imprima a tabuada desse número até 10.

4 - Faça um programa que peça ao usuário para digitar uma palavra e verifique se essa palavra é um palíndromo (ou seja, se pode ser lida da mesma forma da esquerda para a direita e da direita para a esquerda).