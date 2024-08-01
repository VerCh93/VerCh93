package Rectangle;

public class CalculateRectangle {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 8);
        int area = rectangle.area();
        System.out.println("Area: " + area);
        int perimeter = rectangle.perimeter();
        System.out.println("Perimeter: " + perimeter);
    }
}
