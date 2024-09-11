package org.example.parser;

import org.example.parser.abstracted.*;

public class MinuteParser extends NumericParser {

    public MinuteParser(String expression) {
        super("minute", expression, 0);
    }

    @Override
    public String getPatternExpression() {
        return "[0-5]?[0-9]";
    }

    @Override
    public int getNumberFrom() {
        return 0;
    }

    @Override
    public int getNumberTo() {
        return 60;
    }
}
