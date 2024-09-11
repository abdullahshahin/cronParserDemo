package org.example.parser;

import org.example.parser.abstracted.*;

public class HourParser extends NumericParser {

    public HourParser(String expression) {
        super("hour", expression, 1);
    }

    @Override
    public String getPatternExpression() {
        return "([0-1]?[0-9]|2[0-3])";
    }

    @Override
    public int getNumberFrom() {
        return 0;
    }

    @Override
    public int getNumberTo() {
        return 24;
    }
}
