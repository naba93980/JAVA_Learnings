package com.company;

//classes are named following PascalConvention
public class Main {

    // function are named following camelCaseConvention
    public static void main(String[] args) {
        int numOne = 5;
        int numTwo = 6;
        int numThree = 7;
        System.out.println(numOne + numTwo + numThree);
        System.out.format("The sum of three nos %d, %d, %d are %d", numOne, numTwo, numThree,
                numOne + numTwo + numThree);
    }
}
