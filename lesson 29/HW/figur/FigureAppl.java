package figur;

abstract class Shape {
    protected double size;

    public Shape(double size) {
        this.size = size;
    }

    public abstract double calcArea();
    public abstract double calcPerimeter();
}

class Circle extends Shape {
    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double calcArea() {
        return Math.PI * size * size;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * size;
    }
}

class Triangle extends Shape {
    public Triangle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return (Math.sqrt(3) / 4) * size * size;
    }

    @Override
    public double calcPerimeter() {
        return 3 * size;
    }
}

class Square extends Shape {
    public Square(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return size * size;
    }

    @Override
    public double calcPerimeter() {
        return 4 * size;
    }
}

public class FigureAppl {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Circle(3),
                new Triangle(4),
                new Square(2)
        };

        double totalArea = 0;
        double totalPerimeter = 0;
        double totalCircleArea = 0;


        for (Shape shape : shapes) {
            totalArea += shape.calcArea();
            totalPerimeter += shape.calcPerimeter();

            if (shape instanceof Circle) {
                totalCircleArea += shape.calcArea();
            }
        }

        System.out.println("Общая площадь: " + totalArea);
        System.out.println("Общий периметр: " + totalPerimeter);
        System.out.println("Общая площадь кругов: " + totalCircleArea);
    }
}
