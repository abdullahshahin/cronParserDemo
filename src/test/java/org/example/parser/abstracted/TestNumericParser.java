package org.example.parser.abstracted;

class TestNumericParser extends NumericParser {

    private final String patternExpression;
    private final int numberFrom;
    private final int numberTo;

    public TestNumericParser(String key, String expression, int order, String patternExpression, int numberFrom, int numberTo) {
        super(key, expression, order);
        this.patternExpression = patternExpression;
        this.numberFrom = numberFrom;
        this.numberTo = numberTo;
    }

    @Override
    public String getPatternExpression() {
        return patternExpression;
    }

    @Override
    public int getNumberFrom() {
        return numberFrom;
    }

    @Override
    public int getNumberTo() {
        return numberTo;
    }
}
