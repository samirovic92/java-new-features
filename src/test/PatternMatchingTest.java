package test;

import java.util.IllegalFormatException;

public class PatternMatchingTest {
    public static void main(String[] args) {
        // Pattern Matching of instance of

        displayExceptionMessage(new IllegalArgumentException("Hi, it's a bug!!!"));

        System.out.println(formatterWithSwitchPattern(null));
        System.out.println(formatterWithSwitchPattern(1L));
        System.out.println(formatterWithSwitchPattern("Hello world"));

        testTriangle(new Triangle(30, 20));
        testTriangle(new Triangle(5, 5));
        testTriangle(new Square(5, 5));
    }

    public static void displayExceptionMessage(Exception exception) {
        if (exception instanceof IllegalFormatException ex) {
            System.out.println("The exception is IllegalFormatException, the message is " + ex.getMessage());
        } else if (exception instanceof IllegalArgumentException ex) {
            System.out.println("The exception is IllegalArgumentException, the message is : " + ex.getMessage());
        }
    }

    public static String formatterWithSwitchPattern(Object o) {
        return switch (o) {
            case null -> "is Null";
            case Integer i -> String.format("Integer %d", i);
            case Long l -> String.format("Integer %d", l);
            case Double d -> String.format("Double %f", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }

    public static void testTriangle(Shape shape) {
        // Guarded Pattern
        switch (shape) {
            case Triangle t when (t.calculateArea() > 100) -> System.out.println("Large triangle");
            case Triangle t -> System.out.println("small triangle");
            default -> System.out.println("The shape is not Triangle");
        }
    }

    public static void error(Object o ) {
        switch (o) {
            case CharSequence cs -> System.out.println("Object is CharSequence");
            // case String s -> System.out.println("Object is CharSequence"); // error: pattern is dominated by previous pattern
            default-> System.out.println("Object");
        }
    }
}

interface Shape {
    int calculateArea();
}

record Triangle(int p1, int p2) implements Shape {
    @Override
    public int calculateArea() {
        return p1 * p2 / 2;
    }
};

record Square(int p1, int p2) implements Shape {
    @Override
    public int calculateArea() {
        return p1 * p2 / 2;
    }
};

