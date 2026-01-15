public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getParimeter() {
        return 2 * (length + width);
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);

        System.out.println("Area : " + rect.getArea());
        System.out.println("Parimeter : " + rect.getParimeter());
    }
}
