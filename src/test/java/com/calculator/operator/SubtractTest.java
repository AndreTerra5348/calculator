package com.calculator.operator;

import org.junit.jupiter.api.Test;

import com.calculator.operators.BinaryOperator;
import com.calculator.operators.Subtract;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractTest {
    @Test
    public void SubtractTwoValues_ShouldReturn_TheSubtractionOfTheValues() {
        BinaryOperator subtraction = new Subtract();
        assertEquals(5, subtraction.calculate(10, 5));
    }
}