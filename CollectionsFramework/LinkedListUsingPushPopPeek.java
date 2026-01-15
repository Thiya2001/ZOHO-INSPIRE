package CollectionsFramework;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Stack {
    Node top;
    void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
        System.out.println("Pushed: " + x);
    }
    void pop() {
        if (top == null) {
            System.out.println("Stack Empty");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }
    void peek() {
        if (top == null) {
            System.out.println("Stack Empty");
            return;
        }
        System.out.println("Top: " + top.data);
    }
}

public class LinkedListUsingPushPopPeek {
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(5);
        s.push(10);
        s.push(15);

        s.peek();
        s.pop();
        s.peek();
    }
}
