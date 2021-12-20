package com.blz.lambda;

@FunctionalInterface
public interface IMathFunction {
    static void printResult(int a, int b, String methodName, IMathFunction method) {
        System.out.println("Result " +methodName + " is " +method.calculate(a,b));
    }

    int calculate(int a, int b);
}
