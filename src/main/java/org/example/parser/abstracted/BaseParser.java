package org.example.parser.abstracted;

public abstract class BaseParser implements Parser {

    protected final String key;
    protected String expression = "*";

    protected StringBuilder stringValue = new StringBuilder();
    private int order;

    public BaseParser(String key, String expression, int order) {
        this.key = key;
        this.expression = expression.split(" ")[order];
        this.order = order;

    }

    @Override
    public void print() {
        System.out.printf("%-15s %-31s\n", key, stringValue.toString());
    }

    public int getOrder() {
        return this.order;
    }
}
