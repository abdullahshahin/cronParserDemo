package org.example.parser;

import org.example.parser.abstracted.*;

public class DayOfMonthParser extends NumericParser {

    public DayOfMonthParser(String expression) {
        super("day of month", expression, 2);
    }

    @Override
    public String getPatternExpression() {
        return "[1-2]?[0-9]|[30|31]";
    }

    @Override
    public int getNumberFrom() {
        return 1;
    }

    @Override
    public int getNumberTo() {
        return 32;
    }
}
