package com.application.checks;

import java.util.function.Predicate;

public class EvenCheck {


    public static Predicate<Integer> isEven = (number) -> number%2 ==0;

}
