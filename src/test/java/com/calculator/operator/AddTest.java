package com.calculator.operator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.calculator.operators.BinaryOperator;
import com.calculator.operators.Sum;

public class AddTest {
    @Test
    public void SumTwoValues_ShouldReturn_TheSumOfTheValues() {
        BinaryOperator add = new Sum();
        assertEquals(5, add.calculate(2, 3));
    }
}
