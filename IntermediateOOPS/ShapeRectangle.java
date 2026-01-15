import java.util.Scanner;
class Shape {
    int numSides;
    double area;
}

class Rectangle extends Shape {
    double length;
    double width;
    void rectArea() {
        area = length * width;
    }
}

public class ShapeRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.print("Enter number of sides : ");
        rect.numSides = sc.nextInt();
    
        System.out.print("Enter Length : ");
        rect.length = sc.nextDouble();

        System.out.print("Enter Width : ");
        rect.width = sc.nextDouble();

        rect.rectArea();

        System.out.println("\n--- Rectangle Details ---\n");
        System.out.println("Number Of Sides : " + rect.numSides);
        System.out.println("Length : " + rect.length);
        System.out.println("Width : " + rect.width);
        System.out.println("Area : " + rect.area);

        sc.close();
    }
}
