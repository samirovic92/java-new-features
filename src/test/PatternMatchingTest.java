package test;

import java.util.IllegalFormatException;

public class PatternMatchingTest {
    public static void main(String[] args) {
        // Pattern Matching of instance of

        displayExceptionMessage(new IllegalArgumentException("Hi, it's a bug!!!"));

        System.out.println(formatterWithSwitchPattern(null));
        System.out.println(formatterWithSwitchPattern(1L));
        System.out.println(formatterWithSwitchPattern("Hello world"));
    }

    public static void displayExceptionMessage(Exception exception) {
        if (exception instanceof IllegalFormatException ex) {
            System.out.println("The exception is IllegalFormatException, the message is " + ex.getMessage());
        } else if (exception instanceof IllegalArgumentException ex) {
            System.out.println("The exception is IllegalArgumentException, the message is : " + ex.getMessage());
        }
    }

    public static String formatterWithSwitchPattern(Object o ) {
        return switch (o) {
            case null -> "is Null";
            case Integer i -> String.format("Integer %d", i);
            case Long l -> String.format("Integer %d", l);
            case Double d -> String.format("Double %f", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }
}

