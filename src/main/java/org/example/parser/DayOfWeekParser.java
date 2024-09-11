package org.example.parser;

import org.example.parser.abstracted.*;

public class DayOfWeekParser extends NumericParser {


    public DayOfWeekParser(String expression) {
        super("day of week", expression, 4);
    }

    @Override
    public String getPatternExpression() {
        return "[1-7]";
    }

    @Override
    public int getNumberFrom() {
        return 1;
    }

    @Override
    public int getNumberTo() {
        return 8;
    }
}
