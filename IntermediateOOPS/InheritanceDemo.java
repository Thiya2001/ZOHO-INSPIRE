class Parent {
    void showParent() {
        System.out.println("Parent Class Method Called");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("Child Class Method Called");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.showParent();

        Child c = new Child();
        c.showChild();
    }
}
