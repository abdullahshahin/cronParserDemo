package org.example.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.example.parser.abstracted.*;

public class CommandParser extends BaseParser {

    private static final String commandExpression = "[/[a-z]+[0-9]?/?]+";
    
    private final Pattern patternCommand = Pattern.compile(commandExpression);

    public CommandParser(String expression) {
        super("command", expression, 5);
    }

    @Override
    public boolean isValid() {
        Matcher matcher = patternCommand.matcher(expression);
        return matcher.matches();
    }

    @Override
    public void parse() {
        stringValue.append(expression);
    }
}
