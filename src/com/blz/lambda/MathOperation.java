package com.blz.lambda;

public class MathOperation {
    public static void main(String[] args) {

        IMathFunction add = Integer::sum;
        IMathFunction substract =(a,b) -> a-b;
        IMathFunction divide = (a,b) -> a/b;

//        System.out.println("Addition is "+add.calculate(2,3));
//        System.out.println("Substract is "+substract.calculate(3,2));
//        System.out.println("Division is "+divide.calculate(50,10));

        IMathFunction.printResult(5,6,"Addition",add);
        IMathFunction.printResult(6,3, "Subtraction",substract);
        IMathFunction.printResult(6,3,"Division",divide);
    }
}
