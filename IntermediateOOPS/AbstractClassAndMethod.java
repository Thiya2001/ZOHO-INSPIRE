abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
public class AbstractClassAndMethod {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
