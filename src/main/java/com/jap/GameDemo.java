package com.jap;

public class GameDemo {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 0;
        divideByNumber(firstNumber, secondNumber);

    }


    public static String divideByNumber(int firstNumber, int secondNumber) {
        //create local variable
        int finalNumber = 0;
        try {
            firstNumber = 10;
            secondNumber = 0;
            finalNumber = firstNumber / secondNumber;
            System.out.println(finalNumber);


            //Handle specific exception
        }catch (Exception exception){
            return exception.toString();
        }
        return String.valueOf(finalNumber);
    }


}
