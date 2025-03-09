# Data Structure Class
Code from the course "Structured Problem Solving in Computing (Data Structures)"

# FLOOD FILL
There are two flood fill structures in the project: a simpler one using integers (IntFloodFill) and one for images (ImgFloodFill). Both work in a very similar way.

The algorithm works like the paint bucket tool in Paint. It uses two functions: fillByQueue and fillByStack. The first stores the coordinates to be filled in a queue, while the second stores them in a stack. Both structures were implemented by the project team.

![gif](https://github.com/gabrielcoffee/estrutura-de-dados/assets/60583301/2b46baba-f0af-48e8-83b7-ba0b03a439c2)

# STATIC STACK
It functions like a regular stack with a predefined size; the last value added is the first to be removed.

![lego-stacking](https://github.com/gabrielcoffee/estrutura-de-dados/assets/60583301/4ab8bc63-c762-4e7b-a518-3e65bdcfbe7f)

# CIRCULAR QUEUE
It works like a circular queue using the FIFO (First In, First Out) system, where the first value added is the first to be removed.

![Design sem nome](https://github.com/gabrielcoffee/estrutura-de-dados/assets/60583301/65fb78cf-3853-4255-ab26-b2385117dabd)

# BINARY SEARCH TREE (ÁRVORE BINÁRIA DE BUSCA)
A binary search tree is a data structure in which each node has at most two children, and the nodes on the left have smaller values than those on the right. This tree is mainly used to store data in an organized manner, facilitating efficient search and retrieval, and it is commonly used in search and sorting algorithms.

![image](https://github.com/gabrielcoffee/estrutura-de-dados/assets/60583301/62b5c22d-fa3c-4440-ac1a-f2459e65832e)

Essa estrutura possui 3 funções principais:

This structure has three main functions:

**Add (Insert)**: Allows you to add a new element to the tree while maintaining the ordering property, meaning the element is placed in the correct position according to its value.

**Contains**: Checks if a given element is present in the tree, enabling efficient data searches.

**Remove**: Allows you to remove a specific element from the tree, while preserving the proper structure of the binary search tree after removal, ensuring that the ordering property remains intact.

# HASH TABLE
A hash table is a data structure that allows for the efficient storage and retrieval of information.

![HOWHASHWORKS](https://github.com/gabrielcoffee/estrutura-de-dados/assets/60583301/13b32791-03fd-4eac-b303-0da8a817ce48)

**Creation of the Hash Table:** Initially, you create an array where the data will be stored.

**Hashing Function:** The hash table uses a hash function to convert the data you wish to store into a numeric index.

**Data Storage:** The data is placed in the position determined by the hash function in the hash table. If collisions occur (when two or more pieces of data are mapped to the same index), techniques exist to handle this; in this case, we use the chaining technique, where colliding data are stored in a linked list.

**Data Retrieval:** When you wish to retrieve a piece of data, the hash function is applied again to calculate the index where the data is stored in the table, and the data is then returned from that index.
