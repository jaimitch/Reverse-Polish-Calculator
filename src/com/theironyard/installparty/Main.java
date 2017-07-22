package com.theironyard.installparty;



public class Main {
    public static void main(String[] args) {
        ReversePolishCalc rpc = new ReversePolishCalc();

        String rpnExpression = "2.5,4.8,+";
        double expectedResult = 7.3;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        // Write tests for the other operators (-, *, /)

        String subtraction = "2.5,4.8,-";
        double expectedSubResult = -2.3;
        double actualSubResult = rpc.calculate(subtraction);
        checkResult(subtraction, expectedSubResult, actualSubResult);

        String multiplication = "2.5,4.8,*";
        double expectedMultiResult = 12;
        double actualMultiResult = rpc.calculate(multiplication);
        checkResult(multiplication, expectedMultiResult, actualMultiResult);

        String division = "2.5,4.8,/";
        double expectedDivResult = .52;
        double actualDivResult = rpc.calculate(division);
        checkResult(division, expectedDivResult, actualDivResult);


//         Uncomment this test which has many operators
        String rpnExpression1 = "5,1,2,+,4,*,+,3,-";
        double expectedResult1 = 14.0;
        double actualResult1 = rpc.calculate(rpnExpression);
        checkResult(rpnExpression1, expectedResult1, actualResult1);
    }

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
}
