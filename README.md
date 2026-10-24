# Data Structures, taught

Java implementations I wrote while working as a teaching assistant for the Data Structures course (*Resolução de Problemas Estruturados em Computação*) at university, 2023 to 2025. Each file is a self-contained structure or algorithm, written to be read in class rather than imported as a library.

## What's here

| File | What it is |
|---|---|
| `StaticStack` | Fixed-size stack (LIFO) |
| `CircularQueue` | Fixed-size queue (FIFO) over a circular array |
| `StaticList` | Array-backed list with insert, remove and search |
| `DoubleLinkedList` | Doubly linked list with its own `Node` |
| `BinaryTree` | Binary search tree with add, contains and remove, plus `TreeFormatter` to print it |
| `HashTable` | Hash table with chaining for collisions |
| `BubbleSort`, `InsertionSort`, `QuickSort` | The three sorting algorithms covered in the course |
| `IntFloodFill`, `ImgFloodFill` | Flood fill (the paint bucket) over an int grid and over an image, each with a queue-based and a stack-based version |

## Flood fill

Both versions work like the paint bucket tool: start at a pixel, spread to the neighbors with the same color. `fillByQueue` keeps the pending coordinates in a queue, `fillByStack` in a stack. Both containers are the ones from this repo.

![Flood fill animation](https://github.com/gabrielcoffee/estrutura-de-dados/assets/60583301/2b46baba-f0af-48e8-83b7-ba0b03a439c2)

## Stack and queue

![Stack](https://github.com/gabrielcoffee/estrutura-de-dados/assets/60583301/4ab8bc63-c762-4e7b-a518-3e65bdcfbe7f)

![Circular queue](https://github.com/gabrielcoffee/estrutura-de-dados/assets/60583301/65fb78cf-3853-4255-ab26-b2385117dabd)

## Binary search tree

Each node has at most two children; smaller values go left, larger go right. `add` keeps the ordering, `contains` searches in O(log n) on a balanced tree, and `remove` handles the leaf, one-child and two-child cases.

![Binary search tree](https://github.com/gabrielcoffee/estrutura-de-dados/assets/60583301/62b5c22d-fa3c-4440-ac1a-f2459e65832e)

## Hash table

A hash function maps each key to an index in an array. Two keys landing on the same index is a collision; here they are chained in a linked list at that index. Lookup hashes the key again and walks the chain.

![How hashing works](https://github.com/gabrielcoffee/estrutura-de-dados/assets/60583301/13b32791-03fd-4eac-b303-0da8a817ce48)

## Run

`Main.java` has a sample array and the sorting calls commented out. Uncomment the one you want and run:

```bash
javac -d out src/*.java
java -cp out Main
```
