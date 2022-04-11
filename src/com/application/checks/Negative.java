package com.application.checks;

import java.util.function.Predicate;

public class Negative {

    public static Predicate<Integer> isNegative = (number) -> number<0;
}
