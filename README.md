# Linguagem Java
**Teste de código-Pool:**
>class Animais: 
  A classe Animais contém o encapsulamento dos atributos de cada animal, são privados (int idade, float tamanho), e dois construtores um passando como parâmetro as variaveis (idade e tamanho) e o outro construtor vazio. Também contém uma interface Acao onde acessa a função void emitirSom, sendo uma característica em comum de todos os animais da fazenda.

>class Aves: 
  A classe Aves herda os atributos e métodos da classe pai Animais, contém uma variável String corPena que armazena a cor da pena das aves, contém também dois construtores um passando como parâmetro as variáveis (idade, tamanho, corPena) e o outro construtor vazio, e também uma função void botarOvo que imprime a característica das aves de botar ovos.

>class Mamiferos: 
  A classe Mamiferos herda os atributos e métodos da classe pai Animais, que contém dois construtores um passando como parâmetro as variáveis (idade, tamanho, corPelo) e o outro vazio, e também uma várivel String corPelo que armazena a cor do pelo do animal, e uma função void amamentar que imprime a caracteristica dos mamiferos de amamentar.

>class Galinha: 
  A classe Galinha herda os atributos e métodos da classe pai Aves, que contém dois construtores um passando como parâmetro as váriaveis (idade, tamanho, corPena) e um outro vazio, e também uma função void emitirSom que imprime um cacarejo.

>class Pato: 
 A classe Pato herda os atributos e métodos da classe pai Aves, que contém dois construtores um passando como parâmetro as variáveis (idade, tamanho, corPena) e o outro vazio, e também uma função void emitirSom que imprime um grasnido, e uma função void voar que imprime uma característica somente do pato.

>class Morcego:
 A classe Morcego herda os atributos e métodos da classe pai Mamiferos, que contém dois construtores um passando como parâmetro as variáveis (idade, tamanho, corPelo) e o outro vazio, e também uma função void emitirSom que imprime um farfalho, e uma outra função void voar que imprime uma característica somente do morcego.

>class Vaca: 
  A classe Vaca herda os atributos e métodos da classe pai Mamiferos, que contém dois construtores um passando como parâmetro as variáveis (idade, tamanho, corPelo) e o outro vazio, e também uma função void emitirSom que imprime um mugido.
  
>class Input: 
  A classe Input contém o main onde tem a classe Scanner que armazena o que o usuário digitou e imprime na tela as informações de cada animal.
  
>class Acao: 
  A classe Acao é uma interface que contém a função emitirSom.
