package com.application.checks;

import java.util.function.Predicate;

public class OddCheck {

    public static Predicate<Integer> isOdd = number -> number%2 !=0;
}
