package org.example;

import java.util.Arrays;

import org.example.adapter.ParserAdapter;
import org.example.parser.abstracted.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        if(args.length < 1) {
            System.out.print("Arg is needed ex => */15 0 1,15 * 1-5 /usr/bin/find");
            System.exit(1);
        } else {
            String expression = String.join(" ", args);
            ParserAdapter parser = new ParserAdapter(expression);
    
            long count = parser
            .getParsers()
            .stream()
            .filter(Parser::isValid)
            .peek(Parser::parse)
            .peek(Parser::print)
            .count();
    
            if(count != parser.getParsers().size()) System.out.print("Invalid Entry");
        } 
    }
}