public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(3, 4, 5);

        ShapeCalculator calculator = new ShapeCalculator();

        System.out.println("Area of Circle: " + calculator.calculateShapeArea(circle));
        System.out.println("Area of Triangle: " + calculator.calculateShapeArea(triangle));

        if (triangle instanceof Triangle) {
            Triangle tri = (Triangle) triangle;
            System.out.println("Is the triangle right-angled? " + tri.isRightTriangle());
        }
    }
}
