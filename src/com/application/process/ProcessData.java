package com.application.process;

import com.application.checks.SqrRoot;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProcessData {

    public static BiFunction<List<Integer>, Predicate<Integer>,List<Integer>> operation = (numbers, predicate) -> {
        List<Integer> results = new ArrayList<>();
        for (Integer number : numbers) {
            if(predicate.test(number)){
                results.add(number);
            }
        }
        return results;
    };

    public static Function<List<Integer>, List<Integer>> add10ToPerfectSqr = (input) -> {
        List<Integer> results = new ArrayList<>();
        for (Integer number : input) {
            if(SqrRoot.sqrRoot.test(number)){
                number+=10;
            }
            results.add(number);
        }
        return results;
    };


}
