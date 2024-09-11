package org.example.adapter;

import org.example.parser.CommandParser;
import org.example.parser.DayOfMonthParser;
import org.example.parser.DayOfWeekParser;
import org.example.parser.HourParser;
import org.example.parser.MinuteParser;
import org.example.parser.MonthParser;
import org.example.parser.abstracted.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class ParserAdapter {
    private PriorityQueue<Parser> parsers = new PriorityQueue<>(new Comparator<Parser>() {
        @Override
        public int compare(Parser o1, Parser o2) {
            return o1.getOrder() - o2.getOrder();
        }
    });

    public ParserAdapter(String expression) {
        parsers.add(new MinuteParser(expression));
        parsers.add(new HourParser(expression));
        parsers.add(new DayOfMonthParser(expression));
        parsers.add(new MonthParser(expression));
        parsers.add(new DayOfWeekParser(expression));
        parsers.add(new CommandParser(expression));
    }

    public List<Parser> getParsers() {
      return new ArrayList<>(parsers);
    }
}
