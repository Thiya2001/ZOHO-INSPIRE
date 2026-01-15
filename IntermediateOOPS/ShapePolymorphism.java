class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class ShapePolymorphism {
    public static void main(String[] args) {
    
        Shape s = new Shape();
        s.draw();

        Shape r = new Rectangle();
        r.draw();

        Shape c = new Circle();
        c.draw();
    }
}