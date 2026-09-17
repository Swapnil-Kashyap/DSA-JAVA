class PolymorphshapeShape {

    void draw() {
        System.out.println("Drawing a Shape");
    }

    void area() {
        System.out.println("Area of Shape");
    }
}

class Circle extends PolymorphshapeShape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void area() {
        System.out.println("Area of Circle = " + (Math.PI * 5 * 5));
    }

    void circleMethod() {
        System.out.println("This is Circle's own method");
    }
}

class Rectangle extends PolymorphshapeShape {

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle = " + (10 * 5));
    }

    void rectangleMethod() {
        System.out.println("This is Rectangle's own method");
    }
}

public class Polymorphshape {

    public static void main(String[] args) {

        // UPCASTING
        PolymorphshapeShape s1 = new Circle();
        PolymorphshapeShape s2 = new Rectangle();

        // RUNTIME POLYMORPHISM
        s1.draw();
        s1.area();

        s2.draw();
        s2.area();

        // DOWNCASTING
        Circle c = (Circle) s1;
        c.circleMethod();

        Rectangle r = (Rectangle) s2;
        r.rectangleMethod();
    }
}
