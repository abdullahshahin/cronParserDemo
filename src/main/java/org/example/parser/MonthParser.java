package org.example.parser;

import org.example.parser.abstracted.*;

public class MonthParser extends NumericParser {

    public MonthParser(String expression) {
        super("month", expression, 3);
    }

    @Override
    public String getPatternExpression() {
        return "1?[0-1]|[0-9]";
    }

    @Override
    public int getNumberFrom() {
        return 0;
    }

    @Override
    public int getNumberTo() {
        return 12;
    }
}
