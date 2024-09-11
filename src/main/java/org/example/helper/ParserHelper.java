package org.example.helper;

import java.util.regex.Pattern;

public class ParserHelper {
    private ParserHelper() {}

    public static String getValidatorExpression(String patternNumber) {
        final String everyX = "\\*/"+patternNumber;
        final String fromXtoY = patternNumber+"-"+patternNumber;
        final String xAndY = patternNumber+","+patternNumber;
        return everyX + "|" + fromXtoY + "|" + patternNumber + "|" + xAndY + "|\\*";
    }

    public static void numericParsers(String patternNumber, String expression, int from, int to, StringBuilder stringValue) {
        
        final String everyX = "\\*/"+patternNumber;
        final String fromXtoY = patternNumber+"-"+patternNumber;
        final String xAndY = patternNumber+","+patternNumber;

        final Pattern patterXAndY = Pattern.compile(xAndY);
        final Pattern patterEveryX = Pattern.compile(everyX);
        final Pattern patternFromXtoY = Pattern.compile(fromXtoY);
        final Pattern patternSpecificNumber = Pattern.compile(patternNumber);

        if(expression.equals("*")) {
            for(int i = from; i < to; i++) {
                stringValue.append(i);
                stringValue.append(" ");
            }
            stringValue.delete(stringValue.length() -1 , stringValue.length());
        } else if (patterEveryX.matcher(expression).matches()) {
            int range = Integer.valueOf(expression.split("/")[1]);
            for(int i = 0; i < 60; i = i + range) {
                stringValue.append(i);
                stringValue.append(" ");
            }
            stringValue.delete(stringValue.length() -1 , stringValue.length());
        } else if (patternFromXtoY.matcher(expression).matches()) {
            String[] ar = expression.split("-");
            int num1 = Integer.valueOf(ar[0]);
            int num2 = Integer.valueOf(ar[1]);
            for(int i = num1; i <= num2; i++) {
                stringValue.append(i);
                stringValue.append(" ");
            }
            stringValue.delete(stringValue.length() -1 , stringValue.length());
        } else if (patternSpecificNumber.matcher(expression).matches()) {
            stringValue.append(expression);
        } else if (patterXAndY.matcher(expression).matches()) {
            String[] ar = expression.split(",");
            for(int i = 0; i < ar.length; i++) {
                stringValue.append(ar[i]);
                stringValue.append(" ");
            }
            stringValue.delete(stringValue.length() -1 , stringValue.length());
        }
    }
}