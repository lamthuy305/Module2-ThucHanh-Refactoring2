package com.codegym;

public class Main {

    public static void main(String[] args) {
	FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i <= 30; i++) {
            System.out.println(FizzBuzz.fizzBuzz(i));
        }
    }
}
