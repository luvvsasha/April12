public class Enumeration {

    public enum Shape {
        SQUARE("Square", 4),
        RECTANGLE("Rectangle", 4),
        CIRCLE("Circle", 0),
        TRAPEZOID("Trapezoid", 4),
        RHOMBUS("Rhombus", 4),
        TRIANGLE("Triangle", 3),
        OVAL("Oval", 0),
        HEXAGON("Hexagon", 6);

        private final String name;
        private final int sides;

        private Shape(String name, int sides) {
            this.name = name;
            this.sides = sides;
        }

        public String getName() {
            return name;
        }

        public int getSides() {
            return sides;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enumeration Constants:");
        for (Shape shape : Shape.values()) {
            System.out.println("Name: " + shape.getName());
            System.out.println("The start value is: " + shape.getSides());
            System.out.println("Ordinal Value: " + shape.ordinal());
            System.out.println();
        }
    }
}



