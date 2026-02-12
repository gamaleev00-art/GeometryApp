package com.example;

public class Main {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        Rectangle rectangle = new Rectangle(b,c);
        Circle circle = new Circle(c);
        Triangular triangular = new Triangular(a,b,c);
        Sphere sphere = new Sphere(a);
        Cube cube = new Cube(a,b,c);
        System.out.println(convertMetersToCentimeters(5));
        System.out.println("Периметр треугольника равен -> " + triangular.perimeter());
        System.out.println("Площадь треугольника равна -> " + triangular.square());
        System.out.println("Периметр прямоугольника равен -> " + rectangle.perimeter());
        System.out.println("Площадь прямоугольника равна -> " + rectangle.square());
        System.out.println("Периметр круга равен -> " + circle.perimeter());
        System.out.println("Площадь круга равна -> " + circle.square());
        System.out.println("Площадь сферы равна -> " + sphere.square());
        System.out.println("Объем сферы равен -> " + sphere.volume());
        System.out.println("Площадь куба равна -> " + cube.square());
        System.out.println("Объем куба равен -> " + cube.volume());
        System.out.println(triangular.triangularFlag());
        System.out.println(compareSquare(triangular.square(), circle.square()));
    }
}
