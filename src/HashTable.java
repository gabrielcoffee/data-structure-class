import java.util.LinkedList;

public class HashTable {

    public DoubleLinkedList<Person>[] data;
    public int arraySize;

    public HashTable(int size) {
        this.data = new DoubleLinkedList[size];
        this.arraySize = size;
    }

    // Add function with string key
    public void add(String key, Person person) {
        long hashKey = getHashKey(key);
        int index = hashFunction(hashKey);

        if (data[index] == null) { data[index] = new DoubleLinkedList<>(); }
        data[index].add(person);
    }
    // Add function with int key
    public void add(int key, Person person) {
        int index = hashFunction(key);

        if (data[index] == null) { data[index] = new DoubleLinkedList<>(); }
        data[index].add(person);
    }

    public Person search(String key) {
        long hashKey = getHashKey(key);
        int index = hashFunction(hashKey);
        DoubleLinkedList<Person> list = data[index];

        for (int i = 0; i < list.getSize(); i++) {
            Person person = list.get(i);
            if (person.name.equals(key)) {
                return person;
            }
        }
        System.out.println("Não foi encontrado");
        return null;
    }

    public Person remove(String key) {
        long hashKey = getHashKey(key);
        int index = hashFunction(hashKey);
        DoubleLinkedList<Person> list = data[index];

        for (int i = 0; i < list.getSize(); i++) {
            Person person = list.get(i);
            if (person.name.equals(key)) {
                list.remove(i);
                return person;
            }
        }
        System.out.println("Não foi encontrado");
        return null;
    }

    // Calcular uma chave hash baseado nas letras da string
    private long getHashKey(String key) {
        long hash = 7;
        int len = key.length();

        for (int i = 0; i < len; i++) {
            hash += (long)(key.charAt(i) * (Math.pow(31, i)));
        }
        return hash / arraySize;
    }

    // Retorna um endereço válido na tabela hash
    private int hashFunction(long hashKey) {
        return (int)(hashKey % arraySize);
    }

    public void print() {
        for (int i = 0; i < arraySize; i++) {
            System.out.print(i + "-> ");

            if (data[i] != null) {
                for (int j = 0; j < data[i].getSize(); j++) {
                    Person p = data[i].get(j);
                    System.out.print(p.id + ": " + p.name + " // ");
                }
            }

            System.out.println();
        }
    }
}


