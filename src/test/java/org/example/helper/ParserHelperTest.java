package org.example.helper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParserHelperTest {

    private StringBuilder stringBuilder;

    @BeforeEach
    void setUp() {
        stringBuilder = new StringBuilder();
    }

    @Test
    void testNumericParsersWithEvery() {
        ParserHelper.numericParsers("[0-5]?[0-9]", "*/15", 0, 60, stringBuilder);
        assertEquals("0 15 30 45", stringBuilder.toString());
    }

    @Test
    void testNumericParsersWithRange() {
        ParserHelper.numericParsers("[0-5]?[0-9]", "2-5", 0, 60, stringBuilder);
        assertEquals("2 3 4 5", stringBuilder.toString());
    }

    @Test
    void testNumericParsersWithOneNum() {
        ParserHelper.numericParsers("[0-5]?[0-9]", "2", 0, 60, stringBuilder);
        assertEquals("2", stringBuilder.toString());
    }

    @Test
    void testNumericParsersWithXAndY() {
        ParserHelper.numericParsers("([0-1]?[0-9]|2[0-3])", "1,15", 0, 16, stringBuilder);
        assertEquals("1 15", stringBuilder.toString());
    }

    @Test
    void testNumericParsersWithStar() {
        ParserHelper.numericParsers("[0-5]", "*", 0, 6, stringBuilder);
        assertEquals("0 1 2 3 4 5", stringBuilder.toString());
    }

    @Test
    void testNumericParsersWithInvalidExpression() {
        String expression = "invalid";
        ParserHelper.numericParsers("5", expression, 0, 60, stringBuilder);
        assertEquals("", stringBuilder.toString());
    }
}