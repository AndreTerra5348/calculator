package com.calculator;

import com.calculator.operators.BinaryOperator;
import com.calculator.operators.Subtract;
import com.calculator.operators.Sum;

/**
 * Factory for binary operators.
 * Create a new operator based on a string.
 * 
 * @author André Terra
 */
public class BinaryOperatorFactory {

    public static BinaryOperator create(Character symbol) {
        switch (symbol) {
            case '+':
                return new Sum();
            case '-':
                return new Subtract();
            // case '*'':
            // return new Multiply();
            // case '/'':
            // return new Divide();
            default:
                throw new IllegalArgumentException("Unknown operator: " + symbol);
        }
    }

}
