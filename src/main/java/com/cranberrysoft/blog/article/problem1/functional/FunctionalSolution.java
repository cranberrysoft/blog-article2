package com.cranberrysoft.blog.article.problem1.functional;

import com.cranberrysoft.blog.article.problem1.Solution;

import java.util.Comparator;
import java.util.Map;
import java.util.function.*;

import static java.util.stream.Collectors.*;

public class FunctionalSolution implements Solution {

    @Override
    public int differentTeams(String skills) {
       return countCharacters.apply(skills).values()
               .stream()
               .sorted(Comparator.reverseOrder()) //we need to return min value
               .skip(TEAM.length()-1) //we want to get the maximum value
               .findFirst() //if there is some than return
               .map(Long::intValue)//we want to get result as int
               .orElse(0); //if no values in the stream return default
    }

    private Function<String, Map<Integer,Long>> countCharacters = skills -> skills.chars().boxed()
            .collect(groupingBy(Function.identity(),counting()));
}
