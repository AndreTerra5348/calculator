package com.calculator.operators;

/**
 * Interface for all binary operators.
 * The implementation of this interface should be able to calculate the result
 * of a binary operation.
 * 
 * @author André Terra
 */
public interface BinaryOperator {
    double calculate(double operandA, double operandB);
}
