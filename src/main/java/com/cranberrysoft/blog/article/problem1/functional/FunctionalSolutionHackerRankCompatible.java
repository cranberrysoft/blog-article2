package com.cranberrysoft.blog.article.problem1.functional;

import com.cranberrysoft.blog.article.problem1.Solution;

import java.util.*;

public class FunctionalSolutionHackerRankCompatible implements Solution {
    @Override
    public int differentTeams(String skills) {
        return countCharacters(skills).values()
                .stream()
                .sorted(Comparator.reverseOrder()) //we need to return min value
                .skip(TEAM.length()-1) //we want to get the maximum value
                .findFirst() //if there is some than return
                .orElse(0); //if no values in the stream return default
    }

    private static Map<Integer,Integer> countCharacters(String skills){
        return skills.chars().boxed() //not safe for parallel computation
                .collect(HashMap::new,(a,s) -> a.compute( s,(k,v) ->  v == null ? 1: v+1), HashMap::putAll );
    }


}
