package CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListPerformanceCheck {
    public static void main(String[] args) {
        int size = 100000;

        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();

        long start = System.currentTimeMillis();
        for(int i = 0; i < size; i++) {
            al.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList Add Time : " + (end-start) + " ms"); 
        
        start = System.currentTimeMillis();
        for(int i = 0; i < size; i++) {
            ll.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList Add Time : " + (end-start) + " ms"); 

        start = System.currentTimeMillis();
        al.get(50000);
        end = System.currentTimeMillis();
        System.out.println("ArrayList Access Time: " + (end-start) + " ms"); 

        start = System.currentTimeMillis();
        ll.get(50000);
        end = System.currentTimeMillis();
        System.out.println("LinkedList Access Time: " + (end-start) + " ms");    
 
        start = System.currentTimeMillis();
        al.remove(50000);
        end = System.currentTimeMillis();
        System.out.println("ArrayList Remove Time: " + (end-start) + " ms"); 

        start = System.currentTimeMillis();
        ll.remove(50000);
        end = System.currentTimeMillis();
        System.out.println("LinkedList Remove Time: " + (end-start) + " ms");    
    }
}
