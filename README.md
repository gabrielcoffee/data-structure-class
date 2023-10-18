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

# HASH TABLE (TABELA HASH)
É uma estrutura de dados que permite armazenar e recuperar informações de forma eficiente.

![HOWHASHWORKS](https://github.com/gabrielcoffee/estrutura-de-dados/assets/60583301/13b32791-03fd-4eac-b303-0da8a817ce48)

**Criação da Tabela Hash:** Inicialmente, você cria um array, onde os dados serão armazenados.

**Função de Hashing:** A tabela hash usa uma função de hash para converter o dado que você deseja armazenar em um índice numérico.

**Armazenamento dos Dados:** O dado é colocado na posição determinada pela função de hash na tabela hash. Se houver colisões (quando dois ou mais dados são mapeados para o mesmo índice), existem técnicas para lidar com isso, nesse caso utilizamos a técnica de chaining onde dados que colidirem são armazenados em uma lista encadeada.

**Recuperação dos Dados:** Quando você deseja recuperar um dado, a função de hash é usada novamente para calcular o índice onde o dado está armazenado na tabela. O dado é então retornado a partir desse índice.
