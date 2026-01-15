package CollectionsFramework;

import java.util.Stack;

public class PushPopPeekUseStackCollection {
    public static void main(String[] args) {
        Stack<Integer> bag = new Stack<>();
        
        System.out.println("Pushed : " + bag.push(10));
        System.out.println("Pushed : " + bag.push(20));
        System.out.println("Pushed : " + bag.push(30));
        System.out.println("Top Element (Peek) : " + bag.peek());
        System.out.println("Popped : " + bag.pop());
        System.out.println("Top Element (Peek) : " + bag.peek());
        System.out.println("Popped : " + bag.pop());
        System.out.println("Popped : " + bag.pop());
    }
}
