package com.application;

import com.application.checks.*;
import com.application.process.ProcessData;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo {

    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(1,2,3,5,8,7,4,9,6,85,-1,-23,-78,5,99,6,4,15,75);
        processForSave(data);
        processForNotification(data);
        doubleProcessForUpdate(data);

    }

    public static void processForSave(List<Integer> data){
        // you can make combine predicates in functional approach by using simple predefine predicates
        // let suppose we have requirement that before saving to database we must filter data by even and positive
        Predicate<Integer> positiveAndEven =  Positive.isPositive.and(EvenCheck.isEven );

        List<Integer> result = ProcessData.operation.apply(data,positiveAndEven);

        System.out.println(result);

    }

    public static void processForNotification(List<Integer> data){
        // you can make combine predicates in functional approach by using simple predefine predicates
        // let suppose we have requirement that before send notification  we must filter data by odd and positive

        Predicate<Integer> oddAndPositive = OddCheck.isOdd.and(Positive.isPositive);
        List<Integer> result = ProcessData.operation.apply(data,oddAndPositive);
        System.out.println(result);
    }

    public static void doubleProcessForUpdate(List<Integer> data){
        // you can make combine predicates in functional approach by using simple predefine predicates
        // let suppose we have requirement that before update to database  we must do 2 operation on list of data
        // first filter by odd and positive after that add to list, and add 10 to filtered element
        Predicate<Integer> oddAndPositive = OddCheck.isOdd.and(Positive.isPositive);

        List<Integer> result = ProcessData.operation.andThen(ProcessData.add10ToPerfectSqr).apply(data,oddAndPositive);
        System.out.println(result);

    }




}
