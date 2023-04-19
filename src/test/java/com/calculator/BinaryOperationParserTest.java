package com.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BinaryOperationParserTest {
    @Test
    public void ParseInput_ShouldReturn_TheCorrectOperation() {
        BinaryOperationParser operationParser = new DefaultBinaryOperationParser();
        BinaryOperation operation = operationParser.parse("2 + 3");
        assertEquals(5, operation.calculate());
    }

    @Test
    public void ParseInput_ShouldReturn_TheCorrectOperation_WhenInputHasSpaces() {
        BinaryOperationParser operationParser = new DefaultBinaryOperationParser();
        BinaryOperation operation = operationParser.parse(" 2 + 3 ");
        assertEquals(5, operation.calculate());
    }

    @Test
    public void ParseInput_ShouldReturn_TheCorrectOperation_WhenInputHasMultipleSpaces() {
        BinaryOperationParser operationParser = new DefaultBinaryOperationParser();
        BinaryOperation operation = operationParser.parse(" 2   + 3 ");
        assertEquals(5, operation.calculate());
    }

    @Test
    public void ParseInput_ShouldReturn_TheCorrectOperation_WhenInputHasMultipleSpacesAndTabs() {
        BinaryOperationParser operationParser = new DefaultBinaryOperationParser();
        BinaryOperation operation = operationParser.parse(" 2   + \t 3 ");
        assertEquals(5, operation.calculate());
    }

    @Test
    public void ParseInput_ShouldReturn_TheCorrectOperation_WhenInputHasMultipleSpacesAndTabsAndNewLines() {
        BinaryOperationParser operationParser = new DefaultBinaryOperationParser();
        BinaryOperation operation = operationParser.parse(" 2   + \t 3 \r 4 ");
        assertEquals(5, operation.calculate());
    }

    // test for /n

    @Test
    public void ParseInput_ShouldReturn_TheCorrectOperation_WhenInputHasMultipleSpacesAndTabsAndNewLinesAndCarriageReturns() {
        BinaryOperationParser operationParser = new DefaultBinaryOperationParser();
        BinaryOperation operation = operationParser.parse(" 2   + \t 3 \r 4 \n 5 ");
        assertEquals(5, operation.calculate());
    }

    @Test
    public void ParseInput_ShouldThrow_WhenInputIsInvalid() {
        BinaryOperationParser operationParser = new DefaultBinaryOperationParser();
        try {
            operationParser.parse("2 +");
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

}
