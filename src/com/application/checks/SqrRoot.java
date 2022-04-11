package com.application.checks;

import java.util.function.Predicate;

public class SqrRoot {

    public static Predicate<Integer> sqrRoot = (number) -> Math.sqrt(number)-Math.floor(Math.sqrt(number))==0;
}
