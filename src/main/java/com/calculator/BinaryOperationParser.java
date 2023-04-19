package com.calculator;

/**
 * Interface for all binary operation parsers.
 * The implementation of this interface should be able to parse a string and
 * return a {@link BinaryOperation}.
 * 
 * @author André Terra
 */
public interface BinaryOperationParser {
    BinaryOperation parse(String input);
}
