package com.calculator;

public final class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("invalid argument count");
            return;
        }
        BinaryOperationParser parser = new DefaultBinaryOperationParser();
        BinaryOperation operation = parser.parse(args[0]);
        System.out.println(operation.calculate());
    }
}
