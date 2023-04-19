package com.calculator;

import com.calculator.operators.BinaryOperator;

/**
 * Parses a string into an operation.
 * 
 * @author André Terra
 */

public class DefaultBinaryOperationParser implements BinaryOperationParser {

    /**
     * Parses a string into an operation.
     * Sanitizes the input string by removing all whitespace, tabs, carriage returns
     * and new lines.
     * Split the string into 3 parts by whitespace.
     * The first part is the first operand, the second part is the operator and the
     * third part is the second operand.
     * 
     * @param input
     *              the string to be parsed
     * @return the operation
     */
    @Override
    public BinaryOperation parse(String input) {
        // input sanitization
        input = input.trim()
                .replaceAll("\t", " ")
                .replaceAll("\r", " ")
                .replaceAll("\n", " ")
                .replaceAll("\\s+", " ");

        String[] parts = input.split(" ");
        double operandA = Double.parseDouble(parts[0]);
        double operandB = Double.parseDouble(parts[2]);
        BinaryOperator operator = BinaryOperatorFactory.create(parts[1].charAt(0));
        return new BinaryOperation(operandA, operandB, operator);
    }

}
