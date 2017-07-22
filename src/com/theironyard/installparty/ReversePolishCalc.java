package com.theironyard.installparty;

import java.util.*;

public class ReversePolishCalc {

    double calculate(String input) {
        Stack stackTop = new Stack();

        double valueOne;
        double valueTwo;
        double result;

        String[] tokens = input.split(",");

        for (String token : tokens) {
            if (operand(token)) {
                System.out.println(token);

                valueOne = Double.parseDouble(stackTop.pop().toString());
                valueTwo = Double.parseDouble(stackTop.pop().toString());

                System.out.println(valueOne);
                System.out.println(valueTwo);

                switch (token) {

                    case "+":
                        result = valueTwo + valueOne;
                        stackTop.push(result);
                        break;

                    case "-":
                        result = valueTwo - valueOne;
                        stackTop.push(result);
                        break;

                    case "*":
                        result = valueTwo * valueOne;
                        stackTop.push(result);
                        break;

                    case "/":
                        result = valueTwo / valueOne;
                        stackTop.push(result);
                }

            } else {
                stackTop.push(token);
            }
        }
        System.out.println(stackTop);
        return Double.parseDouble(stackTop.peek().toString());
    }

    private boolean operand(String input) {

        boolean operator;

        switch (input) {
            case "+":
                operator = true;
                break;
            case "-":
                operator = true;
                break;
            case "*":
                operator = true;
                break;
            case "/":
                operator = true;
                break;
            default:
                operator = false;
        }
        return operator;
    }
}

