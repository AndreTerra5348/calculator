package com.calculator.operators;

/**
 * Subtraction operator.
 * 
 * @author André Terra
 */
public class Subtract implements BinaryOperator {
    @Override
    public double calculate(double operandA, double operandB) {
        return operandA - operandB;
    }
}
