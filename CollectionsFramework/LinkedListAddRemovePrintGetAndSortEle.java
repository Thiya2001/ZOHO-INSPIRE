package CollectionsFramework;

import java.util.Collections;

public class LinkedListAddRemovePrintGetAndSortEle {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();

        list.add(34);
        list.add(12);
        list.add(5);
        list.add(78);
        list.add(23);

        System.out.println("LinkedList Elements : " + list);

        list.remove(Integer.valueOf(5));
        System.out.println("After removing 5 : " + list);

        int elementAt2 = list.get(2);
        System.out.println("Element at index 2 : " + elementAt2);

        Collections.sort(list);
        System.out.println("Sorted LinkedList : " + list);
    }
}
