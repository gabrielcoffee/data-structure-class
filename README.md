# estrutura-de-dados
Códigos da matéria Resolução de Problemas Estruturados em Computação (Estrutura de Dados)

# FLOOD FILL (PREENCHIMENTO)
Existem duas estruturas de flood fill no projeto, uma mais simples com inteiros (IntFloodFill) e uma com imagens (ImgFloodFill), as duas funcionam de maneira bem similar.

O Algoritmo funciona como o balde de tinta do paint, utiliza duas funções: fillByQueue e fillByStack, a primeira armazena as coordenadas para pintar em uma fila e a outra em uma pilha, ambas as estruturas foram implementadas pela equipe do projeto.

![gif](https://github.com/gabrielcoffee/estrutura-de-dados/assets/60583301/2b46baba-f0af-48e8-83b7-ba0b03a439c2)

# STATIC STACK (PILHA ESTÁTICA)
Funciona como uma pilha comum que tem seu tamanho definido inicialmente, o ultimo valor adicionado é o primeiro a ser retirado.

![lego-stacking](https://github.com/gabrielcoffee/estrutura-de-dados/assets/60583301/4ab8bc63-c762-4e7b-a518-3e65bdcfbe7f)


# CIRCULAR QUEUE (FILA CIRCULAR)
Funciona como uma fila circular com o sistema FIFO (First In First Out), onde o primeiro valor adicionado é o primeiro a ser retirado.

![Design sem nome](https://github.com/gabrielcoffee/estrutura-de-dados/assets/60583301/65fb78cf-3853-4255-ab26-b2385117dabd)

# BINARY SEARCH TREE (ÁRVORE BINÁRIA DE BUSCA)
Uma árvore binária de busca é uma estrutura de dados em que cada nó possui, no máximo, dois filhos, e os nós à esquerda têm valores menores do que os nós à direita. Essa árvore é usada principalmente para armazenar dados de forma organizada, facilitando a busca e a recuperação eficiente de informações, comumente usada em algoritmos de pesquisa e ordenação.
![image](https://github.com/gabrielcoffee/estrutura-de-dados/assets/60583301/62b5c22d-fa3c-4440-ac1a-f2459e65832e)

Essa estrutura possui 3 funções principais:

**Add (Inserir)**: Permite adicionar um novo elemento à árvore, mantendo a propriedade de ordenação, ou seja, o elemento é colocado no local correto de acordo com seu valor.

**Contains (Contém)**: Verifica se um determinado elemento está presente na árvore, permitindo a busca eficiente de dados.

**Remove (Remover)**: Permite remover um elemento específico da árvore, mantendo a estrutura da árvore binária de busca correta após a remoção, garantindo que a propriedade de ordenação seja preservada.
