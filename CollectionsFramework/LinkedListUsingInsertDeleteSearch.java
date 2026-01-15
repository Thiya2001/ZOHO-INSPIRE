package CollectionsFramework;

class HashTable {
    private int SIZE = 10;
    private String[] table = new String[SIZE];

    private int hash(String key) {
        return Math.abs(key.hashCode() % SIZE);
    }
    public void insert(String key) {
        int index = hash(key);
        table[index] = key;
        System.out.println("Inserted : " + key + " at index " + index);
    }
    public boolean search(String key) {
        int index = hash(key);
        return key.equals(table[index]);
    }
    public void delete(String key) {
        int index = hash(key);
        if (key.equals(table[index])) {
            table[index] = null;
            System.out.println("Deleted : " + key);
        } else {
            System.out.println("Key not found!");
        }
    }
    public void printTable() {
        for (int i = 0; i < SIZE; i++) {
            System.out.println(i + " -> " + table[i]);
        }
    }
}

public class LinkedListUsingInsertDeleteSearch {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.insert("A");
        ht.insert("B");
        ht.insert("C");
        System.out.println("Search B : " + ht.search("B"));
        System.out.println("Search X : " + ht.search("X"));
        ht.delete("B");
        ht.delete("X");
        System.out.println("Final Table : ");
        ht.printTable();
    }
}