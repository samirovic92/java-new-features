package test;

import java.util.IllegalFormatException;

public class PatternMatchingTest {
    public static void main(String[] args) {
        // Pattern Matching of instance of

        Object exception = new IllegalArgumentException("Hi, it's a bug!!!");

        if (exception instanceof IllegalFormatException ex) {
            System.out.println("The exception is IllegalFormatException, the message is " + ex.getMessage());
        } else if (exception instanceof IllegalArgumentException ex) {
            System.out.println("The exception is IllegalArgumentException, the message is : " + ex.getMessage());
        }

    }
}

record Person(String name, int age) {
}
