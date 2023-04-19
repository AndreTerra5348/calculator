package com.calculator.operators;

/**
 * Sum operator
 * 
 * @author André Terra
 */
public class Sum implements BinaryOperator {
    @Override
    public double calculate(double operandA, double operandB) {
        return operandA + operandB;
    }
}
