package com.application.checks;

import java.util.function.Predicate;

public class Positive {


    public static Predicate<Integer> isPositive = (number) -> number>0;

}
