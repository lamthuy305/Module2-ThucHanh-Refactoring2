package com.codegym;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ ="FizzBuzz";

    public static String fizzBuzz(int number) {
        boolean divisibleByThree = number % 3 == 0;
        boolean divisibleByFive = number % 5 == 0;
        boolean divisibleByFifteen = divisibleByThree && divisibleByFive;

        String result = number + "";

        if (divisibleByFifteen) {
            result = FIZZ_BUZZ;
        } else if (divisibleByThree) {
            result = FIZZ;
        } else if (divisibleByFive){
            result = BUZZ;
        }

        return result;
    }
}
