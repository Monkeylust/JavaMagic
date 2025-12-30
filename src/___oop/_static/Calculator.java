package ___oop._static;

public class Calculator {

    public static void main(String[] args) {
        int sum = Calculator.calculateSum(3, 5);
        System.out.println(sum);
        System.out.println(Calculator.getOperationCount());
        sum = Calculator.calculateSum(-1, 1);
        System.out.println(sum);
        System.out.println(Calculator.getOperationCount());
    }

    private static int operationCount;

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        operationCount++;
        return sum;
    }

    public static int getOperationCount() {
        return operationCount;
    }
}