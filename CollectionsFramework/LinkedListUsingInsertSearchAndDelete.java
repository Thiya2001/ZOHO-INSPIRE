package CollectionsFramework;

import java.util.LinkedList;

public class LinkedListUsingInsertSearchAndDelete {
    public static void main(String[] args) {
        LinkedList<Integer> items = new LinkedList<>();

        items.add(50);
        items.add(30);
        items.add(70);
        items.add(20);
        items.add(40);
        items.add(60);
        items.add(80);
        System.out.println("Insert : " + items);

        System.out.println("Search : " + items.contains(40));
        System.out.println("Search : " + items.contains(90));
        
        System.out.println("Delete : " + items.remove(3));
        System.out.println("Delete : " + items.remove(1));
        System.out.println("Delete : " + items.remove(0));
    }
}
