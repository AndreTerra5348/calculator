package com.calculator;

import com.calculator.operators.BinaryOperator;

/**
 * Represents a binary operation, with two operands and one operator.
 * 
 * @author André Terra
 */

public class BinaryOperation {
    private final double operandA;
    private final double operandB;
    private final BinaryOperator operator;

    public BinaryOperation(double operandA, double operandB, BinaryOperator operator) {
        this.operandA = operandA;
        this.operandB = operandB;
        this.operator = operator;
    }

    /**
     * Calculates the result of the operation.
     *
     * @return the result of the operation
     */
    public double calculate() {
        return operator.calculate(operandA, operandB);
    }
}
