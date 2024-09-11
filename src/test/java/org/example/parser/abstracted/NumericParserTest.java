package org.example.parser.abstracted;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumericParserTest {

    private TestNumericParser numericParser;

    @BeforeEach
    void setUp() {
        numericParser = new TestNumericParser("testKey", "*/5", 0, "[1-5]", 0, 60);
    }

    @Test
    void testIsValidWithValidExpression() {
        assertTrue(numericParser.isValid());
    }

    @Test
    void testIsValidWithInvalidExpression() {
        numericParser = new TestNumericParser("testKey", "invalid", 0, "[1-5]", 0, 60);
        assertFalse(numericParser.isValid());
    }

    @Test
    void testParseWithEveryX() {
        numericParser.parse();
        assertEquals("0 5 10 15 20 25 30 35 40 45 50 55", numericParser.stringValue.toString());
    }

    @Test
    void testParseWithFromXtoY() {
        numericParser = new TestNumericParser("testKey", "5-9", 0, "[0-9]", 0, 60);
        numericParser.parse();
        assertEquals("5 6 7 8 9", numericParser.stringValue.toString());
    }

    @Test
    void testParseWithSpecificNumber() {
        numericParser = new TestNumericParser("testKey", "5", 0, "5", 0, 60);
        numericParser.parse();
        assertEquals("5", numericParser.stringValue.toString());
    }
}
