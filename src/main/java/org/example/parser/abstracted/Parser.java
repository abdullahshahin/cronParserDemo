package org.example.parser.abstracted;

public interface Parser {
    public boolean isValid();
    public void parse();
    public int getOrder();
    public void print();
}
