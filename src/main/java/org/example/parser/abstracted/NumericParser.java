package org.example.parser.abstracted;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.example.helper.*;

public abstract class NumericParser extends BaseParser {

    public NumericParser(String key, String expression, int order) {
        super(key, expression, order);
    }

    @Override
    public boolean isValid() {
        final String regex = ParserHelper.getValidatorExpression(getPatternExpression());
        final Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(expression);
        return matcher.matches();
    }

    @Override
    public void parse() {
        ParserHelper.numericParsers(getPatternExpression(), expression, getNumberFrom(), getNumberTo(), stringValue);
    }

    public abstract String getPatternExpression();
    public abstract int getNumberFrom();
    public abstract int getNumberTo();
}
