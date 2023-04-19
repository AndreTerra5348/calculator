package com.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.calculator.operators.Sum;

public class BinaryOperationTest {
    @Test
    public void SumOperation_ShouldReturn_TheCalculatedSum() {
        BinaryOperation operation = new BinaryOperation(2, 3, new Sum());
        assertEquals(5, operation.calculate());
    }
}
