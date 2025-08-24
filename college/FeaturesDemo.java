// File: FeaturesDemo.java

@FunctionalInterface
interface Calculator {
    int operation(int a, int b); 
}

@FunctionalInterface
interface StringChecker {
    boolean check(String s); 
}

interface Printer {
    default void printDefault() {
        System.out.println("This is a default method in the interface.");
    }

    static void printStatic() {
        System.out.println("This is a static method in the interface.");
    }
}

public class FeaturesDemo implements Printer {

    // Method reference target
    public static void showMessage(String msg) {
        System.out.println("Message: " + msg);
    }

    public void demonstrateAll() {

        // (a)  with Lambda (Calculator)
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;
        System.out.println("Addition: " + add.operation(10, 5));
        System.out.println("Multiplication: " + multiply.operation(10, 5));

        // (b) Lambda Expression to check if string is empty
        StringChecker isEmpty = str -> str.isEmpty();
        System.out.println("Is string empty? " + isEmpty.check("")); // true
        System.out.println("Is string empty? " + isEmpty.check("Hello")); // false

        // (c) Method Reference
        MessagePrinter printer = FeaturesDemo::showMessage;
        printer.print("Hello from method reference!");

        // (d) Default and Static Methods in Interface
        printDefault(); // Default method
        Printer.printStatic(); // Static method

        // (e) Inner Class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayInner();
    }

    public static void main(String[] args) {
        FeaturesDemo demo = new FeaturesDemo();
        demo.demonstrateAll();
    }

    // (c) Functional interface for Method Reference
    interface MessagePrinter {
        void print(String message);
    }

    // (e) Inner Class Example
    static class OuterClass {
        int outerData = 50;

        class InnerClass {
            void displayInner() {
                System.out.println("This is an inner class. Outer data: " + outerData);
            }
        }
    }
}
